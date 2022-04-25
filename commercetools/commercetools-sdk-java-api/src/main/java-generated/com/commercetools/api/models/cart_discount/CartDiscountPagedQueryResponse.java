
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountPagedQueryResponseImpl.class)
public interface CartDiscountPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<CartDiscount> {

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
    public List<CartDiscount> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final CartDiscount... results);

    public void setResults(final List<CartDiscount> results);

    public static CartDiscountPagedQueryResponse of() {
        return new CartDiscountPagedQueryResponseImpl();
    }

    public static CartDiscountPagedQueryResponse of(final CartDiscountPagedQueryResponse template) {
        CartDiscountPagedQueryResponseImpl instance = new CartDiscountPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static CartDiscountPagedQueryResponseBuilder builder() {
        return CartDiscountPagedQueryResponseBuilder.of();
    }

    public static CartDiscountPagedQueryResponseBuilder builder(final CartDiscountPagedQueryResponse template) {
        return CartDiscountPagedQueryResponseBuilder.of(template);
    }

    default <T> T withCartDiscountPagedQueryResponse(Function<CartDiscountPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountPagedQueryResponse>";
            }
        };
    }
}
