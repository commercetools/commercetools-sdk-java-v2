package com.commercetools.api.models.product_type;

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
public final class ProductTypeChangeAttributeOrderByNameActionImpl implements ProductTypeChangeAttributeOrderByNameAction {

    private String action;
    
    private java.util.List<String> attributeNames;

    @JsonCreator
    ProductTypeChangeAttributeOrderByNameActionImpl(@JsonProperty("attributeNames") final java.util.List<String> attributeNames) {
        this.attributeNames = attributeNames;
        this.action = "changeAttributeOrderByName";
    }
    public ProductTypeChangeAttributeOrderByNameActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.util.List<String> getAttributeNames(){
        return this.attributeNames;
    }

    public void setAttributeNames(final String ...attributeNames){
       this.attributeNames = new ArrayList<>(Arrays.asList(attributeNames));
    }
    
    public void setAttributeNames(final java.util.List<String> attributeNames){
       this.attributeNames = attributeNames;
    }

}
