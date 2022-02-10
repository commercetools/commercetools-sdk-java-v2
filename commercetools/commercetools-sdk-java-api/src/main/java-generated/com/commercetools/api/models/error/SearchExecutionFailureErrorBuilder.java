
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SearchExecutionFailureErrorBuilder implements Builder<SearchExecutionFailureError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public SearchExecutionFailureErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public SearchExecutionFailureErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public SearchExecutionFailureErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public SearchExecutionFailureError build() {
        Objects.requireNonNull(message, SearchExecutionFailureError.class + ": message is missing");
        Objects.requireNonNull(values, SearchExecutionFailureError.class + ": values are missing");
        return new SearchExecutionFailureErrorImpl(message, values);
    }

    /**
     * builds SearchExecutionFailureError without checking for non null required values
     */
    public SearchExecutionFailureError buildUnchecked() {
        return new SearchExecutionFailureErrorImpl(message, values);
    }

    public static SearchExecutionFailureErrorBuilder of() {
        return new SearchExecutionFailureErrorBuilder();
    }

    public static SearchExecutionFailureErrorBuilder of(final SearchExecutionFailureError template) {
        SearchExecutionFailureErrorBuilder builder = new SearchExecutionFailureErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
