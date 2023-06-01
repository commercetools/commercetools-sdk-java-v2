package com.commercetools.ml.models.similar_products;

import com.commercetools.ml.models.common.LocalizedString;
import com.commercetools.ml.models.common.Money;
import com.commercetools.ml.models.similar_products.SimilarProductMetaImpl;

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
 * SimilarProductMeta
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProductMeta similarProductMeta = SimilarProductMeta.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SimilarProductMetaImpl.class)
public interface SimilarProductMeta  {


    /**
     *  <p>Localized product name used for similarity estimation.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    /**
     *  <p>Localized product description used for similarity estimation.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();
    /**
     *  <p>The product price in cents using the currency defined in SimilarProductSearchRequest If multiple prices exist, the median value is taken as a representative amount.</p>
     * @return price
     */
    @Valid
    @JsonProperty("price")
    public Money getPrice();
    /**
     *  <p>Total number of variants associated with the product.</p>
     * @return variantCount
     */
    
    @JsonProperty("variantCount")
    public Long getVariantCount();

    /**
     *  <p>Localized product name used for similarity estimation.</p>
     * @param name value to be set
     */
    
    public void setName(final LocalizedString name);
    
    
    /**
     *  <p>Localized product description used for similarity estimation.</p>
     * @param description value to be set
     */
    
    public void setDescription(final LocalizedString description);
    
    
    /**
     *  <p>The product price in cents using the currency defined in SimilarProductSearchRequest If multiple prices exist, the median value is taken as a representative amount.</p>
     * @param price value to be set
     */
    
    public void setPrice(final Money price);
    
    
    /**
     *  <p>Total number of variants associated with the product.</p>
     * @param variantCount value to be set
     */
    
    public void setVariantCount(final Long variantCount);
    

    /**
     * factory method
     * @return instance of SimilarProductMeta
     */
    public static SimilarProductMeta of(){
        return new SimilarProductMetaImpl();
    }
    

    /**
     * factory method to create a shallow copy SimilarProductMeta
     * @param template instance to be copied
     * @return copy instance
     */
    public static SimilarProductMeta of(final SimilarProductMeta template) {
        SimilarProductMetaImpl instance = new SimilarProductMetaImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setPrice(template.getPrice());
        instance.setVariantCount(template.getVariantCount());
        return instance;
    }

    /**
     * factory method to create a deep copy of SimilarProductMeta
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SimilarProductMeta deepCopy(@Nullable final SimilarProductMeta template) {
        if (template == null) {
            return null;
        }
        SimilarProductMetaImpl instance = new SimilarProductMetaImpl();
        instance.setName(com.commercetools.ml.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(com.commercetools.ml.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setPrice(com.commercetools.ml.models.common.Money.deepCopy(template.getPrice()));
        instance.setVariantCount(template.getVariantCount());
        return instance;
    }

    /**
     * builder factory method for SimilarProductMeta
     * @return builder
     */
    public static SimilarProductMetaBuilder builder() {
        return SimilarProductMetaBuilder.of();
    }
    
    /**
     * create builder for SimilarProductMeta instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarProductMetaBuilder builder(final SimilarProductMeta template) {
        return SimilarProductMetaBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSimilarProductMeta(Function<SimilarProductMeta, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SimilarProductMeta> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SimilarProductMeta>() {
            @Override
            public String toString() {
                return "TypeReference<SimilarProductMeta>";
            }
        };
    }
}
