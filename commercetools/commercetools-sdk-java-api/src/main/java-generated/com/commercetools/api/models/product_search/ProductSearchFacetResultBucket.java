
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Result of a distinct facet or a ranges facet.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResultBucket productSearchFacetResultBucket = ProductSearchFacetResultBucket.builder()
 *             .name("{name}")
 *             .plusBuckets(bucketsBuilder -> bucketsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetResultBucketImpl.class)
public interface ProductSearchFacetResultBucket extends ProductSearchFacetResult {

    /**
     *  <p>Contains results of the facet.</p>
     * @return buckets
     */
    @NotNull
    @Valid
    @JsonProperty("buckets")
    public List<ProductSearchFacetResultBucketEntry> getBuckets();

    /**
     *  <p>Contains results of the facet.</p>
     * @param buckets values to be set
     */

    @JsonIgnore
    public void setBuckets(final ProductSearchFacetResultBucketEntry... buckets);

    /**
     *  <p>Contains results of the facet.</p>
     * @param buckets values to be set
     */

    public void setBuckets(final List<ProductSearchFacetResultBucketEntry> buckets);

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
        instance.setName(template.getName());
        instance.setBuckets(template.getBuckets());
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
        instance.setName(template.getName());
        instance.setBuckets(Optional.ofNullable(template.getBuckets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntry::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
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
