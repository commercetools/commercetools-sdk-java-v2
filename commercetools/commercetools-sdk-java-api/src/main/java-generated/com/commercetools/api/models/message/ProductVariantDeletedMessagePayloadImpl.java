package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductVariant;
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
public final class ProductVariantDeletedMessagePayloadImpl implements ProductVariantDeletedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.product.ProductVariant variant;
    
    private java.util.List<String> removedImageUrls;

    @JsonCreator
    ProductVariantDeletedMessagePayloadImpl(@JsonProperty("variant") final com.commercetools.api.models.product.ProductVariant variant, @JsonProperty("removedImageUrls") final java.util.List<String> removedImageUrls) {
        this.variant = variant;
        this.removedImageUrls = removedImageUrls;
        this.type = "ProductVariantDeleted";
    }
    public ProductVariantDeletedMessagePayloadImpl() {
        this.type = "ProductVariantDeleted";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.product.ProductVariant getVariant(){
        return this.variant;
    }
    
    
    public java.util.List<String> getRemovedImageUrls(){
        return this.removedImageUrls;
    }

    public void setVariant(final com.commercetools.api.models.product.ProductVariant variant){
        this.variant = variant;
    }
    
    public void setRemovedImageUrls(final String ...removedImageUrls){
       this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
    }
    
    public void setRemovedImageUrls(final java.util.List<String> removedImageUrls){
       this.removedImageUrls = removedImageUrls;
    }

}
