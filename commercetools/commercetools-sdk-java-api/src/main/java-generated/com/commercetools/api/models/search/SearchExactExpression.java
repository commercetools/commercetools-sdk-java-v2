
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
 * SearchExactExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchExactExpression searchExactExpression = SearchExactExpression.builder()
 *             .exact(exactBuilder -> exactBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchExactExpressionImpl.class)
public interface SearchExactExpression extends SearchQueryExpression {

    /**
     *
     * @return exact
     */
    @NotNull
    @Valid
    @JsonProperty("exact")
    public SearchAnyValue getExact();

    /**
     * set exact
     * @param exact value to be set
     */

    public void setExact(final SearchAnyValue exact);

    /**
     * factory method
     * @return instance of SearchExactExpression
     */
    public static SearchExactExpression of() {
        return new SearchExactExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchExactExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchExactExpression of(final SearchExactExpression template) {
        SearchExactExpressionImpl instance = new SearchExactExpressionImpl();
        instance.setExact(template.getExact());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchExactExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchExactExpression deepCopy(@Nullable final SearchExactExpression template) {
        if (template == null) {
            return null;
        }
        SearchExactExpressionImpl instance = new SearchExactExpressionImpl();
        instance.setExact(com.commercetools.api.models.search.SearchAnyValue.deepCopy(template.getExact()));
        return instance;
    }

    /**
     * builder factory method for SearchExactExpression
     * @return builder
     */
    public static SearchExactExpressionBuilder builder() {
        return SearchExactExpressionBuilder.of();
    }

    /**
     * create builder for SearchExactExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchExactExpressionBuilder builder(final SearchExactExpression template) {
        return SearchExactExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchExactExpression(Function<SearchExactExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchExactExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchExactExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchExactExpression>";
            }
        };
    }
}
