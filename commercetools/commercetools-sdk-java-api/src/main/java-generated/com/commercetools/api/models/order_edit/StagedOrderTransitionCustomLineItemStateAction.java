package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order_edit.StagedOrderTransitionCustomLineItemStateActionImpl;

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
@JsonDeserialize(as = StagedOrderTransitionCustomLineItemStateActionImpl.class)
public interface StagedOrderTransitionCustomLineItemStateAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();
    
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateResourceIdentifier getFromState();
    
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateResourceIdentifier getToState();
    
    
    @JsonProperty("actualTransitionDate")
    public ZonedDateTime getActualTransitionDate();

    public void setCustomLineItemId(final String customLineItemId);
    
    public void setQuantity(final Long quantity);
    
    public void setFromState(final StateResourceIdentifier fromState);
    
    public void setToState(final StateResourceIdentifier toState);
    
    public void setActualTransitionDate(final ZonedDateTime actualTransitionDate);

    public static StagedOrderTransitionCustomLineItemStateActionImpl of(){
        return new StagedOrderTransitionCustomLineItemStateActionImpl();
    }
    

    public static StagedOrderTransitionCustomLineItemStateActionImpl of(final StagedOrderTransitionCustomLineItemStateAction template) {
        StagedOrderTransitionCustomLineItemStateActionImpl instance = new StagedOrderTransitionCustomLineItemStateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        instance.setActualTransitionDate(template.getActualTransitionDate());
        return instance;
    }

    default <T extends Accessor<StagedOrderTransitionCustomLineItemStateAction>> T withStagedOrderTransitionCustomLineItemStateAction(Function<StagedOrderTransitionCustomLineItemStateAction, T> helper) {
        return helper.apply(this);
    }
}
