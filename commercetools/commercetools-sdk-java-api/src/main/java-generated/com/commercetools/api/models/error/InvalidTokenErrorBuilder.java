
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class InvalidTokenErrorBuilder implements Builder<InvalidTokenError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public InvalidTokenErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public InvalidTokenErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public InvalidTokenErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public InvalidTokenError build() {
        Objects.requireNonNull(message, InvalidTokenError.class + ": message is missing");
        Objects.requireNonNull(values, InvalidTokenError.class + ": values are missing");
        return new InvalidTokenErrorImpl(message, values);
    }

    /**
     * builds InvalidTokenError without checking for non null required values
     */
    public InvalidTokenError buildUnchecked() {
        return new InvalidTokenErrorImpl(message, values);
    }

    public static InvalidTokenErrorBuilder of() {
        return new InvalidTokenErrorBuilder();
    }

    public static InvalidTokenErrorBuilder of(final InvalidTokenError template) {
        InvalidTokenErrorBuilder builder = new InvalidTokenErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
