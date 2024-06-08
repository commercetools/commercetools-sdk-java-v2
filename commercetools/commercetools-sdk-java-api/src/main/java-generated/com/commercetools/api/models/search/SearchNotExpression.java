
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
 * SearchNotExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchNotExpression searchNotExpression = SearchNotExpression.builder()
 *             .plusNot(notBuilder -> notBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchNotExpressionImpl.class)
public interface SearchNotExpression extends SearchCompoundExpression {

    /**
     *
     * @return not
     */
    @NotNull
    @Valid
    @JsonProperty("not")
    public List<SearchQuery> getNot();

    /**
     * set not
     * @param not values to be set
     */

    @JsonIgnore
    public void setNot(final SearchQuery... not);

    /**
     * set not
     * @param not values to be set
     */

    public void setNot(final List<SearchQuery> not);

    /**
     * factory method
     * @return instance of SearchNotExpression
     */
    public static SearchNotExpression of() {
        return new SearchNotExpressionImpl();
    }

    /**
     * factory method to create a shallow copy SearchNotExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchNotExpression of(final SearchNotExpression template) {
        SearchNotExpressionImpl instance = new SearchNotExpressionImpl();
        instance.setNot(template.getNot());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchNotExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchNotExpression deepCopy(@Nullable final SearchNotExpression template) {
        if (template == null) {
            return null;
        }
        SearchNotExpressionImpl instance = new SearchNotExpressionImpl();
        instance.setNot(Optional.ofNullable(template.getNot())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.search.SearchQuery::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SearchNotExpression
     * @return builder
     */
    public static SearchNotExpressionBuilder builder() {
        return SearchNotExpressionBuilder.of();
    }

    /**
     * create builder for SearchNotExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchNotExpressionBuilder builder(final SearchNotExpression template) {
        return SearchNotExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchNotExpression(Function<SearchNotExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchNotExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchNotExpression>() {
            @Override
            public String toString() {
                return "TypeReference<SearchNotExpression>";
            }
        };
    }
}
