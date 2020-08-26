package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
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
public final class ProductSetImageLabelActionImpl implements ProductSetImageLabelAction {

    private String action;
    
    private String sku;
    
    private Long variantId;
    
    private String imageUrl;
    
    private String label;
    
    private Boolean staged;

    @JsonCreator
    ProductSetImageLabelActionImpl(@JsonProperty("sku") final String sku, @JsonProperty("variantId") final Long variantId, @JsonProperty("imageUrl") final String imageUrl, @JsonProperty("label") final String label, @JsonProperty("staged") final Boolean staged) {
        this.sku = sku;
        this.variantId = variantId;
        this.imageUrl = imageUrl;
        this.label = label;
        this.staged = staged;
        this.action = "setImageLabel";
    }
    public ProductSetImageLabelActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getSku(){
        return this.sku;
    }
    
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
    *  <p>The URL of the image.</p>
    */
    public String getImageUrl(){
        return this.imageUrl;
    }
    
    /**
    *  <p>The new image label.
    *  If left blank or set to null, the label is removed.</p>
    */
    public String getLabel(){
        return this.label;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    public void setSku(final String sku){
        this.sku = sku;
    }
    
    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    public void setImageUrl(final String imageUrl){
        this.imageUrl = imageUrl;
    }
    
    public void setLabel(final String label){
        this.label = label;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

}
