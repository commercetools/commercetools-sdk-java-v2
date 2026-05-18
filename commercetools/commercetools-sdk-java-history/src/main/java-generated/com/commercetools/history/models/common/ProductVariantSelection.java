
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
 *  <p>Polymorphic base type for Product Variant Selections. The actual type is determined by the <code>type</code> field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelection productVariantSelection = ProductVariantSelection.builder()
 *             .type(ProductVariantSelectionTypeEnum.INCLUSION)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantSelectionImpl.class)
public interface ProductVariantSelection {

    /**
     *  <p>Determines whether the SKUs are to be included in, or excluded from, the Product Selection.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ProductVariantSelectionTypeEnum getType();

    /**
     *  <p>Determines whether the SKUs are to be included in, or excluded from, the Product Selection.</p>
     * @param type value to be set
     */

    public void setType(final ProductVariantSelectionTypeEnum type);

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
        return instance;
    }

    public ProductVariantSelection copyDeep();

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
