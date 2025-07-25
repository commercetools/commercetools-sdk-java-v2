
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingInfoImportDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingInfoImportDraft shippingInfoImportDraft = ShippingInfoImportDraft.builder()
 *             .shippingMethodName("{shippingMethodName}")
 *             .price(priceBuilder -> priceBuilder)
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethodName</code>.</p>
     * @param shippingMethodName value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder shippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.price</code>.</p>
     * @param price value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder price(final com.commercetools.importapi.models.common.TypedMoney price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.price</code>.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder price(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.price = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Used to determine the price.</p>
     * @param builder function to build the shippingRate value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder shippingRate(
            Function<com.commercetools.importapi.models.orders.ShippingRateDraftBuilder, com.commercetools.importapi.models.orders.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.importapi.models.orders.ShippingRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Used to determine the price.</p>
     * @param builder function to build the shippingRate value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder withShippingRate(
            Function<com.commercetools.importapi.models.orders.ShippingRateDraftBuilder, com.commercetools.importapi.models.orders.ShippingRateDraft> builder) {
        this.shippingRate = builder.apply(com.commercetools.importapi.models.orders.ShippingRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Used to determine the price.</p>
     * @param shippingRate value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder shippingRate(
            final com.commercetools.importapi.models.orders.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.taxRate</code>.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder taxRate(
            Function<com.commercetools.importapi.models.prices.TaxRateBuilder, com.commercetools.importapi.models.prices.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.importapi.models.prices.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.taxRate</code>.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder withTaxRate(
            Function<com.commercetools.importapi.models.prices.TaxRateBuilder, com.commercetools.importapi.models.prices.TaxRate> builder) {
        this.taxRate = builder.apply(com.commercetools.importapi.models.prices.TaxRateBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.taxRate</code>.</p>
     * @param taxRate value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder taxRate(
            @Nullable final com.commercetools.importapi.models.prices.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.taxCategory</code>. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder taxCategory(
            Function<com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.taxCategory</code>. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder withTaxCategory(
            Function<com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.TaxCategoryKeyReference> builder) {
        this.taxCategory = builder.apply(com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.taxCategory</code>. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder taxCategory(
            @Nullable final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethod</code>. If the referenced ShippingMethod does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced ShippingMethod is created.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder shippingMethod(
            Function<com.commercetools.importapi.models.common.ShippingMethodKeyReferenceBuilder, com.commercetools.importapi.models.common.ShippingMethodKeyReferenceBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.importapi.models.common.ShippingMethodKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethod</code>. If the referenced ShippingMethod does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced ShippingMethod is created.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder withShippingMethod(
            Function<com.commercetools.importapi.models.common.ShippingMethodKeyReferenceBuilder, com.commercetools.importapi.models.common.ShippingMethodKeyReference> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.importapi.models.common.ShippingMethodKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethod</code>. If the referenced ShippingMethod does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced ShippingMethod is created.</p>
     * @param shippingMethod value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder shippingMethod(
            @Nullable final com.commercetools.importapi.models.common.ShippingMethodKeyReference shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.deliveries</code>. You cannot add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referenceable by an <code>id</code>.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder deliveries(
            @Nullable final com.commercetools.importapi.models.orders.Delivery... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.deliveries</code>. You cannot add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referenceable by an <code>id</code>.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder deliveries(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.Delivery> deliveries) {
        this.deliveries = deliveries;
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.deliveries</code>. You cannot add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referenceable by an <code>id</code>.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder plusDeliveries(
            @Nullable final com.commercetools.importapi.models.orders.Delivery... deliveries) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.addAll(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.deliveries</code>. You cannot add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referenceable by an <code>id</code>.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder plusDeliveries(
            Function<com.commercetools.importapi.models.orders.DeliveryBuilder, com.commercetools.importapi.models.orders.DeliveryBuilder> builder) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.deliveries</code>. You cannot add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referenceable by an <code>id</code>.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder withDeliveries(
            Function<com.commercetools.importapi.models.orders.DeliveryBuilder, com.commercetools.importapi.models.orders.DeliveryBuilder> builder) {
        this.deliveries = new ArrayList<>();
        this.deliveries.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.deliveries</code>. You cannot add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referenceable by an <code>id</code>.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder addDeliveries(
            Function<com.commercetools.importapi.models.orders.DeliveryBuilder, com.commercetools.importapi.models.orders.Delivery> builder) {
        return plusDeliveries(builder.apply(com.commercetools.importapi.models.orders.DeliveryBuilder.of()));
    }

    /**
     *  <p>Maps to <code>shippingInfo.deliveries</code>. You cannot add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referenceable by an <code>id</code>.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder setDeliveries(
            Function<com.commercetools.importapi.models.orders.DeliveryBuilder, com.commercetools.importapi.models.orders.Delivery> builder) {
        return deliveries(builder.apply(com.commercetools.importapi.models.orders.DeliveryBuilder.of()));
    }

    /**
     *  <p>Maps to <code>shippingInfo.discountedPrice</code>.</p>
     * @param builder function to build the discountedPrice value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder discountedPrice(
            Function<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder, com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder> builder) {
        this.discountedPrice = builder
                .apply(com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.discountedPrice</code>.</p>
     * @param builder function to build the discountedPrice value
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder withDiscountedPrice(
            Function<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder, com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> builder) {
        this.discountedPrice = builder
                .apply(com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.discountedPrice</code>.</p>
     * @param discountedPrice value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder discountedPrice(
            @Nullable final com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethodState</code>.</p>
     * @param shippingMethodState value to be set
     * @return Builder
     */

    public ShippingInfoImportDraftBuilder shippingMethodState(
            @Nullable final com.commercetools.importapi.models.orders.ShippingMethodState shippingMethodState) {
        this.shippingMethodState = shippingMethodState;
        return this;
    }

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethodName</code>.</p>
     * @return shippingMethodName
     */

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    /**
     *  <p>Maps to <code>shippingInfo.price</code>.</p>
     * @return price
     */

    public com.commercetools.importapi.models.common.TypedMoney getPrice() {
        return this.price;
    }

    /**
     *  <p>Used to determine the price.</p>
     * @return shippingRate
     */

    public com.commercetools.importapi.models.orders.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    /**
     *  <p>Maps to <code>shippingInfo.taxRate</code>.</p>
     * @return taxRate
     */

    @Nullable
    public com.commercetools.importapi.models.prices.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>Maps to <code>shippingInfo.taxCategory</code>. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethod</code>. If the referenced ShippingMethod does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced ShippingMethod is created.</p>
     * @return shippingMethod
     */

    @Nullable
    public com.commercetools.importapi.models.common.ShippingMethodKeyReference getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>Maps to <code>shippingInfo.deliveries</code>. You cannot add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referenceable by an <code>id</code>.</p>
     * @return deliveries
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.Delivery> getDeliveries() {
        return this.deliveries;
    }

    /**
     *  <p>Maps to <code>shippingInfo.discountedPrice</code>.</p>
     * @return discountedPrice
     */

    @Nullable
    public com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft getDiscountedPrice() {
        return this.discountedPrice;
    }

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethodState</code>.</p>
     * @return shippingMethodState
     */

    @Nullable
    public com.commercetools.importapi.models.orders.ShippingMethodState getShippingMethodState() {
        return this.shippingMethodState;
    }

    /**
     * builds ShippingInfoImportDraft with checking for non-null required values
     * @return ShippingInfoImportDraft
     */
    public ShippingInfoImportDraft build() {
        Objects.requireNonNull(shippingMethodName, ShippingInfoImportDraft.class + ": shippingMethodName is missing");
        Objects.requireNonNull(price, ShippingInfoImportDraft.class + ": price is missing");
        Objects.requireNonNull(shippingRate, ShippingInfoImportDraft.class + ": shippingRate is missing");
        return new ShippingInfoImportDraftImpl(shippingMethodName, price, shippingRate, taxRate, taxCategory,
            shippingMethod, deliveries, discountedPrice, shippingMethodState);
    }

    /**
     * builds ShippingInfoImportDraft without checking for non-null required values
     * @return ShippingInfoImportDraft
     */
    public ShippingInfoImportDraft buildUnchecked() {
        return new ShippingInfoImportDraftImpl(shippingMethodName, price, shippingRate, taxRate, taxCategory,
            shippingMethod, deliveries, discountedPrice, shippingMethodState);
    }

    /**
     * factory method for an instance of ShippingInfoImportDraftBuilder
     * @return builder
     */
    public static ShippingInfoImportDraftBuilder of() {
        return new ShippingInfoImportDraftBuilder();
    }

    /**
     * create builder for ShippingInfoImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
