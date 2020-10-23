package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ReturnShipmentState;
import com.commercetools.api.models.order.ReturnItemDraftImpl;

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
@JsonDeserialize(as = ReturnItemDraftImpl.class)
public interface ReturnItemDraft  {

    
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();
    
    
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    
    @JsonProperty("comment")
    public String getComment();
    
    @NotNull
    @JsonProperty("shipmentState")
    public ReturnShipmentState getShipmentState();

    public void setQuantity(final Long quantity);
    
    public void setLineItemId(final String lineItemId);
    
    public void setCustomLineItemId(final String customLineItemId);
    
    public void setComment(final String comment);
    
    public void setShipmentState(final ReturnShipmentState shipmentState);

    public static ReturnItemDraftImpl of(){
        return new ReturnItemDraftImpl();
    }
    

    public static ReturnItemDraftImpl of(final ReturnItemDraft template) {
        ReturnItemDraftImpl instance = new ReturnItemDraftImpl();
        instance.setQuantity(template.getQuantity());
        instance.setLineItemId(template.getLineItemId());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    default <T> T withReturnItemDraft(Function<ReturnItemDraft, T> helper) {
        return helper.apply(this);
    }
}
