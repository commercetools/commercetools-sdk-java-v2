
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SubscriptionPagedQueryResponseImpl.class)
public interface SubscriptionPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<Subscription> {

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
    public List<Subscription> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final Subscription... results);

    public void setResults(final List<Subscription> results);

    public static SubscriptionPagedQueryResponse of() {
        return new SubscriptionPagedQueryResponseImpl();
    }

    public static SubscriptionPagedQueryResponse of(final SubscriptionPagedQueryResponse template) {
        SubscriptionPagedQueryResponseImpl instance = new SubscriptionPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static SubscriptionPagedQueryResponseBuilder builder() {
        return SubscriptionPagedQueryResponseBuilder.of();
    }

    public static SubscriptionPagedQueryResponseBuilder builder(final SubscriptionPagedQueryResponse template) {
        return SubscriptionPagedQueryResponseBuilder.of(template);
    }

    default <T> T withSubscriptionPagedQueryResponse(Function<SubscriptionPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
