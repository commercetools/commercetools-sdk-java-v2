
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Search keywords are JSON objects primarily used by Product Suggestions, but are also considered for a full text search. The keys are of type Locale, and the values are an array of SearchKeyword.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchKeywords searchKeywords = SearchKeywords.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchKeywordsImpl.class)
public interface SearchKeywords {

    public static SearchKeywords of() {
        return new SearchKeywordsImpl();
    }

    public static SearchKeywords of(final SearchKeywords template) {
        SearchKeywordsImpl instance = new SearchKeywordsImpl();
        return instance;
    }

    public static SearchKeywordsBuilder builder() {
        return SearchKeywordsBuilder.of();
    }

    public static SearchKeywordsBuilder builder(final SearchKeywords template) {
        return SearchKeywordsBuilder.of(template);
    }

    default <T> T withSearchKeywords(Function<SearchKeywords, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SearchKeywords> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchKeywords>() {
            @Override
            public String toString() {
                return "TypeReference<SearchKeywords>";
            }
        };
    }
}
