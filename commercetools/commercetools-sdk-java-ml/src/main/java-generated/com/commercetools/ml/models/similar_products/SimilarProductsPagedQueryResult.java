
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SimilarProductsPagedQueryResultImpl.class)
public interface SimilarProductsPagedQueryResult {

    @NotNull
    @JsonProperty("count")
    public Long getCount();

    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    @NotNull
    @Valid
    @JsonProperty("results")
    public List<SimilarProductPair> getResults();

    @NotNull
    @Valid
    @JsonProperty("meta")
    public SimilarProductSearchRequestMeta getMeta();

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final SimilarProductPair... results);

    public void setResults(final List<SimilarProductPair> results);

    public void setMeta(final SimilarProductSearchRequestMeta meta);

    public static SimilarProductsPagedQueryResult of() {
        return new SimilarProductsPagedQueryResultImpl();
    }

    public static SimilarProductsPagedQueryResult of(final SimilarProductsPagedQueryResult template) {
        SimilarProductsPagedQueryResultImpl instance = new SimilarProductsPagedQueryResultImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        instance.setMeta(template.getMeta());
        return instance;
    }

    public static SimilarProductsPagedQueryResultBuilder builder() {
        return SimilarProductsPagedQueryResultBuilder.of();
    }

    public static SimilarProductsPagedQueryResultBuilder builder(final SimilarProductsPagedQueryResult template) {
        return SimilarProductsPagedQueryResultBuilder.of(template);
    }

    default <T> T withSimilarProductsPagedQueryResult(Function<SimilarProductsPagedQueryResult, T> helper) {
        return helper.apply(this);
    }
}
