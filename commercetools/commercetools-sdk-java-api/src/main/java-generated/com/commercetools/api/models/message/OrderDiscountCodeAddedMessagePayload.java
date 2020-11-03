package com.commercetools.api.models.message;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayloadImpl;

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
@JsonDeserialize(as = OrderDiscountCodeAddedMessagePayloadImpl.class)
public interface OrderDiscountCodeAddedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    public void setDiscountCode(final DiscountCodeReference discountCode);

    public static OrderDiscountCodeAddedMessagePayloadImpl of(){
        return new OrderDiscountCodeAddedMessagePayloadImpl();
    }
    

    public static OrderDiscountCodeAddedMessagePayloadImpl of(final OrderDiscountCodeAddedMessagePayload template) {
        OrderDiscountCodeAddedMessagePayloadImpl instance = new OrderDiscountCodeAddedMessagePayloadImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    default <T> T withOrderDiscountCodeAddedMessagePayload(Function<OrderDiscountCodeAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
