
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SearchDeactivatedErrorBuilder implements Builder<SearchDeactivatedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public SearchDeactivatedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public SearchDeactivatedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public SearchDeactivatedErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public SearchDeactivatedError build() {
        Objects.requireNonNull(message, SearchDeactivatedError.class + ": message is missing");
        Objects.requireNonNull(values, SearchDeactivatedError.class + ": values are missing");
        return new SearchDeactivatedErrorImpl(message, values);
    }

    /**
     * builds SearchDeactivatedError without checking for non null required values
     */
    public SearchDeactivatedError buildUnchecked() {
        return new SearchDeactivatedErrorImpl(message, values);
    }

    public static SearchDeactivatedErrorBuilder of() {
        return new SearchDeactivatedErrorBuilder();
    }

    public static SearchDeactivatedErrorBuilder of(final SearchDeactivatedError template) {
        SearchDeactivatedErrorBuilder builder = new SearchDeactivatedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
