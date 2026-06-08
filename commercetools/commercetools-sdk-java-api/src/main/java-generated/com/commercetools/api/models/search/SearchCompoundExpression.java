
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchCompoundExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchCompoundExpression searchCompoundExpression = SearchCompoundExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchCompoundExpressionImpl.class)
public interface SearchCompoundExpression extends SearchQuery {

    /**
     * factory method
     * @return instance of SearchCompoundExpression
     */
    public static SearchCompoundExpression of() {
        return new SearchCompoundExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchCompoundExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchCompoundExpression of(final SearchCompoundExpression template) {
        SearchCompoundExpressionImpl instance = new SearchCompoundExpressionImpl();
        return instance;
    }

    public SearchCompoundExpression copyDeep();

    /**
     * factory method to create a deep copy of SearchCompoundExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchCompoundExpression deepCopy(@Nullable final SearchCompoundExpression template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof SearchCompoundExpressionImpl)) {
            return template.copyDeep();
        }
        SearchCompoundExpressionImpl instance = new SearchCompoundExpressionImpl();
        return instance;
    }

    /**
     * builder factory method for SearchCompoundExpression
     * @return builder
     */
    public static SearchCompoundExpressionBuilder builder() {
        return SearchCompoundExpressionBuilder.of();
    }

    /**
     * create builder for SearchCompoundExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchCompoundExpressionBuilder builder(final SearchCompoundExpression template) {
        return SearchCompoundExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchCompoundExpression(Function<SearchCompoundExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchCompoundExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchCompoundExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchCompoundExpression>";
            }
        };
    }
}
