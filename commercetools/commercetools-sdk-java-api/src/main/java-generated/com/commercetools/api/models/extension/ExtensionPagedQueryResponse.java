
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/general-concepts#pagedqueryresult">PagedQueryResult</a> with <code>results</code> containing an array of <a href="ctp:api:type:Extension">Extension</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExtensionPagedQueryResponseImpl.class)
public interface ExtensionPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<Extension> {

    /**
    *  <p>Number of results requested in the query request.</p>
    */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
    *  <p>Offset supplied by the client or server default. It is the number of elements skipped, not a page number.</p>
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
    *  <p>Extensions matching the query.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Extension> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final Extension... results);

    public void setResults(final List<Extension> results);

    public static ExtensionPagedQueryResponse of() {
        return new ExtensionPagedQueryResponseImpl();
    }

    public static ExtensionPagedQueryResponse of(final ExtensionPagedQueryResponse template) {
        ExtensionPagedQueryResponseImpl instance = new ExtensionPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ExtensionPagedQueryResponseBuilder builder() {
        return ExtensionPagedQueryResponseBuilder.of();
    }

    public static ExtensionPagedQueryResponseBuilder builder(final ExtensionPagedQueryResponse template) {
        return ExtensionPagedQueryResponseBuilder.of(template);
    }

    default <T> T withExtensionPagedQueryResponse(Function<ExtensionPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionPagedQueryResponse>";
            }
        };
    }
}
