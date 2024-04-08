
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetResultBucketEntry
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResultBucketEntry productSearchFacetResultBucketEntry = ProductSearchFacetResultBucketEntry.builder()
 *             .key("{key}")
 *             .count(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetResultBucketEntryImpl.class)
public interface ProductSearchFacetResultBucketEntry {

    /**
     *  <p>Key of the bucket.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Number of values in the bucket.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Integer getCount();

    /**
     *  <p>Key of the bucket.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Number of values in the bucket.</p>
     * @param count value to be set
     */

    public void setCount(final Integer count);

    /**
     * factory method
     * @return instance of ProductSearchFacetResultBucketEntry
     */
    public static ProductSearchFacetResultBucketEntry of() {
        return new ProductSearchFacetResultBucketEntryImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetResultBucketEntry
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetResultBucketEntry of(final ProductSearchFacetResultBucketEntry template) {
        ProductSearchFacetResultBucketEntryImpl instance = new ProductSearchFacetResultBucketEntryImpl();
        instance.setKey(template.getKey());
        instance.setCount(template.getCount());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetResultBucketEntry
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetResultBucketEntry deepCopy(
            @Nullable final ProductSearchFacetResultBucketEntry template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetResultBucketEntryImpl instance = new ProductSearchFacetResultBucketEntryImpl();
        instance.setKey(template.getKey());
        instance.setCount(template.getCount());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetResultBucketEntry
     * @return builder
     */
    public static ProductSearchFacetResultBucketEntryBuilder builder() {
        return ProductSearchFacetResultBucketEntryBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetResultBucketEntry instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultBucketEntryBuilder builder(
            final ProductSearchFacetResultBucketEntry template) {
        return ProductSearchFacetResultBucketEntryBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetResultBucketEntry(Function<ProductSearchFacetResultBucketEntry, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResultBucketEntry> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResultBucketEntry>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetResultBucketEntry>";
            }
        };
    }
}
