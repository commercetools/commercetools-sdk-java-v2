package com.commercetools.ml.models.similar_products;

import com.commercetools.ml.models.similar_products.SimilarProduct;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>A pair of SimilarProducts</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SimilarProductPairImpl implements SimilarProductPair, ModelBase {

    
    private Double confidence;
    
    
    private java.util.List<com.commercetools.ml.models.similar_products.SimilarProduct> products;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SimilarProductPairImpl(@JsonProperty("confidence") final Double confidence, @JsonProperty("products") final java.util.List<com.commercetools.ml.models.similar_products.SimilarProduct> products) {
        this.confidence = confidence;
        this.products = products;
    }
    /**
     * create empty instance
     */
    public SimilarProductPairImpl() {
    }

    /**
     *  <p>The probability of product similarity.</p>
     */
    
    public Double getConfidence(){
        return this.confidence;
    }
    
    /**
     *
     */
    
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SimilarProductPairImpl that = (SimilarProductPairImpl) o;
    
        return new EqualsBuilder()
                .append(confidence, that.confidence)
                .append(products, that.products)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(confidence)
            .append(products)
            .toHashCode();
    }

}
