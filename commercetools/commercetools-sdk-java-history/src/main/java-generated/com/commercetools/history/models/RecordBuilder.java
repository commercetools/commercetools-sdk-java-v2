
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RecordBuilder {

    private Integer version;

    private Integer previousVersion;

    private String type;

    private com.commercetools.history.models.ModifiedBy modifiedBy;

    private String modifiedAt;

    private com.commercetools.history.models.Label label;

    private com.commercetools.history.models.Label previousLabel;

    private java.util.List<com.commercetools.history.models.Change> changes;

    private com.commercetools.history.models.Reference resource;

    private Boolean withoutChanges;

    public RecordBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    public RecordBuilder previousVersion(final Integer previousVersion) {
        this.previousVersion = previousVersion;
        return this;
    }

    public RecordBuilder type(final String type) {
        this.type = type;
        return this;
    }

    public RecordBuilder modifiedBy(final com.commercetools.history.models.ModifiedBy modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public RecordBuilder modifiedAt(final String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    public RecordBuilder label(final com.commercetools.history.models.Label label) {
        this.label = label;
        return this;
    }

    public RecordBuilder previousLabel(final com.commercetools.history.models.Label previousLabel) {
        this.previousLabel = previousLabel;
        return this;
    }

    public RecordBuilder changes(final com.commercetools.history.models.Change... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
        return this;
    }

    public RecordBuilder changes(final java.util.List<com.commercetools.history.models.Change> changes) {
        this.changes = changes;
        return this;
    }

    public RecordBuilder resource(final com.commercetools.history.models.Reference resource) {
        this.resource = resource;
        return this;
    }

    public RecordBuilder withoutChanges(final Boolean withoutChanges) {
        this.withoutChanges = withoutChanges;
        return this;
    }

    public Integer getVersion() {
        return this.version;
    }

    public Integer getPreviousVersion() {
        return this.previousVersion;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.history.models.ModifiedBy getModifiedBy() {
        return this.modifiedBy;
    }

    public String getModifiedAt() {
        return this.modifiedAt;
    }

    public com.commercetools.history.models.Label getLabel() {
        return this.label;
    }

    public com.commercetools.history.models.Label getPreviousLabel() {
        return this.previousLabel;
    }

    public java.util.List<com.commercetools.history.models.Change> getChanges() {
        return this.changes;
    }

    public com.commercetools.history.models.Reference getResource() {
        return this.resource;
    }

    public Boolean getWithoutChanges() {
        return this.withoutChanges;
    }

    public Record build() {
        return new RecordImpl(version, previousVersion, type, modifiedBy, modifiedAt, label, previousLabel, changes,
            resource, withoutChanges);
    }

    public static RecordBuilder of() {
        return new RecordBuilder();
    }

    public static RecordBuilder of(final Record template) {
        RecordBuilder builder = new RecordBuilder();
        builder.version = template.getVersion();
        builder.previousVersion = template.getPreviousVersion();
        builder.type = template.getType();
        builder.modifiedBy = template.getModifiedBy();
        builder.modifiedAt = template.getModifiedAt();
        builder.label = template.getLabel();
        builder.previousLabel = template.getPreviousLabel();
        builder.changes = template.getChanges();
        builder.resource = template.getResource();
        builder.withoutChanges = template.getWithoutChanges();
        return builder;
    }

}
