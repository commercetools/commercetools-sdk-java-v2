
package com.commercetools.history.models.change_history;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>A Record captures the differences in a resource between one version and the next.
*  (Recall that the version number is not always incremented by one; see <a href="/general-concepts#optimistic-concurrency-control">Optimistic Concurrency Control</a>.)</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class RecordImpl implements Record, ModelBase {

    private Integer version;

    private Integer previousVersion;

    private String type;

    private com.commercetools.history.models.change_history.ModifiedBy modifiedBy;

    private String modifiedAt;

    private com.commercetools.history.models.label.Label label;

    private com.commercetools.history.models.label.Label previousLabel;

    private java.util.List<com.commercetools.history.models.change.Change> changes;

    private com.commercetools.history.models.common.Reference resource;

    private java.util.List<com.commercetools.history.models.common.KeyReference> stores;

    private Boolean withoutChanges;

    @JsonCreator
    RecordImpl(@JsonProperty("version") final Integer version,
            @JsonProperty("previousVersion") final Integer previousVersion, @JsonProperty("type") final String type,
            @JsonProperty("modifiedBy") final com.commercetools.history.models.change_history.ModifiedBy modifiedBy,
            @JsonProperty("modifiedAt") final String modifiedAt,
            @JsonProperty("label") final com.commercetools.history.models.label.Label label,
            @JsonProperty("previousLabel") final com.commercetools.history.models.label.Label previousLabel,
            @JsonProperty("changes") final java.util.List<com.commercetools.history.models.change.Change> changes,
            @JsonProperty("resource") final com.commercetools.history.models.common.Reference resource,
            @JsonProperty("stores") final java.util.List<com.commercetools.history.models.common.KeyReference> stores,
            @JsonProperty("withoutChanges") final Boolean withoutChanges) {
        this.version = version;
        this.previousVersion = previousVersion;
        this.type = type;
        this.modifiedBy = modifiedBy;
        this.modifiedAt = modifiedAt;
        this.label = label;
        this.previousLabel = previousLabel;
        this.changes = changes;
        this.resource = resource;
        this.stores = stores;
        this.withoutChanges = withoutChanges;
    }

    public RecordImpl() {
    }

    /**
    *  <p>Version of the resource after the change.</p>
    */
    public Integer getVersion() {
        return this.version;
    }

    /**
    *  <p>Version of the resource before the change.</p>
    */
    public Integer getPreviousVersion() {
        return this.previousVersion;
    }

    /**
    *  <p>Type of the change (creation, update or deletion).</p>
    */
    public String getType() {
        return this.type;
    }

    /**
    *  <p>Information about the user or the API client who performed the change.</p>
    */
    public com.commercetools.history.models.change_history.ModifiedBy getModifiedBy() {
        return this.modifiedBy;
    }

    /**
    *  <p>Date and time when the change was made.</p>
    */
    public String getModifiedAt() {
        return this.modifiedAt;
    }

    /**
    *  <p>Information that describes the resource after the change.</p>
    */
    public com.commercetools.history.models.label.Label getLabel() {
        return this.label;
    }

    /**
    *  <p>Information that describes the resource before the change.</p>
    */
    public com.commercetools.history.models.label.Label getPreviousLabel() {
        return this.previousLabel;
    }

    /**
    *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>.
    *  The value is not identical to the actual array of update actions that was sent to the platform and is not limited to update actions (see, for example, <a href="/general-concepts#optimistic-concurrency-control">Optimistic  Concurrency Control</a>).</p>
    */
    public java.util.List<com.commercetools.history.models.change.Change> getChanges() {
        return this.changes;
    }

    /**
    *  <p>Reference to the changed resource.</p>
    */
    public com.commercetools.history.models.common.Reference getResource() {
        return this.resource;
    }

    /**
    *  <p>References to the <a href="ctp:api:type:Store">Stores</a> attached to the <a href="ctp:history:type:Change">Change</a>.</p>
    */
    public java.util.List<com.commercetools.history.models.common.KeyReference> getStores() {
        return this.stores;
    }

    /**
    *  <p><code>true</code> if no change was detected.
    *  The version number of the resource can be increased even without any change in the resource.</p>
    */
    public Boolean getWithoutChanges() {
        return this.withoutChanges;
    }

    public void setVersion(final Integer version) {
        this.version = version;
    }

    public void setPreviousVersion(final Integer previousVersion) {
        this.previousVersion = previousVersion;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setModifiedBy(final com.commercetools.history.models.change_history.ModifiedBy modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public void setModifiedAt(final String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public void setLabel(final com.commercetools.history.models.label.Label label) {
        this.label = label;
    }

    public void setPreviousLabel(final com.commercetools.history.models.label.Label previousLabel) {
        this.previousLabel = previousLabel;
    }

    public void setChanges(final com.commercetools.history.models.change.Change... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
    }

    public void setChanges(final java.util.List<com.commercetools.history.models.change.Change> changes) {
        this.changes = changes;
    }

    public void setResource(final com.commercetools.history.models.common.Reference resource) {
        this.resource = resource;
    }

    public void setStores(final com.commercetools.history.models.common.KeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.history.models.common.KeyReference> stores) {
        this.stores = stores;
    }

    public void setWithoutChanges(final Boolean withoutChanges) {
        this.withoutChanges = withoutChanges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecordImpl that = (RecordImpl) o;

        return new EqualsBuilder().append(version, that.version)
                .append(previousVersion, that.previousVersion)
                .append(type, that.type)
                .append(modifiedBy, that.modifiedBy)
                .append(modifiedAt, that.modifiedAt)
                .append(label, that.label)
                .append(previousLabel, that.previousLabel)
                .append(changes, that.changes)
                .append(resource, that.resource)
                .append(stores, that.stores)
                .append(withoutChanges, that.withoutChanges)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version)
                .append(previousVersion)
                .append(type)
                .append(modifiedBy)
                .append(modifiedAt)
                .append(label)
                .append(previousLabel)
                .append(changes)
                .append(resource)
                .append(stores)
                .append(withoutChanges)
                .toHashCode();
    }

}
