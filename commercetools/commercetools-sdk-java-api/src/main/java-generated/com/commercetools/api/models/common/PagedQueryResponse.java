
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

    /**
    *  <p>Number of results requested.</p>
    */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
    *  <p>Number of elements skipped.</p>
    */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
    *  <p>Actual number of results returned.</p>
    */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
    *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
    */

    @JsonProperty("total")
    public Long getTotal();

    @NotNull
    @Valid
    @JsonProperty("results")
    public List<BaseResource> getResults();

    @Valid
    @JsonProperty("meta")
    public Object getMeta();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

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
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
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

    public static com.fasterxml.jackson.core.type.TypeReference<PagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<PagedQueryResponse>";
            }
        };
    }
}
