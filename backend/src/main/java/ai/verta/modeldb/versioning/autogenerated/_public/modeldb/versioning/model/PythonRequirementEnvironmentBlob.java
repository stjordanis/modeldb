// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.random.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.function.Function;
import org.apache.commons.codec.binary.Hex;

public class PythonRequirementEnvironmentBlob implements ProtoType {
  public String Constraint;
  public String Library;
  public VersionEnvironmentBlob Version;

  public PythonRequirementEnvironmentBlob() {
    this.Constraint = "";
    this.Library = "";
    this.Version = null;
  }

  public Boolean isEmpty() {
    if (this.Constraint != null && !this.Constraint.equals("")) {
      return false;
    }
    if (this.Library != null && !this.Library.equals("")) {
      return false;
    }
    if (this.Version != null && !this.Version.equals(null)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\"class\": \"PythonRequirementEnvironmentBlob\", \"fields\": {");
    boolean first = true;
    if (this.Constraint != null && !this.Constraint.equals("")) {
      if (!first) sb.append(", ");
      sb.append("\"Constraint\": " + "\"" + Constraint + "\"");
      first = false;
    }
    if (this.Library != null && !this.Library.equals("")) {
      if (!first) sb.append(", ");
      sb.append("\"Library\": " + "\"" + Library + "\"");
      first = false;
    }
    if (this.Version != null && !this.Version.equals(null)) {
      if (!first) sb.append(", ");
      sb.append("\"Version\": " + Version);
      first = false;
    }
    sb.append("}}");
    return sb.toString();
  }

  @Override
  public String getSHA() throws NoSuchAlgorithmException {
    StringBuilder sb = new StringBuilder();
    sb.append("PythonRequirementEnvironmentBlob");
    if (this.Constraint != null && !this.Constraint.equals("")) {
      sb.append("::Constraint::").append(Constraint);
    }
    if (this.Library != null && !this.Library.equals("")) {
      sb.append("::Library::").append(Library);
    }
    if (this.Version != null && !this.Version.equals(null)) {
      sb.append("::Version::").append(Version);
    }

    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    byte[] hash = digest.digest(sb.toString().getBytes(StandardCharsets.UTF_8));
    return new String(new Hex().encode(hash));
  }

  // TODO: not consider order on lists
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (!(o instanceof PythonRequirementEnvironmentBlob)) return false;
    PythonRequirementEnvironmentBlob other = (PythonRequirementEnvironmentBlob) o;

    {
      Function3<String, String, Boolean> f = (x, y) -> x.equals(y);
      if (this.Constraint != null || other.Constraint != null) {
        if (this.Constraint == null && other.Constraint != null) return false;
        if (this.Constraint != null && other.Constraint == null) return false;
        if (!f.apply(this.Constraint, other.Constraint)) return false;
      }
    }
    {
      Function3<String, String, Boolean> f = (x, y) -> x.equals(y);
      if (this.Library != null || other.Library != null) {
        if (this.Library == null && other.Library != null) return false;
        if (this.Library != null && other.Library == null) return false;
        if (!f.apply(this.Library, other.Library)) return false;
      }
    }
    {
      Function3<VersionEnvironmentBlob, VersionEnvironmentBlob, Boolean> f = (x, y) -> x.equals(y);
      if (this.Version != null || other.Version != null) {
        if (this.Version == null && other.Version != null) return false;
        if (this.Version != null && other.Version == null) return false;
        if (!f.apply(this.Version, other.Version)) return false;
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.Constraint, this.Library, this.Version);
  }

  public PythonRequirementEnvironmentBlob setConstraint(String value) {
    this.Constraint = Utils.removeEmpty(value);
    return this;
  }

  public PythonRequirementEnvironmentBlob setLibrary(String value) {
    this.Library = Utils.removeEmpty(value);
    return this;
  }

  public PythonRequirementEnvironmentBlob setVersion(VersionEnvironmentBlob value) {
    this.Version = Utils.removeEmpty(value);
    return this;
  }

  public static PythonRequirementEnvironmentBlob fromProto(
      ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob blob) {
    if (blob == null) {
      return null;
    }

    PythonRequirementEnvironmentBlob obj = new PythonRequirementEnvironmentBlob();
    {
      Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob, String> f =
          x -> (blob.getConstraint());
      obj.Constraint = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob, String> f =
          x -> (blob.getLibrary());
      obj.Library = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob, VersionEnvironmentBlob>
          f = x -> VersionEnvironmentBlob.fromProto(blob.getVersion());
      obj.Version = Utils.removeEmpty(f.apply(blob));
    }
    return obj;
  }

  public ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder toProto() {
    ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder builder =
        ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.newBuilder();
    {
      if (this.Constraint != null && !this.Constraint.equals("")) {
        Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder, Void> f =
            x -> {
              builder.setConstraint(this.Constraint);
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Library != null && !this.Library.equals("")) {
        Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder, Void> f =
            x -> {
              builder.setLibrary(this.Library);
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Version != null && !this.Version.equals(null)) {
        Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder, Void> f =
            x -> {
              builder.setVersion(this.Version.toProto());
              return null;
            };
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
    visitor.preVisitDeepString(this.Constraint);
    visitor.preVisitDeepString(this.Library);
    visitor.preVisitDeepVersionEnvironmentBlob(this.Version);
  }

  public PythonRequirementEnvironmentBlob postVisitShallow(Visitor visitor)
      throws ModelDBException {
    return visitor.postVisitPythonRequirementEnvironmentBlob(this);
  }

  public PythonRequirementEnvironmentBlob postVisitDeep(Visitor visitor) throws ModelDBException {
    this.setConstraint(visitor.postVisitDeepString(this.Constraint));
    this.setLibrary(visitor.postVisitDeepString(this.Library));
    this.setVersion(visitor.postVisitDeepVersionEnvironmentBlob(this.Version));
    return this.postVisitShallow(visitor);
  }
}