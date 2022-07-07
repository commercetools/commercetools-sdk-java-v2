
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *  <p>Number of results requested.</p>
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

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

    /**
     *  <p>Number of elements skipped.</p>
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>Reviews matching the query.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Review> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final Review... results);

    public void setResults(final List<Review> results);

    public static ReviewPagedQueryResponse of() {
        return new ReviewPagedQueryResponseImpl();
    }

    public static ReviewPagedQueryResponse of(final ReviewPagedQueryResponse template) {
        ReviewPagedQueryResponseImpl instance = new ReviewPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ReviewPagedQueryResponseBuilder builder() {
        return ReviewPagedQueryResponseBuilder.of();
    }

    public static ReviewPagedQueryResponseBuilder builder(final ReviewPagedQueryResponse template) {
        return ReviewPagedQueryResponseBuilder.of(template);
    }

    default <T> T withReviewPagedQueryResponse(Function<ReviewPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewPagedQueryResponse>";
            }
        };
    }
}
