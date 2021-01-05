package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.message.OrderStateTransitionMessagePayloadImpl;

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
@JsonDeserialize(as = OrderStateTransitionMessagePayloadImpl.class)
public interface OrderStateTransitionMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();
    
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);
    
    public void setForce(final Boolean force);

    public static OrderStateTransitionMessagePayload of(){
        return new OrderStateTransitionMessagePayloadImpl();
    }
    

    public static OrderStateTransitionMessagePayload of(final OrderStateTransitionMessagePayload template) {
        OrderStateTransitionMessagePayloadImpl instance = new OrderStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static OrderStateTransitionMessagePayloadBuilder builder(){
        return OrderStateTransitionMessagePayloadBuilder.of();
    }
    
    public static OrderStateTransitionMessagePayloadBuilder builder(final OrderStateTransitionMessagePayload template){
        return OrderStateTransitionMessagePayloadBuilder.of(template);
    }
    

    default <T> T withOrderStateTransitionMessagePayload(Function<OrderStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
