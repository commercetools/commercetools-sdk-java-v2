package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderCustomerEmailSetMessagePayloadImpl.class)
public interface OrderCustomerEmailSetMessagePayload extends MessagePayload {

    
    
    @JsonProperty("email")
    public String getEmail();
    
    
    @JsonProperty("oldEmail")
    public String getOldEmail();

    public void setEmail(final String email);
    
    public void setOldEmail(final String oldEmail);

    public static OrderCustomerEmailSetMessagePayloadImpl of(){
        return new OrderCustomerEmailSetMessagePayloadImpl();
    }
    

    public static OrderCustomerEmailSetMessagePayloadImpl of(final OrderCustomerEmailSetMessagePayload template) {
        OrderCustomerEmailSetMessagePayloadImpl instance = new OrderCustomerEmailSetMessagePayloadImpl();
        instance.setEmail(template.getEmail());
        instance.setOldEmail(template.getOldEmail());
        return instance;
    }

    default <T extends Accessor<OrderCustomerEmailSetMessagePayload>> T withOrderCustomerEmailSetMessagePayload(Function<OrderCustomerEmailSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
