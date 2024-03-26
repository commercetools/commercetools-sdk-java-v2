
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
        if (template instanceof com.commercetools.api.models.search.SearchDateRangeExpression) {
            return com.commercetools.api.models.search.SearchDateRangeExpression
                    .deepCopy((com.commercetools.api.models.search.SearchDateRangeExpression) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchDateTimeRangeExpression) {
            return com.commercetools.api.models.search.SearchDateTimeRangeExpression
                    .deepCopy((com.commercetools.api.models.search.SearchDateTimeRangeExpression) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchExactExpression) {
            return com.commercetools.api.models.search.SearchExactExpression
                    .deepCopy((com.commercetools.api.models.search.SearchExactExpression) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchExistsExpression) {
            return com.commercetools.api.models.search.SearchExistsExpression
                    .deepCopy((com.commercetools.api.models.search.SearchExistsExpression) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchFullTextExpression) {
            return com.commercetools.api.models.search.SearchFullTextExpression
                    .deepCopy((com.commercetools.api.models.search.SearchFullTextExpression) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchFullTextPrefixExpression) {
            return com.commercetools.api.models.search.SearchFullTextPrefixExpression
                    .deepCopy((com.commercetools.api.models.search.SearchFullTextPrefixExpression) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchLongRangeExpression) {
            return com.commercetools.api.models.search.SearchLongRangeExpression
                    .deepCopy((com.commercetools.api.models.search.SearchLongRangeExpression) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchNumberRangeExpression) {
            return com.commercetools.api.models.search.SearchNumberRangeExpression
                    .deepCopy((com.commercetools.api.models.search.SearchNumberRangeExpression) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchPrefixExpression) {
            return com.commercetools.api.models.search.SearchPrefixExpression
                    .deepCopy((com.commercetools.api.models.search.SearchPrefixExpression) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchTimeRangeExpression) {
            return com.commercetools.api.models.search.SearchTimeRangeExpression
                    .deepCopy((com.commercetools.api.models.search.SearchTimeRangeExpression) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchWildCardExpression) {
            return com.commercetools.api.models.search.SearchWildCardExpression
                    .deepCopy((com.commercetools.api.models.search.SearchWildCardExpression) template);
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
