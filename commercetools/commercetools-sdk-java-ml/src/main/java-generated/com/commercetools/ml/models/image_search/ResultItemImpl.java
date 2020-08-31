package com.commercetools.ml.models.image_search;

import com.commercetools.ml.models.common.ProductVariant;
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


/**
*  <p>An image URL and the product variants it is contained in. If no matching images are found, ResultItem is not present.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ResultItemImpl implements ResultItem {

    private String imageUrl;
    
    private java.util.List<com.commercetools.ml.models.common.ProductVariant> productVariants;

    @JsonCreator
    ResultItemImpl(@JsonProperty("imageUrl") final String imageUrl, @JsonProperty("productVariants") final java.util.List<com.commercetools.ml.models.common.ProductVariant> productVariants) {
        this.imageUrl = imageUrl;
        this.productVariants = productVariants;
    }
    public ResultItemImpl() {
       
    }

    /**
    *  <p>The URL of the image.</p>
    */
    public String getImageUrl(){
        return this.imageUrl;
    }
    
    /**
    *  <p>An array of product variants containing the image URL.</p>
    */
    public java.util.List<com.commercetools.ml.models.common.ProductVariant> getProductVariants(){
        return this.productVariants;
    }

    public void setImageUrl(final String imageUrl){
        this.imageUrl = imageUrl;
    }
    
    public void setProductVariants(final java.util.List<com.commercetools.ml.models.common.ProductVariant> productVariants){
        this.productVariants = productVariants;
    }

}
