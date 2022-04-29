
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingPricesPagedQueryResultImpl.class)
public interface MissingPricesPagedQueryResult {

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
    public List<MissingPrices> getResults();

    @NotNull
    @Valid
    @JsonProperty("meta")
    public MissingPricesMeta getMeta();

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final MissingPrices... results);

    public void setResults(final List<MissingPrices> results);

    public void setMeta(final MissingPricesMeta meta);

    public static MissingPricesPagedQueryResult of() {
        return new MissingPricesPagedQueryResultImpl();
    }

    public static MissingPricesPagedQueryResult of(final MissingPricesPagedQueryResult template) {
        MissingPricesPagedQueryResultImpl instance = new MissingPricesPagedQueryResultImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        instance.setMeta(template.getMeta());
        return instance;
    }

    public static MissingPricesPagedQueryResultBuilder builder() {
        return MissingPricesPagedQueryResultBuilder.of();
    }

    public static MissingPricesPagedQueryResultBuilder builder(final MissingPricesPagedQueryResult template) {
        return MissingPricesPagedQueryResultBuilder.of(template);
    }

    default <T> T withMissingPricesPagedQueryResult(Function<MissingPricesPagedQueryResult, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MissingPricesPagedQueryResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingPricesPagedQueryResult>() {
            @Override
            public String toString() {
                return "TypeReference<MissingPricesPagedQueryResult>";
            }
        };
    }
}
