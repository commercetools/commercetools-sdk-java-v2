
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchQuery
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchQuery searchQuery = SearchQuery.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchQueryImpl.class)
public interface SearchQuery {

    /**
     * factory method
     * @return instance of SearchQuery
     */
    public static SearchQuery of() {
        return new SearchQueryImpl();
    }

    /**
     * factory method to create a shallow copy SearchQuery
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchQuery of(final SearchQuery template) {
        SearchQueryImpl instance = new SearchQueryImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchQuery
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchQuery deepCopy(@Nullable final SearchQuery template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.search.SearchCompoundExpression) {
            return com.commercetools.api.models.search.SearchCompoundExpression
                    .deepCopy((com.commercetools.api.models.search.SearchCompoundExpression) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchQueryExpression) {
            return com.commercetools.api.models.search.SearchQueryExpression
                    .deepCopy((com.commercetools.api.models.search.SearchQueryExpression) template);
        }
        SearchQueryImpl instance = new SearchQueryImpl();
        return instance;
    }

    /**
     * builder factory method for SearchQuery
     * @return builder
     */
    public static SearchQueryBuilder builder() {
        return SearchQueryBuilder.of();
    }

    /**
     * create builder for SearchQuery instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchQueryBuilder builder(final SearchQuery template) {
        return SearchQueryBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchQuery(Function<SearchQuery, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchQuery> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchQuery>() {
            @Override
            public String toString() {
                return "TypeReference<SearchQuery>";
            }
        };
    }
}
