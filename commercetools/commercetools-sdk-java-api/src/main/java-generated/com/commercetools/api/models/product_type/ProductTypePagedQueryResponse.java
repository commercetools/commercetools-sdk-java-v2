
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypePagedQueryResponseImpl.class)
public interface ProductTypePagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ProductType> {

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
    public List<ProductType> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final ProductType... results);

    public void setResults(final List<ProductType> results);

    public static ProductTypePagedQueryResponse of() {
        return new ProductTypePagedQueryResponseImpl();
    }

    public static ProductTypePagedQueryResponse of(final ProductTypePagedQueryResponse template) {
        ProductTypePagedQueryResponseImpl instance = new ProductTypePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ProductTypePagedQueryResponseBuilder builder() {
        return ProductTypePagedQueryResponseBuilder.of();
    }

    public static ProductTypePagedQueryResponseBuilder builder(final ProductTypePagedQueryResponse template) {
        return ProductTypePagedQueryResponseBuilder.of(template);
    }

    default <T> T withProductTypePagedQueryResponse(Function<ProductTypePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
