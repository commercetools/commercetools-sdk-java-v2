
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

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    /**
     *  <p>Unique identifier for the Custom Line Item.</p>
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder discountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
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
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
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
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder withDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.discountedPricePerQuantity = new ArrayList<>();
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Custom Line Item after the Discount recalculation.</p>
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Custom Line Item after the Discount recalculation.</p>
     */

    public OrderCustomLineItemDiscountSetMessagePayloadBuilder taxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public OrderCustomLineItemDiscountSetMessagePayload build() {
        Objects.requireNonNull(customLineItemId,
            OrderCustomLineItemDiscountSetMessagePayload.class + ": customLineItemId is missing");
        Objects.requireNonNull(discountedPricePerQuantity,
            OrderCustomLineItemDiscountSetMessagePayload.class + ": discountedPricePerQuantity is missing");
        return new OrderCustomLineItemDiscountSetMessagePayloadImpl(customLineItemId, discountedPricePerQuantity,
            taxedPrice);
    }

    /**
     * builds OrderCustomLineItemDiscountSetMessagePayload without checking for non null required values
     */
    public OrderCustomLineItemDiscountSetMessagePayload buildUnchecked() {
        return new OrderCustomLineItemDiscountSetMessagePayloadImpl(customLineItemId, discountedPricePerQuantity,
            taxedPrice);
    }

    public static OrderCustomLineItemDiscountSetMessagePayloadBuilder of() {
        return new OrderCustomLineItemDiscountSetMessagePayloadBuilder();
    }

    public static OrderCustomLineItemDiscountSetMessagePayloadBuilder of(
            final OrderCustomLineItemDiscountSetMessagePayload template) {
        OrderCustomLineItemDiscountSetMessagePayloadBuilder builder = new OrderCustomLineItemDiscountSetMessagePayloadBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.taxedPrice = template.getTaxedPrice();
        return builder;
    }

}
