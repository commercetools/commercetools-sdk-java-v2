
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
 <p>PagedQueryResult containing an array of ProductSelectionAssignment.</p>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ProductsInStorePagedQueryResponse productsInStorePagedQueryResponse = ProductsInStorePagedQueryResponse.builder()
           .limit(0.3)
           .offset(0.3)
           .count(0.3)
           .plusResults(resultsBuilder -> resultsBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductsInStorePagedQueryResponseImpl.class)
public interface ProductsInStorePagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ProductSelectionAssignment> {

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
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. Unlike other endpoints, the Product Selection endpoint does not return this field by default. To get <code>total</code>, pass the query parameter <code>withTotal</code> set to <code>true</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>ProductSelectionAssignments matching the query.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ProductSelectionAssignment> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final ProductSelectionAssignment... results);

    public void setResults(final List<ProductSelectionAssignment> results);

    public static ProductsInStorePagedQueryResponse of() {
        return new ProductsInStorePagedQueryResponseImpl();
    }

    public static ProductsInStorePagedQueryResponse of(final ProductsInStorePagedQueryResponse template) {
        ProductsInStorePagedQueryResponseImpl instance = new ProductsInStorePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ProductsInStorePagedQueryResponseBuilder builder() {
        return ProductsInStorePagedQueryResponseBuilder.of();
    }

    public static ProductsInStorePagedQueryResponseBuilder builder(final ProductsInStorePagedQueryResponse template) {
        return ProductsInStorePagedQueryResponseBuilder.of(template);
    }

    default <T> T withProductsInStorePagedQueryResponse(Function<ProductsInStorePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductsInStorePagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductsInStorePagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductsInStorePagedQueryResponse>";
            }
        };
    }
}
