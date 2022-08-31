
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderLineItemDiscountSetMessageImpl.class)
public interface OrderLineItemDiscountSetMessage extends OrderMessage {

    String ORDER_LINE_ITEM_DISCOUNT_SET = "OrderLineItemDiscountSet";

    /**
     *  <p>Unique identifier for the Line Item.</p>
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();

    /**
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public Money getTotalPrice();

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multi</code> ShippingMode..</p>
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

    public static OrderLineItemDiscountSetMessage of() {
        return new OrderLineItemDiscountSetMessageImpl();
    }

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
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTaxedPricePortions(template.getTaxedPricePortions());
        return instance;
    }

    public static OrderLineItemDiscountSetMessageBuilder builder() {
        return OrderLineItemDiscountSetMessageBuilder.of();
    }

    public static OrderLineItemDiscountSetMessageBuilder builder(final OrderLineItemDiscountSetMessage template) {
        return OrderLineItemDiscountSetMessageBuilder.of(template);
    }

    default <T> T withOrderLineItemDiscountSetMessage(Function<OrderLineItemDiscountSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDiscountSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDiscountSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemDiscountSetMessage>";
            }
        };
    }
}
