
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>PagedQueryResult with <code>results</code> containing an array of Product.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPagedQueryResponse productPagedQueryResponse = ProductPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPagedQueryResponseImpl.class)
public interface ProductPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Product> {

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
     *  <p>Products matching the query.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Product> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final Product... results);

    public void setResults(final List<Product> results);

    public static ProductPagedQueryResponse of() {
        return new ProductPagedQueryResponseImpl();
    }

    public static ProductPagedQueryResponse of(final ProductPagedQueryResponse template) {
        ProductPagedQueryResponseImpl instance = new ProductPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ProductPagedQueryResponseBuilder builder() {
        return ProductPagedQueryResponseBuilder.of();
    }

    public static ProductPagedQueryResponseBuilder builder(final ProductPagedQueryResponse template) {
        return ProductPagedQueryResponseBuilder.of(template);
    }

    default <T> T withProductPagedQueryResponse(Function<ProductPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPagedQueryResponse>";
            }
        };
    }
}
