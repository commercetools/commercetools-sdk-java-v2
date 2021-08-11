
package com.commercetools.importapi.models.products;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchKeywordsBuilder implements Builder<SearchKeywords> {

    private Map<String, java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> values = new HashMap<>();

    public SearchKeywordsBuilder values(
            final Map<String, java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> values) {
        this.values = values;
        return this;
    }

    public SearchKeywordsBuilder addValue(final String key,
            final java.util.List<com.commercetools.importapi.models.products.SearchKeyword> value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> getValues() {
        return this.values;
    }

    public SearchKeywords build() {
        Objects.requireNonNull(values, SearchKeywords.class + ": values are missing");
        return new SearchKeywordsImpl(values);
    }

    /**
     * builds SearchKeywords without checking for non null required values
     */
    public SearchKeywords buildUnchecked() {
        return new SearchKeywordsImpl(values);
    }

    public static SearchKeywordsBuilder of() {
        return new SearchKeywordsBuilder();
    }

    public static SearchKeywordsBuilder of(final SearchKeywords template) {
        SearchKeywordsBuilder builder = new SearchKeywordsBuilder();
        builder.values = template.values();
        return builder;
    }

}
