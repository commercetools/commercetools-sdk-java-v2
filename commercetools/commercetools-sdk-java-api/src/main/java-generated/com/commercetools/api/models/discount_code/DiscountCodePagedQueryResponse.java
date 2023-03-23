
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>PagedQueryResult with <code>results</code> containing an array of DiscountCode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodePagedQueryResponse discountCodePagedQueryResponse = DiscountCodePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodePagedQueryResponseImpl.class)
public interface DiscountCodePagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<DiscountCode> {

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>DiscountCodes matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<DiscountCode> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final DiscountCode... results);

    public void setResults(final List<DiscountCode> results);

    public static DiscountCodePagedQueryResponse of() {
        return new DiscountCodePagedQueryResponseImpl();
    }

    public static DiscountCodePagedQueryResponse of(final DiscountCodePagedQueryResponse template) {
        DiscountCodePagedQueryResponseImpl instance = new DiscountCodePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static DiscountCodePagedQueryResponseBuilder builder() {
        return DiscountCodePagedQueryResponseBuilder.of();
    }

    public static DiscountCodePagedQueryResponseBuilder builder(final DiscountCodePagedQueryResponse template) {
        return DiscountCodePagedQueryResponseBuilder.of(template);
    }

    default <T> T withDiscountCodePagedQueryResponse(Function<DiscountCodePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodePagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodePagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodePagedQueryResponse>";
            }
        };
    }
}
