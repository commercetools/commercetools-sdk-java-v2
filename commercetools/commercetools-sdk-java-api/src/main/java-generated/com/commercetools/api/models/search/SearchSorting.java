
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Sorting parameters provided with a Search request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchSorting searchSorting = SearchSorting.builder()
 *             .field("{field}")
 *             .order(SearchSortOrder.ASC)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchSortingImpl.class)
public interface SearchSorting {

    /**
     *  <p>Use any searchable field of the resource as sort criterion, or <code>"score"</code> to sort by relevance score calculated by the API.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @return language
     */

    @JsonProperty("language")
    public String getLanguage();

    /**
     *  <p>Specify the order in which the search results should be sorted. Can be <code>asc</code> for ascending, or <code>desc</code> for descending order.</p>
     * @return order
     */
    @NotNull
    @JsonProperty("order")
    public SearchSortOrder getOrder();

    /**
     *  <p>Specify the sort mode to be applied for a set-type <code>field</code>.</p>
     * @return mode
     */

    @JsonProperty("mode")
    public SearchSortMode getMode();

    /**
     *  <p>Provide the data type of the given <code>field</code>.</p>
     * @return fieldType
     */

    @JsonProperty("fieldType")
    public SearchFieldType getFieldType();

    /**
     *  <p>Allows you to apply a sort filter.</p>
     * @return filter
     */
    @Valid
    @JsonProperty("filter")
    public SearchQueryExpression getFilter();

    /**
     *  <p>Use any searchable field of the resource as sort criterion, or <code>"score"</code> to sort by relevance score calculated by the API.</p>
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     */

    public void setLanguage(final String language);

    /**
     *  <p>Specify the order in which the search results should be sorted. Can be <code>asc</code> for ascending, or <code>desc</code> for descending order.</p>
     * @param order value to be set
     */

    public void setOrder(final SearchSortOrder order);

    /**
     *  <p>Specify the sort mode to be applied for a set-type <code>field</code>.</p>
     * @param mode value to be set
     */

    public void setMode(final SearchSortMode mode);

    /**
     *  <p>Provide the data type of the given <code>field</code>.</p>
     * @param fieldType value to be set
     */

    public void setFieldType(final SearchFieldType fieldType);

    /**
     *  <p>Allows you to apply a sort filter.</p>
     * @param filter value to be set
     */

    public void setFilter(final SearchQueryExpression filter);

    /**
     * factory method
     * @return instance of SearchSorting
     */
    public static SearchSorting of() {
        return new SearchSortingImpl();
    }

    /**
     * factory method to create a shallow copy SearchSorting
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchSorting of(final SearchSorting template) {
        SearchSortingImpl instance = new SearchSortingImpl();
        instance.setField(template.getField());
        instance.setLanguage(template.getLanguage());
        instance.setOrder(template.getOrder());
        instance.setMode(template.getMode());
        instance.setFieldType(template.getFieldType());
        instance.setFilter(template.getFilter());
        return instance;
    }

    public SearchSorting copyDeep();

    /**
     * factory method to create a deep copy of SearchSorting
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchSorting deepCopy(@Nullable final SearchSorting template) {
        if (template == null) {
            return null;
        }
        SearchSortingImpl instance = new SearchSortingImpl();
        instance.setField(template.getField());
        instance.setLanguage(template.getLanguage());
        instance.setOrder(template.getOrder());
        instance.setMode(template.getMode());
        instance.setFieldType(template.getFieldType());
        instance.setFilter(com.commercetools.api.models.search.SearchQueryExpression.deepCopy(template.getFilter()));
        return instance;
    }

    /**
     * builder factory method for SearchSorting
     * @return builder
     */
    public static SearchSortingBuilder builder() {
        return SearchSortingBuilder.of();
    }

    /**
     * create builder for SearchSorting instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchSortingBuilder builder(final SearchSorting template) {
        return SearchSortingBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchSorting(Function<SearchSorting, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchSorting> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchSorting>() {
            @Override
            public String toString() {
                return "TypeReference<SearchSorting>";
            }
        };
    }
}
