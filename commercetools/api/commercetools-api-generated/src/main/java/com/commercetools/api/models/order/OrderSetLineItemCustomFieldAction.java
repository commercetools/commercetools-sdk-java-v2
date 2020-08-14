package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.order.OrderSetLineItemCustomFieldActionImpl;

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
@JsonDeserialize(as = OrderSetLineItemCustomFieldActionImpl.class)
public interface OrderSetLineItemCustomFieldAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setLineItemId(final String lineItemId);
    
    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static OrderSetLineItemCustomFieldActionImpl of(){
        return new OrderSetLineItemCustomFieldActionImpl();
    }
    

    public static OrderSetLineItemCustomFieldActionImpl of(final OrderSetLineItemCustomFieldAction template) {
        OrderSetLineItemCustomFieldActionImpl instance = new OrderSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

}
