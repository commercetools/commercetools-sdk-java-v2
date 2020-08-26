package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;
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
public final class ProductSetAssetCustomTypeActionImpl implements ProductSetAssetCustomTypeAction {

    private String action;
    
    private Long variantId;
    
    private String sku;
    
    private Boolean staged;
    
    private String assetId;
    
    private String assetKey;
    
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    private com.fasterxml.jackson.databind.JsonNode fields;

    @JsonCreator
    ProductSetAssetCustomTypeActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("staged") final Boolean staged, @JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey, @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type, @JsonProperty("fields") final com.fasterxml.jackson.databind.JsonNode fields) {
        this.variantId = variantId;
        this.sku = sku;
        this.staged = staged;
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.type = type;
        this.fields = fields;
        this.action = "setAssetCustomType";
    }
    public ProductSetAssetCustomTypeActionImpl() {
       
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
    
    
    public Boolean getStaged(){
        return this.staged;
    }
    
    
    public String getAssetId(){
        return this.assetId;
    }
    
    
    public String getAssetKey(){
        return this.assetKey;
    }
    
    /**
    *  <p>If set, the custom type is set to this new value.
    *  If absent, the custom type and any existing custom fields are removed.</p>
    */
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    /**
    *  <p>If set, the custom fields are set to this new value.</p>
    */
    public com.fasterxml.jackson.databind.JsonNode getFields(){
        return this.fields;
    }

    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    public void setSku(final String sku){
        this.sku = sku;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }
    
    public void setAssetId(final String assetId){
        this.assetId = assetId;
    }
    
    public void setAssetKey(final String assetKey){
        this.assetKey = assetKey;
    }
    
    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type){
        this.type = type;
    }
    
    public void setFields(final com.fasterxml.jackson.databind.JsonNode fields){
        this.fields = fields;
    }

}
