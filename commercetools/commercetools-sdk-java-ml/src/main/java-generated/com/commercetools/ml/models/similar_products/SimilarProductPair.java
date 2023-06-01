package com.commercetools.ml.models.similar_products;

import com.commercetools.ml.models.similar_products.SimilarProduct;
import com.commercetools.ml.models.similar_products.SimilarProductPairImpl;

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
 *  <p>A pair of SimilarProducts</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProductPair similarProductPair = SimilarProductPair.builder()
 *             .confidence(0.3)
 *             .plusProducts(productsBuilder -> productsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SimilarProductPairImpl.class)
public interface SimilarProductPair  {


    /**
     *  <p>The probability of product similarity.</p>
     * @return confidence
     */
    @NotNull
    @JsonProperty("confidence")
    public Double getConfidence();
    /**
     *
     * @return products
     */
    @NotNull
    @Valid
    @JsonProperty("products")
    public List<SimilarProduct> getProducts();

    /**
     *  <p>The probability of product similarity.</p>
     * @param confidence value to be set
     */
    
    public void setConfidence(final Double confidence);
    
    
    /**
     * set products
     * @param products values to be set
     */
    
    @JsonIgnore
    public void setProducts(final SimilarProduct ...products);
    /**
     * set products
     * @param products values to be set
     */
    
    public void setProducts(final List<SimilarProduct> products);

    /**
     * factory method
     * @return instance of SimilarProductPair
     */
    public static SimilarProductPair of(){
        return new SimilarProductPairImpl();
    }
    

    /**
     * factory method to create a shallow copy SimilarProductPair
     * @param template instance to be copied
     * @return copy instance
     */
    public static SimilarProductPair of(final SimilarProductPair template) {
        SimilarProductPairImpl instance = new SimilarProductPairImpl();
        instance.setConfidence(template.getConfidence());
        instance.setProducts(template.getProducts());
        return instance;
    }

    /**
     * factory method to create a deep copy of SimilarProductPair
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SimilarProductPair deepCopy(@Nullable final SimilarProductPair template) {
        if (template == null) {
            return null;
        }
        SimilarProductPairImpl instance = new SimilarProductPairImpl();
        instance.setConfidence(template.getConfidence());
        instance.setProducts(Optional.ofNullable(template.getProducts())
                .map(t -> t.stream().map(com.commercetools.ml.models.similar_products.SimilarProduct::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SimilarProductPair
     * @return builder
     */
    public static SimilarProductPairBuilder builder() {
        return SimilarProductPairBuilder.of();
    }
    
    /**
     * create builder for SimilarProductPair instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarProductPairBuilder builder(final SimilarProductPair template) {
        return SimilarProductPairBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSimilarProductPair(Function<SimilarProductPair, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SimilarProductPair> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SimilarProductPair>() {
            @Override
            public String toString() {
                return "TypeReference<SimilarProductPair>";
            }
        };
    }
}
