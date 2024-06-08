
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
 * SearchLongRangeExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchLongRangeExpression searchLongRangeExpression = SearchLongRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchLongRangeExpressionImpl.class)
public interface SearchLongRangeExpression extends SearchQueryExpression {

    /**
     *
     * @return range
     */
    @NotNull
    @Valid
    @JsonProperty("range")
    public SearchLongRangeValue getRange();

    /**
     * set range
     * @param range value to be set
     */

    public void setRange(final SearchLongRangeValue range);

    /**
     * factory method
     * @return instance of SearchLongRangeExpression
     */
    public static SearchLongRangeExpression of() {
        return new SearchLongRangeExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchLongRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchLongRangeExpression of(final SearchLongRangeExpression template) {
        SearchLongRangeExpressionImpl instance = new SearchLongRangeExpressionImpl();
        instance.setRange(template.getRange());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchLongRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchLongRangeExpression deepCopy(@Nullable final SearchLongRangeExpression template) {
        if (template == null) {
            return null;
        }
        SearchLongRangeExpressionImpl instance = new SearchLongRangeExpressionImpl();
        instance.setRange(com.commercetools.api.models.search.SearchLongRangeValue.deepCopy(template.getRange()));
        return instance;
    }

    /**
     * builder factory method for SearchLongRangeExpression
     * @return builder
     */
    public static SearchLongRangeExpressionBuilder builder() {
        return SearchLongRangeExpressionBuilder.of();
    }

    /**
     * create builder for SearchLongRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchLongRangeExpressionBuilder builder(final SearchLongRangeExpression template) {
        return SearchLongRangeExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchLongRangeExpression(Function<SearchLongRangeExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchLongRangeExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchLongRangeExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchLongRangeExpression>";
            }
        };
    }
}
