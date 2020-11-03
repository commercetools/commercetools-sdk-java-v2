package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
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
public final class ProductSetAttributeActionImpl implements ProductSetAttributeAction {

    private String action;
    
    private Long variantId;
    
    private String sku;
    
    private String name;
    
    private com.fasterxml.jackson.databind.JsonNode value;
    
    private Boolean staged;

    @JsonCreator
    ProductSetAttributeActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("name") final String name, @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value, @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.sku = sku;
        this.name = name;
        this.value = value;
        this.staged = staged;
        this.action = "setAttribute";
    }
    public ProductSetAttributeActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    
    public String getSku(){
        return this.sku;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    /**
    *  <p>If the attribute exists and the value is omitted or set to <code>null</code>, the attribute is removed.
    *  If the attribute exists and a value is provided, the new value is applied.
    *  If the attribute does not exist and a value is provided, it is added as a new attribute.</p>
    */
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    public void setSku(final String sku){
        this.sku = sku;
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
