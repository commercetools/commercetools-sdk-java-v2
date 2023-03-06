
package com.commercetools.api.models.cart;

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

    private com.commercetools.api.models.common.CentPrecisionMoney price;

    private com.commercetools.api.models.shipping_method.ShippingRate shippingRate;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.Delivery> deliveries;

    @Nullable
    private com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice;

    private com.commercetools.api.models.cart.ShippingMethodState shippingMethodState;

    /**
     *  <p>Name of the Shipping Method.</p>
     */

    public ShippingInfoBuilder shippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }

    /**
     *  <p>Determined based on the ShippingRate and its tiered prices, and either the sum of LineItem prices or the <code>shippingRateInput</code> field.</p>
     */

    public ShippingInfoBuilder price(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Determined based on the ShippingRate and its tiered prices, and either the sum of LineItem prices or the <code>shippingRateInput</code> field.</p>
     */

    public ShippingInfoBuilder price(final com.commercetools.api.models.common.CentPrecisionMoney price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Used to determine the price.</p>
     */

    public ShippingInfoBuilder shippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateBuilder, com.commercetools.api.models.shipping_method.ShippingRateBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Used to determine the price.</p>
     */

    public ShippingInfoBuilder shippingRate(
            final com.commercetools.api.models.shipping_method.ShippingRate shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     */

    public ShippingInfoBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     */

    public ShippingInfoBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Automatically set in the <code>Platform</code> TaxMode after the shipping address is set.</p>
     *  <p>For the <code>External</code> TaxMode the Tax Rate must be set explicitly with the ExternalTaxRateDraft.</p>
     */

    public ShippingInfoBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Automatically set in the <code>Platform</code> TaxMode after the shipping address is set.</p>
     *  <p>For the <code>External</code> TaxMode the Tax Rate must be set explicitly with the ExternalTaxRateDraft.</p>
     */

    public ShippingInfoBuilder taxRate(@Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     */

    public ShippingInfoBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder, com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     */

    public ShippingInfoBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>Not set if a custom Shipping Method is used.</p>
     */

    public ShippingInfoBuilder shippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder, com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Not set if a custom Shipping Method is used.</p>
     */

    public ShippingInfoBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     */

    public ShippingInfoBuilder deliveries(@Nullable final com.commercetools.api.models.order.Delivery... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     */

    public ShippingInfoBuilder deliveries(
            @Nullable final java.util.List<com.commercetools.api.models.order.Delivery> deliveries) {
        this.deliveries = deliveries;
        return this;
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     */

    public ShippingInfoBuilder plusDeliveries(
            @Nullable final com.commercetools.api.models.order.Delivery... deliveries) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.addAll(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     */

    public ShippingInfoBuilder plusDeliveries(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     */

    public ShippingInfoBuilder withDeliveries(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        this.deliveries = new ArrayList<>();
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discounted price of the Shipping Method.</p>
     */

    public ShippingInfoBuilder discountedPrice(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceBuilder> builder) {
        this.discountedPrice = builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Discounted price of the Shipping Method.</p>
     */

    public ShippingInfoBuilder discountedPrice(
            @Nullable final com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    /**
     *  <p>Indicates whether the ShippingMethod referenced in this ShippingInfo is allowed for the Cart.</p>
     */

    public ShippingInfoBuilder shippingMethodState(
            final com.commercetools.api.models.cart.ShippingMethodState shippingMethodState) {
        this.shippingMethodState = shippingMethodState;
        return this;
    }

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    public com.commercetools.api.models.common.CentPrecisionMoney getPrice() {
        return this.price;
    }

    public com.commercetools.api.models.shipping_method.ShippingRate getShippingRate() {
        return this.shippingRate;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodReference getShippingMethod() {
        return this.shippingMethod;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.Delivery> getDeliveries() {
        return this.deliveries;
    }

    @Nullable
    public com.commercetools.api.models.cart.DiscountedLineItemPrice getDiscountedPrice() {
        return this.discountedPrice;
    }

    public com.commercetools.api.models.cart.ShippingMethodState getShippingMethodState() {
        return this.shippingMethodState;
    }

    public ShippingInfo build() {
        Objects.requireNonNull(shippingMethodName, ShippingInfo.class + ": shippingMethodName is missing");
        Objects.requireNonNull(price, ShippingInfo.class + ": price is missing");
        Objects.requireNonNull(shippingRate, ShippingInfo.class + ": shippingRate is missing");
        Objects.requireNonNull(shippingMethodState, ShippingInfo.class + ": shippingMethodState is missing");
        return new ShippingInfoImpl(shippingMethodName, price, shippingRate, taxedPrice, taxRate, taxCategory,
            shippingMethod, deliveries, discountedPrice, shippingMethodState);
    }

    /**
     * builds ShippingInfo without checking for non null required values
     */
    public ShippingInfo buildUnchecked() {
        return new ShippingInfoImpl(shippingMethodName, price, shippingRate, taxedPrice, taxRate, taxCategory,
            shippingMethod, deliveries, discountedPrice, shippingMethodState);
    }

    public static ShippingInfoBuilder of() {
        return new ShippingInfoBuilder();
    }

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
