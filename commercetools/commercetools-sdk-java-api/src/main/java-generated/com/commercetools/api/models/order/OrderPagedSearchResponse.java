
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderPagedSearchResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPagedSearchResponse orderPagedSearchResponse = OrderPagedSearchResponse.builder()
 *             .total(0.3)
 *             .plusHits(hitsBuilder -> hitsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderPagedSearchResponseImpl.class)
public interface OrderPagedSearchResponse {

    /**
     *  <p>Total number of results matching the query.</p>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Actual results.</p>
     * @return hits
     */
    @NotNull
    @Valid
    @JsonProperty("hits")
    public List<Hit> getHits();

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     *  <p>Actual results.</p>
     * @param hits values to be set
     */

    @JsonIgnore
    public void setHits(final Hit... hits);

    /**
     *  <p>Actual results.</p>
     * @param hits values to be set
     */

    public void setHits(final List<Hit> hits);

    /**
     * factory method
     * @return instance of OrderPagedSearchResponse
     */
    public static OrderPagedSearchResponse of() {
        return new OrderPagedSearchResponseImpl();
    }

    /**
     * factory method to copy an instance of OrderPagedSearchResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderPagedSearchResponse of(final OrderPagedSearchResponse template) {
        OrderPagedSearchResponseImpl instance = new OrderPagedSearchResponseImpl();
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setLimit(template.getLimit());
        instance.setHits(template.getHits());
        return instance;
    }

    /**
     * builder factory method for OrderPagedSearchResponse
     * @return builder
     */
    public static OrderPagedSearchResponseBuilder builder() {
        return OrderPagedSearchResponseBuilder.of();
    }

    /**
     * create builder for OrderPagedSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPagedSearchResponseBuilder builder(final OrderPagedSearchResponse template) {
        return OrderPagedSearchResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderPagedSearchResponse(Function<OrderPagedSearchResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderPagedSearchResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPagedSearchResponse>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPagedSearchResponse>";
            }
        };
    }
}
