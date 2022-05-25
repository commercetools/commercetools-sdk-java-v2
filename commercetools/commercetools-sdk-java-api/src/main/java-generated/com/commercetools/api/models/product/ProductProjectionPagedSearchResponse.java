
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductProjectionPagedSearchResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductProjectionPagedSearchResponse productProjectionPagedSearchResponse = ProductProjectionPagedSearchResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .facets(facetsBuilder -> facetsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductProjectionPagedSearchResponseImpl.class)
public interface ProductProjectionPagedSearchResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ProductProjection> {

    /**
     *  <p>Number of results requested.</p>
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of elements skipped.</p>
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ProductProjection> getResults();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("facets")
    public FacetResults getFacets();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final ProductProjection... results);

    public void setResults(final List<ProductProjection> results);

    public void setFacets(final FacetResults facets);

    public static ProductProjectionPagedSearchResponse of() {
        return new ProductProjectionPagedSearchResponseImpl();
    }

    public static ProductProjectionPagedSearchResponse of(final ProductProjectionPagedSearchResponse template) {
        ProductProjectionPagedSearchResponseImpl instance = new ProductProjectionPagedSearchResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        instance.setFacets(template.getFacets());
        return instance;
    }

    public static ProductProjectionPagedSearchResponseBuilder builder() {
        return ProductProjectionPagedSearchResponseBuilder.of();
    }

    public static ProductProjectionPagedSearchResponseBuilder builder(
            final ProductProjectionPagedSearchResponse template) {
        return ProductProjectionPagedSearchResponseBuilder.of(template);
    }

    default <T> T withProductProjectionPagedSearchResponse(Function<ProductProjectionPagedSearchResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductProjectionPagedSearchResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductProjectionPagedSearchResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductProjectionPagedSearchResponse>";
            }
        };
    }
}
