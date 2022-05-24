
package com.commercetools.history.models.change_history;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecordBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Record record = Record.builder()
 *             .version(1)
 *             .previousVersion(1)
 *             .type("{type}")
 *             .modifiedBy(modifiedByBuilder -> modifiedByBuilder)
 *             .modifiedAt("{modifiedAt}")
 *             .label(labelBuilder -> labelBuilder)
 *             .previousLabel(previousLabelBuilder -> previousLabelBuilder)
 *             .plusChanges(changesBuilder -> changesBuilder)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .withoutChanges(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    /**
     <*  <p>Version of the resource after the change.</p>>
     */

    public RecordBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    /**
     <*  <p>Version of the resource before the change.</p>>
     */

    public RecordBuilder previousVersion(final Integer previousVersion) {
        this.previousVersion = previousVersion;
        return this;
    }

    /**
     <*  <p>Type of the change (creation, update or deletion).</p>>
     */

    public RecordBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     <*  <p>Information about the user or the API client who performed the change.</p>>
     */

    public RecordBuilder modifiedBy(
            Function<com.commercetools.history.models.change_history.ModifiedByBuilder, com.commercetools.history.models.change_history.ModifiedByBuilder> builder) {
        this.modifiedBy = builder.apply(com.commercetools.history.models.change_history.ModifiedByBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Information about the user or the API client who performed the change.</p>>
     */

    public RecordBuilder modifiedBy(final com.commercetools.history.models.change_history.ModifiedBy modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     <*  <p>Date and time when the change was made.</p>>
     */

    public RecordBuilder modifiedAt(final String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    /**
     <*  <p>Information that describes the resource after the change.</p>>
     */

    public RecordBuilder label(final com.commercetools.history.models.label.Label label) {
        this.label = label;
        return this;
    }

    /**
     <*  <p>Information that describes the resource after the change.</p>>
     */

    public RecordBuilder label(
            Function<com.commercetools.history.models.label.LabelBuilder, Builder<? extends com.commercetools.history.models.label.Label>> builder) {
        this.label = builder.apply(com.commercetools.history.models.label.LabelBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Information that describes the resource before the change.</p>>
     */

    public RecordBuilder previousLabel(final com.commercetools.history.models.label.Label previousLabel) {
        this.previousLabel = previousLabel;
        return this;
    }

    /**
     <*  <p>Information that describes the resource before the change.</p>>
     */

    public RecordBuilder previousLabel(
            Function<com.commercetools.history.models.label.LabelBuilder, Builder<? extends com.commercetools.history.models.label.Label>> builder) {
        this.previousLabel = builder.apply(com.commercetools.history.models.label.LabelBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>. The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>>
     */

    public RecordBuilder changes(final com.commercetools.history.models.change.Change... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
        return this;
    }

    /**
     <*  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>. The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>>
     */

    public RecordBuilder changes(final java.util.List<com.commercetools.history.models.change.Change> changes) {
        this.changes = changes;
        return this;
    }

    /**
     <*  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>. The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>>
     */

    public RecordBuilder plusChanges(final com.commercetools.history.models.change.Change... changes) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes.addAll(Arrays.asList(changes));
        return this;
    }

    /**
     <*  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>. The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>>
     */

    public RecordBuilder plusChanges(
            Function<com.commercetools.history.models.change.ChangeBuilder, Builder<? extends com.commercetools.history.models.change.Change>> builder) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes.add(builder.apply(com.commercetools.history.models.change.ChangeBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>. The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>>
     */

    public RecordBuilder withChanges(
            Function<com.commercetools.history.models.change.ChangeBuilder, Builder<? extends com.commercetools.history.models.change.Change>> builder) {
        this.changes = new ArrayList<>();
        this.changes.add(builder.apply(com.commercetools.history.models.change.ChangeBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>Reference to the changed resource.</p>>
     */

    public RecordBuilder resource(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.resource = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Reference to the changed resource.</p>>
     */

    public RecordBuilder resource(final com.commercetools.history.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     <*  <p>References to the Stores attached to the Change.</p>>
     */

    public RecordBuilder stores(final com.commercetools.history.models.common.KeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     <*  <p>References to the Stores attached to the Change.</p>>
     */

    public RecordBuilder stores(final java.util.List<com.commercetools.history.models.common.KeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     <*  <p>References to the Stores attached to the Change.</p>>
     */

    public RecordBuilder plusStores(final com.commercetools.history.models.common.KeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     <*  <p>References to the Stores attached to the Change.</p>>
     */

    public RecordBuilder plusStores(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>References to the Stores attached to the Change.</p>>
     */

    public RecordBuilder withStores(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     <*  <p><code>true</code> if no change was detected. The version number of the resource can be increased even without any change in the resource.</p>>
     */

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
