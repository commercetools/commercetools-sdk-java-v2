
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartAddLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddLineItemAction cartAddLineItemAction = CartAddLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddLineItemActionBuilder implements Builder<CartAddLineItemAction> {

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
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    @Nullable
    private com.commercetools.api.models.common.Money externalPrice;

    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.MethodExternalTaxRateDraft> perMethodExternalTaxRate;

    @Nullable
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @param key value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>id</code> of the published Product.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     * @param productId value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder productId(@Nullable final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p><code>id</code> of the ProductVariant in the Product. If not provided, the Master Variant is used.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>SKU of the ProductVariant.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     * @param sku value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Quantity of the Product Variant to add to the Cart.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Product Variant is added to the Cart. If not set, it defaults to the current date and time.</p>
     *  <p>Optional for backwards compatibility reasons.</p>
     * @param addedAt value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>Used to select a Product Price. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum. If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public CartAddLineItemActionBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Used to select a Product Price. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum. If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public CartAddLineItemActionBuilder withDistributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Used to select a Product Price. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum. If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p>Used to identify Inventory entries that must be reserved. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public CartAddLineItemActionBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Used to identify Inventory entries that must be reserved. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public CartAddLineItemActionBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Used to identify Inventory entries that must be reserved. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> value, and the <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
     * @param builder function to build the externalPrice value
     * @return Builder
     */

    public CartAddLineItemActionBuilder externalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> value, and the <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
     * @param builder function to build the externalPrice value
     * @return Builder
     */

    public CartAddLineItemActionBuilder withExternalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> value, and the <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
     * @param externalPrice value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder externalPrice(
            @Nullable final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
        return this;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> values, and the <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @param builder function to build the externalTotalPrice value
     * @return Builder
     */

    public CartAddLineItemActionBuilder externalTotalPrice(
            Function<com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder, com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder> builder) {
        this.externalTotalPrice = builder
                .apply(com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> values, and the <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @param builder function to build the externalTotalPrice value
     * @return Builder
     */

    public CartAddLineItemActionBuilder withExternalTotalPrice(
            Function<com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder, com.commercetools.api.models.cart.ExternalLineItemTotalPrice> builder) {
        this.externalTotalPrice = builder
                .apply(com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> values, and the <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @param externalTotalPrice value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder externalTotalPrice(
            @Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
        return this;
    }

    /**
     *  <p>Sets the external Tax Rate for the Line Item, if the Cart has the <code>External</code> TaxMode and <code>Single</code> ShippingMode. If the Cart has <code>Multiple</code> ShippingMode, the Tax Rate is accepted but ignored.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public CartAddLineItemActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Sets the external Tax Rate for the Line Item, if the Cart has the <code>External</code> TaxMode and <code>Single</code> ShippingMode. If the Cart has <code>Multiple</code> ShippingMode, the Tax Rate is accepted but ignored.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public CartAddLineItemActionBuilder withExternalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the external Tax Rate for the Line Item, if the Cart has the <code>External</code> TaxMode and <code>Single</code> ShippingMode. If the Cart has <code>Multiple</code> ShippingMode, the Tax Rate is accepted but ignored.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <p>Sets the external Tax Rates for individual Shipping Methods, if the Cart has the <code>External</code> TaxMode and <code>Multiple</code> ShippingMode.</p>
     * @param perMethodExternalTaxRate value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder perMethodExternalTaxRate(
            @Nullable final com.commercetools.api.models.cart.MethodExternalTaxRateDraft... perMethodExternalTaxRate) {
        this.perMethodExternalTaxRate = new ArrayList<>(Arrays.asList(perMethodExternalTaxRate));
        return this;
    }

    /**
     *  <p>Sets the external Tax Rates for individual Shipping Methods, if the Cart has the <code>External</code> TaxMode and <code>Multiple</code> ShippingMode.</p>
     * @param perMethodExternalTaxRate value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder perMethodExternalTaxRate(
            @Nullable final java.util.List<com.commercetools.api.models.cart.MethodExternalTaxRateDraft> perMethodExternalTaxRate) {
        this.perMethodExternalTaxRate = perMethodExternalTaxRate;
        return this;
    }

    /**
     *  <p>Sets the external Tax Rates for individual Shipping Methods, if the Cart has the <code>External</code> TaxMode and <code>Multiple</code> ShippingMode.</p>
     * @param perMethodExternalTaxRate value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder plusPerMethodExternalTaxRate(
            @Nullable final com.commercetools.api.models.cart.MethodExternalTaxRateDraft... perMethodExternalTaxRate) {
        if (this.perMethodExternalTaxRate == null) {
            this.perMethodExternalTaxRate = new ArrayList<>();
        }
        this.perMethodExternalTaxRate.addAll(Arrays.asList(perMethodExternalTaxRate));
        return this;
    }

    /**
     *  <p>Sets the external Tax Rates for individual Shipping Methods, if the Cart has the <code>External</code> TaxMode and <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the perMethodExternalTaxRate value
     * @return Builder
     */

    public CartAddLineItemActionBuilder plusPerMethodExternalTaxRate(
            Function<com.commercetools.api.models.cart.MethodExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.MethodExternalTaxRateDraftBuilder> builder) {
        if (this.perMethodExternalTaxRate == null) {
            this.perMethodExternalTaxRate = new ArrayList<>();
        }
        this.perMethodExternalTaxRate
                .add(builder.apply(com.commercetools.api.models.cart.MethodExternalTaxRateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sets the external Tax Rates for individual Shipping Methods, if the Cart has the <code>External</code> TaxMode and <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the perMethodExternalTaxRate value
     * @return Builder
     */

    public CartAddLineItemActionBuilder withPerMethodExternalTaxRate(
            Function<com.commercetools.api.models.cart.MethodExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.MethodExternalTaxRateDraftBuilder> builder) {
        this.perMethodExternalTaxRate = new ArrayList<>();
        this.perMethodExternalTaxRate
                .add(builder.apply(com.commercetools.api.models.cart.MethodExternalTaxRateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sets the external Tax Rates for individual Shipping Methods, if the Cart has the <code>External</code> TaxMode and <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the perMethodExternalTaxRate value
     * @return Builder
     */

    public CartAddLineItemActionBuilder addPerMethodExternalTaxRate(
            Function<com.commercetools.api.models.cart.MethodExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.MethodExternalTaxRateDraft> builder) {
        return plusPerMethodExternalTaxRate(
            builder.apply(com.commercetools.api.models.cart.MethodExternalTaxRateDraftBuilder.of()));
    }

    /**
     *  <p>Sets the external Tax Rates for individual Shipping Methods, if the Cart has the <code>External</code> TaxMode and <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the perMethodExternalTaxRate value
     * @return Builder
     */

    public CartAddLineItemActionBuilder setPerMethodExternalTaxRate(
            Function<com.commercetools.api.models.cart.MethodExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.MethodExternalTaxRateDraft> builder) {
        return perMethodExternalTaxRate(
            builder.apply(com.commercetools.api.models.cart.MethodExternalTaxRateDraftBuilder.of()));
    }

    /**
     *  <p>Inventory mode specific to the Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Set only if the inventory mode should be different from the <code>inventoryMode</code> specified on the Cart.</p>
     * @param inventoryMode value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public CartAddLineItemActionBuilder shippingDetails(
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

    public CartAddLineItemActionBuilder withShippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraft> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p>Custom Fields for the Line Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CartAddLineItemActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Line Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CartAddLineItemActionBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Line Item.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CartAddLineItemActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
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
     *  <p><code>id</code> of the published Product.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     * @return productId
     */

    @Nullable
    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p><code>id</code> of the ProductVariant in the Product. If not provided, the Master Variant is used.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     * @return variantId
     */

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>SKU of the ProductVariant.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Quantity of the Product Variant to add to the Cart.</p>
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
     *  <p>Used to select a Product Price. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum. If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @return distributionChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     *  <p>Used to identify Inventory entries that must be reserved. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> value, and the <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
     * @return externalPrice
     */

    @Nullable
    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> values, and the <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @return externalTotalPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    /**
     *  <p>Sets the external Tax Rate for the Line Item, if the Cart has the <code>External</code> TaxMode and <code>Single</code> ShippingMode. If the Cart has <code>Multiple</code> ShippingMode, the Tax Rate is accepted but ignored.</p>
     * @return externalTaxRate
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Sets the external Tax Rates for individual Shipping Methods, if the Cart has the <code>External</code> TaxMode and <code>Multiple</code> ShippingMode.</p>
     * @return perMethodExternalTaxRate
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.MethodExternalTaxRateDraft> getPerMethodExternalTaxRate() {
        return this.perMethodExternalTaxRate;
    }

    /**
     *  <p>Inventory mode specific to the Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Set only if the inventory mode should be different from the <code>inventoryMode</code> specified on the Cart.</p>
     * @return inventoryMode
     */

    @Nullable
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
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
     *  <p>Custom Fields for the Line Item.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds CartAddLineItemAction with checking for non-null required values
     * @return CartAddLineItemAction
     */
    public CartAddLineItemAction build() {
        return new CartAddLineItemActionImpl(key, productId, variantId, sku, quantity, addedAt, distributionChannel,
            supplyChannel, externalPrice, externalTotalPrice, externalTaxRate, perMethodExternalTaxRate, inventoryMode,
            shippingDetails, custom);
    }

    /**
     * builds CartAddLineItemAction without checking for non-null required values
     * @return CartAddLineItemAction
     */
    public CartAddLineItemAction buildUnchecked() {
        return new CartAddLineItemActionImpl(key, productId, variantId, sku, quantity, addedAt, distributionChannel,
            supplyChannel, externalPrice, externalTotalPrice, externalTaxRate, perMethodExternalTaxRate, inventoryMode,
            shippingDetails, custom);
    }

    /**
     * factory method for an instance of CartAddLineItemActionBuilder
     * @return builder
     */
    public static CartAddLineItemActionBuilder of() {
        return new CartAddLineItemActionBuilder();
    }

    /**
     * create builder for CartAddLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddLineItemActionBuilder of(final CartAddLineItemAction template) {
        CartAddLineItemActionBuilder builder = new CartAddLineItemActionBuilder();
        builder.key = template.getKey();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.quantity = template.getQuantity();
        builder.addedAt = template.getAddedAt();
        builder.distributionChannel = template.getDistributionChannel();
        builder.supplyChannel = template.getSupplyChannel();
        builder.externalPrice = template.getExternalPrice();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.perMethodExternalTaxRate = template.getPerMethodExternalTaxRate();
        builder.inventoryMode = template.getInventoryMode();
        builder.shippingDetails = template.getShippingDetails();
        builder.custom = template.getCustom();
        return builder;
    }

}
