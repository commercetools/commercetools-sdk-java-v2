package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.product_selection.ProductVariantSelection;
import com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum;
import com.commercetools.api.models.product_selection.ProductVariantSelectionExclusionImpl;

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
 *  <p>All Product Variants except the explicitly stated SKUs are part of the Product Selection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelectionExclusion productVariantSelectionExclusion = ProductVariantSelectionExclusion.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductVariantSelectionExclusionImpl.class)
@Deprecated
public interface ProductVariantSelectionExclusion extends ProductVariantSelection {

    /**
     * discriminator value for ProductVariantSelectionExclusion
     */
    String EXCLUSION = "exclusion";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ProductVariantSelectionTypeEnum getType();
    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     * @return skus
     */
    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     * @param skus values to be set
     */
    
    @JsonIgnore
    public void setSkus(final String ...skus);
    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     * @param skus values to be set
     */
    
    public void setSkus(final List<String> skus);

    /**
     * factory method
     * @return instance of ProductVariantSelectionExclusion
     */
    public static ProductVariantSelectionExclusion of(){
        return new ProductVariantSelectionExclusionImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductVariantSelectionExclusion
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantSelectionExclusion of(final ProductVariantSelectionExclusion template) {
        ProductVariantSelectionExclusionImpl instance = new ProductVariantSelectionExclusionImpl();
        instance.setSkus(template.getSkus());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantSelectionExclusion
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantSelectionExclusion deepCopy(@Nullable final ProductVariantSelectionExclusion template) {
        if (template == null) {
            return null;
        }
        ProductVariantSelectionExclusionImpl instance = new ProductVariantSelectionExclusionImpl();
        instance.setSkus(Optional.ofNullable(template.getSkus())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantSelectionExclusion
     * @return builder
     */
    public static ProductVariantSelectionExclusionBuilder builder() {
        return ProductVariantSelectionExclusionBuilder.of();
    }
    
    /**
     * create builder for ProductVariantSelectionExclusion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantSelectionExclusionBuilder builder(final ProductVariantSelectionExclusion template) {
        return ProductVariantSelectionExclusionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantSelectionExclusion(Function<ProductVariantSelectionExclusion, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionExclusion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionExclusion>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantSelectionExclusion>";
            }
        };
    }
}
