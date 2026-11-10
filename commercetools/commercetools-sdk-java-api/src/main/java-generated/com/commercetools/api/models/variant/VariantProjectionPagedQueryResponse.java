
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 * VariantProjectionPagedQueryResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantProjectionPagedQueryResponse variantProjectionPagedQueryResponse = VariantProjectionPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantProjectionPagedQueryResponseImpl.class)
public interface VariantProjectionPagedQueryResponse {

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:VariantProjection" rel="nofollow">VariantProjections</a> matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<VariantProjection> getResults();

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:VariantProjection" rel="nofollow">VariantProjections</a> matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final VariantProjection... results);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:VariantProjection" rel="nofollow">VariantProjections</a> matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<VariantProjection> results);

    /**
     * factory method
     * @return instance of VariantProjectionPagedQueryResponse
     */
    public static VariantProjectionPagedQueryResponse of() {
        return new VariantProjectionPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy VariantProjectionPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantProjectionPagedQueryResponse of(final VariantProjectionPagedQueryResponse template) {
        VariantProjectionPagedQueryResponseImpl instance = new VariantProjectionPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public VariantProjectionPagedQueryResponse copyDeep();

    /**
     * factory method to create a deep copy of VariantProjectionPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantProjectionPagedQueryResponse deepCopy(
            @Nullable final VariantProjectionPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        VariantProjectionPagedQueryResponseImpl instance = new VariantProjectionPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.variant.VariantProjection::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantProjectionPagedQueryResponse
     * @return builder
     */
    public static VariantProjectionPagedQueryResponseBuilder builder() {
        return VariantProjectionPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for VariantProjectionPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantProjectionPagedQueryResponseBuilder builder(
            final VariantProjectionPagedQueryResponse template) {
        return VariantProjectionPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantProjectionPagedQueryResponse(Function<VariantProjectionPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantProjectionPagedQueryResponse> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantProjectionPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<VariantProjectionPagedQueryResponse>";
            }
        };
    }
}
