
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * SearchAndExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchAndExpression searchAndExpression = SearchAndExpression.builder()
 *             .plusAnd(andBuilder -> andBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchAndExpressionImpl.class)
public interface SearchAndExpression extends SearchCompoundExpression {

    /**
     *
     * @return and
     */
    @NotNull
    @Valid
    @JsonProperty("and")
    public List<SearchQuery> getAnd();

    /**
     * set and
     * @param and values to be set
     */

    @JsonIgnore
    public void setAnd(final SearchQuery... and);

    /**
     * set and
     * @param and values to be set
     */

    public void setAnd(final List<SearchQuery> and);

    /**
     * factory method
     * @return instance of SearchAndExpression
     */
    public static SearchAndExpression of() {
        return new SearchAndExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchAndExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchAndExpression of(final SearchAndExpression template) {
        SearchAndExpressionImpl instance = new SearchAndExpressionImpl();
        instance.setAnd(template.getAnd());
        return instance;
    }

    public SearchAndExpression copyDeep();

    /**
     * factory method to create a deep copy of SearchAndExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchAndExpression deepCopy(@Nullable final SearchAndExpression template) {
        if (template == null) {
            return null;
        }
        SearchAndExpressionImpl instance = new SearchAndExpressionImpl();
        instance.setAnd(Optional.ofNullable(template.getAnd())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.search.SearchQuery::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SearchAndExpression
     * @return builder
     */
    public static SearchAndExpressionBuilder builder() {
        return SearchAndExpressionBuilder.of();
    }

    /**
     * create builder for SearchAndExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchAndExpressionBuilder builder(final SearchAndExpression template) {
        return SearchAndExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchAndExpression(Function<SearchAndExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchAndExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchAndExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchAndExpression>";
            }
        };
    }
}
