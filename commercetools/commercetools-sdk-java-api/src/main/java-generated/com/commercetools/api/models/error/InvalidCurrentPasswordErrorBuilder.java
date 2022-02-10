
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class InvalidCurrentPasswordErrorBuilder implements Builder<InvalidCurrentPasswordError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public InvalidCurrentPasswordErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public InvalidCurrentPasswordErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public InvalidCurrentPasswordErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public InvalidCurrentPasswordError build() {
        Objects.requireNonNull(message, InvalidCurrentPasswordError.class + ": message is missing");
        Objects.requireNonNull(values, InvalidCurrentPasswordError.class + ": values are missing");
        return new InvalidCurrentPasswordErrorImpl(message, values);
    }

    /**
     * builds InvalidCurrentPasswordError without checking for non null required values
     */
    public InvalidCurrentPasswordError buildUnchecked() {
        return new InvalidCurrentPasswordErrorImpl(message, values);
    }

    public static InvalidCurrentPasswordErrorBuilder of() {
        return new InvalidCurrentPasswordErrorBuilder();
    }

    public static InvalidCurrentPasswordErrorBuilder of(final InvalidCurrentPasswordError template) {
        InvalidCurrentPasswordErrorBuilder builder = new InvalidCurrentPasswordErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
