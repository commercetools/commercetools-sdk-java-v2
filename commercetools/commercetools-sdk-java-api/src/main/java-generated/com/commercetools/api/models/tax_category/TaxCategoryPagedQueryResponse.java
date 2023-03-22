
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>PagedQueryResult with <code>results</code> containing an array of TaxCategory.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryPagedQueryResponse taxCategoryPagedQueryResponse = TaxCategoryPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxCategoryPagedQueryResponseImpl.class)
public interface TaxCategoryPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<TaxCategory> {

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>TaxCategories matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<TaxCategory> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final TaxCategory... results);

    public void setResults(final List<TaxCategory> results);

    public static TaxCategoryPagedQueryResponse of() {
        return new TaxCategoryPagedQueryResponseImpl();
    }

    public static TaxCategoryPagedQueryResponse of(final TaxCategoryPagedQueryResponse template) {
        TaxCategoryPagedQueryResponseImpl instance = new TaxCategoryPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static TaxCategoryPagedQueryResponseBuilder builder() {
        return TaxCategoryPagedQueryResponseBuilder.of();
    }

    public static TaxCategoryPagedQueryResponseBuilder builder(final TaxCategoryPagedQueryResponse template) {
        return TaxCategoryPagedQueryResponseBuilder.of(template);
    }

    default <T> T withTaxCategoryPagedQueryResponse(Function<TaxCategoryPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryPagedQueryResponse>";
            }
        };
    }
}
