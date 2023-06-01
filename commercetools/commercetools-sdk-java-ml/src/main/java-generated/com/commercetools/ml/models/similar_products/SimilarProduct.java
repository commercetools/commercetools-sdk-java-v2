package com.commercetools.ml.models.similar_products;

import com.commercetools.ml.models.common.ProductReference;
import com.commercetools.ml.models.similar_products.SimilarProductMeta;
import com.commercetools.ml.models.similar_products.SimilarProductImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>One part of a SimilarProductPair. Refers to a specific ProductVariant.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProduct similarProduct = SimilarProduct.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SimilarProductImpl.class)
public interface SimilarProduct  {


    /**
     *  <p>Reference to Product</p>
     * @return product
     */
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();
    /**
     *  <p>ID of the ProductVariant that was compared.</p>
     * @return variantId
     */
    
    @JsonProperty("variantId")
    public Long getVariantId();
    /**
     *  <p>Supplementary information about the data used for similarity estimation. This information helps you understand the estimated confidence score, but it should not be used to identify a product.</p>
     * @return meta
     */
    @Valid
    @JsonProperty("meta")
    public SimilarProductMeta getMeta();

    /**
     *  <p>Reference to Product</p>
     * @param product value to be set
     */
    
    public void setProduct(final ProductReference product);
    
    
    /**
     *  <p>ID of the ProductVariant that was compared.</p>
     * @param variantId value to be set
     */
    
    public void setVariantId(final Long variantId);
    
    
    /**
     *  <p>Supplementary information about the data used for similarity estimation. This information helps you understand the estimated confidence score, but it should not be used to identify a product.</p>
     * @param meta value to be set
     */
    
    public void setMeta(final SimilarProductMeta meta);
    

    /**
     * factory method
     * @return instance of SimilarProduct
     */
    public static SimilarProduct of(){
        return new SimilarProductImpl();
    }
    

    /**
     * factory method to create a shallow copy SimilarProduct
     * @param template instance to be copied
     * @return copy instance
     */
    public static SimilarProduct of(final SimilarProduct template) {
        SimilarProductImpl instance = new SimilarProductImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setMeta(template.getMeta());
        return instance;
    }

    /**
     * factory method to create a deep copy of SimilarProduct
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SimilarProduct deepCopy(@Nullable final SimilarProduct template) {
        if (template == null) {
            return null;
        }
        SimilarProductImpl instance = new SimilarProductImpl();
        instance.setProduct(com.commercetools.ml.models.common.ProductReference.deepCopy(template.getProduct()));
        instance.setVariantId(template.getVariantId());
        instance.setMeta(com.commercetools.ml.models.similar_products.SimilarProductMeta.deepCopy(template.getMeta()));
        return instance;
    }

    /**
     * builder factory method for SimilarProduct
     * @return builder
     */
    public static SimilarProductBuilder builder() {
        return SimilarProductBuilder.of();
    }
    
    /**
     * create builder for SimilarProduct instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarProductBuilder builder(final SimilarProduct template) {
        return SimilarProductBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSimilarProduct(Function<SimilarProduct, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SimilarProduct> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SimilarProduct>() {
            @Override
            public String toString() {
                return "TypeReference<SimilarProduct>";
            }
        };
    }
}
