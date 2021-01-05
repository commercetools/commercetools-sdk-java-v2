package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldActionImpl;

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
@JsonDeserialize(as = StagedOrderSetCustomLineItemCustomFieldActionImpl.class)
public interface StagedOrderSetCustomLineItemCustomFieldAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setCustomLineItemId(final String customLineItemId);
    
    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static StagedOrderSetCustomLineItemCustomFieldAction of(){
        return new StagedOrderSetCustomLineItemCustomFieldActionImpl();
    }
    

    public static StagedOrderSetCustomLineItemCustomFieldAction of(final StagedOrderSetCustomLineItemCustomFieldAction template) {
        StagedOrderSetCustomLineItemCustomFieldActionImpl instance = new StagedOrderSetCustomLineItemCustomFieldActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetCustomLineItemCustomFieldActionBuilder builder(){
        return StagedOrderSetCustomLineItemCustomFieldActionBuilder.of();
    }
    
    public static StagedOrderSetCustomLineItemCustomFieldActionBuilder builder(final StagedOrderSetCustomLineItemCustomFieldAction template){
        return StagedOrderSetCustomLineItemCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderSetCustomLineItemCustomFieldAction(Function<StagedOrderSetCustomLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
