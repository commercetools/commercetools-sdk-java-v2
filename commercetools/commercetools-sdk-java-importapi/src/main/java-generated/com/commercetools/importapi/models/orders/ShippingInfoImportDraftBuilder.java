
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingInfoImportDraftBuilder implements Builder<ShippingInfoImportDraft> {

    private String shippingMethodName;

    private com.commercetools.importapi.models.common.TypedMoney price;

    private com.commercetools.importapi.models.orders.ShippingRateDraft shippingRate;

    @Nullable
    private com.commercetools.importapi.models.prices.TaxRate taxRate;

    @Nullable
    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;

    @Nullable
    private com.commercetools.importapi.models.common.ShippingMethodKeyReference shippingMethod;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.Delivery> deliveries;

    @Nullable
    private com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft discountedPrice;

    @Nullable
    private com.commercetools.importapi.models.orders.ShippingMethodState shippingMethodState;

    public ShippingInfoImportDraftBuilder shippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }

    public ShippingInfoImportDraftBuilder price(final com.commercetools.importapi.models.common.TypedMoney price) {
        this.price = price;
        return this;
    }

    public ShippingInfoImportDraftBuilder price(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.price = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    public ShippingInfoImportDraftBuilder shippingRate(
            Function<com.commercetools.importapi.models.orders.ShippingRateDraftBuilder, com.commercetools.importapi.models.orders.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.importapi.models.orders.ShippingRateDraftBuilder.of())
                .build();
        return this;
    }

    public ShippingInfoImportDraftBuilder shippingRate(
            final com.commercetools.importapi.models.orders.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    public ShippingInfoImportDraftBuilder taxRate(
            Function<com.commercetools.importapi.models.prices.TaxRateBuilder, com.commercetools.importapi.models.prices.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.importapi.models.prices.TaxRateBuilder.of()).build();
        return this;
    }

    public ShippingInfoImportDraftBuilder taxRate(
            @Nullable final com.commercetools.importapi.models.prices.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public ShippingInfoImportDraftBuilder taxCategory(
            Function<com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder.of())
                .build();
        return this;
    }

    public ShippingInfoImportDraftBuilder taxCategory(
            @Nullable final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public ShippingInfoImportDraftBuilder shippingMethod(
            Function<com.commercetools.importapi.models.common.ShippingMethodKeyReferenceBuilder, com.commercetools.importapi.models.common.ShippingMethodKeyReferenceBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.importapi.models.common.ShippingMethodKeyReferenceBuilder.of())
                .build();
        return this;
    }

    public ShippingInfoImportDraftBuilder shippingMethod(
            @Nullable final com.commercetools.importapi.models.common.ShippingMethodKeyReference shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    public ShippingInfoImportDraftBuilder deliveries(
            @Nullable final com.commercetools.importapi.models.orders.Delivery... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
        return this;
    }

    public ShippingInfoImportDraftBuilder deliveries(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.Delivery> deliveries) {
        this.deliveries = deliveries;
        return this;
    }

    public ShippingInfoImportDraftBuilder plusDeliveries(
            @Nullable final com.commercetools.importapi.models.orders.Delivery... deliveries) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.addAll(Arrays.asList(deliveries));
        return this;
    }

    public ShippingInfoImportDraftBuilder plusDeliveries(
            Function<com.commercetools.importapi.models.orders.DeliveryBuilder, com.commercetools.importapi.models.orders.DeliveryBuilder> builder) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryBuilder.of()).build());
        return this;
    }

    public ShippingInfoImportDraftBuilder withDeliveries(
            Function<com.commercetools.importapi.models.orders.DeliveryBuilder, com.commercetools.importapi.models.orders.DeliveryBuilder> builder) {
        this.deliveries = new ArrayList<>();
        this.deliveries.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryBuilder.of()).build());
        return this;
    }

    public ShippingInfoImportDraftBuilder discountedPrice(
            Function<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder, com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder> builder) {
        this.discountedPrice = builder
                .apply(com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder.of())
                .build();
        return this;
    }

    public ShippingInfoImportDraftBuilder discountedPrice(
            @Nullable final com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    public ShippingInfoImportDraftBuilder shippingMethodState(
            @Nullable final com.commercetools.importapi.models.orders.ShippingMethodState shippingMethodState) {
        this.shippingMethodState = shippingMethodState;
        return this;
    }

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    public com.commercetools.importapi.models.common.TypedMoney getPrice() {
        return this.price;
    }

    public com.commercetools.importapi.models.orders.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    @Nullable
    public com.commercetools.importapi.models.prices.TaxRate getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public com.commercetools.importapi.models.common.ShippingMethodKeyReference getShippingMethod() {
        return this.shippingMethod;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.Delivery> getDeliveries() {
        return this.deliveries;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft getDiscountedPrice() {
        return this.discountedPrice;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.ShippingMethodState getShippingMethodState() {
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
