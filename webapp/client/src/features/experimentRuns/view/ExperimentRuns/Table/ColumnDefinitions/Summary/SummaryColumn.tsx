import { bind } from 'decko';
import * as React from 'react';
import ResizeDetector from 'react-resize-detector';
import { Link } from 'react-router-dom';

import ProjectEntityTagsManager from 'features/tagsManager/view/ProjectEntityTagsManager/ProjectEntityTagsManager';
import { makeDefaultExprNameFilter } from 'shared/models/Filters';
import { getFormattedDateTime } from 'shared/utils/formatters/dateTime';
import withProps from 'shared/utils/react/withProps';
import Draggable from 'shared/view/elements/Draggable/Draggable';
import ScrollableContainer from 'shared/view/elements/ScrollableContainer/ScrollableContainer';
import routes from 'shared/routes';

import { IRow } from '../types';
import styles from './SummaryColumn.module.css';

interface ILocalProps {
  row: IRow;
  onHeightChanged(experimentRunId: string, height: number): void;
}

type AllProps = ILocalProps;

class SummaryColumn extends React.PureComponent<AllProps> {
  private rootRef = React.createRef<HTMLDivElement>();

  public render() {
    const {
      experimentRun: {
        id,
        projectId,
        shortExperiment: experiment,
        owner,
        name,
        tags,
        dateCreated,
      },
    } = this.props.row;
    return (
      <div
        className={styles.root}
        ref={this.rootRef}
        data-column-name={'experiment-runs-summary-column'}
        data-column-id={id}
      >
        <ResizeDetector handleHeight={true} onResize={this.onHeightChanged} />
        <Link
          className={styles.model_link}
          to={routes.modelRecord.getRedirectPathWithCurrentWorkspace({
            projectId,
            modelRecordId: id,
          })}
        >
          <div className={styles.modelName_block}>
            <div className={styles.model_name} data-test="experiment-run-name">
              {name}
            </div>
          </div>
        </Link>

        <div className={styles.expName_block}>
          Experiment Name:
          <Draggable
            additionalClassName={styles.param_draggable}
            type="filter"
            data={makeDefaultExprNameFilter(experiment.name)}
          >
            <div className={styles.expName_value}>{experiment.name}</div>
          </Draggable>
        </div>
        {dateCreated && (
          <div className={styles.timeStamp_block}>
            Timestamp:{' '}
            <div className={styles.timestamp_value}>
              {getFormattedDateTime(dateCreated)}
            </div>
          </div>
        )}
        {/* limit 5 tags after which a scrollable container is rendered */}
        {tags.length > 5 ? (
          <ScrollableContainer
            maxHeight={90}
            containerOffsetValue={4}
            children={
              <ProjectEntityTagsManager
                id={id}
                projectId={projectId}
                tags={tags}
                isDraggableTags={true}
                entityType="experimentRun"
              />
            }
          />
        ) : (
          <ProjectEntityTagsManager
            id={id}
            projectId={projectId}
            tags={tags}
            isDraggableTags={true}
            entityType="experimentRun"
          />
        )}
      </div>
    );
  }

  @bind
  private onHeightChanged(width: number, height: number) {
    this.props.onHeightChanged(this.props.row.experimentRun.id, height);
  }
}

export default SummaryColumn;
