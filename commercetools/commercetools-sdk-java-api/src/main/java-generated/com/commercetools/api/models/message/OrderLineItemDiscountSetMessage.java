
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderLineItemDiscountSetMessageImpl.class)
public interface OrderLineItemDiscountSetMessage extends OrderMessage {

    String ORDER_LINE_ITEM_DISCOUNT_SET = "OrderLineItemDiscountSet";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.
    *  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public Money getTotalPrice();

    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    public void setLineItemId(final String lineItemId);

    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceForQuantity... discountedPricePerQuantity);

    public void setDiscountedPricePerQuantity(
            final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);

    public void setTotalPrice(final Money totalPrice);

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

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
