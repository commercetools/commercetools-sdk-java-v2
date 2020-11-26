package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetCustomLineItemCustomFieldActionImpl implements StagedOrderSetCustomLineItemCustomFieldAction {

    private String action;
    
    private String customLineItemId;
    
    private String name;
    
    private com.fasterxml.jackson.databind.JsonNode value;

    @JsonCreator
    StagedOrderSetCustomLineItemCustomFieldActionImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("name") final String name, @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value) {
        this.customLineItemId = customLineItemId;
        this.name = name;
        this.value = value;
        this.action = "setCustomLineItemCustomField";
    }
    public StagedOrderSetCustomLineItemCustomFieldActionImpl() {
        this.action = "setCustomLineItemCustomField";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }

    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }
    
    public void setName(final String name){
        this.name = name;
    }
    
    public void setValue(final com.fasterxml.jackson.databind.JsonNode value){
        this.value = value;
    }

}
