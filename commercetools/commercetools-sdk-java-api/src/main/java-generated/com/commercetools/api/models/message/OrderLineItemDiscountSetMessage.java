
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
 *     OrderLineItemDiscountSetMessage orderLineItemDiscountSetMessage = OrderLineItemDiscountSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .lineItemId("{lineItemId}")
 *             .plusDiscountedPricePerQuantity(discountedPricePerQuantityBuilder -> discountedPricePerQuantityBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .plusTaxedPricePortions(taxedPricePortionsBuilder -> taxedPricePortionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderLineItemDiscountSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderLineItemDiscountSetMessageImpl.class)
public interface OrderLineItemDiscountSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderLineItemDiscountSetMessage
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
     * @return instance of OrderLineItemDiscountSetMessage
     */
    public static OrderLineItemDiscountSetMessage of() {
        return new OrderLineItemDiscountSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderLineItemDiscountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderLineItemDiscountSetMessage of(final OrderLineItemDiscountSetMessage template) {
        OrderLineItemDiscountSetMessageImpl instance = new OrderLineItemDiscountSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTaxedPricePortions(template.getTaxedPricePortions());
        return instance;
    }

    public OrderLineItemDiscountSetMessage copyDeep();

    /**
     * factory method to create a deep copy of OrderLineItemDiscountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderLineItemDiscountSetMessage deepCopy(@Nullable final OrderLineItemDiscountSetMessage template) {
        if (template == null) {
            return null;
        }
        OrderLineItemDiscountSetMessageImpl instance = new OrderLineItemDiscountSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
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
     * builder factory method for OrderLineItemDiscountSetMessage
     * @return builder
     */
    public static OrderLineItemDiscountSetMessageBuilder builder() {
        return OrderLineItemDiscountSetMessageBuilder.of();
    }

    /**
     * create builder for OrderLineItemDiscountSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLineItemDiscountSetMessageBuilder builder(final OrderLineItemDiscountSetMessage template) {
        return OrderLineItemDiscountSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderLineItemDiscountSetMessage(Function<OrderLineItemDiscountSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDiscountSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDiscountSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemDiscountSetMessage>";
            }
        };
    }
}
