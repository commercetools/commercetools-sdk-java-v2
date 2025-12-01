
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingInfoBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingInfo shippingInfo = ShippingInfo.builder()
 *             .shippingMethodName("{shippingMethodName}")
 *             .price(priceBuilder -> priceBuilder)
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .shippingMethodState(ShippingMethodState.DOES_NOT_MATCH_CART)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingInfoBuilder implements Builder<ShippingInfo> {

    private String shippingMethodName;

    private com.commercetools.history.models.common.CentPrecisionMoney price;

    private com.commercetools.history.models.common.ShippingRate shippingRate;

    @Nullable
    private com.commercetools.history.models.common.TaxedItemPrice taxedPrice;

    @Nullable
    private com.commercetools.history.models.common.TaxRate taxRate;

    @Nullable
    private com.commercetools.history.models.common.TaxCategoryReference taxCategory;

    @Nullable
    private com.commercetools.history.models.common.ShippingMethodReference shippingMethod;

    @Nullable
    private java.util.List<com.commercetools.history.models.common.Delivery> deliveries;

    @Nullable
    private com.commercetools.history.models.common.DiscountedLineItemPrice discountedPrice;

    private com.commercetools.history.models.common.ShippingMethodState shippingMethodState;

    /**
     *  <p>Name of the Shipping Method.</p>
     * @param shippingMethodName value to be set
     * @return Builder
     */

    public ShippingInfoBuilder shippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }

    /**
     *  <p>Determined based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRate" rel="nofollow">ShippingRate</a> and its tiered prices, and either the sum of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> prices or the <code>shippingRateInput</code> field.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public ShippingInfoBuilder price(
            Function<com.commercetools.history.models.common.CentPrecisionMoneyBuilder, com.commercetools.history.models.common.CentPrecisionMoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.history.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Determined based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRate" rel="nofollow">ShippingRate</a> and its tiered prices, and either the sum of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> prices or the <code>shippingRateInput</code> field.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public ShippingInfoBuilder withPrice(
            Function<com.commercetools.history.models.common.CentPrecisionMoneyBuilder, com.commercetools.history.models.common.CentPrecisionMoney> builder) {
        this.price = builder.apply(com.commercetools.history.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Determined based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRate" rel="nofollow">ShippingRate</a> and its tiered prices, and either the sum of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> prices or the <code>shippingRateInput</code> field.</p>
     * @param price value to be set
     * @return Builder
     */

    public ShippingInfoBuilder price(final com.commercetools.history.models.common.CentPrecisionMoney price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Used to determine the price.</p>
     * @param builder function to build the shippingRate value
     * @return Builder
     */

    public ShippingInfoBuilder shippingRate(
            Function<com.commercetools.history.models.common.ShippingRateBuilder, com.commercetools.history.models.common.ShippingRateBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.history.models.common.ShippingRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Used to determine the price.</p>
     * @param builder function to build the shippingRate value
     * @return Builder
     */

    public ShippingInfoBuilder withShippingRate(
            Function<com.commercetools.history.models.common.ShippingRateBuilder, com.commercetools.history.models.common.ShippingRate> builder) {
        this.shippingRate = builder.apply(com.commercetools.history.models.common.ShippingRateBuilder.of());
        return this;
    }

    /**
     *  <p>Used to determine the price.</p>
     * @param shippingRate value to be set
     * @return Builder
     */

    public ShippingInfoBuilder shippingRate(final com.commercetools.history.models.common.ShippingRate shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public ShippingInfoBuilder taxedPrice(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public ShippingInfoBuilder withTaxedPrice(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public ShippingInfoBuilder taxedPrice(
            @Nullable final com.commercetools.history.models.common.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Automatically set in the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingAddressAction" rel="nofollow">shipping address is set</a>.</p>
     *  <p>For the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> the Tax Rate must be set explicitly with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public ShippingInfoBuilder taxRate(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Automatically set in the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingAddressAction" rel="nofollow">shipping address is set</a>.</p>
     *  <p>For the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> the Tax Rate must be set explicitly with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public ShippingInfoBuilder withTaxRate(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRate> builder) {
        this.taxRate = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of());
        return this;
    }

    /**
     *  <p>Automatically set in the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingAddressAction" rel="nofollow">shipping address is set</a>.</p>
     *  <p>For the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> the Tax Rate must be set explicitly with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param taxRate value to be set
     * @return Builder
     */

    public ShippingInfoBuilder taxRate(@Nullable final com.commercetools.history.models.common.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ShippingInfoBuilder taxCategory(
            Function<com.commercetools.history.models.common.TaxCategoryReferenceBuilder, com.commercetools.history.models.common.TaxCategoryReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.history.models.common.TaxCategoryReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ShippingInfoBuilder withTaxCategory(
            Function<com.commercetools.history.models.common.TaxCategoryReferenceBuilder, com.commercetools.history.models.common.TaxCategoryReference> builder) {
        this.taxCategory = builder.apply(com.commercetools.history.models.common.TaxCategoryReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public ShippingInfoBuilder taxCategory(
            @Nullable final com.commercetools.history.models.common.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>Not set if a custom Shipping Method is used.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public ShippingInfoBuilder shippingMethod(
            Function<com.commercetools.history.models.common.ShippingMethodReferenceBuilder, com.commercetools.history.models.common.ShippingMethodReferenceBuilder> builder) {
        this.shippingMethod = builder.apply(com.commercetools.history.models.common.ShippingMethodReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Not set if a custom Shipping Method is used.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public ShippingInfoBuilder withShippingMethod(
            Function<com.commercetools.history.models.common.ShippingMethodReferenceBuilder, com.commercetools.history.models.common.ShippingMethodReference> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.history.models.common.ShippingMethodReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Not set if a custom Shipping Method is used.</p>
     * @param shippingMethod value to be set
     * @return Builder
     */

    public ShippingInfoBuilder shippingMethod(
            @Nullable final com.commercetools.history.models.common.ShippingMethodReference shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public ShippingInfoBuilder deliveries(
            @Nullable final com.commercetools.history.models.common.Delivery... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public ShippingInfoBuilder deliveries(
            @Nullable final java.util.List<com.commercetools.history.models.common.Delivery> deliveries) {
        this.deliveries = deliveries;
        return this;
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public ShippingInfoBuilder plusDeliveries(
            @Nullable final com.commercetools.history.models.common.Delivery... deliveries) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.addAll(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public ShippingInfoBuilder plusDeliveries(
            Function<com.commercetools.history.models.common.DeliveryBuilder, com.commercetools.history.models.common.DeliveryBuilder> builder) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.add(builder.apply(com.commercetools.history.models.common.DeliveryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public ShippingInfoBuilder withDeliveries(
            Function<com.commercetools.history.models.common.DeliveryBuilder, com.commercetools.history.models.common.DeliveryBuilder> builder) {
        this.deliveries = new ArrayList<>();
        this.deliveries.add(builder.apply(com.commercetools.history.models.common.DeliveryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public ShippingInfoBuilder addDeliveries(
            Function<com.commercetools.history.models.common.DeliveryBuilder, com.commercetools.history.models.common.Delivery> builder) {
        return plusDeliveries(builder.apply(com.commercetools.history.models.common.DeliveryBuilder.of()));
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public ShippingInfoBuilder setDeliveries(
            Function<com.commercetools.history.models.common.DeliveryBuilder, com.commercetools.history.models.common.Delivery> builder) {
        return deliveries(builder.apply(com.commercetools.history.models.common.DeliveryBuilder.of()));
    }

    /**
     *  <p>Discounted price of the Shipping Method.</p>
     * @param builder function to build the discountedPrice value
     * @return Builder
     */

    public ShippingInfoBuilder discountedPrice(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceBuilder> builder) {
        this.discountedPrice = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Discounted price of the Shipping Method.</p>
     * @param builder function to build the discountedPrice value
     * @return Builder
     */

    public ShippingInfoBuilder withDiscountedPrice(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPrice> builder) {
        this.discountedPrice = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Discounted price of the Shipping Method.</p>
     * @param discountedPrice value to be set
     * @return Builder
     */

    public ShippingInfoBuilder discountedPrice(
            @Nullable final com.commercetools.history.models.common.DiscountedLineItemPrice discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    /**
     *  <p>Indicates whether the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> referenced in this ShippingInfo is allowed for the Cart.</p>
     * @param shippingMethodState value to be set
     * @return Builder
     */

    public ShippingInfoBuilder shippingMethodState(
            final com.commercetools.history.models.common.ShippingMethodState shippingMethodState) {
        this.shippingMethodState = shippingMethodState;
        return this;
    }

    /**
     *  <p>Name of the Shipping Method.</p>
     * @return shippingMethodName
     */

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    /**
     *  <p>Determined based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRate" rel="nofollow">ShippingRate</a> and its tiered prices, and either the sum of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> prices or the <code>shippingRateInput</code> field.</p>
     * @return price
     */

    public com.commercetools.history.models.common.CentPrecisionMoney getPrice() {
        return this.price;
    }

    /**
     *  <p>Used to determine the price.</p>
     * @return shippingRate
     */

    public com.commercetools.history.models.common.ShippingRate getShippingRate() {
        return this.shippingRate;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.history.models.common.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Automatically set in the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingAddressAction" rel="nofollow">shipping address is set</a>.</p>
     *  <p>For the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> the Tax Rate must be set explicitly with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @return taxRate
     */

    @Nullable
    public com.commercetools.history.models.common.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.history.models.common.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Not set if a custom Shipping Method is used.</p>
     * @return shippingMethod
     */

    @Nullable
    public com.commercetools.history.models.common.ShippingMethodReference getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     * @return deliveries
     */

    @Nullable
    public java.util.List<com.commercetools.history.models.common.Delivery> getDeliveries() {
        return this.deliveries;
    }

    /**
     *  <p>Discounted price of the Shipping Method.</p>
     * @return discountedPrice
     */

    @Nullable
    public com.commercetools.history.models.common.DiscountedLineItemPrice getDiscountedPrice() {
        return this.discountedPrice;
    }

    /**
     *  <p>Indicates whether the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> referenced in this ShippingInfo is allowed for the Cart.</p>
     * @return shippingMethodState
     */

    public com.commercetools.history.models.common.ShippingMethodState getShippingMethodState() {
        return this.shippingMethodState;
    }

    /**
     * builds ShippingInfo with checking for non-null required values
     * @return ShippingInfo
     */
    public ShippingInfo build() {
        Objects.requireNonNull(shippingMethodName, ShippingInfo.class + ": shippingMethodName is missing");
        Objects.requireNonNull(price, ShippingInfo.class + ": price is missing");
        Objects.requireNonNull(shippingRate, ShippingInfo.class + ": shippingRate is missing");
        Objects.requireNonNull(shippingMethodState, ShippingInfo.class + ": shippingMethodState is missing");
        return new ShippingInfoImpl(shippingMethodName, price, shippingRate, taxedPrice, taxRate, taxCategory,
            shippingMethod, deliveries, discountedPrice, shippingMethodState);
    }

    /**
     * builds ShippingInfo without checking for non-null required values
     * @return ShippingInfo
     */
    public ShippingInfo buildUnchecked() {
        return new ShippingInfoImpl(shippingMethodName, price, shippingRate, taxedPrice, taxRate, taxCategory,
            shippingMethod, deliveries, discountedPrice, shippingMethodState);
    }

    /**
     * factory method for an instance of ShippingInfoBuilder
     * @return builder
     */
    public static ShippingInfoBuilder of() {
        return new ShippingInfoBuilder();
    }

    /**
     * create builder for ShippingInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingInfoBuilder of(final ShippingInfo template) {
        ShippingInfoBuilder builder = new ShippingInfoBuilder();
        builder.shippingMethodName = template.getShippingMethodName();
        builder.price = template.getPrice();
        builder.shippingRate = template.getShippingRate();
        builder.taxedPrice = template.getTaxedPrice();
        builder.taxRate = template.getTaxRate();
        builder.taxCategory = template.getTaxCategory();
        builder.shippingMethod = template.getShippingMethod();
        builder.deliveries = template.getDeliveries();
        builder.discountedPrice = template.getDiscountedPrice();
        builder.shippingMethodState = template.getShippingMethodState();
        return builder;
    }

}
