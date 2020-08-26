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
public final class ProductSetProductPriceCustomFieldActionImpl implements ProductSetProductPriceCustomFieldAction {

    private String action;
    
    private String priceId;
    
    private Boolean staged;
    
    private String name;
    
    private com.fasterxml.jackson.databind.JsonNode value;

    @JsonCreator
    ProductSetProductPriceCustomFieldActionImpl(@JsonProperty("priceId") final String priceId, @JsonProperty("staged") final Boolean staged, @JsonProperty("name") final String name, @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value) {
        this.priceId = priceId;
        this.staged = staged;
        this.name = name;
        this.value = value;
        this.action = "setProductPriceCustomField";
    }
    public ProductSetProductPriceCustomFieldActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getPriceId(){
        return this.priceId;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }

    public void setPriceId(final String priceId){
        this.priceId = priceId;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }
    
    public void setName(final String name){
        this.name = name;
    }
    
    public void setValue(final com.fasterxml.jackson.databind.JsonNode value){
        this.value = value;
    }

}
