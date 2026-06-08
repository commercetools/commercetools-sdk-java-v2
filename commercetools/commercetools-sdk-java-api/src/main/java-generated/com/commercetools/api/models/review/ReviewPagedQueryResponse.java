
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ReviewPagedQueryResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewPagedQueryResponse reviewPagedQueryResponse = ReviewPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewPagedQueryResponseImpl.class)
public interface ReviewPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Review> {

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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Reviews</a> matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Review> getResults();

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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Reviews</a> matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final Review... results);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Reviews</a> matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<Review> results);

    /**
     * factory method
     * @return instance of ReviewPagedQueryResponse
     */
    public static ReviewPagedQueryResponse of() {
        return new ReviewPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy ReviewPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewPagedQueryResponse of(final ReviewPagedQueryResponse template) {
        ReviewPagedQueryResponseImpl instance = new ReviewPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public ReviewPagedQueryResponse copyDeep();

    /**
     * factory method to create a deep copy of ReviewPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewPagedQueryResponse deepCopy(@Nullable final ReviewPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        ReviewPagedQueryResponseImpl instance = new ReviewPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.review.Review::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ReviewPagedQueryResponse
     * @return builder
     */
    public static ReviewPagedQueryResponseBuilder builder() {
        return ReviewPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for ReviewPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewPagedQueryResponseBuilder builder(final ReviewPagedQueryResponse template) {
        return ReviewPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewPagedQueryResponse(Function<ReviewPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewPagedQueryResponse>";
            }
        };
    }
}
