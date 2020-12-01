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
public final class ProductTypeRemoveEnumValuesActionImpl implements ProductTypeRemoveEnumValuesAction {

    private String action;
    
    private String attributeName;
    
    private java.util.List<String> keys;

    @JsonCreator
    ProductTypeRemoveEnumValuesActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("keys") final java.util.List<String> keys) {
        this.attributeName = attributeName;
        this.keys = keys;
        this.action = "removeEnumValues";
    }
    public ProductTypeRemoveEnumValuesActionImpl() {
        this.action = "removeEnumValues";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    
    public java.util.List<String> getKeys(){
        return this.keys;
    }

    public void setAttributeName(final String attributeName){
        this.attributeName = attributeName;
    }
    
    public void setKeys(final String ...keys){
       this.keys = new ArrayList<>(Arrays.asList(keys));
    }
    
    public void setKeys(final java.util.List<String> keys){
       this.keys = keys;
    }

}
