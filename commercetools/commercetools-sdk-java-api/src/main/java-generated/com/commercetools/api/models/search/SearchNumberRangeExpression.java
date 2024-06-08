
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
 * SearchNumberRangeExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchNumberRangeExpression searchNumberRangeExpression = SearchNumberRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchNumberRangeExpressionImpl.class)
public interface SearchNumberRangeExpression extends SearchQueryExpression {

    /**
     *
     * @return range
     */
    @NotNull
    @Valid
    @JsonProperty("range")
    public SearchNumberRangeValue getRange();

    /**
     * set range
     * @param range value to be set
     */

    public void setRange(final SearchNumberRangeValue range);

    /**
     * factory method
     * @return instance of SearchNumberRangeExpression
     */
    public static SearchNumberRangeExpression of() {
        return new SearchNumberRangeExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchNumberRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchNumberRangeExpression of(final SearchNumberRangeExpression template) {
        SearchNumberRangeExpressionImpl instance = new SearchNumberRangeExpressionImpl();
        instance.setRange(template.getRange());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchNumberRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchNumberRangeExpression deepCopy(@Nullable final SearchNumberRangeExpression template) {
        if (template == null) {
            return null;
        }
        SearchNumberRangeExpressionImpl instance = new SearchNumberRangeExpressionImpl();
        instance.setRange(com.commercetools.api.models.search.SearchNumberRangeValue.deepCopy(template.getRange()));
        return instance;
    }

    /**
     * builder factory method for SearchNumberRangeExpression
     * @return builder
     */
    public static SearchNumberRangeExpressionBuilder builder() {
        return SearchNumberRangeExpressionBuilder.of();
    }

    /**
     * create builder for SearchNumberRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchNumberRangeExpressionBuilder builder(final SearchNumberRangeExpression template) {
        return SearchNumberRangeExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchNumberRangeExpression(Function<SearchNumberRangeExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchNumberRangeExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchNumberRangeExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchNumberRangeExpression>";
            }
        };
    }
}
