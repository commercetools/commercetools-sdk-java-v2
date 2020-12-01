package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductProjection;
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
public final class ProductDeletedMessagePayloadImpl implements ProductDeletedMessagePayload {

    private String type;
    
    private java.util.List<String> removedImageUrls;
    
    private com.commercetools.api.models.product.ProductProjection currentProjection;

    @JsonCreator
    ProductDeletedMessagePayloadImpl(@JsonProperty("removedImageUrls") final java.util.List<String> removedImageUrls, @JsonProperty("currentProjection") final com.commercetools.api.models.product.ProductProjection currentProjection) {
        this.removedImageUrls = removedImageUrls;
        this.currentProjection = currentProjection;
        this.type = "ProductDeleted";
    }
    public ProductDeletedMessagePayloadImpl() {
        this.type = "ProductDeleted";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public java.util.List<String> getRemovedImageUrls(){
        return this.removedImageUrls;
    }
    
    
    public com.commercetools.api.models.product.ProductProjection getCurrentProjection(){
        return this.currentProjection;
    }

    public void setRemovedImageUrls(final String ...removedImageUrls){
       this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
    }
    
    public void setRemovedImageUrls(final java.util.List<String> removedImageUrls){
       this.removedImageUrls = removedImageUrls;
    }
    
    public void setCurrentProjection(final com.commercetools.api.models.product.ProductProjection currentProjection){
        this.currentProjection = currentProjection;
    }

}
