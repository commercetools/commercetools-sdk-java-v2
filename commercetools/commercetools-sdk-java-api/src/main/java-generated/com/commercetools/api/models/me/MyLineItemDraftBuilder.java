
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyLineItemDraftBuilder {

    private String productId;

    private Long variantId;

    private Double quantity;

    @Nullable
    private java.time.ZonedDateTime addedAt;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    @Nullable
    private String sku;

    public MyLineItemDraftBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    public MyLineItemDraftBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public MyLineItemDraftBuilder quantity(final Double quantity) {
        this.quantity = quantity;
        return this;
    }

    public MyLineItemDraftBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    public MyLineItemDraftBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public MyLineItemDraftBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public MyLineItemDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public MyLineItemDraftBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    public MyLineItemDraftBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public String getProductId() {
        return this.productId;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    @Nullable
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public MyLineItemDraft build() {
        return new MyLineItemDraftImpl(productId, variantId, quantity, addedAt, supplyChannel, distributionChannel,
            custom, shippingDetails, sku);
    }

    public static MyLineItemDraftBuilder of() {
        return new MyLineItemDraftBuilder();
    }

    public static MyLineItemDraftBuilder of(final MyLineItemDraft template) {
        MyLineItemDraftBuilder builder = new MyLineItemDraftBuilder();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.quantity = template.getQuantity();
        builder.addedAt = template.getAddedAt();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        builder.custom = template.getCustom();
        builder.shippingDetails = template.getShippingDetails();
        builder.sku = template.getSku();
        return builder;
    }

}
