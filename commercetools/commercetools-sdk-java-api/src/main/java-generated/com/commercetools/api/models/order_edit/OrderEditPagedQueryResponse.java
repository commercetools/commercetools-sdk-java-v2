
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditPagedQueryResponseImpl.class)
public interface OrderEditPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<OrderEdit> {

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
    public List<OrderEdit> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final OrderEdit... results);

    public void setResults(final List<OrderEdit> results);

    public static OrderEditPagedQueryResponse of() {
        return new OrderEditPagedQueryResponseImpl();
    }

    public static OrderEditPagedQueryResponse of(final OrderEditPagedQueryResponse template) {
        OrderEditPagedQueryResponseImpl instance = new OrderEditPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static OrderEditPagedQueryResponseBuilder builder() {
        return OrderEditPagedQueryResponseBuilder.of();
    }

    public static OrderEditPagedQueryResponseBuilder builder(final OrderEditPagedQueryResponse template) {
        return OrderEditPagedQueryResponseBuilder.of(template);
    }

    default <T> T withOrderEditPagedQueryResponse(Function<OrderEditPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
