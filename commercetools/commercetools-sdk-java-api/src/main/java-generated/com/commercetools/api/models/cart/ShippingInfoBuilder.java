
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingInfoBuilder {

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
            final com.commercetools.api.models.shipping_method.ShippingRate shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    public ShippingInfoBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
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

    public ShippingInfoBuilder deliveries(
            @Nullable final java.util.List<com.commercetools.api.models.order.Delivery> deliveries) {
        this.deliveries = deliveries;
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
