
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SearchFacetPathNotFoundErrorBuilder implements Builder<SearchFacetPathNotFoundError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public SearchFacetPathNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public SearchFacetPathNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public SearchFacetPathNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public SearchFacetPathNotFoundError build() {
        Objects.requireNonNull(message, SearchFacetPathNotFoundError.class + ": message is missing");
        Objects.requireNonNull(values, SearchFacetPathNotFoundError.class + ": values are missing");
        return new SearchFacetPathNotFoundErrorImpl(message, values);
    }

    /**
     * builds SearchFacetPathNotFoundError without checking for non null required values
     */
    public SearchFacetPathNotFoundError buildUnchecked() {
        return new SearchFacetPathNotFoundErrorImpl(message, values);
    }

    public static SearchFacetPathNotFoundErrorBuilder of() {
        return new SearchFacetPathNotFoundErrorBuilder();
    }

    public static SearchFacetPathNotFoundErrorBuilder of(final SearchFacetPathNotFoundError template) {
        SearchFacetPathNotFoundErrorBuilder builder = new SearchFacetPathNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
