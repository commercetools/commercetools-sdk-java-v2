package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.order.OrderTransitionStateActionImpl;

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
@JsonDeserialize(as = OrderTransitionStateActionImpl.class)
public interface OrderTransitionStateAction extends OrderUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();
    
    
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateResourceIdentifier state);
    
    public void setForce(final Boolean force);

    public static OrderTransitionStateActionImpl of(){
        return new OrderTransitionStateActionImpl();
    }
    

    public static OrderTransitionStateActionImpl of(final OrderTransitionStateAction template) {
        OrderTransitionStateActionImpl instance = new OrderTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    default <T extends Accessor<OrderTransitionStateAction>> T withOrderTransitionStateAction(Function<OrderTransitionStateAction, T> helper) {
        return helper.apply(this);
    }
}
