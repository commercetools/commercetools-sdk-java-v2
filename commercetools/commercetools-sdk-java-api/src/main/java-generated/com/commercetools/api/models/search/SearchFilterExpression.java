
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
 * SearchFilterExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchFilterExpression searchFilterExpression = SearchFilterExpression.builder()
 *             .plusFilter(filterBuilder -> filterBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchFilterExpressionImpl.class)
public interface SearchFilterExpression extends SearchCompoundExpression {

    /**
     *
     * @return filter
     */
    @NotNull
    @Valid
    @JsonProperty("filter")
    public List<SearchQueryExpression> getFilter();

    /**
     * set filter
     * @param filter values to be set
     */

    @JsonIgnore
    public void setFilter(final SearchQueryExpression... filter);

    /**
     * set filter
     * @param filter values to be set
     */

    public void setFilter(final List<SearchQueryExpression> filter);

    /**
     * factory method
     * @return instance of SearchFilterExpression
     */
    public static SearchFilterExpression of() {
        return new SearchFilterExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchFilterExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchFilterExpression of(final SearchFilterExpression template) {
        SearchFilterExpressionImpl instance = new SearchFilterExpressionImpl();
        instance.setFilter(template.getFilter());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchFilterExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchFilterExpression deepCopy(@Nullable final SearchFilterExpression template) {
        if (template == null) {
            return null;
        }
        SearchFilterExpressionImpl instance = new SearchFilterExpressionImpl();
        instance.setFilter(Optional.ofNullable(template.getFilter())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.search.SearchQueryExpression::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SearchFilterExpression
     * @return builder
     */
    public static SearchFilterExpressionBuilder builder() {
        return SearchFilterExpressionBuilder.of();
    }

    /**
     * create builder for SearchFilterExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFilterExpressionBuilder builder(final SearchFilterExpression template) {
        return SearchFilterExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchFilterExpression(Function<SearchFilterExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchFilterExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchFilterExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchFilterExpression>";
            }
        };
    }
}
