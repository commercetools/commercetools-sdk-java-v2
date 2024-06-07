
package com.commercetools.history.models.change_history;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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

    private com.commercetools.history.models.common.ResourceIdentifier resource;

    private java.util.List<com.commercetools.history.models.common.KeyReference> stores;

    @Nullable
    private com.commercetools.history.models.common.KeyReference businessUnit;

    private Boolean withoutChanges;

    /**
     *  <p>Version of the resource after the change.</p>
     *  <p>For more information on how the version is incremented, see Optimistic Concurrency Control.</p>
     * @param version value to be set
     * @return Builder
     */

    public RecordBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Version of the resource before the change.</p>
     * @param previousVersion value to be set
     * @return Builder
     */

    public RecordBuilder previousVersion(final Integer previousVersion) {
        this.previousVersion = previousVersion;
        return this;
    }

    /**
     *  <p>Indicates the type of change. For creation, update, or deletion, the value is <code>"ResourceCreated"</code>, <code>"ResourceUpdated"</code>, or <code>"ResourceDeleted"</code> respectively.</p>
     * @param type value to be set
     * @return Builder
     */

    public RecordBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Information about the user or API Client who performed the change.</p>
     * @param builder function to build the modifiedBy value
     * @return Builder
     */

    public RecordBuilder modifiedBy(
            Function<com.commercetools.history.models.change_history.ModifiedByBuilder, com.commercetools.history.models.change_history.ModifiedByBuilder> builder) {
        this.modifiedBy = builder.apply(com.commercetools.history.models.change_history.ModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Information about the user or API Client who performed the change.</p>
     * @param builder function to build the modifiedBy value
     * @return Builder
     */

    public RecordBuilder withModifiedBy(
            Function<com.commercetools.history.models.change_history.ModifiedByBuilder, com.commercetools.history.models.change_history.ModifiedBy> builder) {
        this.modifiedBy = builder.apply(com.commercetools.history.models.change_history.ModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>Information about the user or API Client who performed the change.</p>
     * @param modifiedBy value to be set
     * @return Builder
     */

    public RecordBuilder modifiedBy(final com.commercetools.history.models.change_history.ModifiedBy modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the change was made.</p>
     * @param modifiedAt value to be set
     * @return Builder
     */

    public RecordBuilder modifiedAt(final String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    /**
     *  <p>Information that describes the resource after the change.</p>
     * @param label value to be set
     * @return Builder
     */

    public RecordBuilder label(final com.commercetools.history.models.label.Label label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Information that describes the resource after the change.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public RecordBuilder label(
            Function<com.commercetools.history.models.label.LabelBuilder, Builder<? extends com.commercetools.history.models.label.Label>> builder) {
        this.label = builder.apply(com.commercetools.history.models.label.LabelBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Information that describes the resource before the change.</p>
     * @param previousLabel value to be set
     * @return Builder
     */

    public RecordBuilder previousLabel(final com.commercetools.history.models.label.Label previousLabel) {
        this.previousLabel = previousLabel;
        return this;
    }

    /**
     *  <p>Information that describes the resource before the change.</p>
     * @param builder function to build the previousLabel value
     * @return Builder
     */

    public RecordBuilder previousLabel(
            Function<com.commercetools.history.models.label.LabelBuilder, Builder<? extends com.commercetools.history.models.label.Label>> builder) {
        this.previousLabel = builder.apply(com.commercetools.history.models.label.LabelBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>.</p>
     *  <p>The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>
     * @param changes value to be set
     * @return Builder
     */

    public RecordBuilder changes(final com.commercetools.history.models.change.Change... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
        return this;
    }

    /**
     *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>.</p>
     *  <p>The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>
     * @param changes value to be set
     * @return Builder
     */

    public RecordBuilder changes(final java.util.List<com.commercetools.history.models.change.Change> changes) {
        this.changes = changes;
        return this;
    }

    /**
     *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>.</p>
     *  <p>The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>
     * @param changes value to be set
     * @return Builder
     */

    public RecordBuilder plusChanges(final com.commercetools.history.models.change.Change... changes) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes.addAll(Arrays.asList(changes));
        return this;
    }

    /**
     *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>.</p>
     *  <p>The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>
     * @param builder function to build the changes value
     * @return Builder
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
     *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>.</p>
     *  <p>The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>
     * @param builder function to build the changes value
     * @return Builder
     */

    public RecordBuilder withChanges(
            Function<com.commercetools.history.models.change.ChangeBuilder, Builder<? extends com.commercetools.history.models.change.Change>> builder) {
        this.changes = new ArrayList<>();
        this.changes.add(builder.apply(com.commercetools.history.models.change.ChangeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the changed resource.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public RecordBuilder resource(
            Function<com.commercetools.history.models.common.ResourceIdentifierBuilder, com.commercetools.history.models.common.ResourceIdentifierBuilder> builder) {
        this.resource = builder.apply(com.commercetools.history.models.common.ResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the changed resource.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public RecordBuilder withResource(
            Function<com.commercetools.history.models.common.ResourceIdentifierBuilder, com.commercetools.history.models.common.ResourceIdentifier> builder) {
        this.resource = builder.apply(com.commercetools.history.models.common.ResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the changed resource.</p>
     * @param resource value to be set
     * @return Builder
     */

    public RecordBuilder resource(final com.commercetools.history.models.common.ResourceIdentifier resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>References to the Stores associated with the Change.</p>
     * @param stores value to be set
     * @return Builder
     */

    public RecordBuilder stores(final com.commercetools.history.models.common.KeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>References to the Stores associated with the Change.</p>
     * @param stores value to be set
     * @return Builder
     */

    public RecordBuilder stores(final java.util.List<com.commercetools.history.models.common.KeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>References to the Stores associated with the Change.</p>
     * @param stores value to be set
     * @return Builder
     */

    public RecordBuilder plusStores(final com.commercetools.history.models.common.KeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>References to the Stores associated with the Change.</p>
     * @param builder function to build the stores value
     * @return Builder
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
     *  <p>References to the Stores associated with the Change.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public RecordBuilder withStores(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References to the Stores associated with the Change.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public RecordBuilder addStores(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReference> builder) {
        return plusStores(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()));
    }

    /**
     *  <p>References to the Stores associated with the Change.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public RecordBuilder setStores(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReference> builder) {
        return stores(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()));
    }

    /**
     *  <p>Reference to the Business Unit associated with the Change.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public RecordBuilder businessUnit(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReferenceBuilder> builder) {
        this.businessUnit = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Business Unit associated with the Change.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public RecordBuilder withBusinessUnit(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReference> builder) {
        this.businessUnit = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Business Unit associated with the Change.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public RecordBuilder businessUnit(
            @Nullable final com.commercetools.history.models.common.KeyReference businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p><code>true</code> if no change was detected.</p>
     *  <p>The version number of the resource can be increased even without any change in the resource.</p>
     * @param withoutChanges value to be set
     * @return Builder
     */

    public RecordBuilder withoutChanges(final Boolean withoutChanges) {
        this.withoutChanges = withoutChanges;
        return this;
    }

    /**
     *  <p>Version of the resource after the change.</p>
     *  <p>For more information on how the version is incremented, see Optimistic Concurrency Control.</p>
     * @return version
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     *  <p>Version of the resource before the change.</p>
     * @return previousVersion
     */

    public Integer getPreviousVersion() {
        return this.previousVersion;
    }

    /**
     *  <p>Indicates the type of change. For creation, update, or deletion, the value is <code>"ResourceCreated"</code>, <code>"ResourceUpdated"</code>, or <code>"ResourceDeleted"</code> respectively.</p>
     * @return type
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Information about the user or API Client who performed the change.</p>
     * @return modifiedBy
     */

    public com.commercetools.history.models.change_history.ModifiedBy getModifiedBy() {
        return this.modifiedBy;
    }

    /**
     *  <p>Date and time (UTC) the change was made.</p>
     * @return modifiedAt
     */

    public String getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     *  <p>Information that describes the resource after the change.</p>
     * @return label
     */

    public com.commercetools.history.models.label.Label getLabel() {
        return this.label;
    }

    /**
     *  <p>Information that describes the resource before the change.</p>
     * @return previousLabel
     */

    public com.commercetools.history.models.label.Label getPreviousLabel() {
        return this.previousLabel;
    }

    /**
     *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>.</p>
     *  <p>The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>
     * @return changes
     */

    public java.util.List<com.commercetools.history.models.change.Change> getChanges() {
        return this.changes;
    }

    /**
     *  <p>ResourceIdentifier of the changed resource.</p>
     * @return resource
     */

    public com.commercetools.history.models.common.ResourceIdentifier getResource() {
        return this.resource;
    }

    /**
     *  <p>References to the Stores associated with the Change.</p>
     * @return stores
     */

    public java.util.List<com.commercetools.history.models.common.KeyReference> getStores() {
        return this.stores;
    }

    /**
     *  <p>Reference to the Business Unit associated with the Change.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.history.models.common.KeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p><code>true</code> if no change was detected.</p>
     *  <p>The version number of the resource can be increased even without any change in the resource.</p>
     * @return withoutChanges
     */

    public Boolean getWithoutChanges() {
        return this.withoutChanges;
    }

    /**
     * builds Record with checking for non-null required values
     * @return Record
     */
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
            resource, stores, businessUnit, withoutChanges);
    }

    /**
     * builds Record without checking for non-null required values
     * @return Record
     */
    public Record buildUnchecked() {
        return new RecordImpl(version, previousVersion, type, modifiedBy, modifiedAt, label, previousLabel, changes,
            resource, stores, businessUnit, withoutChanges);
    }

    /**
     * factory method for an instance of RecordBuilder
     * @return builder
     */
    public static RecordBuilder of() {
        return new RecordBuilder();
    }

    /**
     * create builder for Record instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
        builder.businessUnit = template.getBusinessUnit();
        builder.withoutChanges = template.getWithoutChanges();
        return builder;
    }

}
