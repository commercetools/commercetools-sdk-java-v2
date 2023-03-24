
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderBillingAddressSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderBillingAddressSetMessage orderBillingAddressSetMessage = OrderBillingAddressSetMessage.builder()
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
public class OrderBillingAddressSetMessageBuilder implements Builder<OrderBillingAddressSetMessage> {

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
    private com.commercetools.api.models.common.Address address;

    @Nullable
    private com.commercetools.api.models.common.Address oldAddress;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Billing address on the Order after the Set Billing Address update action.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Billing address on the Order after the Set Billing Address update action.</p>
     * @param address value to be set
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Billing address on the Order before the Set Billing Address update action.</p>
     * @param builder function to build the oldAddress value
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder oldAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.oldAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Billing address on the Order before the Set Billing Address update action.</p>
     * @param oldAddress value to be set
     * @return Builder
     */

    public OrderBillingAddressSetMessageBuilder oldAddress(
            @Nullable final com.commercetools.api.models.common.Address oldAddress) {
        this.oldAddress = oldAddress;
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
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getOldAddress() {
        return this.oldAddress;
    }

    /**
     * builds OrderBillingAddressSetMessage with checking for non-null required values
     * @return OrderBillingAddressSetMessage
     */
    public OrderBillingAddressSetMessage build() {
        Objects.requireNonNull(id, OrderBillingAddressSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderBillingAddressSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderBillingAddressSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderBillingAddressSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, OrderBillingAddressSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderBillingAddressSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, OrderBillingAddressSetMessage.class + ": resourceVersion is missing");
        return new OrderBillingAddressSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, address, oldAddress);
    }

    /**
     * builds OrderBillingAddressSetMessage without checking for non-null required values
     * @return OrderBillingAddressSetMessage
     */
    public OrderBillingAddressSetMessage buildUnchecked() {
        return new OrderBillingAddressSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, address, oldAddress);
    }

    public static OrderBillingAddressSetMessageBuilder of() {
        return new OrderBillingAddressSetMessageBuilder();
    }

    public static OrderBillingAddressSetMessageBuilder of(final OrderBillingAddressSetMessage template) {
        OrderBillingAddressSetMessageBuilder builder = new OrderBillingAddressSetMessageBuilder();
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
        builder.address = template.getAddress();
        builder.oldAddress = template.getOldAddress();
        return builder;
    }

}
