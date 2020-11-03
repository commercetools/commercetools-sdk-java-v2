package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
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
public final class ProductSetAssetKeyActionImpl implements ProductSetAssetKeyAction {

    private String action;
    
    private Long variantId;
    
    private String sku;
    
    private Boolean staged;
    
    private String assetId;
    
    private String assetKey;

    @JsonCreator
    ProductSetAssetKeyActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("staged") final Boolean staged, @JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey) {
        this.variantId = variantId;
        this.sku = sku;
        this.staged = staged;
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.action = "setAssetKey";
    }
    public ProductSetAssetKeyActionImpl() {
       
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
    
    /**
    *  <p>User-defined identifier for the asset.
    *  If left blank or set to <code>null</code>, the asset key is unset/removed.</p>
    */
    public String getAssetKey(){
        return this.assetKey;
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

}
