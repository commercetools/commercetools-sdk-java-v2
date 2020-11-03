package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderLineItemDiscountSetMessagePayloadImpl.class)
public interface OrderLineItemDiscountSetMessagePayload extends MessagePayload {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @NotNull
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();
    
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public Money getTotalPrice();
    
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    public void setLineItemId(final String lineItemId);
    
    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceForQuantity ...discountedPricePerQuantity);
    public void setDiscountedPricePerQuantity(final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);
    
    public void setTotalPrice(final Money totalPrice);
    
    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    public static OrderLineItemDiscountSetMessagePayloadImpl of(){
        return new OrderLineItemDiscountSetMessagePayloadImpl();
    }
    

    public static OrderLineItemDiscountSetMessagePayloadImpl of(final OrderLineItemDiscountSetMessagePayload template) {
        OrderLineItemDiscountSetMessagePayloadImpl instance = new OrderLineItemDiscountSetMessagePayloadImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        return instance;
    }

    default <T> T withOrderLineItemDiscountSetMessagePayload(Function<OrderLineItemDiscountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
