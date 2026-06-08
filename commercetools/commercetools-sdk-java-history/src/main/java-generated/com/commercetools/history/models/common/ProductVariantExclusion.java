
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Only Product Variants with the explicitly listed SKUs are part of a Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantExclusion productVariantExclusion = ProductVariantExclusion.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantExclusionImpl.class)
public interface ProductVariantExclusion {

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included in the Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @return skus
     */
    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included in the Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @param skus values to be set
     */

    @JsonIgnore
    public void setSkus(final String... skus);

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included in the Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @param skus values to be set
     */

    public void setSkus(final List<String> skus);

    /**
     * factory method
     * @return instance of ProductVariantExclusion
     */
    public static ProductVariantExclusion of() {
        return new ProductVariantExclusionImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantExclusion
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantExclusion of(final ProductVariantExclusion template) {
        ProductVariantExclusionImpl instance = new ProductVariantExclusionImpl();
        instance.setSkus(template.getSkus());
        return instance;
    }

    public ProductVariantExclusion copyDeep();

    /**
     * factory method to create a deep copy of ProductVariantExclusion
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantExclusion deepCopy(@Nullable final ProductVariantExclusion template) {
        if (template == null) {
            return null;
        }
        ProductVariantExclusionImpl instance = new ProductVariantExclusionImpl();
        instance.setSkus(Optional.ofNullable(template.getSkus()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantExclusion
     * @return builder
     */
    public static ProductVariantExclusionBuilder builder() {
        return ProductVariantExclusionBuilder.of();
    }

    /**
     * create builder for ProductVariantExclusion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantExclusionBuilder builder(final ProductVariantExclusion template) {
        return ProductVariantExclusionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantExclusion(Function<ProductVariantExclusion, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantExclusion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantExclusion>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantExclusion>";
            }
        };
    }
}
