
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSearchRequestImpl.class)
public interface OrderSearchRequest {

    /**
    *  <p>The Order search query.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("query")
    public OrderSearchQuery getQuery();

    /**
    *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
    */

    @JsonProperty("sort")
    public String getSort();

    /**
    *  <p>The maximum number of search results to be returned.</p>
    */

    @JsonProperty("limit")
    public Integer getLimit();

    /**
    *  <p>The number of search results to be skipped in the response for pagination.</p>
    */

    @JsonProperty("offset")
    public Integer getOffset();

    public void setQuery(final OrderSearchQuery query);

    public void setSort(final String sort);

    public void setLimit(final Integer limit);

    public void setOffset(final Integer offset);

    public static OrderSearchRequest of() {
        return new OrderSearchRequestImpl();
    }

    public static OrderSearchRequest of(final OrderSearchRequest template) {
        OrderSearchRequestImpl instance = new OrderSearchRequestImpl();
        instance.setQuery(template.getQuery());
        instance.setSort(template.getSort());
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        return instance;
    }

    public static OrderSearchRequestBuilder builder() {
        return OrderSearchRequestBuilder.of();
    }

    public static OrderSearchRequestBuilder builder(final OrderSearchRequest template) {
        return OrderSearchRequestBuilder.of(template);
    }

    default <T> T withOrderSearchRequest(Function<OrderSearchRequest, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchRequest>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchRequest>";
            }
        };
    }
}
