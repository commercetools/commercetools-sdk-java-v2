package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
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
public final class ProductTypeAddLocalizedEnumValueActionImpl implements ProductTypeAddLocalizedEnumValueAction {

    private String action;
    
    private String attributeName;
    
    private com.commercetools.api.models.product_type.AttributeLocalizedEnumValue value;

    @JsonCreator
    ProductTypeAddLocalizedEnumValueActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("value") final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue value) {
        this.attributeName = attributeName;
        this.value = value;
        this.action = "addLocalizedEnumValue";
    }
    public ProductTypeAddLocalizedEnumValueActionImpl() {
        this.action = "addLocalizedEnumValue";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    
    public com.commercetools.api.models.product_type.AttributeLocalizedEnumValue getValue(){
        return this.value;
    }

    public void setAttributeName(final String attributeName){
        this.attributeName = attributeName;
    }
    
    public void setValue(final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue value){
        this.value = value;
    }

}
