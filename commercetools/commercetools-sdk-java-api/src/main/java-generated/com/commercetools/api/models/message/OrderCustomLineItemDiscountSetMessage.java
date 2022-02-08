
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
@JsonDeserialize(as = OrderCustomLineItemDiscountSetMessageImpl.class)
public interface OrderCustomLineItemDiscountSetMessage extends OrderMessage {

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

    public static OrderCustomLineItemDiscountSetMessage of() {
        return new OrderCustomLineItemDiscountSetMessageImpl();
    }

    public static OrderCustomLineItemDiscountSetMessage of(final OrderCustomLineItemDiscountSetMessage template) {
        OrderCustomLineItemDiscountSetMessageImpl instance = new OrderCustomLineItemDiscountSetMessageImpl();
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
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setTaxedPrice(template.getTaxedPrice());
        return instance;
    }

    public static OrderCustomLineItemDiscountSetMessageBuilder builder() {
        return OrderCustomLineItemDiscountSetMessageBuilder.of();
    }

    public static OrderCustomLineItemDiscountSetMessageBuilder builder(
            final OrderCustomLineItemDiscountSetMessage template) {
        return OrderCustomLineItemDiscountSetMessageBuilder.of(template);
    }

    default <T> T withOrderCustomLineItemDiscountSetMessage(Function<OrderCustomLineItemDiscountSetMessage, T> helper) {
        return helper.apply(this);
    }
}
