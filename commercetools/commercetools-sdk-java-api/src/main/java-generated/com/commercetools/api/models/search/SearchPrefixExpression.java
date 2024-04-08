
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
 * SearchPrefixExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchPrefixExpression searchPrefixExpression = SearchPrefixExpression.builder()
 *             .prefix(prefixBuilder -> prefixBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchPrefixExpressionImpl.class)
public interface SearchPrefixExpression extends SearchQueryExpression {

    /**
     *
     * @return prefix
     */
    @NotNull
    @Valid
    @JsonProperty("prefix")
    public SearchAnyValue getPrefix();

    /**
     * set prefix
     * @param prefix value to be set
     */

    public void setPrefix(final SearchAnyValue prefix);

    /**
     * factory method
     * @return instance of SearchPrefixExpression
     */
    public static SearchPrefixExpression of() {
        return new SearchPrefixExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchPrefixExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchPrefixExpression of(final SearchPrefixExpression template) {
        SearchPrefixExpressionImpl instance = new SearchPrefixExpressionImpl();
        instance.setPrefix(template.getPrefix());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchPrefixExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchPrefixExpression deepCopy(@Nullable final SearchPrefixExpression template) {
        if (template == null) {
            return null;
        }
        SearchPrefixExpressionImpl instance = new SearchPrefixExpressionImpl();
        instance.setPrefix(com.commercetools.api.models.search.SearchAnyValue.deepCopy(template.getPrefix()));
        return instance;
    }

    /**
     * builder factory method for SearchPrefixExpression
     * @return builder
     */
    public static SearchPrefixExpressionBuilder builder() {
        return SearchPrefixExpressionBuilder.of();
    }

    /**
     * create builder for SearchPrefixExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchPrefixExpressionBuilder builder(final SearchPrefixExpression template) {
        return SearchPrefixExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchPrefixExpression(Function<SearchPrefixExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchPrefixExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchPrefixExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchPrefixExpression>";
            }
        };
    }
}
