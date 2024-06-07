
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderLineItemDiscountSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLineItemDiscountSetMessagePayload orderLineItemDiscountSetMessagePayload = OrderLineItemDiscountSetMessagePayload.builder()
 *             .lineItemId("{lineItemId}")
 *             .plusDiscountedPricePerQuantity(discountedPricePerQuantityBuilder -> discountedPricePerQuantityBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .plusTaxedPricePortions(taxedPricePortionsBuilder -> taxedPricePortionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderLineItemDiscountSetMessagePayloadBuilder implements Builder<OrderLineItemDiscountSetMessagePayload> {

    private String lineItemId;

    @Nullable
    private String lineItemKey;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    private com.commercetools.api.models.common.CentPrecisionMoney totalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    private java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions;

    /**
     *  <p>Unique identifier for the Line Item.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder discountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder plusDiscountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.addAll(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder plusDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder withDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.discountedPricePerQuantity = new ArrayList<>();
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder addDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> builder) {
        return plusDiscountedPricePerQuantity(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()));
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder setDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> builder) {
        return discountedPricePerQuantity(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()));
    }

    /**
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder totalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder withTotalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     * @param totalPrice value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder totalPrice(
            final com.commercetools.api.models.common.CentPrecisionMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder withTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder taxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each Shipping Method. Only applicable for Carts with <code>Multiple</code> ShippingMode. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder taxedPricePortions(
            final com.commercetools.api.models.cart.MethodTaxedPrice... taxedPricePortions) {
        this.taxedPricePortions = new ArrayList<>(Arrays.asList(taxedPricePortions));
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each Shipping Method. Only applicable for Carts with <code>Multiple</code> ShippingMode. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder taxedPricePortions(
            final java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions) {
        this.taxedPricePortions = taxedPricePortions;
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each Shipping Method. Only applicable for Carts with <code>Multiple</code> ShippingMode. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder plusTaxedPricePortions(
            final com.commercetools.api.models.cart.MethodTaxedPrice... taxedPricePortions) {
        if (this.taxedPricePortions == null) {
            this.taxedPricePortions = new ArrayList<>();
        }
        this.taxedPricePortions.addAll(Arrays.asList(taxedPricePortions));
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each Shipping Method. Only applicable for Carts with <code>Multiple</code> ShippingMode. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder plusTaxedPricePortions(
            Function<com.commercetools.api.models.cart.MethodTaxedPriceBuilder, com.commercetools.api.models.cart.MethodTaxedPriceBuilder> builder) {
        if (this.taxedPricePortions == null) {
            this.taxedPricePortions = new ArrayList<>();
        }
        this.taxedPricePortions
                .add(builder.apply(com.commercetools.api.models.cart.MethodTaxedPriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each Shipping Method. Only applicable for Carts with <code>Multiple</code> ShippingMode. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder withTaxedPricePortions(
            Function<com.commercetools.api.models.cart.MethodTaxedPriceBuilder, com.commercetools.api.models.cart.MethodTaxedPriceBuilder> builder) {
        this.taxedPricePortions = new ArrayList<>();
        this.taxedPricePortions
                .add(builder.apply(com.commercetools.api.models.cart.MethodTaxedPriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each Shipping Method. Only applicable for Carts with <code>Multiple</code> ShippingMode. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder addTaxedPricePortions(
            Function<com.commercetools.api.models.cart.MethodTaxedPriceBuilder, com.commercetools.api.models.cart.MethodTaxedPrice> builder) {
        return plusTaxedPricePortions(builder.apply(com.commercetools.api.models.cart.MethodTaxedPriceBuilder.of()));
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each Shipping Method. Only applicable for Carts with <code>Multiple</code> ShippingMode. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessagePayloadBuilder setTaxedPricePortions(
            Function<com.commercetools.api.models.cart.MethodTaxedPriceBuilder, com.commercetools.api.models.cart.MethodTaxedPrice> builder) {
        return taxedPricePortions(builder.apply(com.commercetools.api.models.cart.MethodTaxedPriceBuilder.of()));
    }

    /**
     *  <p>Unique identifier for the Line Item.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @return discountedPricePerQuantity
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    /**
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     * @return totalPrice
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each Shipping Method. Only applicable for Carts with <code>Multiple</code> ShippingMode. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @return taxedPricePortions
     */

    public java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> getTaxedPricePortions() {
        return this.taxedPricePortions;
    }

    /**
     * builds OrderLineItemDiscountSetMessagePayload with checking for non-null required values
     * @return OrderLineItemDiscountSetMessagePayload
     */
    public OrderLineItemDiscountSetMessagePayload build() {
        Objects.requireNonNull(lineItemId, OrderLineItemDiscountSetMessagePayload.class + ": lineItemId is missing");
        Objects.requireNonNull(discountedPricePerQuantity,
            OrderLineItemDiscountSetMessagePayload.class + ": discountedPricePerQuantity is missing");
        Objects.requireNonNull(totalPrice, OrderLineItemDiscountSetMessagePayload.class + ": totalPrice is missing");
        Objects.requireNonNull(taxedPricePortions,
            OrderLineItemDiscountSetMessagePayload.class + ": taxedPricePortions is missing");
        return new OrderLineItemDiscountSetMessagePayloadImpl(lineItemId, lineItemKey, discountedPricePerQuantity,
            totalPrice, taxedPrice, taxedPricePortions);
    }

    /**
     * builds OrderLineItemDiscountSetMessagePayload without checking for non-null required values
     * @return OrderLineItemDiscountSetMessagePayload
     */
    public OrderLineItemDiscountSetMessagePayload buildUnchecked() {
        return new OrderLineItemDiscountSetMessagePayloadImpl(lineItemId, lineItemKey, discountedPricePerQuantity,
            totalPrice, taxedPrice, taxedPricePortions);
    }

    /**
     * factory method for an instance of OrderLineItemDiscountSetMessagePayloadBuilder
     * @return builder
     */
    public static OrderLineItemDiscountSetMessagePayloadBuilder of() {
        return new OrderLineItemDiscountSetMessagePayloadBuilder();
    }

    /**
     * create builder for OrderLineItemDiscountSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLineItemDiscountSetMessagePayloadBuilder of(
            final OrderLineItemDiscountSetMessagePayload template) {
        OrderLineItemDiscountSetMessagePayloadBuilder builder = new OrderLineItemDiscountSetMessagePayloadBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.taxedPricePortions = template.getTaxedPricePortions();
        return builder;
    }

}
