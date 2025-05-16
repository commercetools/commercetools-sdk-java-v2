
package com.commercetools.api.models.attribute_group;

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
 *  <p>PagedQueryResult with <code>results</code> containing an array of AttributeGroup.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupPagedQueryResponse attributeGroupPagedQueryResponse = AttributeGroupPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupPagedQueryResponseImpl.class)
public interface AttributeGroupPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<AttributeGroup> {

    /**
     *  <p>Number of results requested in the query request.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Offset supplied by the client or the server default. It is the number of elements skipped, not a page number.</p>
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
     *  <p>AttributeGroups matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<AttributeGroup> getResults();

    /**
     *  <p>Number of results requested in the query request.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     *  <p>Offset supplied by the client or the server default. It is the number of elements skipped, not a page number.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>AttributeGroups matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final AttributeGroup... results);

    /**
     *  <p>AttributeGroups matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<AttributeGroup> results);

    /**
     * factory method
     * @return instance of AttributeGroupPagedQueryResponse
     */
    public static AttributeGroupPagedQueryResponse of() {
        return new AttributeGroupPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy AttributeGroupPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeGroupPagedQueryResponse of(final AttributeGroupPagedQueryResponse template) {
        AttributeGroupPagedQueryResponseImpl instance = new AttributeGroupPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public AttributeGroupPagedQueryResponse copyDeep();

    /**
     * factory method to create a deep copy of AttributeGroupPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeGroupPagedQueryResponse deepCopy(@Nullable final AttributeGroupPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        AttributeGroupPagedQueryResponseImpl instance = new AttributeGroupPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.attribute_group.AttributeGroup::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for AttributeGroupPagedQueryResponse
     * @return builder
     */
    public static AttributeGroupPagedQueryResponseBuilder builder() {
        return AttributeGroupPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for AttributeGroupPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupPagedQueryResponseBuilder builder(final AttributeGroupPagedQueryResponse template) {
        return AttributeGroupPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeGroupPagedQueryResponse(Function<AttributeGroupPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupPagedQueryResponse>";
            }
        };
    }
}
