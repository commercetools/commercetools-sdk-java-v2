
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
 * ProductSearchFacetResultBucket
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResultBucket productSearchFacetResultBucket = ProductSearchFacetResultBucket.builder()
 *             .key("{key}")
 *             .count(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetResultBucketImpl.class)
public interface ProductSearchFacetResultBucket {

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
     * @return instance of ProductSearchFacetResultBucket
     */
    public static ProductSearchFacetResultBucket of() {
        return new ProductSearchFacetResultBucketImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetResultBucket
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetResultBucket of(final ProductSearchFacetResultBucket template) {
        ProductSearchFacetResultBucketImpl instance = new ProductSearchFacetResultBucketImpl();
        instance.setKey(template.getKey());
        instance.setCount(template.getCount());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetResultBucket
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetResultBucket deepCopy(@Nullable final ProductSearchFacetResultBucket template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetResultBucketImpl instance = new ProductSearchFacetResultBucketImpl();
        instance.setKey(template.getKey());
        instance.setCount(template.getCount());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetResultBucket
     * @return builder
     */
    public static ProductSearchFacetResultBucketBuilder builder() {
        return ProductSearchFacetResultBucketBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetResultBucket instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultBucketBuilder builder(final ProductSearchFacetResultBucket template) {
        return ProductSearchFacetResultBucketBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetResultBucket(Function<ProductSearchFacetResultBucket, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResultBucket> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResultBucket>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetResultBucket>";
            }
        };
    }
}
