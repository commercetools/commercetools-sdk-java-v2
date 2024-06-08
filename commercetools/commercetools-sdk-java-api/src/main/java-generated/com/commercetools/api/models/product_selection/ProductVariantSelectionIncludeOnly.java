
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Only Product Variants with explicitly stated SKUs are part of the Product Selection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelectionIncludeOnly productVariantSelectionIncludeOnly = ProductVariantSelectionIncludeOnly.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantSelectionIncludeOnlyImpl.class)
public interface ProductVariantSelectionIncludeOnly extends ProductVariantSelection {

    /**
     * discriminator value for ProductVariantSelectionIncludeOnly
     */
    String INCLUDE_ONLY = "includeOnly";

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
     * @return instance of ProductVariantSelectionIncludeOnly
     */
    public static ProductVariantSelectionIncludeOnly of() {
        return new ProductVariantSelectionIncludeOnlyImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantSelectionIncludeOnly
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantSelectionIncludeOnly of(final ProductVariantSelectionIncludeOnly template) {
        ProductVariantSelectionIncludeOnlyImpl instance = new ProductVariantSelectionIncludeOnlyImpl();
        instance.setSkus(template.getSkus());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantSelectionIncludeOnly
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantSelectionIncludeOnly deepCopy(
            @Nullable final ProductVariantSelectionIncludeOnly template) {
        if (template == null) {
            return null;
        }
        ProductVariantSelectionIncludeOnlyImpl instance = new ProductVariantSelectionIncludeOnlyImpl();
        instance.setSkus(Optional.ofNullable(template.getSkus()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantSelectionIncludeOnly
     * @return builder
     */
    public static ProductVariantSelectionIncludeOnlyBuilder builder() {
        return ProductVariantSelectionIncludeOnlyBuilder.of();
    }

    /**
     * create builder for ProductVariantSelectionIncludeOnly instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantSelectionIncludeOnlyBuilder builder(final ProductVariantSelectionIncludeOnly template) {
        return ProductVariantSelectionIncludeOnlyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantSelectionIncludeOnly(Function<ProductVariantSelectionIncludeOnly, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionIncludeOnly> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionIncludeOnly>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantSelectionIncludeOnly>";
            }
        };
    }
}
