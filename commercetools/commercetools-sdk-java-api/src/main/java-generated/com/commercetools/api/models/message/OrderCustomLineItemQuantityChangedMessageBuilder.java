
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomLineItemQuantityChangedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemQuantityChangedMessage orderCustomLineItemQuantityChangedMessage = OrderCustomLineItemQuantityChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customLineItemId("{customLineItemId}")
 *             .quantity(0.3)
 *             .oldQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomLineItemQuantityChangedMessageBuilder
        implements Builder<OrderCustomLineItemQuantityChangedMessage> {

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

    private String customLineItemId;

    private Long quantity;

    private Long oldQuantity;

    /**
     *  <p>Unique identifier of the Message.</p>
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder lastModifiedAt(
            final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemQuantityChangedMessageBuilder oldQuantity(final Long oldQuantity) {
        this.oldQuantity = oldQuantity;
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

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public Long getOldQuantity() {
        return this.oldQuantity;
    }

    public OrderCustomLineItemQuantityChangedMessage build() {
        Objects.requireNonNull(id, OrderCustomLineItemQuantityChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderCustomLineItemQuantityChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderCustomLineItemQuantityChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            OrderCustomLineItemQuantityChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            OrderCustomLineItemQuantityChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderCustomLineItemQuantityChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            OrderCustomLineItemQuantityChangedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(customLineItemId,
            OrderCustomLineItemQuantityChangedMessage.class + ": customLineItemId is missing");
        Objects.requireNonNull(quantity, OrderCustomLineItemQuantityChangedMessage.class + ": quantity is missing");
        Objects.requireNonNull(oldQuantity,
            OrderCustomLineItemQuantityChangedMessage.class + ": oldQuantity is missing");
        return new OrderCustomLineItemQuantityChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, customLineItemId,
            quantity, oldQuantity);
    }

    /**
     * builds OrderCustomLineItemQuantityChangedMessage without checking for non null required values
     */
    public OrderCustomLineItemQuantityChangedMessage buildUnchecked() {
        return new OrderCustomLineItemQuantityChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, customLineItemId,
            quantity, oldQuantity);
    }

    public static OrderCustomLineItemQuantityChangedMessageBuilder of() {
        return new OrderCustomLineItemQuantityChangedMessageBuilder();
    }

    public static OrderCustomLineItemQuantityChangedMessageBuilder of(
            final OrderCustomLineItemQuantityChangedMessage template) {
        OrderCustomLineItemQuantityChangedMessageBuilder builder = new OrderCustomLineItemQuantityChangedMessageBuilder();
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
        builder.customLineItemId = template.getCustomLineItemId();
        builder.quantity = template.getQuantity();
        builder.oldQuantity = template.getOldQuantity();
        return builder;
    }

}
