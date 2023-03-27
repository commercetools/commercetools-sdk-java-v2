
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful recalculation of a Discount on a Custom Line Item.</p>
 *
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
@JsonDeserialize(as = OrderCustomLineItemDiscountSetMessagePayloadImpl.class)
public interface OrderCustomLineItemDiscountSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCustomLineItemDiscountSetMessagePayload
     */
    String ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET = "OrderCustomLineItemDiscountSet";

    /**
     *  <p>Unique identifier for the Custom Line Item.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @return discountedPricePerQuantity
     */
    @NotNull
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();

    /**
     *  <p>TaxedItemPrice of the Custom Line Item after the Discount recalculation.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
     *  <p>Unique identifier for the Custom Line Item.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param discountedPricePerQuantity values to be set
     */

    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceForQuantity... discountedPricePerQuantity);

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param discountedPricePerQuantity values to be set
     */

    public void setDiscountedPricePerQuantity(
            final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);

    /**
     *  <p>TaxedItemPrice of the Custom Line Item after the Discount recalculation.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    /**
     * factory method
     * @return instance of OrderCustomLineItemDiscountSetMessagePayload
     */
    public static OrderCustomLineItemDiscountSetMessagePayload of() {
        return new OrderCustomLineItemDiscountSetMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of OrderCustomLineItemDiscountSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomLineItemDiscountSetMessagePayload of(
            final OrderCustomLineItemDiscountSetMessagePayload template) {
        OrderCustomLineItemDiscountSetMessagePayloadImpl instance = new OrderCustomLineItemDiscountSetMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setTaxedPrice(template.getTaxedPrice());
        return instance;
    }

    /**
     * builder factory method for OrderCustomLineItemDiscountSetMessagePayload
     * @return builder
     */
    public static OrderCustomLineItemDiscountSetMessagePayloadBuilder builder() {
        return OrderCustomLineItemDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderCustomLineItemDiscountSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomLineItemDiscountSetMessagePayloadBuilder builder(
            final OrderCustomLineItemDiscountSetMessagePayload template) {
        return OrderCustomLineItemDiscountSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomLineItemDiscountSetMessagePayload(
            Function<OrderCustomLineItemDiscountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemDiscountSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemDiscountSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemDiscountSetMessagePayload>";
            }
        };
    }
}
