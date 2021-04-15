
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductProjectionPagedSearchResponseImpl.class)
public interface ProductProjectionPagedSearchResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ProductProjection> {

    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    @NotNull
    @JsonProperty("count")
    public Long getCount();

    @JsonProperty("total")
    public Long getTotal();

    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ProductProjection> getResults();

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
}
