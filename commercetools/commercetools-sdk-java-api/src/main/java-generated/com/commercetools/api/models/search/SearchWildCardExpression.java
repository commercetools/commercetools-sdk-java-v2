
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
 * SearchWildCardExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchWildCardExpression searchWildCardExpression = SearchWildCardExpression.builder()
 *             .wildcard(wildcardBuilder -> wildcardBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchWildCardExpressionImpl.class)
public interface SearchWildCardExpression extends SearchQueryExpression {

    /**
     *
     * @return wildcard
     */
    @NotNull
    @Valid
    @JsonProperty("wildcard")
    public SearchAnyValue getWildcard();

    /**
     * set wildcard
     * @param wildcard value to be set
     */

    public void setWildcard(final SearchAnyValue wildcard);

    /**
     * factory method
     * @return instance of SearchWildCardExpression
     */
    public static SearchWildCardExpression of() {
        return new SearchWildCardExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchWildCardExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchWildCardExpression of(final SearchWildCardExpression template) {
        SearchWildCardExpressionImpl instance = new SearchWildCardExpressionImpl();
        instance.setWildcard(template.getWildcard());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchWildCardExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchWildCardExpression deepCopy(@Nullable final SearchWildCardExpression template) {
        if (template == null) {
            return null;
        }
        SearchWildCardExpressionImpl instance = new SearchWildCardExpressionImpl();
        instance.setWildcard(com.commercetools.api.models.search.SearchAnyValue.deepCopy(template.getWildcard()));
        return instance;
    }

    /**
     * builder factory method for SearchWildCardExpression
     * @return builder
     */
    public static SearchWildCardExpressionBuilder builder() {
        return SearchWildCardExpressionBuilder.of();
    }

    /**
     * create builder for SearchWildCardExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchWildCardExpressionBuilder builder(final SearchWildCardExpression template) {
        return SearchWildCardExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchWildCardExpression(Function<SearchWildCardExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchWildCardExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchWildCardExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchWildCardExpression>";
            }
        };
    }
}
