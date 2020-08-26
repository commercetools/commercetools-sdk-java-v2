package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetAttributeInAllVariantsActionImpl implements ProductSetAttributeInAllVariantsAction {

    private String action;
    
    private String name;
    
    private com.fasterxml.jackson.databind.JsonNode value;
    
    private Boolean staged;

    @JsonCreator
    ProductSetAttributeInAllVariantsActionImpl(@JsonProperty("name") final String name, @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value, @JsonProperty("staged") final Boolean staged) {
        this.name = name;
        this.value = value;
        this.staged = staged;
        this.action = "setAttributeInAllVariants";
    }
    public ProductSetAttributeInAllVariantsActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    /**
    *  <p>The same update behavior as for Set Attribute applies.</p>
    */
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    public void setName(final String name){
        this.name = name;
    }
    
    public void setValue(final com.fasterxml.jackson.databind.JsonNode value){
        this.value = value;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

}
