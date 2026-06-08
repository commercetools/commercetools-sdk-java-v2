
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p><span>PagedQueryResult</span> with results containing an array of <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryPagedQueryResponse categoryPagedQueryResponse = CategoryPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryPagedQueryResponseImpl.class)
public interface CategoryPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Category> {

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
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Category> getResults();

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
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final Category... results);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<Category> results);

    /**
     * factory method
     * @return instance of CategoryPagedQueryResponse
     */
    public static CategoryPagedQueryResponse of() {
        return new CategoryPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy CategoryPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryPagedQueryResponse of(final CategoryPagedQueryResponse template) {
        CategoryPagedQueryResponseImpl instance = new CategoryPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public CategoryPagedQueryResponse copyDeep();

    /**
     * factory method to create a deep copy of CategoryPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryPagedQueryResponse deepCopy(@Nullable final CategoryPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        CategoryPagedQueryResponseImpl instance = new CategoryPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.category.Category::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CategoryPagedQueryResponse
     * @return builder
     */
    public static CategoryPagedQueryResponseBuilder builder() {
        return CategoryPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for CategoryPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryPagedQueryResponseBuilder builder(final CategoryPagedQueryResponse template) {
        return CategoryPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryPagedQueryResponse(Function<CategoryPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryPagedQueryResponse>";
            }
        };
    }
}
