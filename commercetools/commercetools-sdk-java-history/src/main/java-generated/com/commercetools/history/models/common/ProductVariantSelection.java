
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantSelection
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelection productVariantSelection = ProductVariantSelection.builder()
 *             .type(ProductVariantSelectionTypeEnum.INCLUSION)
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantSelectionImpl.class)
public interface ProductVariantSelection {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ProductVariantSelectionTypeEnum getType();

    /**
     *
     * @return skus
     */
    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    /**
     * set type
     * @param type value to be set
     */

    public void setType(final ProductVariantSelectionTypeEnum type);

    /**
     * set skus
     * @param skus values to be set
     */

    @JsonIgnore
    public void setSkus(final String... skus);

    /**
     * set skus
     * @param skus values to be set
     */

    public void setSkus(final List<String> skus);

    /**
     * factory method
     * @return instance of ProductVariantSelection
     */
    public static ProductVariantSelection of() {
        return new ProductVariantSelectionImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantSelection
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantSelection of(final ProductVariantSelection template) {
        ProductVariantSelectionImpl instance = new ProductVariantSelectionImpl();
        instance.setType(template.getType());
        instance.setSkus(template.getSkus());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantSelection
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantSelection deepCopy(@Nullable final ProductVariantSelection template) {
        if (template == null) {
            return null;
        }
        ProductVariantSelectionImpl instance = new ProductVariantSelectionImpl();
        instance.setType(template.getType());
        instance.setSkus(Optional.ofNullable(template.getSkus()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantSelection
     * @return builder
     */
    public static ProductVariantSelectionBuilder builder() {
        return ProductVariantSelectionBuilder.of();
    }

    /**
     * create builder for ProductVariantSelection instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantSelectionBuilder builder(final ProductVariantSelection template) {
        return ProductVariantSelectionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantSelection(Function<ProductVariantSelection, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelection> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelection>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantSelection>";
            }
        };
    }
}
