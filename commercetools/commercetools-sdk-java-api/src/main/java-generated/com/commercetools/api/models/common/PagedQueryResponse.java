
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PagedQueryResponseImpl.class)
public interface PagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<BaseResource> {

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
    public List<BaseResource> getResults();

    @Valid
    @JsonProperty("meta")
    public Object getMeta();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final BaseResource... results);

    public void setResults(final List<BaseResource> results);

    public void setMeta(final Object meta);

    public static PagedQueryResponse of() {
        return new PagedQueryResponseImpl();
    }

    public static PagedQueryResponse of(final PagedQueryResponse template) {
        PagedQueryResponseImpl instance = new PagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        instance.setMeta(template.getMeta());
        return instance;
    }

    public static PagedQueryResponseBuilder builder() {
        return PagedQueryResponseBuilder.of();
    }

    public static PagedQueryResponseBuilder builder(final PagedQueryResponse template) {
        return PagedQueryResponseBuilder.of(template);
    }

    default <T> T withPagedQueryResponse(Function<PagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
