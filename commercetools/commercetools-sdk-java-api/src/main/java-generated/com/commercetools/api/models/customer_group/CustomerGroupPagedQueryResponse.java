
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 <p>PagedQueryResult with <code>results</code> containing an array of CustomerGroup.</p>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomerGroupPagedQueryResponse customerGroupPagedQueryResponse = CustomerGroupPagedQueryResponse.builder()
           .limit(0.3)
           .offset(0.3)
           .count(0.3)
           .plusResults(resultsBuilder -> resultsBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupPagedQueryResponseImpl.class)
public interface CustomerGroupPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<CustomerGroup> {

    /**
     *  <p>Number of results requested.</p>
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
     *  <p>CustomerGroups matching the query.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<CustomerGroup> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final CustomerGroup... results);

    public void setResults(final List<CustomerGroup> results);

    public static CustomerGroupPagedQueryResponse of() {
        return new CustomerGroupPagedQueryResponseImpl();
    }

    public static CustomerGroupPagedQueryResponse of(final CustomerGroupPagedQueryResponse template) {
        CustomerGroupPagedQueryResponseImpl instance = new CustomerGroupPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static CustomerGroupPagedQueryResponseBuilder builder() {
        return CustomerGroupPagedQueryResponseBuilder.of();
    }

    public static CustomerGroupPagedQueryResponseBuilder builder(final CustomerGroupPagedQueryResponse template) {
        return CustomerGroupPagedQueryResponseBuilder.of(template);
    }

    default <T> T withCustomerGroupPagedQueryResponse(Function<CustomerGroupPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupPagedQueryResponse>";
            }
        };
    }
}
