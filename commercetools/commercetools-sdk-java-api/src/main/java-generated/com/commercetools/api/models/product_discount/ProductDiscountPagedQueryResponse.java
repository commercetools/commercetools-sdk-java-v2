
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountPagedQueryResponseImpl.class)
public interface ProductDiscountPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ProductDiscount> {

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
    public List<ProductDiscount> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final ProductDiscount... results);

    public void setResults(final List<ProductDiscount> results);

    public static ProductDiscountPagedQueryResponse of() {
        return new ProductDiscountPagedQueryResponseImpl();
    }

    public static ProductDiscountPagedQueryResponse of(final ProductDiscountPagedQueryResponse template) {
        ProductDiscountPagedQueryResponseImpl instance = new ProductDiscountPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ProductDiscountPagedQueryResponseBuilder builder() {
        return ProductDiscountPagedQueryResponseBuilder.of();
    }

    public static ProductDiscountPagedQueryResponseBuilder builder(final ProductDiscountPagedQueryResponse template) {
        return ProductDiscountPagedQueryResponseBuilder.of(template);
    }

    default <T> T withProductDiscountPagedQueryResponse(Function<ProductDiscountPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
