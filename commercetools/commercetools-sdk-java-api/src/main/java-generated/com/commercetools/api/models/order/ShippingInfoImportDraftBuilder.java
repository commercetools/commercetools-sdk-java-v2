
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingInfoImportDraftBuilder implements Builder<ShippingInfoImportDraft> {

    private String shippingMethodName;

    private com.commercetools.api.models.common.Money price;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.Delivery> deliveries;

    @Nullable
    private com.commercetools.api.models.order.DiscountedLineItemPriceDraft discountedPrice;

    @Nullable
    private com.commercetools.api.models.cart.ShippingMethodState shippingMethodState;

    public ShippingInfoImportDraftBuilder shippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }

    public ShippingInfoImportDraftBuilder price(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public ShippingInfoImportDraftBuilder price(final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }

    public ShippingInfoImportDraftBuilder shippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of())
                .build();
        return this;
    }

    public ShippingInfoImportDraftBuilder shippingRate(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    public ShippingInfoImportDraftBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }

    public ShippingInfoImportDraftBuilder taxRate(
            @Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public ShippingInfoImportDraftBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public ShippingInfoImportDraftBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    public ShippingInfoImportDraftBuilder deliveries(
            @Nullable final com.commercetools.api.models.order.Delivery... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
        return this;
    }

    public ShippingInfoImportDraftBuilder withDeliveries(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        this.deliveries = new ArrayList<>();
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build());
        return this;
    }

    public ShippingInfoImportDraftBuilder plusDeliveries(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build());
        return this;
    }

    public ShippingInfoImportDraftBuilder deliveries(
            @Nullable final java.util.List<com.commercetools.api.models.order.Delivery> deliveries) {
        this.deliveries = deliveries;
        return this;
    }

    public ShippingInfoImportDraftBuilder discountedPrice(
            Function<com.commercetools.api.models.order.DiscountedLineItemPriceDraftBuilder, com.commercetools.api.models.order.DiscountedLineItemPriceDraftBuilder> builder) {
        this.discountedPrice = builder
                .apply(com.commercetools.api.models.order.DiscountedLineItemPriceDraftBuilder.of())
                .build();
        return this;
    }

    public ShippingInfoImportDraftBuilder discountedPrice(
            @Nullable final com.commercetools.api.models.order.DiscountedLineItemPriceDraft discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    public ShippingInfoImportDraftBuilder shippingMethodState(
            @Nullable final com.commercetools.api.models.cart.ShippingMethodState shippingMethodState) {
        this.shippingMethodState = shippingMethodState;
        return this;
    }

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.Delivery> getDeliveries() {
        return this.deliveries;
    }

    @Nullable
    public com.commercetools.api.models.order.DiscountedLineItemPriceDraft getDiscountedPrice() {
        return this.discountedPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingMethodState getShippingMethodState() {
        return this.shippingMethodState;
    }

    public ShippingInfoImportDraft build() {
        Objects.requireNonNull(shippingMethodName, ShippingInfoImportDraft.class + ": shippingMethodName is missing");
        Objects.requireNonNull(price, ShippingInfoImportDraft.class + ": price is missing");
        Objects.requireNonNull(shippingRate, ShippingInfoImportDraft.class + ": shippingRate is missing");
        return new ShippingInfoImportDraftImpl(shippingMethodName, price, shippingRate, taxRate, taxCategory,
            shippingMethod, deliveries, discountedPrice, shippingMethodState);
    }

    /**
     * builds ShippingInfoImportDraft without checking for non null required values
     */
    public ShippingInfoImportDraft buildUnchecked() {
        return new ShippingInfoImportDraftImpl(shippingMethodName, price, shippingRate, taxRate, taxCategory,
            shippingMethod, deliveries, discountedPrice, shippingMethodState);
    }

    public static ShippingInfoImportDraftBuilder of() {
        return new ShippingInfoImportDraftBuilder();
    }

    public static ShippingInfoImportDraftBuilder of(final ShippingInfoImportDraft template) {
        ShippingInfoImportDraftBuilder builder = new ShippingInfoImportDraftBuilder();
        builder.shippingMethodName = template.getShippingMethodName();
        builder.price = template.getPrice();
        builder.shippingRate = template.getShippingRate();
        builder.taxRate = template.getTaxRate();
        builder.taxCategory = template.getTaxCategory();
        builder.shippingMethod = template.getShippingMethod();
        builder.deliveries = template.getDeliveries();
        builder.discountedPrice = template.getDiscountedPrice();
        builder.shippingMethodState = template.getShippingMethodState();
        return builder;
    }

}
