
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>PagedQueryResult with results containing an array of BusinessUnit.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitPagedQueryResponse businessUnitPagedQueryResponse = BusinessUnitPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitPagedQueryResponseImpl.class)
public interface BusinessUnitPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<BusinessUnit> {

    /**
     *  <p>Number of requested results.</p>
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Number of elements skipped.</p>
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
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>BusinessUnits matching the query.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<BusinessUnit> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final BusinessUnit... results);

    public void setResults(final List<BusinessUnit> results);

    public static BusinessUnitPagedQueryResponse of() {
        return new BusinessUnitPagedQueryResponseImpl();
    }

    public static BusinessUnitPagedQueryResponse of(final BusinessUnitPagedQueryResponse template) {
        BusinessUnitPagedQueryResponseImpl instance = new BusinessUnitPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static BusinessUnitPagedQueryResponseBuilder builder() {
        return BusinessUnitPagedQueryResponseBuilder.of();
    }

    public static BusinessUnitPagedQueryResponseBuilder builder(final BusinessUnitPagedQueryResponse template) {
        return BusinessUnitPagedQueryResponseBuilder.of(template);
    }

    default <T> T withBusinessUnitPagedQueryResponse(Function<BusinessUnitPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitPagedQueryResponse>";
            }
        };
    }
}
