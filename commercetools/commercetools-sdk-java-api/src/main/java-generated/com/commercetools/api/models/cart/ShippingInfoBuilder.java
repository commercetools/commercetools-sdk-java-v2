
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingInfoBuilder implements Builder<ShippingInfo> {

    private String shippingMethodName;

    private com.commercetools.api.models.common.TypedMoney price;

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

    public ShippingInfoBuilder shippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }

    public ShippingInfoBuilder price(final com.commercetools.api.models.common.TypedMoney price) {
        this.price = price;
        return this;
    }

    public ShippingInfoBuilder shippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateBuilder, com.commercetools.api.models.shipping_method.ShippingRateBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateBuilder.of())
                .build();
        return this;
    }

    public ShippingInfoBuilder shippingRate(
            final com.commercetools.api.models.shipping_method.ShippingRate shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    public ShippingInfoBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    public ShippingInfoBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    public ShippingInfoBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }

    public ShippingInfoBuilder taxRate(@Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public ShippingInfoBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public ShippingInfoBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    public ShippingInfoBuilder deliveries(@Nullable final com.commercetools.api.models.order.Delivery... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
        return this;
    }

    public ShippingInfoBuilder withDeliveries(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        this.deliveries = new ArrayList<>();
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build());
        return this;
    }

    public ShippingInfoBuilder plusDeliveries(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build());
        return this;
    }

    public ShippingInfoBuilder deliveries(
            @Nullable final java.util.List<com.commercetools.api.models.order.Delivery> deliveries) {
        this.deliveries = deliveries;
        return this;
    }

    public ShippingInfoBuilder discountedPrice(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceBuilder> builder) {
        this.discountedPrice = builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceBuilder.of())
                .build();
        return this;
    }

    public ShippingInfoBuilder discountedPrice(
            @Nullable final com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    public ShippingInfoBuilder shippingMethodState(
            final com.commercetools.api.models.cart.ShippingMethodState shippingMethodState) {
        this.shippingMethodState = shippingMethodState;
        return this;
    }

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    public com.commercetools.api.models.common.TypedMoney getPrice() {
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
