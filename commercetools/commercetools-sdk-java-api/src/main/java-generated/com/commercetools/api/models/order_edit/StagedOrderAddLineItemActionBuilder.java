
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddLineItemAction stagedOrderAddLineItemAction = StagedOrderAddLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderAddLineItemActionBuilder implements Builder<StagedOrderAddLineItemAction> {

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @Nullable
    private String productId;

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Long quantity;

    @Nullable
    private java.time.ZonedDateTime addedAt;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    @Nullable
    private com.commercetools.api.models.common.Money externalPrice;

    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    /**
     *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
     * @param custom value to be set
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *
     * @param productId value to be set
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder productId(@Nullable final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *
     * @param variantId value to be set
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *
     * @param sku value to be set
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *
     * @param quantity value to be set
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *
     * @param addedAt value to be set
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @param builder function to build the externalPrice value
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder externalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @param externalPrice value to be set
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder externalPrice(
            @Nullable final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
        return this;
    }

    /**
     *
     * @param builder function to build the externalTotalPrice value
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder externalTotalPrice(
            Function<com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder, com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder> builder) {
        this.externalTotalPrice = builder
                .apply(com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *
     * @param externalTotalPrice value to be set
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder externalTotalPrice(
            @Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
        return this;
    }

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public StagedOrderAddLineItemActionBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    @Nullable
    public String getProductId() {
        return this.productId;
    }

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public Long getQuantity() {
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
    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     * builds StagedOrderAddLineItemAction with checking for non-null required values
     * @return StagedOrderAddLineItemAction
     */
    public StagedOrderAddLineItemAction build() {
        return new StagedOrderAddLineItemActionImpl(custom, distributionChannel, externalTaxRate, productId, variantId,
            sku, quantity, addedAt, supplyChannel, externalPrice, externalTotalPrice, shippingDetails);
    }

    /**
     * builds StagedOrderAddLineItemAction without checking for non-null required values
     * @return StagedOrderAddLineItemAction
     */
    public StagedOrderAddLineItemAction buildUnchecked() {
        return new StagedOrderAddLineItemActionImpl(custom, distributionChannel, externalTaxRate, productId, variantId,
            sku, quantity, addedAt, supplyChannel, externalPrice, externalTotalPrice, shippingDetails);
    }

    public static StagedOrderAddLineItemActionBuilder of() {
        return new StagedOrderAddLineItemActionBuilder();
    }

    public static StagedOrderAddLineItemActionBuilder of(final StagedOrderAddLineItemAction template) {
        StagedOrderAddLineItemActionBuilder builder = new StagedOrderAddLineItemActionBuilder();
        builder.custom = template.getCustom();
        builder.distributionChannel = template.getDistributionChannel();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.quantity = template.getQuantity();
        builder.addedAt = template.getAddedAt();
        builder.supplyChannel = template.getSupplyChannel();
        builder.externalPrice = template.getExternalPrice();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
