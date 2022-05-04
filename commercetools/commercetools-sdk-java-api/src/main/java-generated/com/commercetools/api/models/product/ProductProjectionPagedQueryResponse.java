
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
@JsonDeserialize(as = ProductProjectionPagedQueryResponseImpl.class)
public interface ProductProjectionPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ProductProjection> {

    /**
    *  <p>Number of <a href="/../api/general-concepts#limit">results requested</a>.</p>
    */
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

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final ProductProjection... results);

    public void setResults(final List<ProductProjection> results);

    public static ProductProjectionPagedQueryResponse of() {
        return new ProductProjectionPagedQueryResponseImpl();
    }

    public static ProductProjectionPagedQueryResponse of(final ProductProjectionPagedQueryResponse template) {
        ProductProjectionPagedQueryResponseImpl instance = new ProductProjectionPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ProductProjectionPagedQueryResponseBuilder builder() {
        return ProductProjectionPagedQueryResponseBuilder.of();
    }

    public static ProductProjectionPagedQueryResponseBuilder builder(
            final ProductProjectionPagedQueryResponse template) {
        return ProductProjectionPagedQueryResponseBuilder.of(template);
    }

    default <T> T withProductProjectionPagedQueryResponse(Function<ProductProjectionPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductProjectionPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductProjectionPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductProjectionPagedQueryResponse>";
            }
        };
    }
}
