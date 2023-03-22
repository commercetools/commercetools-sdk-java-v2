
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitStoreModeChangedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStoreModeChangedMessage businessUnitStoreModeChangedMessage = BusinessUnitStoreModeChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .storeMode(BusinessUnitStoreMode.EXPLICIT)
 *             .plusOldStores(oldStoresBuilder -> oldStoresBuilder)
 *             .oldStoreMode(BusinessUnitStoreMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitStoreModeChangedMessageBuilder implements Builder<BusinessUnitStoreModeChangedMessage> {

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

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> oldStores;

    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode oldStoreMode;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @param stores
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder stores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @param stores
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @param stores
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder plusStores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>BusinessUnitStoreMode of the Business Unit after the Set Store Mode update action.</p>
     * @param storeMode
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder storeMode(
            final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode) {
        this.storeMode = storeMode;
        return this;
    }

    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStores
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder oldStores(
            final com.commercetools.api.models.store.StoreKeyReference... oldStores) {
        this.oldStores = new ArrayList<>(Arrays.asList(oldStores));
        return this;
    }

    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStores
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder oldStores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> oldStores) {
        this.oldStores = oldStores;
        return this;
    }

    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStores
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder plusOldStores(
            final com.commercetools.api.models.store.StoreKeyReference... oldStores) {
        if (this.oldStores == null) {
            this.oldStores = new ArrayList<>();
        }
        this.oldStores.addAll(Arrays.asList(oldStores));
        return this;
    }

    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder plusOldStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.oldStores == null) {
            this.oldStores = new ArrayList<>();
        }
        this.oldStores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder withOldStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.oldStores = new ArrayList<>();
        this.oldStores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>BusinessUnitStoreMode of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStoreMode
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessageBuilder oldStoreMode(
            final com.commercetools.api.models.business_unit.BusinessUnitStoreMode oldStoreMode) {
        this.oldStoreMode = oldStoreMode;
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

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getStoreMode() {
        return this.storeMode;
    }

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getOldStores() {
        return this.oldStores;
    }

    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getOldStoreMode() {
        return this.oldStoreMode;
    }

    public BusinessUnitStoreModeChangedMessage build() {
        Objects.requireNonNull(id, BusinessUnitStoreModeChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, BusinessUnitStoreModeChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, BusinessUnitStoreModeChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            BusinessUnitStoreModeChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            BusinessUnitStoreModeChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, BusinessUnitStoreModeChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            BusinessUnitStoreModeChangedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(stores, BusinessUnitStoreModeChangedMessage.class + ": stores is missing");
        Objects.requireNonNull(storeMode, BusinessUnitStoreModeChangedMessage.class + ": storeMode is missing");
        Objects.requireNonNull(oldStores, BusinessUnitStoreModeChangedMessage.class + ": oldStores is missing");
        Objects.requireNonNull(oldStoreMode, BusinessUnitStoreModeChangedMessage.class + ": oldStoreMode is missing");
        return new BusinessUnitStoreModeChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, stores, storeMode,
            oldStores, oldStoreMode);
    }

    /**
     * builds BusinessUnitStoreModeChangedMessage without checking for non null required values
     */
    public BusinessUnitStoreModeChangedMessage buildUnchecked() {
        return new BusinessUnitStoreModeChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, stores, storeMode,
            oldStores, oldStoreMode);
    }

    public static BusinessUnitStoreModeChangedMessageBuilder of() {
        return new BusinessUnitStoreModeChangedMessageBuilder();
    }

    public static BusinessUnitStoreModeChangedMessageBuilder of(final BusinessUnitStoreModeChangedMessage template) {
        BusinessUnitStoreModeChangedMessageBuilder builder = new BusinessUnitStoreModeChangedMessageBuilder();
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
        builder.stores = template.getStores();
        builder.storeMode = template.getStoreMode();
        builder.oldStores = template.getOldStores();
        builder.oldStoreMode = template.getOldStoreMode();
        return builder;
    }

}
