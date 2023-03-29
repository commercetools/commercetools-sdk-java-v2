
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Only Product Variants with explicitly stated SKUs are part of the Product Selection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelectionInclusion productVariantSelectionInclusion = ProductVariantSelectionInclusion.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantSelectionInclusionImpl.class)
@Deprecated
public interface ProductVariantSelectionInclusion extends ProductVariantSelection {

    /**
     * discriminator value for ProductVariantSelectionInclusion
     */
    String INCLUSION = "inclusion";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ProductVariantSelectionTypeEnum getType();

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     * @return skus
     */
    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     * @param skus values to be set
     */

    @JsonIgnore
    public void setSkus(final String... skus);

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     * @param skus values to be set
     */

    public void setSkus(final List<String> skus);

    /**
     * factory method
     * @return instance of ProductVariantSelectionInclusion
     */
    public static ProductVariantSelectionInclusion of() {
        return new ProductVariantSelectionInclusionImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantSelectionInclusion
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantSelectionInclusion of(final ProductVariantSelectionInclusion template) {
        ProductVariantSelectionInclusionImpl instance = new ProductVariantSelectionInclusionImpl();
        instance.setSkus(template.getSkus());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantSelectionInclusion
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantSelectionInclusion deepCopy(@Nullable final ProductVariantSelectionInclusion template) {
        if (template == null) {
            return null;
        }
        ProductVariantSelectionInclusionImpl instance = new ProductVariantSelectionInclusionImpl();
        instance.setSkus(Optional.ofNullable(template.getSkus()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantSelectionInclusion
     * @return builder
     */
    public static ProductVariantSelectionInclusionBuilder builder() {
        return ProductVariantSelectionInclusionBuilder.of();
    }

    /**
     * create builder for ProductVariantSelectionInclusion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantSelectionInclusionBuilder builder(final ProductVariantSelectionInclusion template) {
        return ProductVariantSelectionInclusionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantSelectionInclusion(Function<ProductVariantSelectionInclusion, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionInclusion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionInclusion>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantSelectionInclusion>";
            }
        };
    }
}
