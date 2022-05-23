
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderLineItemDistributionChannelSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLineItemDistributionChannelSetMessage orderLineItemDistributionChannelSetMessage = OrderLineItemDistributionChannelSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderLineItemDistributionChannelSetMessageBuilder
        implements Builder<OrderLineItemDistributionChannelSetMessage> {

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

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    /**
     <*  <p>Platform-generated unique identifier of the Message.</p>>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     <>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     <>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     <>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder lastModifiedAt(
            final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     <>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     <*  <p>A Reference represents a loose reference to another resource in the same commercetools Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     <*  <p>A Reference represents a loose reference to another resource in the same commercetools Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     <>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     <>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     <>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     <>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     <*  <p>Reference to a Channel.</p>>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.distributionChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     <*  <p>Reference to a Channel.</p>>
     */

    public OrderLineItemDistributionChannelSetMessageBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
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

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    public OrderLineItemDistributionChannelSetMessage build() {
        Objects.requireNonNull(id, OrderLineItemDistributionChannelSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderLineItemDistributionChannelSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderLineItemDistributionChannelSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            OrderLineItemDistributionChannelSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            OrderLineItemDistributionChannelSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderLineItemDistributionChannelSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            OrderLineItemDistributionChannelSetMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(lineItemId,
            OrderLineItemDistributionChannelSetMessage.class + ": lineItemId is missing");
        return new OrderLineItemDistributionChannelSetMessageImpl(id, version, createdAt, lastModifiedAt,
            lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            lineItemId, distributionChannel);
    }

    /**
     * builds OrderLineItemDistributionChannelSetMessage without checking for non null required values
     */
    public OrderLineItemDistributionChannelSetMessage buildUnchecked() {
        return new OrderLineItemDistributionChannelSetMessageImpl(id, version, createdAt, lastModifiedAt,
            lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            lineItemId, distributionChannel);
    }

    public static OrderLineItemDistributionChannelSetMessageBuilder of() {
        return new OrderLineItemDistributionChannelSetMessageBuilder();
    }

    public static OrderLineItemDistributionChannelSetMessageBuilder of(
            final OrderLineItemDistributionChannelSetMessage template) {
        OrderLineItemDistributionChannelSetMessageBuilder builder = new OrderLineItemDistributionChannelSetMessageBuilder();
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
        builder.lineItemId = template.getLineItemId();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
