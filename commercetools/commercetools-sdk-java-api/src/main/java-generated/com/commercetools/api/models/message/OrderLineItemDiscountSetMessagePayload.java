
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.MethodTaxedPrice;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.CentPrecisionMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful recalculation of a Discount on a Line Item.</p>
 *
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
@JsonDeserialize(as = OrderLineItemDiscountSetMessagePayloadImpl.class)
public interface OrderLineItemDiscountSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderLineItemDiscountSetMessagePayload
     */
    String ORDER_LINE_ITEM_DISCOUNT_SET = "OrderLineItemDiscountSet";

    /**
     *  <p>Unique identifier for the Line Item.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @return discountedPricePerQuantity
     */
    @NotNull
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();

    /**
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public CentPrecisionMoney getTotalPrice();

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each Shipping Method. Only applicable for Carts with <code>Multiple</code> ShippingMode. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @return taxedPricePortions
     */
    @NotNull
    @Valid
    @JsonProperty("taxedPricePortions")
    public List<MethodTaxedPrice> getTaxedPricePortions();

    /**
     *  <p>Unique identifier for the Line Item.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

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
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     * @param totalPrice value to be set
     */

    public void setTotalPrice(final CentPrecisionMoney totalPrice);

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each Shipping Method. Only applicable for Carts with <code>Multiple</code> ShippingMode. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions values to be set
     */

    @JsonIgnore
    public void setTaxedPricePortions(final MethodTaxedPrice... taxedPricePortions);

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each Shipping Method. Only applicable for Carts with <code>Multiple</code> ShippingMode. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions values to be set
     */

    public void setTaxedPricePortions(final List<MethodTaxedPrice> taxedPricePortions);

    /**
     * factory method
     * @return instance of OrderLineItemDiscountSetMessagePayload
     */
    public static OrderLineItemDiscountSetMessagePayload of() {
        return new OrderLineItemDiscountSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderLineItemDiscountSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderLineItemDiscountSetMessagePayload of(final OrderLineItemDiscountSetMessagePayload template) {
        OrderLineItemDiscountSetMessagePayloadImpl instance = new OrderLineItemDiscountSetMessagePayloadImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTaxedPricePortions(template.getTaxedPricePortions());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderLineItemDiscountSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderLineItemDiscountSetMessagePayload deepCopy(
            @Nullable final OrderLineItemDiscountSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderLineItemDiscountSetMessagePayloadImpl instance = new OrderLineItemDiscountSetMessagePayloadImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setDiscountedPricePerQuantity(Optional.ofNullable(template.getDiscountedPricePerQuantity())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTotalPrice(
            com.commercetools.api.models.common.CentPrecisionMoney.deepCopy(template.getTotalPrice()));
        instance.setTaxedPrice(com.commercetools.api.models.cart.TaxedItemPrice.deepCopy(template.getTaxedPrice()));
        instance.setTaxedPricePortions(Optional.ofNullable(template.getTaxedPricePortions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.MethodTaxedPrice::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderLineItemDiscountSetMessagePayload
     * @return builder
     */
    public static OrderLineItemDiscountSetMessagePayloadBuilder builder() {
        return OrderLineItemDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderLineItemDiscountSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLineItemDiscountSetMessagePayloadBuilder builder(
            final OrderLineItemDiscountSetMessagePayload template) {
        return OrderLineItemDiscountSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderLineItemDiscountSetMessagePayload(
            Function<OrderLineItemDiscountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDiscountSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDiscountSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemDiscountSetMessagePayload>";
            }
        };
    }
}
