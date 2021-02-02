
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ZonePagedQueryResponseImpl.class)
public interface ZonePagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Zone> {

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
    public List<Zone> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final Zone... results);

    public void setResults(final List<Zone> results);

    public static ZonePagedQueryResponse of() {
        return new ZonePagedQueryResponseImpl();
    }

    public static ZonePagedQueryResponse of(final ZonePagedQueryResponse template) {
        ZonePagedQueryResponseImpl instance = new ZonePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ZonePagedQueryResponseBuilder builder() {
        return ZonePagedQueryResponseBuilder.of();
    }

    public static ZonePagedQueryResponseBuilder builder(final ZonePagedQueryResponse template) {
        return ZonePagedQueryResponseBuilder.of(template);
    }

    default <T> T withZonePagedQueryResponse(Function<ZonePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
