package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemQuantityActionImpl;

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
@JsonDeserialize(as = StagedOrderChangeCustomLineItemQuantityActionImpl.class)
public interface StagedOrderChangeCustomLineItemQuantityAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();

    public void setCustomLineItemId(final String customLineItemId);
    
    public void setQuantity(final Double quantity);

    public static StagedOrderChangeCustomLineItemQuantityAction of(){
        return new StagedOrderChangeCustomLineItemQuantityActionImpl();
    }
    

    public static StagedOrderChangeCustomLineItemQuantityAction of(final StagedOrderChangeCustomLineItemQuantityAction template) {
        StagedOrderChangeCustomLineItemQuantityActionImpl instance = new StagedOrderChangeCustomLineItemQuantityActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static StagedOrderChangeCustomLineItemQuantityActionBuilder builder(){
        return StagedOrderChangeCustomLineItemQuantityActionBuilder.of();
    }
    
    public static StagedOrderChangeCustomLineItemQuantityActionBuilder builder(final StagedOrderChangeCustomLineItemQuantityAction template){
        return StagedOrderChangeCustomLineItemQuantityActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderChangeCustomLineItemQuantityAction(Function<StagedOrderChangeCustomLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }
}
