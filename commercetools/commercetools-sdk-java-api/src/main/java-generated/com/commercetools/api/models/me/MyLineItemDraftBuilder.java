
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyLineItemDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyLineItemDraft myLineItemDraft = MyLineItemDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyLineItemDraftBuilder implements Builder<MyLineItemDraft> {

    @Nullable
    private String key;

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
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    @Nullable
    private com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft recurrenceInfo;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @param key value to be set
     * @return Builder
     */

    public MyLineItemDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param productId value to be set
     * @return Builder
     */

    public MyLineItemDraftBuilder productId(@Nullable final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in the Product. If not provided, the Master Variant is used.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public MyLineItemDraftBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p><code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param sku value to be set
     * @return Builder
     */

    public MyLineItemDraftBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Number of Product Variants to add to the Cart.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public MyLineItemDraftBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Product Variant is added to the Cart. If not set, it defaults to the current date and time.</p>
     *  <p>Optional for backwards compatibility reasons.</p>
     * @param addedAt value to be set
     * @return Builder
     */

    public MyLineItemDraftBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>Used to identify <span>Inventory entries</span> that must be reserved. The Channel must have the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public MyLineItemDraftBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Used to identify <span>Inventory entries</span> that must be reserved. The Channel must have the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public MyLineItemDraftBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Used to identify <span>Inventory entries</span> that must be reserved. The Channel must have the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public MyLineItemDraftBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Used to <span>select</span> a Product Price. The Channel must have the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     *  <p>If the Cart is bound to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public MyLineItemDraftBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Used to <span>select</span> a Product Price. The Channel must have the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     *  <p>If the Cart is bound to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public MyLineItemDraftBuilder withDistributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Used to <span>select</span> a Product Price. The Channel must have the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     *  <p>If the Cart is bound to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public MyLineItemDraftBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public MyLineItemDraftBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public MyLineItemDraftBuilder withShippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraft> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public MyLineItemDraftBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @param builder function to build the recurrenceInfo value
     * @return Builder
     */

    public MyLineItemDraftBuilder recurrenceInfo(
            Function<com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftBuilder, com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftBuilder> builder) {
        this.recurrenceInfo = builder
                .apply(com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @param builder function to build the recurrenceInfo value
     * @return Builder
     */

    public MyLineItemDraftBuilder withRecurrenceInfo(
            Function<com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftBuilder, com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft> builder) {
        this.recurrenceInfo = builder
                .apply(com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @param recurrenceInfo value to be set
     * @return Builder
     */

    public MyLineItemDraftBuilder recurrenceInfo(
            @Nullable final com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft recurrenceInfo) {
        this.recurrenceInfo = recurrenceInfo;
        return this;
    }

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyLineItemDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyLineItemDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @param custom value to be set
     * @return Builder
     */

    public MyLineItemDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return productId
     */

    @Nullable
    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in the Product. If not provided, the Master Variant is used.</p>
     * @return variantId
     */

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p><code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Number of Product Variants to add to the Cart.</p>
     * @return quantity
     */

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Date and time (UTC) the Product Variant is added to the Cart. If not set, it defaults to the current date and time.</p>
     *  <p>Optional for backwards compatibility reasons.</p>
     * @return addedAt
     */

    @Nullable
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
     *  <p>Used to identify <span>Inventory entries</span> that must be reserved. The Channel must have the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Used to <span>select</span> a Product Price. The Channel must have the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     *  <p>If the Cart is bound to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @return distributionChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @return shippingDetails
     */

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @return recurrenceInfo
     */

    @Nullable
    public com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft getRecurrenceInfo() {
        return this.recurrenceInfo;
    }

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds MyLineItemDraft with checking for non-null required values
     * @return MyLineItemDraft
     */
    public MyLineItemDraft build() {
        return new MyLineItemDraftImpl(key, productId, variantId, sku, quantity, addedAt, supplyChannel,
            distributionChannel, shippingDetails, recurrenceInfo, custom);
    }

    /**
     * builds MyLineItemDraft without checking for non-null required values
     * @return MyLineItemDraft
     */
    public MyLineItemDraft buildUnchecked() {
        return new MyLineItemDraftImpl(key, productId, variantId, sku, quantity, addedAt, supplyChannel,
            distributionChannel, shippingDetails, recurrenceInfo, custom);
    }

    /**
     * factory method for an instance of MyLineItemDraftBuilder
     * @return builder
     */
    public static MyLineItemDraftBuilder of() {
        return new MyLineItemDraftBuilder();
    }

    /**
     * create builder for MyLineItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyLineItemDraftBuilder of(final MyLineItemDraft template) {
        MyLineItemDraftBuilder builder = new MyLineItemDraftBuilder();
        builder.key = template.getKey();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.quantity = template.getQuantity();
        builder.addedAt = template.getAddedAt();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        builder.shippingDetails = template.getShippingDetails();
        builder.recurrenceInfo = template.getRecurrenceInfo();
        builder.custom = template.getCustom();
        return builder;
    }

}
