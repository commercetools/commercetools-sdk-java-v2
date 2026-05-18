
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
 * SearchFuzzyExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchFuzzyExpression searchFuzzyExpression = SearchFuzzyExpression.builder()
 *             .fuzzy(fuzzyBuilder -> fuzzyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchFuzzyExpressionImpl.class)
public interface SearchFuzzyExpression extends SearchQueryExpression {

    /**
     *
     * @return fuzzy
     */
    @NotNull
    @Valid
    @JsonProperty("fuzzy")
    public SearchFuzzyValue getFuzzy();

    /**
     * set fuzzy
     * @param fuzzy value to be set
     */

    public void setFuzzy(final SearchFuzzyValue fuzzy);

    /**
     * factory method
     * @return instance of SearchFuzzyExpression
     */
    public static SearchFuzzyExpression of() {
        return new SearchFuzzyExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchFuzzyExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchFuzzyExpression of(final SearchFuzzyExpression template) {
        SearchFuzzyExpressionImpl instance = new SearchFuzzyExpressionImpl();
        instance.setFuzzy(template.getFuzzy());
        return instance;
    }

    public SearchFuzzyExpression copyDeep();

    /**
     * factory method to create a deep copy of SearchFuzzyExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchFuzzyExpression deepCopy(@Nullable final SearchFuzzyExpression template) {
        if (template == null) {
            return null;
        }
        SearchFuzzyExpressionImpl instance = new SearchFuzzyExpressionImpl();
        instance.setFuzzy(com.commercetools.api.models.search.SearchFuzzyValue.deepCopy(template.getFuzzy()));
        return instance;
    }

    /**
     * builder factory method for SearchFuzzyExpression
     * @return builder
     */
    public static SearchFuzzyExpressionBuilder builder() {
        return SearchFuzzyExpressionBuilder.of();
    }

    /**
     * create builder for SearchFuzzyExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFuzzyExpressionBuilder builder(final SearchFuzzyExpression template) {
        return SearchFuzzyExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchFuzzyExpression(Function<SearchFuzzyExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchFuzzyExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchFuzzyExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchFuzzyExpression>";
            }
        };
    }
}
