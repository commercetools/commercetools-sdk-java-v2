package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingImagesProductLevel;
import com.commercetools.ml.models.missing_data.MissingImagesVariantLevel;
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
public final class MissingImagesMetaImpl implements MissingImagesMeta {

    private com.commercetools.ml.models.missing_data.MissingImagesProductLevel productLevel;
    
    private com.commercetools.ml.models.missing_data.MissingImagesVariantLevel variantLevel;
    
    private Long threshold;

    @JsonCreator
    MissingImagesMetaImpl(@JsonProperty("productLevel") final com.commercetools.ml.models.missing_data.MissingImagesProductLevel productLevel, @JsonProperty("variantLevel") final com.commercetools.ml.models.missing_data.MissingImagesVariantLevel variantLevel, @JsonProperty("threshold") final Long threshold) {
        this.productLevel = productLevel;
        this.variantLevel = variantLevel;
        this.threshold = threshold;
    }
    public MissingImagesMetaImpl() {
       
    }

    
    public com.commercetools.ml.models.missing_data.MissingImagesProductLevel getProductLevel(){
        return this.productLevel;
    }
    
    
    public com.commercetools.ml.models.missing_data.MissingImagesVariantLevel getVariantLevel(){
        return this.variantLevel;
    }
    
    /**
    *  <p>The minimum number of images a product variant must have. Anything below this value is considered a product variant with missing images.</p>
    */
    public Long getThreshold(){
        return this.threshold;
    }

    public void setProductLevel(final com.commercetools.ml.models.missing_data.MissingImagesProductLevel productLevel){
        this.productLevel = productLevel;
    }
    
    public void setVariantLevel(final com.commercetools.ml.models.missing_data.MissingImagesVariantLevel variantLevel){
        this.variantLevel = variantLevel;
    }
    
    public void setThreshold(final Long threshold){
        this.threshold = threshold;
    }

}
