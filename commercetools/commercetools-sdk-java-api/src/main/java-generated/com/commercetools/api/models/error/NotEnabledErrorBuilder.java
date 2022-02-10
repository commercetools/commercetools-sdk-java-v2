
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class NotEnabledErrorBuilder implements Builder<NotEnabledError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public NotEnabledErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public NotEnabledErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public NotEnabledErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public NotEnabledError build() {
        Objects.requireNonNull(message, NotEnabledError.class + ": message is missing");
        Objects.requireNonNull(values, NotEnabledError.class + ": values are missing");
        return new NotEnabledErrorImpl(message, values);
    }

    /**
     * builds NotEnabledError without checking for non null required values
     */
    public NotEnabledError buildUnchecked() {
        return new NotEnabledErrorImpl(message, values);
    }

    public static NotEnabledErrorBuilder of() {
        return new NotEnabledErrorBuilder();
    }

    public static NotEnabledErrorBuilder of(final NotEnabledError template) {
        NotEnabledErrorBuilder builder = new NotEnabledErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
