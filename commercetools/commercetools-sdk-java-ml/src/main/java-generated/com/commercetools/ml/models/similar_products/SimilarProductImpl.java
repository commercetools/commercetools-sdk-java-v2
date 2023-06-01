package com.commercetools.ml.models.similar_products;

import com.commercetools.ml.models.common.ProductReference;
import com.commercetools.ml.models.similar_products.SimilarProductMeta;
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
 *  <p>One part of a SimilarProductPair. Refers to a specific ProductVariant.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SimilarProductImpl implements SimilarProduct, ModelBase {

    
    private com.commercetools.ml.models.common.ProductReference product;
    
    
    private Long variantId;
    
    
    private com.commercetools.ml.models.similar_products.SimilarProductMeta meta;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SimilarProductImpl(@JsonProperty("product") final com.commercetools.ml.models.common.ProductReference product, @JsonProperty("variantId") final Long variantId, @JsonProperty("meta") final com.commercetools.ml.models.similar_products.SimilarProductMeta meta) {
        this.product = product;
        this.variantId = variantId;
        this.meta = meta;
    }
    /**
     * create empty instance
     */
    public SimilarProductImpl() {
    }

    /**
     *  <p>Reference to Product</p>
     */
    
    public com.commercetools.ml.models.common.ProductReference getProduct(){
        return this.product;
    }
    
    /**
     *  <p>ID of the ProductVariant that was compared.</p>
     */
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>Supplementary information about the data used for similarity estimation. This information helps you understand the estimated confidence score, but it should not be used to identify a product.</p>
     */
    
    public com.commercetools.ml.models.similar_products.SimilarProductMeta getMeta(){
        return this.meta;
    }

    
    public void setProduct(final com.commercetools.ml.models.common.ProductReference product){
        this.product = product;
    }
    
    
    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    
    public void setMeta(final com.commercetools.ml.models.similar_products.SimilarProductMeta meta){
        this.meta = meta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SimilarProductImpl that = (SimilarProductImpl) o;
    
        return new EqualsBuilder()
                .append(product, that.product)
                .append(variantId, that.variantId)
                .append(meta, that.meta)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(product)
            .append(variantId)
            .append(meta)
            .toHashCode();
    }

}
