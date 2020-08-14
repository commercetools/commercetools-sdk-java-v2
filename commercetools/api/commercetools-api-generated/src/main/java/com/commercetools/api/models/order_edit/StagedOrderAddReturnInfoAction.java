package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ReturnItemDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoActionImpl;

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
@JsonDeserialize(as = StagedOrderAddReturnInfoActionImpl.class)
public interface StagedOrderAddReturnInfoAction extends StagedOrderUpdateAction {

    
    
    @JsonProperty("returnTrackingId")
    public String getReturnTrackingId();
    
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<ReturnItemDraft> getItems();
    
    
    @JsonProperty("returnDate")
    public ZonedDateTime getReturnDate();

    public void setReturnTrackingId(final String returnTrackingId);
    
    public void setItems(final List<ReturnItemDraft> items);
    
    public void setReturnDate(final ZonedDateTime returnDate);

    public static StagedOrderAddReturnInfoActionImpl of(){
        return new StagedOrderAddReturnInfoActionImpl();
    }
    

    public static StagedOrderAddReturnInfoActionImpl of(final StagedOrderAddReturnInfoAction template) {
        StagedOrderAddReturnInfoActionImpl instance = new StagedOrderAddReturnInfoActionImpl();
        instance.setReturnTrackingId(template.getReturnTrackingId());
        instance.setItems(template.getItems());
        instance.setReturnDate(template.getReturnDate());
        return instance;
    }

}
