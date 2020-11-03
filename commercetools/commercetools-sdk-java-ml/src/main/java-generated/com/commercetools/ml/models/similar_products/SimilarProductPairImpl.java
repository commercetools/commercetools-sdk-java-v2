package com.commercetools.ml.models.similar_products;

import com.commercetools.ml.models.similar_products.SimilarProduct;
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


/**
*  <p>A pair of SimilarProducts</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SimilarProductPairImpl implements SimilarProductPair {

    private Double confidence;
    
    private java.util.List<com.commercetools.ml.models.similar_products.SimilarProduct> products;

    @JsonCreator
    SimilarProductPairImpl(@JsonProperty("confidence") final Double confidence, @JsonProperty("products") final java.util.List<com.commercetools.ml.models.similar_products.SimilarProduct> products) {
        this.confidence = confidence;
        this.products = products;
    }
    public SimilarProductPairImpl() {
       
    }

    /**
    *  <p>The probability of product similarity.</p>
    */
    public Double getConfidence(){
        return this.confidence;
    }
    
    
    public java.util.List<com.commercetools.ml.models.similar_products.SimilarProduct> getProducts(){
        return this.products;
    }

    public void setConfidence(final Double confidence){
        this.confidence = confidence;
    }
    
    public void setProducts(final com.commercetools.ml.models.similar_products.SimilarProduct ...products){
       this.products = new ArrayList<>(Arrays.asList(products));
    }
    
    public void setProducts(final java.util.List<com.commercetools.ml.models.similar_products.SimilarProduct> products){
       this.products = products;
    }

}
