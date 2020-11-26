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
public final class ProductChangeAssetOrderActionImpl implements ProductChangeAssetOrderAction {

    private String action;
    
    private Long variantId;
    
    private String sku;
    
    private Boolean staged;
    
    private java.util.List<String> assetOrder;

    @JsonCreator
    ProductChangeAssetOrderActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("staged") final Boolean staged, @JsonProperty("assetOrder") final java.util.List<String> assetOrder) {
        this.variantId = variantId;
        this.sku = sku;
        this.staged = staged;
        this.assetOrder = assetOrder;
        this.action = "changeAssetOrder";
    }
    public ProductChangeAssetOrderActionImpl() {
        this.action = "changeAssetOrder";
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
    
    
    public java.util.List<String> getAssetOrder(){
        return this.assetOrder;
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
    
    public void setAssetOrder(final String ...assetOrder){
       this.assetOrder = new ArrayList<>(Arrays.asList(assetOrder));
    }
    
    public void setAssetOrder(final java.util.List<String> assetOrder){
       this.assetOrder = assetOrder;
    }

}
