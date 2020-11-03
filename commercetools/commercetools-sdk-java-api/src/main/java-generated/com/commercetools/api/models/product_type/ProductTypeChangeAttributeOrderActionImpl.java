package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeDefinition;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
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
public final class ProductTypeChangeAttributeOrderActionImpl implements ProductTypeChangeAttributeOrderAction {

    private String action;
    
    private java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes;

    @JsonCreator
    ProductTypeChangeAttributeOrderActionImpl(@JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes) {
        this.attributes = attributes;
        this.action = "changeAttributeOrder";
    }
    public ProductTypeChangeAttributeOrderActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> getAttributes(){
        return this.attributes;
    }

    public void setAttributes(final com.commercetools.api.models.product_type.AttributeDefinition ...attributes){
       this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }
    
    public void setAttributes(final java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes){
       this.attributes = attributes;
    }

}
