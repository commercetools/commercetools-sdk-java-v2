
package com.commercetools.api.models.product;

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
 * SearchKeyword
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchKeyword searchKeyword = SearchKeyword.builder()
 *             .text("{text}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchKeywordImpl.class)
public interface SearchKeyword {

    /**
     *  <p>Text to return in the result of a suggest query.</p>
     * @return text
     */
    @NotNull
    @JsonProperty("text")
    public String getText();

    /**
     *  <p>If no tokenizer is defined, the <code>text</code> is used as a single token.</p>
     * @return suggestTokenizer
     */
    @Valid
    @JsonProperty("suggestTokenizer")
    public SuggestTokenizer getSuggestTokenizer();

    /**
     *  <p>Text to return in the result of a suggest query.</p>
     * @param text value to be set
     */

    public void setText(final String text);

    /**
     *  <p>If no tokenizer is defined, the <code>text</code> is used as a single token.</p>
     * @param suggestTokenizer value to be set
     */

    public void setSuggestTokenizer(final SuggestTokenizer suggestTokenizer);

    /**
     * factory method
     * @return instance of SearchKeyword
     */
    public static SearchKeyword of() {
        return new SearchKeywordImpl();
    }

    /**
     * factory method to create a shallow copy SearchKeyword
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchKeyword of(final SearchKeyword template) {
        SearchKeywordImpl instance = new SearchKeywordImpl();
        instance.setText(template.getText());
        instance.setSuggestTokenizer(template.getSuggestTokenizer());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchKeyword
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchKeyword deepCopy(@Nullable final SearchKeyword template) {
        if (template == null) {
            return null;
        }
        SearchKeywordImpl instance = new SearchKeywordImpl();
        instance.setText(template.getText());
        instance.setSuggestTokenizer(Optional.ofNullable(template.getSuggestTokenizer())
                .map(com.commercetools.api.models.product.SuggestTokenizer::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SearchKeyword
     * @return builder
     */
    public static SearchKeywordBuilder builder() {
        return SearchKeywordBuilder.of();
    }

    /**
     * create builder for SearchKeyword instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchKeywordBuilder builder(final SearchKeyword template) {
        return SearchKeywordBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchKeyword(Function<SearchKeyword, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchKeyword> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchKeyword>() {
            @Override
            public String toString() {
                return "TypeReference<SearchKeyword>";
            }
        };
    }
}
