
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class InvalidInputErrorBuilder implements Builder<InvalidInputError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public InvalidInputErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public InvalidInputErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public InvalidInputErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public InvalidInputError build() {
        Objects.requireNonNull(message, InvalidInputError.class + ": message is missing");
        Objects.requireNonNull(values, InvalidInputError.class + ": values are missing");
        return new InvalidInputErrorImpl(message, values);
    }

    /**
     * builds InvalidInputError without checking for non null required values
     */
    public InvalidInputError buildUnchecked() {
        return new InvalidInputErrorImpl(message, values);
    }

    public static InvalidInputErrorBuilder of() {
        return new InvalidInputErrorBuilder();
    }

    public static InvalidInputErrorBuilder of(final InvalidInputError template) {
        InvalidInputErrorBuilder builder = new InvalidInputErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
