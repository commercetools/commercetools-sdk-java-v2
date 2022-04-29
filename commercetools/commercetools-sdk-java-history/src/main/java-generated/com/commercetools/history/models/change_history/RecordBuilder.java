
package com.commercetools.history.models.change_history;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class RecordBuilder implements Builder<Record> {

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

    public RecordBuilder modifiedBy(
            Function<com.commercetools.history.models.change_history.ModifiedByBuilder, com.commercetools.history.models.change_history.ModifiedByBuilder> builder) {
        this.modifiedBy = builder.apply(com.commercetools.history.models.change_history.ModifiedByBuilder.of()).build();
        return this;
    }

    public RecordBuilder modifiedBy(final com.commercetools.history.models.change_history.ModifiedBy modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public RecordBuilder modifiedAt(final String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    public RecordBuilder label(final com.commercetools.history.models.label.Label label) {
        this.label = label;
        return this;
    }

    public RecordBuilder label(
            Function<com.commercetools.history.models.label.LabelBuilder, Builder<? extends com.commercetools.history.models.label.Label>> builder) {
        this.label = builder.apply(com.commercetools.history.models.label.LabelBuilder.of()).build();
        return this;
    }

    public RecordBuilder previousLabel(final com.commercetools.history.models.label.Label previousLabel) {
        this.previousLabel = previousLabel;
        return this;
    }

    public RecordBuilder previousLabel(
            Function<com.commercetools.history.models.label.LabelBuilder, Builder<? extends com.commercetools.history.models.label.Label>> builder) {
        this.previousLabel = builder.apply(com.commercetools.history.models.label.LabelBuilder.of()).build();
        return this;
    }

    public RecordBuilder changes(final com.commercetools.history.models.change.Change... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
        return this;
    }

    public RecordBuilder changes(final java.util.List<com.commercetools.history.models.change.Change> changes) {
        this.changes = changes;
        return this;
    }

    public RecordBuilder plusChanges(final com.commercetools.history.models.change.Change... changes) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes.addAll(Arrays.asList(changes));
        return this;
    }

    public RecordBuilder plusChanges(
            Function<com.commercetools.history.models.change.ChangeBuilder, Builder<? extends com.commercetools.history.models.change.Change>> builder) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes.add(builder.apply(com.commercetools.history.models.change.ChangeBuilder.of()).build());
        return this;
    }

    public RecordBuilder withChanges(
            Function<com.commercetools.history.models.change.ChangeBuilder, Builder<? extends com.commercetools.history.models.change.Change>> builder) {
        this.changes = new ArrayList<>();
        this.changes.add(builder.apply(com.commercetools.history.models.change.ChangeBuilder.of()).build());
        return this;
    }

    public RecordBuilder resource(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.resource = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public RecordBuilder resource(final com.commercetools.history.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public RecordBuilder stores(final com.commercetools.history.models.common.KeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    public RecordBuilder stores(final java.util.List<com.commercetools.history.models.common.KeyReference> stores) {
        this.stores = stores;
        return this;
    }

    public RecordBuilder plusStores(final com.commercetools.history.models.common.KeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    public RecordBuilder plusStores(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    public RecordBuilder withStores(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build());
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

    public com.commercetools.history.models.change_history.ModifiedBy getModifiedBy() {
        return this.modifiedBy;
    }

    public String getModifiedAt() {
        return this.modifiedAt;
    }

    public com.commercetools.history.models.label.Label getLabel() {
        return this.label;
    }

    public com.commercetools.history.models.label.Label getPreviousLabel() {
        return this.previousLabel;
    }

    public java.util.List<com.commercetools.history.models.change.Change> getChanges() {
        return this.changes;
    }

    public com.commercetools.history.models.common.Reference getResource() {
        return this.resource;
    }

    public java.util.List<com.commercetools.history.models.common.KeyReference> getStores() {
        return this.stores;
    }

    public Boolean getWithoutChanges() {
        return this.withoutChanges;
    }

    public Record build() {
        Objects.requireNonNull(version, Record.class + ": version is missing");
        Objects.requireNonNull(previousVersion, Record.class + ": previousVersion is missing");
        Objects.requireNonNull(type, Record.class + ": type is missing");
        Objects.requireNonNull(modifiedBy, Record.class + ": modifiedBy is missing");
        Objects.requireNonNull(modifiedAt, Record.class + ": modifiedAt is missing");
        Objects.requireNonNull(label, Record.class + ": label is missing");
        Objects.requireNonNull(previousLabel, Record.class + ": previousLabel is missing");
        Objects.requireNonNull(changes, Record.class + ": changes is missing");
        Objects.requireNonNull(resource, Record.class + ": resource is missing");
        Objects.requireNonNull(stores, Record.class + ": stores is missing");
        Objects.requireNonNull(withoutChanges, Record.class + ": withoutChanges is missing");
        return new RecordImpl(version, previousVersion, type, modifiedBy, modifiedAt, label, previousLabel, changes,
            resource, stores, withoutChanges);
    }

    /**
     * builds Record without checking for non null required values
     */
    public Record buildUnchecked() {
        return new RecordImpl(version, previousVersion, type, modifiedBy, modifiedAt, label, previousLabel, changes,
            resource, stores, withoutChanges);
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
        builder.stores = template.getStores();
        builder.withoutChanges = template.getWithoutChanges();
        return builder;
    }

}
