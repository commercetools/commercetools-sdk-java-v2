
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/general-concepts#pagedqueryresult">PagedQueryResult</a> containing an array of <a href="ctp:api:type:ProductSelection">ProductSelection</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSelectionPagedQueryResponseImpl.class)
public interface ProductSelectionPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ProductSelection> {

    /**
    *  <p>Number of results requested in the query request.</p>
    */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
    *  <p>Offset supplied by the client or the server default.
    *  It is the number of elements skipped, not a page number.</p>
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
    *  This number is an estimation that is not <a href="/general-concepts#strong-consistency">strongly consistent</a>.
    *  Unlike other endpoints, the Product Selection endpoint does not return this field by default.
    *  To get <code>total</code>, pass the query parameter <code>withTotal</code> set to <code>true</code>.
    *  When the results are filtered with a <a href="/predicates/query">Query Predicate</a>, <code>total</code> is subject to a <a href="/limits#queries">limit</a>.</p>
    */

    @JsonProperty("total")
    public Long getTotal();

    /**
    *  <p>The Product Selections matching the query.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ProductSelection> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final ProductSelection... results);

    public void setResults(final List<ProductSelection> results);

    public static ProductSelectionPagedQueryResponse of() {
        return new ProductSelectionPagedQueryResponseImpl();
    }

    public static ProductSelectionPagedQueryResponse of(final ProductSelectionPagedQueryResponse template) {
        ProductSelectionPagedQueryResponseImpl instance = new ProductSelectionPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ProductSelectionPagedQueryResponseBuilder builder() {
        return ProductSelectionPagedQueryResponseBuilder.of();
    }

    public static ProductSelectionPagedQueryResponseBuilder builder(final ProductSelectionPagedQueryResponse template) {
        return ProductSelectionPagedQueryResponseBuilder.of(template);
    }

    default <T> T withProductSelectionPagedQueryResponse(Function<ProductSelectionPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionPagedQueryResponse>";
            }
        };
    }
}
