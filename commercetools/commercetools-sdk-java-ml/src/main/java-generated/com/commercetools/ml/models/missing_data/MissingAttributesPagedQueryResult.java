
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
@JsonDeserialize(as = MissingAttributesPagedQueryResultImpl.class)
public interface MissingAttributesPagedQueryResult {

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
    public List<MissingAttributes> getResults();

    @NotNull
    @Valid
    @JsonProperty("meta")
    public MissingAttributesMeta getMeta();

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final MissingAttributes... results);

    public void setResults(final List<MissingAttributes> results);

    public void setMeta(final MissingAttributesMeta meta);

    public static MissingAttributesPagedQueryResult of() {
        return new MissingAttributesPagedQueryResultImpl();
    }

    public static MissingAttributesPagedQueryResult of(final MissingAttributesPagedQueryResult template) {
        MissingAttributesPagedQueryResultImpl instance = new MissingAttributesPagedQueryResultImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        instance.setMeta(template.getMeta());
        return instance;
    }

    public static MissingAttributesPagedQueryResultBuilder builder() {
        return MissingAttributesPagedQueryResultBuilder.of();
    }

    public static MissingAttributesPagedQueryResultBuilder builder(final MissingAttributesPagedQueryResult template) {
        return MissingAttributesPagedQueryResultBuilder.of(template);
    }

    default <T> T withMissingAttributesPagedQueryResult(Function<MissingAttributesPagedQueryResult, T> helper) {
        return helper.apply(this);
    }
}
