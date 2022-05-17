
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
*  <p><a href="/../api/general-concepts#pagedqueryresult">PagedQueryResult</a> with <code>results</code> containing an array of <a href="ctp:api:type:DiscountCode">DiscountCode</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodePagedQueryResponseImpl.class)
public interface DiscountCodePagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<DiscountCode> {

    /**
    *  <p>Number of <a href="/../api/general-concepts#limit">results requested</a>.</p>
    */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
    *  <p>Number of <a href="/../api/general-concepts#offset">elements skipped</a>.</p>
    */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
    *  <p>Actual number of results returned.</p>
    */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
    *  <p>Total number of results matching the query.
    *  This number is an estimation that is not <a href="/../api/general-concepts#strong-consistency">strongly consistent</a>.
    *  This field is returned by default.
    *  For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>.
    *  When the results are filtered with a <a href="/../api/predicates/query">Query Predicate</a>, <code>total</code> is subject to a <a href="/../api/limits#queries">limit</a>.</p>
    */

    @JsonProperty("total")
    public Long getTotal();

    /**
    *  <p><a href="ctp:api:type:DiscountCode">DiscountCodes</a> matching the query.</p>
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
