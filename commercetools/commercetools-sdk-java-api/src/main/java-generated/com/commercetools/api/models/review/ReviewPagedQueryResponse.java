
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewPagedQueryResponseImpl.class)
public interface ReviewPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Review> {

    /**
    *  <p>Number of <a href="/../api/general-concepts#limit">results requested</a>.</p>
    */
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
