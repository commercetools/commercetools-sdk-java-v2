package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.message.MessagePayload;
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
public final class ProductImageAddedMessagePayloadImpl implements ProductImageAddedMessagePayload {

    private String type;
    
    private Long variantId;
    
    private com.commercetools.api.models.common.Image image;
    
    private Boolean staged;

    @JsonCreator
    ProductImageAddedMessagePayloadImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("image") final com.commercetools.api.models.common.Image image, @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.image = image;
        this.staged = staged;
        this.type = "ProductImageAdded";
    }
    public ProductImageAddedMessagePayloadImpl() {
        this.type = "ProductImageAdded";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    
    public com.commercetools.api.models.common.Image getImage(){
        return this.image;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    public void setImage(final com.commercetools.api.models.common.Image image){
        this.image = image;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

}
