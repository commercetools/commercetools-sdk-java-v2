
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetBucketResult
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetBucketResult productSearchFacetBucketResult = ProductSearchFacetBucketResult.builder()
 *             .name("{name}")
 *             .plusBuckets(bucketsBuilder -> bucketsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetBucketResultImpl.class)
public interface ProductSearchFacetBucketResult extends ProductSearchFacetResultExpression {

    /**
     *  <p>Contains results of the facet.</p>
     * @return buckets
     */
    @NotNull
    @Valid
    @JsonProperty("buckets")
    public List<ProductSearchFacetResultBucket> getBuckets();

    /**
     *  <p>Contains results of the facet.</p>
     * @param buckets values to be set
     */

    @JsonIgnore
    public void setBuckets(final ProductSearchFacetResultBucket... buckets);

    /**
     *  <p>Contains results of the facet.</p>
     * @param buckets values to be set
     */

    public void setBuckets(final List<ProductSearchFacetResultBucket> buckets);

    /**
     * factory method
     * @return instance of ProductSearchFacetBucketResult
     */
    public static ProductSearchFacetBucketResult of() {
        return new ProductSearchFacetBucketResultImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetBucketResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetBucketResult of(final ProductSearchFacetBucketResult template) {
        ProductSearchFacetBucketResultImpl instance = new ProductSearchFacetBucketResultImpl();
        instance.setName(template.getName());
        instance.setBuckets(template.getBuckets());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetBucketResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetBucketResult deepCopy(@Nullable final ProductSearchFacetBucketResult template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetBucketResultImpl instance = new ProductSearchFacetBucketResultImpl();
        instance.setName(template.getName());
        instance.setBuckets(Optional.ofNullable(template.getBuckets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchFacetResultBucket::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetBucketResult
     * @return builder
     */
    public static ProductSearchFacetBucketResultBuilder builder() {
        return ProductSearchFacetBucketResultBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetBucketResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetBucketResultBuilder builder(final ProductSearchFacetBucketResult template) {
        return ProductSearchFacetBucketResultBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetBucketResult(Function<ProductSearchFacetBucketResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetBucketResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetBucketResult>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetBucketResult>";
            }
        };
    }
}
