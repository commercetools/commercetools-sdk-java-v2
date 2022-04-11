
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderLineItemRemovedMessageBuilder implements Builder<OrderLineItemRemovedMessage> {

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

    private Long removedQuantity;

    private Long newQuantity;

    private java.util.List<com.commercetools.api.models.order.ItemState> newState;

    private com.commercetools.api.models.common.TypedMoney newTotalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice;

    @Nullable
    private com.commercetools.api.models.common.Price newPrice;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail;

    public OrderLineItemRemovedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public OrderLineItemRemovedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public OrderLineItemRemovedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public OrderLineItemRemovedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public OrderLineItemRemovedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder removedQuantity(final Long removedQuantity) {
        this.removedQuantity = removedQuantity;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder newQuantity(final Long newQuantity) {
        this.newQuantity = newQuantity;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder newState(final com.commercetools.api.models.order.ItemState... newState) {
        this.newState = new ArrayList<>(Arrays.asList(newState));
        return this;
    }

    public OrderLineItemRemovedMessageBuilder newState(
            final java.util.List<com.commercetools.api.models.order.ItemState> newState) {
        this.newState = newState;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder plusNewState(
            final com.commercetools.api.models.order.ItemState... newState) {
        if (this.newState == null) {
            this.newState = new ArrayList<>();
        }
        this.newState.addAll(Arrays.asList(newState));
        return this;
    }

    public OrderLineItemRemovedMessageBuilder plusNewState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.newState == null) {
            this.newState = new ArrayList<>();
        }
        this.newState.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    public OrderLineItemRemovedMessageBuilder withNewState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.newState = new ArrayList<>();
        this.newState.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    public OrderLineItemRemovedMessageBuilder newTotalPrice(
            final com.commercetools.api.models.common.TypedMoney newTotalPrice) {
        this.newTotalPrice = newTotalPrice;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder newTotalPrice(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.newTotalPrice = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    public OrderLineItemRemovedMessageBuilder newTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.newTaxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    public OrderLineItemRemovedMessageBuilder newTaxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice) {
        this.newTaxedPrice = newTaxedPrice;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder newPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.newPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    public OrderLineItemRemovedMessageBuilder newPrice(
            @Nullable final com.commercetools.api.models.common.Price newPrice) {
        this.newPrice = newPrice;
        return this;
    }

    public OrderLineItemRemovedMessageBuilder newShippingDetail(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsBuilder, com.commercetools.api.models.cart.ItemShippingDetailsBuilder> builder) {
        this.newShippingDetail = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsBuilder.of())
                .build();
        return this;
    }

    public OrderLineItemRemovedMessageBuilder newShippingDetail(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail) {
        this.newShippingDetail = newShippingDetail;
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

    public Long getRemovedQuantity() {
        return this.removedQuantity;
    }

    public Long getNewQuantity() {
        return this.newQuantity;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getNewState() {
        return this.newState;
    }

    public com.commercetools.api.models.common.TypedMoney getNewTotalPrice() {
        return this.newTotalPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getNewTaxedPrice() {
        return this.newTaxedPrice;
    }

    @Nullable
    public com.commercetools.api.models.common.Price getNewPrice() {
        return this.newPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetails getNewShippingDetail() {
        return this.newShippingDetail;
    }

    public OrderLineItemRemovedMessage build() {
        Objects.requireNonNull(id, OrderLineItemRemovedMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderLineItemRemovedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderLineItemRemovedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderLineItemRemovedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, OrderLineItemRemovedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderLineItemRemovedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, OrderLineItemRemovedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(lineItemId, OrderLineItemRemovedMessage.class + ": lineItemId is missing");
        Objects.requireNonNull(removedQuantity, OrderLineItemRemovedMessage.class + ": removedQuantity is missing");
        Objects.requireNonNull(newQuantity, OrderLineItemRemovedMessage.class + ": newQuantity is missing");
        Objects.requireNonNull(newState, OrderLineItemRemovedMessage.class + ": newState is missing");
        Objects.requireNonNull(newTotalPrice, OrderLineItemRemovedMessage.class + ": newTotalPrice is missing");
        return new OrderLineItemRemovedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, lineItemId, removedQuantity,
            newQuantity, newState, newTotalPrice, newTaxedPrice, newPrice, newShippingDetail);
    }

    /**
     * builds OrderLineItemRemovedMessage without checking for non null required values
     */
    public OrderLineItemRemovedMessage buildUnchecked() {
        return new OrderLineItemRemovedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, lineItemId, removedQuantity,
            newQuantity, newState, newTotalPrice, newTaxedPrice, newPrice, newShippingDetail);
    }

    public static OrderLineItemRemovedMessageBuilder of() {
        return new OrderLineItemRemovedMessageBuilder();
    }

    public static OrderLineItemRemovedMessageBuilder of(final OrderLineItemRemovedMessage template) {
        OrderLineItemRemovedMessageBuilder builder = new OrderLineItemRemovedMessageBuilder();
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
        builder.removedQuantity = template.getRemovedQuantity();
        builder.newQuantity = template.getNewQuantity();
        builder.newState = template.getNewState();
        builder.newTotalPrice = template.getNewTotalPrice();
        builder.newTaxedPrice = template.getNewTaxedPrice();
        builder.newPrice = template.getNewPrice();
        builder.newShippingDetail = template.getNewShippingDetail();
        return builder;
    }

}
