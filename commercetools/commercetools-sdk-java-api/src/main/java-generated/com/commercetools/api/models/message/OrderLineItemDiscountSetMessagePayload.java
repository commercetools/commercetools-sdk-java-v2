
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.MethodTaxedPrice;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    String ORDER_LINE_ITEM_DISCOUNT_SET = "OrderLineItemDiscountSet";

    /**
     *  <p>Unique identifier for the Line Item.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

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
    public Money getTotalPrice();

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multi</code> ShippingMode..</p>
     * @return taxedPricePortions
     */
    @NotNull
    @Valid
    @JsonProperty("taxedPricePortions")
    public List<MethodTaxedPrice> getTaxedPricePortions();

    public void setLineItemId(final String lineItemId);

    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceForQuantity... discountedPricePerQuantity);

    public void setDiscountedPricePerQuantity(
            final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);

    public void setTotalPrice(final Money totalPrice);

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    @JsonIgnore
    public void setTaxedPricePortions(final MethodTaxedPrice... taxedPricePortions);

    public void setTaxedPricePortions(final List<MethodTaxedPrice> taxedPricePortions);

    public static OrderLineItemDiscountSetMessagePayload of() {
        return new OrderLineItemDiscountSetMessagePayloadImpl();
    }

    public static OrderLineItemDiscountSetMessagePayload of(final OrderLineItemDiscountSetMessagePayload template) {
        OrderLineItemDiscountSetMessagePayloadImpl instance = new OrderLineItemDiscountSetMessagePayloadImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTaxedPricePortions(template.getTaxedPricePortions());
        return instance;
    }

    public static OrderLineItemDiscountSetMessagePayloadBuilder builder() {
        return OrderLineItemDiscountSetMessagePayloadBuilder.of();
    }

    public static OrderLineItemDiscountSetMessagePayloadBuilder builder(
            final OrderLineItemDiscountSetMessagePayload template) {
        return OrderLineItemDiscountSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderLineItemDiscountSetMessagePayload(
            Function<OrderLineItemDiscountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDiscountSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDiscountSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemDiscountSetMessagePayload>";
            }
        };
    }
}
