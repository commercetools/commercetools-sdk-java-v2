
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchTimeRangeExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchTimeRangeExpression searchTimeRangeExpression = SearchTimeRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchTimeRangeExpressionImpl.class)
public interface SearchTimeRangeExpression extends SearchQueryExpression {

    /**
     *
     * @return range
     */
    @NotNull
    @Valid
    @JsonProperty("range")
    public SearchTimeRangeValue getRange();

    /**
     * set range
     * @param range value to be set
     */

    public void setRange(final SearchTimeRangeValue range);

    /**
     * factory method
     * @return instance of SearchTimeRangeExpression
     */
    public static SearchTimeRangeExpression of() {
        return new SearchTimeRangeExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchTimeRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchTimeRangeExpression of(final SearchTimeRangeExpression template) {
        SearchTimeRangeExpressionImpl instance = new SearchTimeRangeExpressionImpl();
        instance.setRange(template.getRange());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchTimeRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchTimeRangeExpression deepCopy(@Nullable final SearchTimeRangeExpression template) {
        if (template == null) {
            return null;
        }
        SearchTimeRangeExpressionImpl instance = new SearchTimeRangeExpressionImpl();
        instance.setRange(com.commercetools.api.models.search.SearchTimeRangeValue.deepCopy(template.getRange()));
        return instance;
    }

    /**
     * builder factory method for SearchTimeRangeExpression
     * @return builder
     */
    public static SearchTimeRangeExpressionBuilder builder() {
        return SearchTimeRangeExpressionBuilder.of();
    }

    /**
     * create builder for SearchTimeRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchTimeRangeExpressionBuilder builder(final SearchTimeRangeExpression template) {
        return SearchTimeRangeExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchTimeRangeExpression(Function<SearchTimeRangeExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchTimeRangeExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchTimeRangeExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchTimeRangeExpression>";
            }
        };
    }
}
