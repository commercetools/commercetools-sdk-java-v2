package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderImportCustomLineItemStateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderImportCustomLineItemStateActionImpl.class)
public interface StagedOrderImportCustomLineItemStateAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    public void setCustomLineItemId(final String customLineItemId);
    
    public void setState(final List<ItemState> state);

    public static StagedOrderImportCustomLineItemStateActionImpl of(){
        return new StagedOrderImportCustomLineItemStateActionImpl();
    }
    

    public static StagedOrderImportCustomLineItemStateActionImpl of(final StagedOrderImportCustomLineItemStateAction template) {
        StagedOrderImportCustomLineItemStateActionImpl instance = new StagedOrderImportCustomLineItemStateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setState(template.getState());
        return instance;
    }

}
