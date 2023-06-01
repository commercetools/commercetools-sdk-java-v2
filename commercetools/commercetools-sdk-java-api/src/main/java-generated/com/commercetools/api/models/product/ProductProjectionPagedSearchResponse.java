package com.commercetools.api.models.product;

import com.commercetools.api.models.product.FacetResults;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductProjectionPagedSearchResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductProjectionPagedSearchResponseImpl.class)
public interface ProductProjectionPagedSearchResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<ProductProjection> {


    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();
    /**
     *
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();
    /**
     *
     * @return total
     */
    
    @JsonProperty("total")
    public Long getTotal();
    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();
    /**
     *
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ProductProjection> getResults();
    /**
     *
     * @return facets
     */
    @NotNull
    @Valid
    @JsonProperty("facets")
    public FacetResults getFacets();

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */
    
    public void setLimit(final Long limit);
    
    
    /**
     * set count
     * @param count value to be set
     */
    
    public void setCount(final Long count);
    
    
    /**
     * set total
     * @param total value to be set
     */
    
    public void setTotal(final Long total);
    
    
    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */
    
    public void setOffset(final Long offset);
    
    
    /**
     * set results
     * @param results values to be set
     */
    
    @JsonIgnore
    public void setResults(final ProductProjection ...results);
    /**
     * set results
     * @param results values to be set
     */
    
    public void setResults(final List<ProductProjection> results);
    
    /**
     * set facets
     * @param facets value to be set
     */
    
    public void setFacets(final FacetResults facets);
    

    /**
     * factory method
     * @return instance of ProductProjectionPagedSearchResponse
     */
    public static ProductProjectionPagedSearchResponse of(){
        return new ProductProjectionPagedSearchResponseImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductProjectionPagedSearchResponse
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of ProductProjectionPagedSearchResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductProjectionPagedSearchResponse deepCopy(@Nullable final ProductProjectionPagedSearchResponse template) {
        if (template == null) {
            return null;
        }
        ProductProjectionPagedSearchResponseImpl instance = new ProductProjectionPagedSearchResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream().map(com.commercetools.api.models.product.ProductProjection::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setFacets(com.commercetools.api.models.product.FacetResults.deepCopy(template.getFacets()));
        return instance;
    }

    /**
     * builder factory method for ProductProjectionPagedSearchResponse
     * @return builder
     */
    public static ProductProjectionPagedSearchResponseBuilder builder() {
        return ProductProjectionPagedSearchResponseBuilder.of();
    }
    
    /**
     * create builder for ProductProjectionPagedSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductProjectionPagedSearchResponseBuilder builder(final ProductProjectionPagedSearchResponse template) {
        return ProductProjectionPagedSearchResponseBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductProjectionPagedSearchResponse(Function<ProductProjectionPagedSearchResponse, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductProjectionPagedSearchResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductProjectionPagedSearchResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductProjectionPagedSearchResponse>";
            }
        };
    }
}
