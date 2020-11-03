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
public final class ProductTypeChangeEnumKeyActionImpl implements ProductTypeChangeEnumKeyAction {

    private String action;
    
    private String attributeName;
    
    private String key;
    
    private String newKey;

    @JsonCreator
    ProductTypeChangeEnumKeyActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("key") final String key, @JsonProperty("newKey") final String newKey) {
        this.attributeName = attributeName;
        this.key = key;
        this.newKey = newKey;
        this.action = "changeEnumKey";
    }
    public ProductTypeChangeEnumKeyActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    
    public String getKey(){
        return this.key;
    }
    
    
    public String getNewKey(){
        return this.newKey;
    }

    public void setAttributeName(final String attributeName){
        this.attributeName = attributeName;
    }
    
    public void setKey(final String key){
        this.key = key;
    }
    
    public void setNewKey(final String newKey){
        this.newKey = newKey;
    }

}
