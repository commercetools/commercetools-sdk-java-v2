
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodePagedQueryResponseImpl.class)
public interface DiscountCodePagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<DiscountCode> {

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
    public List<DiscountCode> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final DiscountCode... results);

    public void setResults(final List<DiscountCode> results);

    public static DiscountCodePagedQueryResponse of() {
        return new DiscountCodePagedQueryResponseImpl();
    }

    public static DiscountCodePagedQueryResponse of(final DiscountCodePagedQueryResponse template) {
        DiscountCodePagedQueryResponseImpl instance = new DiscountCodePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static DiscountCodePagedQueryResponseBuilder builder() {
        return DiscountCodePagedQueryResponseBuilder.of();
    }

    public static DiscountCodePagedQueryResponseBuilder builder(final DiscountCodePagedQueryResponse template) {
        return DiscountCodePagedQueryResponseBuilder.of(template);
    }

    default <T> T withDiscountCodePagedQueryResponse(Function<DiscountCodePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
