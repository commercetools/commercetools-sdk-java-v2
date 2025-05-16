
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
 * SearchFullTextPrefixExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchFullTextPrefixExpression searchFullTextPrefixExpression = SearchFullTextPrefixExpression.builder()
 *             .fullTextPrefix(fullTextPrefixBuilder -> fullTextPrefixBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchFullTextPrefixExpressionImpl.class)
public interface SearchFullTextPrefixExpression extends SearchQueryExpression {

    /**
     *
     * @return fullTextPrefix
     */
    @NotNull
    @Valid
    @JsonProperty("fullTextPrefix")
    public SearchFullTextPrefixValue getFullTextPrefix();

    /**
     * set fullTextPrefix
     * @param fullTextPrefix value to be set
     */

    public void setFullTextPrefix(final SearchFullTextPrefixValue fullTextPrefix);

    /**
     * factory method
     * @return instance of SearchFullTextPrefixExpression
     */
    public static SearchFullTextPrefixExpression of() {
        return new SearchFullTextPrefixExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchFullTextPrefixExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchFullTextPrefixExpression of(final SearchFullTextPrefixExpression template) {
        SearchFullTextPrefixExpressionImpl instance = new SearchFullTextPrefixExpressionImpl();
        instance.setFullTextPrefix(template.getFullTextPrefix());
        return instance;
    }

    public SearchFullTextPrefixExpression copyDeep();

    /**
     * factory method to create a deep copy of SearchFullTextPrefixExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchFullTextPrefixExpression deepCopy(@Nullable final SearchFullTextPrefixExpression template) {
        if (template == null) {
            return null;
        }
        SearchFullTextPrefixExpressionImpl instance = new SearchFullTextPrefixExpressionImpl();
        instance.setFullTextPrefix(
            com.commercetools.api.models.search.SearchFullTextPrefixValue.deepCopy(template.getFullTextPrefix()));
        return instance;
    }

    /**
     * builder factory method for SearchFullTextPrefixExpression
     * @return builder
     */
    public static SearchFullTextPrefixExpressionBuilder builder() {
        return SearchFullTextPrefixExpressionBuilder.of();
    }

    /**
     * create builder for SearchFullTextPrefixExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFullTextPrefixExpressionBuilder builder(final SearchFullTextPrefixExpression template) {
        return SearchFullTextPrefixExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchFullTextPrefixExpression(Function<SearchFullTextPrefixExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchFullTextPrefixExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchFullTextPrefixExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchFullTextPrefixExpression>";
            }
        };
    }
}
