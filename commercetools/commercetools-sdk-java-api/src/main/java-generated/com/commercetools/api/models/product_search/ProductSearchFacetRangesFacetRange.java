
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Values for <code>from</code> and <code>to</code> must be a number or DateTime.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetRangesFacetRange productSearchFacetRangesFacetRange = ProductSearchFacetRangesFacetRange.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetRangesFacetRangeImpl.class)
public interface ProductSearchFacetRangesFacetRange {

    /**
     *  <p>Starting value of the bucket (inclusive).</p>
     * @return from
     */

    @JsonProperty("from")
    public Object getFrom();

    /**
     *  <p>Ending value of the bucket (non-inclusive).</p>
     * @return to
     */

    @JsonProperty("to")
    public Object getTo();

    /**
     *  <p>Key to assign the bucket.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Starting value of the bucket (inclusive).</p>
     * @param from value to be set
     */

    public void setFrom(final Object from);

    /**
     *  <p>Ending value of the bucket (non-inclusive).</p>
     * @param to value to be set
     */

    public void setTo(final Object to);

    /**
     *  <p>Key to assign the bucket.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ProductSearchFacetRangesFacetRange
     */
    public static ProductSearchFacetRangesFacetRange of() {
        return new ProductSearchFacetRangesFacetRangeImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetRangesFacetRange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetRangesFacetRange of(final ProductSearchFacetRangesFacetRange template) {
        ProductSearchFacetRangesFacetRangeImpl instance = new ProductSearchFacetRangesFacetRangeImpl();
        instance.setFrom(template.getFrom());
        instance.setTo(template.getTo());
        instance.setKey(template.getKey());
        return instance;
    }

    public ProductSearchFacetRangesFacetRange copyDeep();

    /**
     * factory method to create a deep copy of ProductSearchFacetRangesFacetRange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetRangesFacetRange deepCopy(
            @Nullable final ProductSearchFacetRangesFacetRange template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetRangesFacetRangeImpl instance = new ProductSearchFacetRangesFacetRangeImpl();
        instance.setFrom(template.getFrom());
        instance.setTo(template.getTo());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetRangesFacetRange
     * @return builder
     */
    public static ProductSearchFacetRangesFacetRangeBuilder builder() {
        return ProductSearchFacetRangesFacetRangeBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetRangesFacetRange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetRangesFacetRangeBuilder builder(final ProductSearchFacetRangesFacetRange template) {
        return ProductSearchFacetRangesFacetRangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetRangesFacetRange(Function<ProductSearchFacetRangesFacetRange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetRangesFacetRange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetRangesFacetRange>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetRangesFacetRange>";
            }
        };
    }
}
