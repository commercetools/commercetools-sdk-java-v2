package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.order_edit.StagedOrderTransitionStateActionImpl;

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
@JsonDeserialize(as = StagedOrderTransitionStateActionImpl.class)
public interface StagedOrderTransitionStateAction extends StagedOrderUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();
    
    
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateResourceIdentifier state);
    
    public void setForce(final Boolean force);

    public static StagedOrderTransitionStateAction of(){
        return new StagedOrderTransitionStateActionImpl();
    }
    

    public static StagedOrderTransitionStateAction of(final StagedOrderTransitionStateAction template) {
        StagedOrderTransitionStateActionImpl instance = new StagedOrderTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static StagedOrderTransitionStateActionBuilder builder(){
        return StagedOrderTransitionStateActionBuilder.of();
    }
    
    public static StagedOrderTransitionStateActionBuilder builder(final StagedOrderTransitionStateAction template){
        return StagedOrderTransitionStateActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderTransitionStateAction(Function<StagedOrderTransitionStateAction, T> helper) {
        return helper.apply(this);
    }
}
