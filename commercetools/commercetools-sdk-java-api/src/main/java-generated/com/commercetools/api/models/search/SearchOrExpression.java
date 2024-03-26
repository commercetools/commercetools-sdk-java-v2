
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchOrExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchOrExpression searchOrExpression = SearchOrExpression.builder()
 *             .plusOr(orBuilder -> orBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchOrExpressionImpl.class)
public interface SearchOrExpression extends SearchCompoundExpression {

    /**
     *
     * @return or
     */
    @NotNull
    @Valid
    @JsonProperty("or")
    public List<SearchQuery> getOr();

    /**
     * set or
     * @param or values to be set
     */

    @JsonIgnore
    public void setOr(final SearchQuery... or);

    /**
     * set or
     * @param or values to be set
     */

    public void setOr(final List<SearchQuery> or);

    /**
     * factory method
     * @return instance of SearchOrExpression
     */
    public static SearchOrExpression of() {
        return new SearchOrExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchOrExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchOrExpression of(final SearchOrExpression template) {
        SearchOrExpressionImpl instance = new SearchOrExpressionImpl();
        instance.setOr(template.getOr());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchOrExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchOrExpression deepCopy(@Nullable final SearchOrExpression template) {
        if (template == null) {
            return null;
        }
        SearchOrExpressionImpl instance = new SearchOrExpressionImpl();
        instance.setOr(Optional.ofNullable(template.getOr())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.search.SearchQuery::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SearchOrExpression
     * @return builder
     */
    public static SearchOrExpressionBuilder builder() {
        return SearchOrExpressionBuilder.of();
    }

    /**
     * create builder for SearchOrExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchOrExpressionBuilder builder(final SearchOrExpression template) {
        return SearchOrExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchOrExpression(Function<SearchOrExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchOrExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchOrExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchOrExpression>";
            }
        };
    }
}
