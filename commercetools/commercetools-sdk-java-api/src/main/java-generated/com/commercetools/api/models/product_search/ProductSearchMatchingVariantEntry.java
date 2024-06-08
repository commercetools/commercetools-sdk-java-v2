
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProductSearchMatchingVariantEntry
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchMatchingVariantEntry productSearchMatchingVariantEntry = ProductSearchMatchingVariantEntry.builder()
 *             .id(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchMatchingVariantEntryImpl.class)
public interface ProductSearchMatchingVariantEntry {

    /**
     *  <p>Unique identifier of the variant.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public Integer getId();

    /**
     *  <p>SKU of the matching variant.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Unique identifier of the variant.</p>
     * @param id value to be set
     */

    public void setId(final Integer id);

    /**
     *  <p>SKU of the matching variant.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     * factory method
     * @return instance of ProductSearchMatchingVariantEntry
     */
    public static ProductSearchMatchingVariantEntry of() {
        return new ProductSearchMatchingVariantEntryImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchMatchingVariantEntry
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchMatchingVariantEntry of(final ProductSearchMatchingVariantEntry template) {
        ProductSearchMatchingVariantEntryImpl instance = new ProductSearchMatchingVariantEntryImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchMatchingVariantEntry
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchMatchingVariantEntry deepCopy(
            @Nullable final ProductSearchMatchingVariantEntry template) {
        if (template == null) {
            return null;
        }
        ProductSearchMatchingVariantEntryImpl instance = new ProductSearchMatchingVariantEntryImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        return instance;
    }

    /**
     * builder factory method for ProductSearchMatchingVariantEntry
     * @return builder
     */
    public static ProductSearchMatchingVariantEntryBuilder builder() {
        return ProductSearchMatchingVariantEntryBuilder.of();
    }

    /**
     * create builder for ProductSearchMatchingVariantEntry instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchMatchingVariantEntryBuilder builder(final ProductSearchMatchingVariantEntry template) {
        return ProductSearchMatchingVariantEntryBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchMatchingVariantEntry(Function<ProductSearchMatchingVariantEntry, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchMatchingVariantEntry> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchMatchingVariantEntry>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchMatchingVariantEntry>";
            }
        };
    }
}
