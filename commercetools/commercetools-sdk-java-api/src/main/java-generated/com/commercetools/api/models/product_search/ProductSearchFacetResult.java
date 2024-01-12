
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
 * ProductSearchFacetResult
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResult productSearchFacetResult = ProductSearchFacetResult.builder()
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetResultImpl.class)
public interface ProductSearchFacetResult {

    /**
     *  <p>Results of the facets.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ProductSearchFacetResultExpression> getResults();

    /**
     *  <p>Results of the facets.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final ProductSearchFacetResultExpression... results);

    /**
     *  <p>Results of the facets.</p>
     * @param results values to be set
     */

    public void setResults(final List<ProductSearchFacetResultExpression> results);

    /**
     * factory method
     * @return instance of ProductSearchFacetResult
     */
    public static ProductSearchFacetResult of() {
        return new ProductSearchFacetResultImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetResult of(final ProductSearchFacetResult template) {
        ProductSearchFacetResultImpl instance = new ProductSearchFacetResultImpl();
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetResult deepCopy(@Nullable final ProductSearchFacetResult template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetResultImpl instance = new ProductSearchFacetResultImpl();
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchFacetResultExpression::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetResult
     * @return builder
     */
    public static ProductSearchFacetResultBuilder builder() {
        return ProductSearchFacetResultBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultBuilder builder(final ProductSearchFacetResult template) {
        return ProductSearchFacetResultBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetResult(Function<ProductSearchFacetResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResult>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetResult>";
            }
        };
    }
}
