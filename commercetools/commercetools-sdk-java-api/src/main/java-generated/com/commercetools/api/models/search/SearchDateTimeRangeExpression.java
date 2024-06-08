
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
 * SearchDateTimeRangeExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchDateTimeRangeExpression searchDateTimeRangeExpression = SearchDateTimeRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchDateTimeRangeExpressionImpl.class)
public interface SearchDateTimeRangeExpression extends SearchQueryExpression {

    /**
     *
     * @return range
     */
    @NotNull
    @Valid
    @JsonProperty("range")
    public SearchDateTimeRangeValue getRange();

    /**
     * set range
     * @param range value to be set
     */

    public void setRange(final SearchDateTimeRangeValue range);

    /**
     * factory method
     * @return instance of SearchDateTimeRangeExpression
     */
    public static SearchDateTimeRangeExpression of() {
        return new SearchDateTimeRangeExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchDateTimeRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchDateTimeRangeExpression of(final SearchDateTimeRangeExpression template) {
        SearchDateTimeRangeExpressionImpl instance = new SearchDateTimeRangeExpressionImpl();
        instance.setRange(template.getRange());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchDateTimeRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchDateTimeRangeExpression deepCopy(@Nullable final SearchDateTimeRangeExpression template) {
        if (template == null) {
            return null;
        }
        SearchDateTimeRangeExpressionImpl instance = new SearchDateTimeRangeExpressionImpl();
        instance.setRange(com.commercetools.api.models.search.SearchDateTimeRangeValue.deepCopy(template.getRange()));
        return instance;
    }

    /**
     * builder factory method for SearchDateTimeRangeExpression
     * @return builder
     */
    public static SearchDateTimeRangeExpressionBuilder builder() {
        return SearchDateTimeRangeExpressionBuilder.of();
    }

    /**
     * create builder for SearchDateTimeRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchDateTimeRangeExpressionBuilder builder(final SearchDateTimeRangeExpression template) {
        return SearchDateTimeRangeExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchDateTimeRangeExpression(Function<SearchDateTimeRangeExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchDateTimeRangeExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchDateTimeRangeExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchDateTimeRangeExpression>";
            }
        };
    }
}
