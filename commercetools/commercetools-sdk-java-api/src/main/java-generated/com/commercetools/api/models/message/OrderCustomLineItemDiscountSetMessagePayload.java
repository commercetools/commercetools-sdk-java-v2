
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderCustomLineItemDiscountSetMessagePayloadImpl.class)
public interface OrderCustomLineItemDiscountSetMessagePayload extends OrderMessagePayload {

    String ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET = "OrderCustomLineItemDiscountSet";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();

    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    public void setCustomLineItemId(final String customLineItemId);

    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceForQuantity... discountedPricePerQuantity);

    public void setDiscountedPricePerQuantity(
            final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    public static OrderCustomLineItemDiscountSetMessagePayload of() {
        return new OrderCustomLineItemDiscountSetMessagePayloadImpl();
    }

    public static OrderCustomLineItemDiscountSetMessagePayload of(
            final OrderCustomLineItemDiscountSetMessagePayload template) {
        OrderCustomLineItemDiscountSetMessagePayloadImpl instance = new OrderCustomLineItemDiscountSetMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setTaxedPrice(template.getTaxedPrice());
        return instance;
    }

    public static OrderCustomLineItemDiscountSetMessagePayloadBuilder builder() {
        return OrderCustomLineItemDiscountSetMessagePayloadBuilder.of();
    }

    public static OrderCustomLineItemDiscountSetMessagePayloadBuilder builder(
            final OrderCustomLineItemDiscountSetMessagePayload template) {
        return OrderCustomLineItemDiscountSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderCustomLineItemDiscountSetMessagePayload(
            Function<OrderCustomLineItemDiscountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemDiscountSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemDiscountSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemDiscountSetMessagePayload>";
            }
        };
    }
}
