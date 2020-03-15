// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;

public class PythonRequirementEnvironmentBlob {
    public String Library;
    public String Constraint;
    public VersionEnvironmentBlob Version;

    public PythonRequirementEnvironmentBlob() {
        this.Library = null;
        this.Constraint = null;
        this.Version = null;
    }

    public PythonRequirementEnvironmentBlob setLibrary(String value) {
        this.Library = value;
        return this;
    }
    public PythonRequirementEnvironmentBlob setConstraint(String value) {
        this.Constraint = value;
        return this;
    }
    public PythonRequirementEnvironmentBlob setVersion(VersionEnvironmentBlob value) {
        this.Version = value;
        return this;
    }

    static public PythonRequirementEnvironmentBlob fromProto(ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob blob) {
        if (blob == null) {
            return null;
        }

        PythonRequirementEnvironmentBlob obj = new PythonRequirementEnvironmentBlob();
        {
            Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob,String> f = x -> (blob.getLibrary());
            obj.Library = f.apply(blob);
        }
        {
            Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob,String> f = x -> (blob.getConstraint());
            obj.Constraint = f.apply(blob);
        }
        {
            Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob,VersionEnvironmentBlob> f = x -> VersionEnvironmentBlob.fromProto(blob.getVersion());
            obj.Version = f.apply(blob);
        }
        return obj;
    }

    public ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder toProto() {
        ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder builder = ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.newBuilder();
        {
            if (this.Library != null) {
                Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder,Void> f = x -> { builder.setLibrary(this.Library); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.Constraint != null) {
                Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder,Void> f = x -> { builder.setConstraint(this.Constraint); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.Version != null) {
                Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder,Void> f = x -> { builder.setVersion(this.Version.toProto()); return null; };
                f.apply(builder);
            }
        }
        return builder;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitPythonRequirementEnvironmentBlob(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        visitor.preVisitDeepString(this.Library);
        visitor.preVisitDeepString(this.Constraint);
        visitor.preVisitDeepVersionEnvironmentBlob(this.Version);
    }

    public PythonRequirementEnvironmentBlob postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitPythonRequirementEnvironmentBlob(this);
    }

    public PythonRequirementEnvironmentBlob postVisitDeep(Visitor visitor) throws ModelDBException {
        this.Library = visitor.postVisitDeepString(this.Library);
        this.Constraint = visitor.postVisitDeepString(this.Constraint);
        this.Version = visitor.postVisitDeepVersionEnvironmentBlob(this.Version);
        return this.postVisitShallow(visitor);
    }
}