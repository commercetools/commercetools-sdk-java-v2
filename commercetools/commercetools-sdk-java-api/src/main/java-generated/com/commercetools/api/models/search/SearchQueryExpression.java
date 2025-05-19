
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchQueryExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchQueryExpression searchQueryExpression = SearchQueryExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchQueryExpressionImpl.class)
public interface SearchQueryExpression extends SearchQuery {

    /**
     * factory method
     * @return instance of SearchQueryExpression
     */
    public static SearchQueryExpression of() {
        return new SearchQueryExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchQueryExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchQueryExpression of(final SearchQueryExpression template) {
        SearchQueryExpressionImpl instance = new SearchQueryExpressionImpl();
        return instance;
    }

    public SearchQueryExpression copyDeep();

    /**
     * factory method to create a deep copy of SearchQueryExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchQueryExpression deepCopy(@Nullable final SearchQueryExpression template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof SearchQueryExpressionImpl)) {
            return template.copyDeep();
        }
        SearchQueryExpressionImpl instance = new SearchQueryExpressionImpl();
        return instance;
    }

    /**
     * builder factory method for SearchQueryExpression
     * @return builder
     */
    public static SearchQueryExpressionBuilder builder() {
        return SearchQueryExpressionBuilder.of();
    }

    /**
     * create builder for SearchQueryExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchQueryExpressionBuilder builder(final SearchQueryExpression template) {
        return SearchQueryExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchQueryExpression(Function<SearchQueryExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchQueryExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchQueryExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchQueryExpression>";
            }
        };
    }
}
