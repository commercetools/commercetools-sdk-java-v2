package com.commercetools.api.models.product;

import com.commercetools.api.models.common.AssetDraft;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.Attribute;
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
public final class ProductVariantDraftImpl implements ProductVariantDraft {

    private String sku;
    
    private String key;
    
    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;
    
    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;
    
    private java.util.List<com.commercetools.api.models.common.Image> images;
    
    private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

    @JsonCreator
    ProductVariantDraftImpl(@JsonProperty("sku") final String sku, @JsonProperty("key") final String key, @JsonProperty("prices") final java.util.List<com.commercetools.api.models.common.PriceDraft> prices, @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes, @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images, @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.sku = sku;
        this.key = key;
        this.prices = prices;
        this.attributes = attributes;
        this.images = images;
        this.assets = assets;
    }
    public ProductVariantDraftImpl() {
       
    }

    
    public String getSku(){
        return this.sku;
    }
    
    
    public String getKey(){
        return this.key;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices(){
        return this.prices;
    }
    
    
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes(){
        return this.attributes;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.Image> getImages(){
        return this.images;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.AssetDraft> getAssets(){
        return this.assets;
    }

    public void setSku(final String sku){
        this.sku = sku;
    }
    
    public void setKey(final String key){
        this.key = key;
    }
    
    public void setPrices(final java.util.List<com.commercetools.api.models.common.PriceDraft> prices){
        this.prices = prices;
    }
    
    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes){
        this.attributes = attributes;
    }
    
    public void setImages(final java.util.List<com.commercetools.api.models.common.Image> images){
        this.images = images;
    }
    
    public void setAssets(final java.util.List<com.commercetools.api.models.common.AssetDraft> assets){
        this.assets = assets;
    }

}
