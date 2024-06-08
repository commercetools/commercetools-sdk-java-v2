
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
 * SearchExistsExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchExistsExpression searchExistsExpression = SearchExistsExpression.builder()
 *             .exists(existsBuilder -> existsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchExistsExpressionImpl.class)
public interface SearchExistsExpression extends SearchQueryExpression {

    /**
     *
     * @return exists
     */
    @NotNull
    @Valid
    @JsonProperty("exists")
    public SearchExistsValue getExists();

    /**
     * set exists
     * @param exists value to be set
     */

    public void setExists(final SearchExistsValue exists);

    /**
     * factory method
     * @return instance of SearchExistsExpression
     */
    public static SearchExistsExpression of() {
        return new SearchExistsExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchExistsExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchExistsExpression of(final SearchExistsExpression template) {
        SearchExistsExpressionImpl instance = new SearchExistsExpressionImpl();
        instance.setExists(template.getExists());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchExistsExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchExistsExpression deepCopy(@Nullable final SearchExistsExpression template) {
        if (template == null) {
            return null;
        }
        SearchExistsExpressionImpl instance = new SearchExistsExpressionImpl();
        instance.setExists(com.commercetools.api.models.search.SearchExistsValue.deepCopy(template.getExists()));
        return instance;
    }

    /**
     * builder factory method for SearchExistsExpression
     * @return builder
     */
    public static SearchExistsExpressionBuilder builder() {
        return SearchExistsExpressionBuilder.of();
    }

    /**
     * create builder for SearchExistsExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchExistsExpressionBuilder builder(final SearchExistsExpression template) {
        return SearchExistsExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchExistsExpression(Function<SearchExistsExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchExistsExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchExistsExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchExistsExpression>";
            }
        };
    }
}
