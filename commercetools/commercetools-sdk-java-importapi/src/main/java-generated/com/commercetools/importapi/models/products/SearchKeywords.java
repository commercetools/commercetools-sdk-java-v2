
package com.commercetools.importapi.models.products;

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
 *  <p>Search keywords are primarily used by the suggester but are also considered for the full-text search. SearchKeywords is a JSON object where the keys are of IETF language tag. The value to a language tag key is an array of SearchKeyword for the specific language.</p>
 *  <pre><code>{
 *    "en": [
 *      { "text": "Multi tool" },
 *      { "text": "Swiss Army Knife", "suggestTokenizer": { "type": "whitespace" } }
 *    ],
 *    "de": [
 *      {
 *        "text": "Schweizer Messer",
 *        "suggestTokenizer": {
 *          "type": "custom",
 *          "inputs": ["schweizer messer", "offiziersmesser", "sackmesser"]
 *        }
 *      }
 *    ]
 *  }
 *  </code></pre>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchKeywords searchKeywords = SearchKeywords.builder()
 *             .plus/^[a-zA-Z]{2,3}(?:-[a-zA-Z]{4})?(?:-(?:[a-zA-Z]{2}|\d{3}))?$/(/^[a-zA-Z]{2,3}(?:-[a-zA-Z]{4})?(?:-(?:[a-zA-Z]{2}|\d{3}))?$/Builder -> /^[a-zA-Z]{2,3}(?:-[a-zA-Z]{4})?(?:-(?:[a-zA-Z]{2}|\d{3}))?$/Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchKeywordsImpl.class)
public interface SearchKeywords {

    /**
     *
     * @return map of the pattern property values
     */
    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, List<SearchKeyword>> values();

    /**
     * set pattern property
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
