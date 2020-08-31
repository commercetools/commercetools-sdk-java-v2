package com.commercetools.api.models.product;

import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.common.ScopedPrice;
import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.product.ProductVariantAvailability;
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
public final class ProductVariantImpl implements ProductVariant {

    private Long id;
    
    private String sku;
    
    private String key;
    
    private java.util.List<com.commercetools.api.models.common.Price> prices;
    
    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;
    
    private com.commercetools.api.models.common.Price price;
    
    private java.util.List<com.commercetools.api.models.common.Image> images;
    
    private java.util.List<com.commercetools.api.models.common.Asset> assets;
    
    private com.commercetools.api.models.product.ProductVariantAvailability availability;
    
    private Boolean isMatchingVariant;
    
    private com.commercetools.api.models.common.ScopedPrice scopedPrice;
    
    private Boolean scopedPriceDiscounted;

    @JsonCreator
    ProductVariantImpl(@JsonProperty("id") final Long id, @JsonProperty("sku") final String sku, @JsonProperty("key") final String key, @JsonProperty("prices") final java.util.List<com.commercetools.api.models.common.Price> prices, @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes, @JsonProperty("price") final com.commercetools.api.models.common.Price price, @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images, @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.Asset> assets, @JsonProperty("availability") final com.commercetools.api.models.product.ProductVariantAvailability availability, @JsonProperty("isMatchingVariant") final Boolean isMatchingVariant, @JsonProperty("scopedPrice") final com.commercetools.api.models.common.ScopedPrice scopedPrice, @JsonProperty("scopedPriceDiscounted") final Boolean scopedPriceDiscounted) {
        this.id = id;
        this.sku = sku;
        this.key = key;
        this.prices = prices;
        this.attributes = attributes;
        this.price = price;
        this.images = images;
        this.assets = assets;
        this.availability = availability;
        this.isMatchingVariant = isMatchingVariant;
        this.scopedPrice = scopedPrice;
        this.scopedPriceDiscounted = scopedPriceDiscounted;
    }
    public ProductVariantImpl() {
       
    }

    
    public Long getId(){
        return this.id;
    }
    
    
    public String getSku(){
        return this.sku;
    }
    
    
    public String getKey(){
        return this.key;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.Price> getPrices(){
        return this.prices;
    }
    
    
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes(){
        return this.attributes;
    }
    
    
    public com.commercetools.api.models.common.Price getPrice(){
        return this.price;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.Image> getImages(){
        return this.images;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.Asset> getAssets(){
        return this.assets;
    }
    
    
    public com.commercetools.api.models.product.ProductVariantAvailability getAvailability(){
        return this.availability;
    }
    
    
    public Boolean getIsMatchingVariant(){
        return this.isMatchingVariant;
    }
    
    
    public com.commercetools.api.models.common.ScopedPrice getScopedPrice(){
        return this.scopedPrice;
    }
    
    
    public Boolean getScopedPriceDiscounted(){
        return this.scopedPriceDiscounted;
    }

    public void setId(final Long id){
        this.id = id;
    }
    
    public void setSku(final String sku){
        this.sku = sku;
    }
    
    public void setKey(final String key){
        this.key = key;
    }
    
    public void setPrices(final java.util.List<com.commercetools.api.models.common.Price> prices){
        this.prices = prices;
    }
    
    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes){
        this.attributes = attributes;
    }
    
    public void setPrice(final com.commercetools.api.models.common.Price price){
        this.price = price;
    }
    
    public void setImages(final java.util.List<com.commercetools.api.models.common.Image> images){
        this.images = images;
    }
    
    public void setAssets(final java.util.List<com.commercetools.api.models.common.Asset> assets){
        this.assets = assets;
    }
    
    public void setAvailability(final com.commercetools.api.models.product.ProductVariantAvailability availability){
        this.availability = availability;
    }
    
    public void setIsMatchingVariant(final Boolean isMatchingVariant){
        this.isMatchingVariant = isMatchingVariant;
    }
    
    public void setScopedPrice(final com.commercetools.api.models.common.ScopedPrice scopedPrice){
        this.scopedPrice = scopedPrice;
    }
    
    public void setScopedPriceDiscounted(final Boolean scopedPriceDiscounted){
        this.scopedPriceDiscounted = scopedPriceDiscounted;
    }

}
