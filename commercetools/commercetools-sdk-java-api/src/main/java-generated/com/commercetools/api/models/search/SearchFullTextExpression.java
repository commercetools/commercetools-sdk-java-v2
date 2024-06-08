
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
 * SearchFullTextExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchFullTextExpression searchFullTextExpression = SearchFullTextExpression.builder()
 *             .fullText(fullTextBuilder -> fullTextBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchFullTextExpressionImpl.class)
public interface SearchFullTextExpression extends SearchQueryExpression {

    /**
     *
     * @return fullText
     */
    @NotNull
    @Valid
    @JsonProperty("fullText")
    public SearchFullTextValue getFullText();

    /**
     * set fullText
     * @param fullText value to be set
     */

    public void setFullText(final SearchFullTextValue fullText);

    /**
     * factory method
     * @return instance of SearchFullTextExpression
     */
    public static SearchFullTextExpression of() {
        return new SearchFullTextExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchFullTextExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchFullTextExpression of(final SearchFullTextExpression template) {
        SearchFullTextExpressionImpl instance = new SearchFullTextExpressionImpl();
        instance.setFullText(template.getFullText());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchFullTextExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchFullTextExpression deepCopy(@Nullable final SearchFullTextExpression template) {
        if (template == null) {
            return null;
        }
        SearchFullTextExpressionImpl instance = new SearchFullTextExpressionImpl();
        instance.setFullText(com.commercetools.api.models.search.SearchFullTextValue.deepCopy(template.getFullText()));
        return instance;
    }

    /**
     * builder factory method for SearchFullTextExpression
     * @return builder
     */
    public static SearchFullTextExpressionBuilder builder() {
        return SearchFullTextExpressionBuilder.of();
    }

    /**
     * create builder for SearchFullTextExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFullTextExpressionBuilder builder(final SearchFullTextExpression template) {
        return SearchFullTextExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchFullTextExpression(Function<SearchFullTextExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchFullTextExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchFullTextExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchFullTextExpression>";
            }
        };
    }
}
