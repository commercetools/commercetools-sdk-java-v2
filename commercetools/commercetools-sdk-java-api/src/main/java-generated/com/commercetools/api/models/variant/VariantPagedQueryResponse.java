
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p><span>PagedQueryResult</span> with results containing an array of <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantPagedQueryResponse variantPagedQueryResponse = VariantPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantPagedQueryResponseImpl.class)
public interface VariantPagedQueryResponse {

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
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
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. Unless absolutely necessary, use the query parameter <code>withTotal=false</code> to improve performance by deactivating the calculation of this field. When the results are filtered with a <a href="https://docs.commercetools.com/apis/ctp:api:type:QueryPredicate" rel="nofollow">Query Predicate</a>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variants</a> matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Variant> getResults();

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. Unless absolutely necessary, use the query parameter <code>withTotal=false</code> to improve performance by deactivating the calculation of this field. When the results are filtered with a <a href="https://docs.commercetools.com/apis/ctp:api:type:QueryPredicate" rel="nofollow">Query Predicate</a>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variants</a> matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final Variant... results);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variants</a> matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<Variant> results);

    /**
     * factory method
     * @return instance of VariantPagedQueryResponse
     */
    public static VariantPagedQueryResponse of() {
        return new VariantPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy VariantPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantPagedQueryResponse of(final VariantPagedQueryResponse template) {
        VariantPagedQueryResponseImpl instance = new VariantPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public VariantPagedQueryResponse copyDeep();

    /**
     * factory method to create a deep copy of VariantPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantPagedQueryResponse deepCopy(@Nullable final VariantPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        VariantPagedQueryResponseImpl instance = new VariantPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.variant.Variant::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantPagedQueryResponse
     * @return builder
     */
    public static VariantPagedQueryResponseBuilder builder() {
        return VariantPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for VariantPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantPagedQueryResponseBuilder builder(final VariantPagedQueryResponse template) {
        return VariantPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantPagedQueryResponse(Function<VariantPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantPagedQueryResponse> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<VariantPagedQueryResponse>";
            }
        };
    }
}
