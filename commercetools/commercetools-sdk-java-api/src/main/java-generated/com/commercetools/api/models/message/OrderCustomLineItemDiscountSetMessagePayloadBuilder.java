
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomLineItemDiscountSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemDiscountSetMessagePayload orderCustomLineItemDiscountSetMessagePayload = OrderCustomLineItemDiscountSetMessagePayload.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .plusDiscountedPricePerQuantity(discountedPricePerQuantityBuilder -> discountedPricePerQuantityBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomLineItemDiscountSetMessagePayloadBuilder
        implements Builder<OrderCustomLineItemDiscountSetMessagePayload> {

    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    /**
     *  <p>Unique identifier for the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder customLineItemKey(
            @Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>Array of <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountedLineItemPriceForQuantity" rel="nofollow">DiscountedLineItemPriceForQuantity</a> after the Discount recalculation.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder discountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Array of <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountedLineItemPriceForQuantity" rel="nofollow">DiscountedLineItemPriceForQuantity</a> after the Discount recalculation.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    /**
     *  <p>Array of <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountedLineItemPriceForQuantity" rel="nofollow">DiscountedLineItemPriceForQuantity</a> after the Discount recalculation.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder plusDiscountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.addAll(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Array of <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountedLineItemPriceForQuantity" rel="nofollow">DiscountedLineItemPriceForQuantity</a> after the Discount recalculation.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder plusDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Array of <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountedLineItemPriceForQuantity" rel="nofollow">DiscountedLineItemPriceForQuantity</a> after the Discount recalculation.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder withDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.discountedPricePerQuantity = new ArrayList<>();
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Array of <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountedLineItemPriceForQuantity" rel="nofollow">DiscountedLineItemPriceForQuantity</a> after the Discount recalculation.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder addDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> builder) {
        return plusDiscountedPricePerQuantity(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()));
    }

    /**
     *  <p>Array of <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountedLineItemPriceForQuantity" rel="nofollow">DiscountedLineItemPriceForQuantity</a> after the Discount recalculation.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder setDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> builder) {
        return discountedPricePerQuantity(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:TaxedItemPrice" rel="nofollow">TaxedItemPrice</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> after the Discount recalculation.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:TaxedItemPrice" rel="nofollow">TaxedItemPrice</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> after the Discount recalculation.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder withTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:TaxedItemPrice" rel="nofollow">TaxedItemPrice</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> after the Discount recalculation.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder taxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Unique identifier for the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>Array of <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountedLineItemPriceForQuantity" rel="nofollow">DiscountedLineItemPriceForQuantity</a> after the Discount recalculation.</p>
     * @return discountedPricePerQuantity
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:TaxedItemPrice" rel="nofollow">TaxedItemPrice</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> after the Discount recalculation.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     * builds OrderCustomLineItemDiscountSetMessagePayload with checking for non-null required values
     * @return OrderCustomLineItemDiscountSetMessagePayload
     */
    public OrderCustomLineItemDiscountSetMessagePayload build() {
        Objects.requireNonNull(customLineItemId,
            OrderCustomLineItemDiscountSetMessagePayload.class + ": customLineItemId is missing");
        Objects.requireNonNull(discountedPricePerQuantity,
            OrderCustomLineItemDiscountSetMessagePayload.class + ": discountedPricePerQuantity is missing");
        return new OrderCustomLineItemDiscountSetMessagePayloadImpl(customLineItemId, customLineItemKey,
            discountedPricePerQuantity, taxedPrice);
    }

    /**
     * builds OrderCustomLineItemDiscountSetMessagePayload without checking for non-null required values
     * @return OrderCustomLineItemDiscountSetMessagePayload
     */
    public OrderCustomLineItemDiscountSetMessagePayload buildUnchecked() {
        return new OrderCustomLineItemDiscountSetMessagePayloadImpl(customLineItemId, customLineItemKey,
            discountedPricePerQuantity, taxedPrice);
    }

    /**
     * factory method for an instance of OrderCustomLineItemDiscountSetMessagePayloadBuilder
     * @return builder
     */
    public static OrderCustomLineItemDiscountSetMessagePayloadBuilder of() {
        return new OrderCustomLineItemDiscountSetMessagePayloadBuilder();
    }

    /**
     * create builder for OrderCustomLineItemDiscountSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomLineItemDiscountSetMessagePayloadBuilder of(
            final OrderCustomLineItemDiscountSetMessagePayload template) {
        OrderCustomLineItemDiscountSetMessagePayloadBuilder builder = new OrderCustomLineItemDiscountSetMessagePayloadBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.taxedPrice = template.getTaxedPrice();
        return builder;
    }

}
