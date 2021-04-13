
package com.commercetools.history.models;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Reference;
import com.commercetools.history.models.label.Label;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A Record captures the differences in a resource between one version and the next.
*  (Recall that the version number is not always incremented by one; see <a href="/general-concepts#optimistic-concurrency-control">Optimistic Concurrency Control</a>.)</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RecordImpl.class)
public interface Record {

    /**
    *  <p>Version of the resource after the change.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Integer getVersion();

    /**
    *  <p>Version of the resource before the change.</p>
    */
    @NotNull
    @JsonProperty("previousVersion")
    public Integer getPreviousVersion();

    /**
    *  <p>Type of the change (creation, update or deletion).</p>
    */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Information about the user or the API client who performed the change.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("modifiedBy")
    public ModifiedBy getModifiedBy();

    /**
    *  <p>Date and time when the change was made.</p>
    */
    @NotNull
    @JsonProperty("modifiedAt")
    public String getModifiedAt();

    /**
    *  <p>Information that describes the resource after the change.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("label")
    public Label getLabel();

    /**
    *  <p>Information that describes the resource before the change.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("previousLabel")
    public Label getPreviousLabel();

    /**
    *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>.
    *  The value is not identical to the actual array of update actions that was sent to the platform and is not limited to update actions (see, for example, <a href="/general-concepts#optimistic-concurrency-control">Optimistic  Concurrency Control</a>).</p>
    */
    @NotNull
    @Valid
    @JsonProperty("changes")
    public List<Change> getChanges();

    /**
    *  <p><a href="/types#reference">Reference</a> to the changed resource.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public Reference getResource();

    /**
    *  <p><code>true</code> if no change was detected.
    *  The version number of the resource can be increased even without any change in the resource.</p>
    */
    @NotNull
    @JsonProperty("withoutChanges")
    public Boolean getWithoutChanges();

    public void setVersion(final Integer version);

    public void setPreviousVersion(final Integer previousVersion);

    public void setType(final String type);

    public void setModifiedBy(final ModifiedBy modifiedBy);

    public void setModifiedAt(final String modifiedAt);

    public void setLabel(final Label label);

    public void setPreviousLabel(final Label previousLabel);

    @JsonIgnore
    public void setChanges(final Change... changes);

    public void setChanges(final List<Change> changes);

    public void setResource(final Reference resource);

    public void setWithoutChanges(final Boolean withoutChanges);

    public static Record of() {
        return new RecordImpl();
    }

    public static Record of(final Record template) {
        RecordImpl instance = new RecordImpl();
        instance.setVersion(template.getVersion());
        instance.setPreviousVersion(template.getPreviousVersion());
        instance.setType(template.getType());
        instance.setModifiedBy(template.getModifiedBy());
        instance.setModifiedAt(template.getModifiedAt());
        instance.setLabel(template.getLabel());
        instance.setPreviousLabel(template.getPreviousLabel());
        instance.setChanges(template.getChanges());
        instance.setResource(template.getResource());
        instance.setWithoutChanges(template.getWithoutChanges());
        return instance;
    }

    public static RecordBuilder builder() {
        return RecordBuilder.of();
    }

    public static RecordBuilder builder(final Record template) {
        return RecordBuilder.of(template);
    }

    default <T> T withRecord(Function<Record, T> helper) {
        return helper.apply(this);
    }
}
