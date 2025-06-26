
package com.commercetools.api.models.product;

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
 *  <p>Search keywords are JSON objects primarily used by Search Term Suggestions, but are also considered for a full text search in the Product Projection Search API. The keys are of type Locale, and the values are an array of SearchKeyword.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchKeywords searchKeywords = SearchKeywords.builder()
 *             .plus/^[a-z]{2}(-[A-Z]{2})?$/(/^[a-z]{2}(-[A-Z]{2})?$/Builder -> /^[a-z]{2}(-[A-Z]{2})?$/Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchKeywordsImpl.class)
public interface SearchKeywords {

    /**
     *  <p>Key-value pair where the keys are of type Locale and the values are an array of SearchKeyword.</p>
     * @return map of the pattern property values
     */
    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, List<SearchKeyword>> values();

    /**
     *  <p>Key-value pair where the keys are of type Locale and the values are an array of SearchKeyword.</p>
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, List<SearchKeyword> value);

    /**
     * factory method
     * @return instance of SearchKeywords
     */
    public static SearchKeywords of() {
        return new SearchKeywordsImpl();
    }

    /**
     * factory method to create a shallow copy SearchKeywords
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchKeywords of(final SearchKeywords template) {
        SearchKeywordsImpl instance = new SearchKeywordsImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public SearchKeywords copyDeep();

    /**
     * factory method to create a deep copy of SearchKeywords
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchKeywords deepCopy(@Nullable final SearchKeywords template) {
        if (template == null) {
            return null;
        }
        SearchKeywordsImpl instance = new SearchKeywordsImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for SearchKeywords
     * @return builder
     */
    public static SearchKeywordsBuilder builder() {
        return SearchKeywordsBuilder.of();
    }

    /**
     * create builder for SearchKeywords instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchKeywordsBuilder builder(final SearchKeywords template) {
        return SearchKeywordsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchKeywords(Function<SearchKeywords, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchKeywords> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchKeywords>() {
            @Override
            public String toString() {
                return "TypeReference<SearchKeywords>";
            }
        };
    }
}
