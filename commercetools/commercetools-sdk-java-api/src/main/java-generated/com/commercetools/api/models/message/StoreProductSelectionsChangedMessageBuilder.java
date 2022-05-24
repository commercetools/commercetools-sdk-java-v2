
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreProductSelectionsChangedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreProductSelectionsChangedMessage storeProductSelectionsChangedMessage = StoreProductSelectionsChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreProductSelectionsChangedMessageBuilder implements Builder<StoreProductSelectionsChangedMessage> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private Long sequenceNumber;

    private com.commercetools.api.models.common.Reference resource;

    private Long resourceVersion;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> addedProductSelections;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> removedProductSelections;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> updatedProductSelections;

    /**
     <*  <p>Unique identifier of the Message.</p>>
     */

    public StoreProductSelectionsChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public StoreProductSelectionsChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public StoreProductSelectionsChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public StoreProductSelectionsChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public StoreProductSelectionsChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     <*  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>>
     */

    public StoreProductSelectionsChangedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     <*  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>>
     */

    public StoreProductSelectionsChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder addedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... addedProductSelections) {
        this.addedProductSelections = new ArrayList<>(Arrays.asList(addedProductSelections));
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder addedProductSelections(
            @Nullable final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> addedProductSelections) {
        this.addedProductSelections = addedProductSelections;
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder plusAddedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... addedProductSelections) {
        if (this.addedProductSelections == null) {
            this.addedProductSelections = new ArrayList<>();
        }
        this.addedProductSelections.addAll(Arrays.asList(addedProductSelections));
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder plusAddedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        if (this.addedProductSelections == null) {
            this.addedProductSelections = new ArrayList<>();
        }
        this.addedProductSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder withAddedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        this.addedProductSelections = new ArrayList<>();
        this.addedProductSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder removedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... removedProductSelections) {
        this.removedProductSelections = new ArrayList<>(Arrays.asList(removedProductSelections));
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder removedProductSelections(
            @Nullable final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> removedProductSelections) {
        this.removedProductSelections = removedProductSelections;
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder plusRemovedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... removedProductSelections) {
        if (this.removedProductSelections == null) {
            this.removedProductSelections = new ArrayList<>();
        }
        this.removedProductSelections.addAll(Arrays.asList(removedProductSelections));
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder plusRemovedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        if (this.removedProductSelections == null) {
            this.removedProductSelections = new ArrayList<>();
        }
        this.removedProductSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder withRemovedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        this.removedProductSelections = new ArrayList<>();
        this.removedProductSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder updatedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... updatedProductSelections) {
        this.updatedProductSelections = new ArrayList<>(Arrays.asList(updatedProductSelections));
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder updatedProductSelections(
            @Nullable final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> updatedProductSelections) {
        this.updatedProductSelections = updatedProductSelections;
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder plusUpdatedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... updatedProductSelections) {
        if (this.updatedProductSelections == null) {
            this.updatedProductSelections = new ArrayList<>();
        }
        this.updatedProductSelections.addAll(Arrays.asList(updatedProductSelections));
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder plusUpdatedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        if (this.updatedProductSelections == null) {
            this.updatedProductSelections = new ArrayList<>();
        }
        this.updatedProductSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     <>
     */

    public StoreProductSelectionsChangedMessageBuilder withUpdatedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        this.updatedProductSelections = new ArrayList<>();
        this.updatedProductSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getAddedProductSelections() {
        return this.addedProductSelections;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getRemovedProductSelections() {
        return this.removedProductSelections;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getUpdatedProductSelections() {
        return this.updatedProductSelections;
    }

    public StoreProductSelectionsChangedMessage build() {
        Objects.requireNonNull(id, StoreProductSelectionsChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, StoreProductSelectionsChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, StoreProductSelectionsChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            StoreProductSelectionsChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            StoreProductSelectionsChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, StoreProductSelectionsChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            StoreProductSelectionsChangedMessage.class + ": resourceVersion is missing");
        return new StoreProductSelectionsChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            addedProductSelections, removedProductSelections, updatedProductSelections);
    }

    /**
     * builds StoreProductSelectionsChangedMessage without checking for non null required values
     */
    public StoreProductSelectionsChangedMessage buildUnchecked() {
        return new StoreProductSelectionsChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            addedProductSelections, removedProductSelections, updatedProductSelections);
    }

    public static StoreProductSelectionsChangedMessageBuilder of() {
        return new StoreProductSelectionsChangedMessageBuilder();
    }

    public static StoreProductSelectionsChangedMessageBuilder of(final StoreProductSelectionsChangedMessage template) {
        StoreProductSelectionsChangedMessageBuilder builder = new StoreProductSelectionsChangedMessageBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resource = template.getResource();
        builder.resourceVersion = template.getResourceVersion();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.addedProductSelections = template.getAddedProductSelections();
        builder.removedProductSelections = template.getRemovedProductSelections();
        builder.updatedProductSelections = template.getUpdatedProductSelections();
        return builder;
    }

}
