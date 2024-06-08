
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
 *  <p>All Product Variants except the explicitly stated SKUs are part of the Product Selection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelectionIncludeAllExcept productVariantSelectionIncludeAllExcept = ProductVariantSelectionIncludeAllExcept.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantSelectionIncludeAllExceptImpl.class)
public interface ProductVariantSelectionIncludeAllExcept extends ProductVariantSelection {

    /**
     * discriminator value for ProductVariantSelectionIncludeAllExcept
     */
    String INCLUDE_ALL_EXCEPT = "includeAllExcept";

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
    public void setSkus(final String... skus);

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     * @param skus values to be set
     */

    public void setSkus(final List<String> skus);

    /**
     * factory method
     * @return instance of ProductVariantSelectionIncludeAllExcept
     */
    public static ProductVariantSelectionIncludeAllExcept of() {
        return new ProductVariantSelectionIncludeAllExceptImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantSelectionIncludeAllExcept
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantSelectionIncludeAllExcept of(final ProductVariantSelectionIncludeAllExcept template) {
        ProductVariantSelectionIncludeAllExceptImpl instance = new ProductVariantSelectionIncludeAllExceptImpl();
        instance.setSkus(template.getSkus());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantSelectionIncludeAllExcept
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantSelectionIncludeAllExcept deepCopy(
            @Nullable final ProductVariantSelectionIncludeAllExcept template) {
        if (template == null) {
            return null;
        }
        ProductVariantSelectionIncludeAllExceptImpl instance = new ProductVariantSelectionIncludeAllExceptImpl();
        instance.setSkus(Optional.ofNullable(template.getSkus()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantSelectionIncludeAllExcept
     * @return builder
     */
    public static ProductVariantSelectionIncludeAllExceptBuilder builder() {
        return ProductVariantSelectionIncludeAllExceptBuilder.of();
    }

    /**
     * create builder for ProductVariantSelectionIncludeAllExcept instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantSelectionIncludeAllExceptBuilder builder(
            final ProductVariantSelectionIncludeAllExcept template) {
        return ProductVariantSelectionIncludeAllExceptBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantSelectionIncludeAllExcept(
            Function<ProductVariantSelectionIncludeAllExcept, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionIncludeAllExcept> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionIncludeAllExcept>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantSelectionIncludeAllExcept>";
            }
        };
    }
}
