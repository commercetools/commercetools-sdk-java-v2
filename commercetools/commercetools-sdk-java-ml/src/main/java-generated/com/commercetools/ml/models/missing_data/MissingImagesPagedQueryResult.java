
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
@JsonDeserialize(as = MissingImagesPagedQueryResultImpl.class)
public interface MissingImagesPagedQueryResult {

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
    public List<MissingImages> getResults();

    @NotNull
    @Valid
    @JsonProperty("meta")
    public MissingImagesMeta getMeta();

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final MissingImages... results);

    public void setResults(final List<MissingImages> results);

    public void setMeta(final MissingImagesMeta meta);

    public static MissingImagesPagedQueryResult of() {
        return new MissingImagesPagedQueryResultImpl();
    }

    public static MissingImagesPagedQueryResult of(final MissingImagesPagedQueryResult template) {
        MissingImagesPagedQueryResultImpl instance = new MissingImagesPagedQueryResultImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        instance.setMeta(template.getMeta());
        return instance;
    }

    public static MissingImagesPagedQueryResultBuilder builder() {
        return MissingImagesPagedQueryResultBuilder.of();
    }

    public static MissingImagesPagedQueryResultBuilder builder(final MissingImagesPagedQueryResult template) {
        return MissingImagesPagedQueryResultBuilder.of(template);
    }

    default <T> T withMissingImagesPagedQueryResult(Function<MissingImagesPagedQueryResult, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MissingImagesPagedQueryResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingImagesPagedQueryResult>() {
            @Override
            public String toString() {
                return "TypeReference<MissingImagesPagedQueryResult>";
            }
        };
    }
}
