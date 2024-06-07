
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
 * SearchDateRangeExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchDateRangeExpression searchDateRangeExpression = SearchDateRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchDateRangeExpressionImpl.class)
public interface SearchDateRangeExpression extends SearchQueryExpression {

    /**
     *
     * @return range
     */
    @NotNull
    @Valid
    @JsonProperty("range")
    public SearchDateRangeValue getRange();

    /**
     * set range
     * @param range value to be set
     */

    public void setRange(final SearchDateRangeValue range);

    /**
     * factory method
     * @return instance of SearchDateRangeExpression
     */
    public static SearchDateRangeExpression of() {
        return new SearchDateRangeExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchDateRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchDateRangeExpression of(final SearchDateRangeExpression template) {
        SearchDateRangeExpressionImpl instance = new SearchDateRangeExpressionImpl();
        instance.setRange(template.getRange());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchDateRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchDateRangeExpression deepCopy(@Nullable final SearchDateRangeExpression template) {
        if (template == null) {
            return null;
        }
        SearchDateRangeExpressionImpl instance = new SearchDateRangeExpressionImpl();
        instance.setRange(com.commercetools.api.models.search.SearchDateRangeValue.deepCopy(template.getRange()));
        return instance;
    }

    /**
     * builder factory method for SearchDateRangeExpression
     * @return builder
     */
    public static SearchDateRangeExpressionBuilder builder() {
        return SearchDateRangeExpressionBuilder.of();
    }

    /**
     * create builder for SearchDateRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchDateRangeExpressionBuilder builder(final SearchDateRangeExpression template) {
        return SearchDateRangeExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchDateRangeExpression(Function<SearchDateRangeExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchDateRangeExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchDateRangeExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchDateRangeExpression>";
            }
        };
    }
}
