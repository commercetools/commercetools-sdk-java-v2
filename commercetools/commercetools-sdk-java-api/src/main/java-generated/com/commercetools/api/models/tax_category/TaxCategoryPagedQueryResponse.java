
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxCategoryPagedQueryResponseImpl.class)
public interface TaxCategoryPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<TaxCategory> {

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
    public List<TaxCategory> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final TaxCategory... results);

    public void setResults(final List<TaxCategory> results);

    public static TaxCategoryPagedQueryResponse of() {
        return new TaxCategoryPagedQueryResponseImpl();
    }

    public static TaxCategoryPagedQueryResponse of(final TaxCategoryPagedQueryResponse template) {
        TaxCategoryPagedQueryResponseImpl instance = new TaxCategoryPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static TaxCategoryPagedQueryResponseBuilder builder() {
        return TaxCategoryPagedQueryResponseBuilder.of();
    }

    public static TaxCategoryPagedQueryResponseBuilder builder(final TaxCategoryPagedQueryResponse template) {
        return TaxCategoryPagedQueryResponseBuilder.of(template);
    }

    default <T> T withTaxCategoryPagedQueryResponse(Function<TaxCategoryPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
