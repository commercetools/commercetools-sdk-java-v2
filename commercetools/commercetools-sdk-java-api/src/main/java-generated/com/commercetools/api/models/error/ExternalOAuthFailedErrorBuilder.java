
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ExternalOAuthFailedErrorBuilder implements Builder<ExternalOAuthFailedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public ExternalOAuthFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ExternalOAuthFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public ExternalOAuthFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public ExternalOAuthFailedError build() {
        Objects.requireNonNull(message, ExternalOAuthFailedError.class + ": message is missing");
        Objects.requireNonNull(values, ExternalOAuthFailedError.class + ": values are missing");
        return new ExternalOAuthFailedErrorImpl(message, values);
    }

    /**
     * builds ExternalOAuthFailedError without checking for non null required values
     */
    public ExternalOAuthFailedError buildUnchecked() {
        return new ExternalOAuthFailedErrorImpl(message, values);
    }

    public static ExternalOAuthFailedErrorBuilder of() {
        return new ExternalOAuthFailedErrorBuilder();
    }

    public static ExternalOAuthFailedErrorBuilder of(final ExternalOAuthFailedError template) {
        ExternalOAuthFailedErrorBuilder builder = new ExternalOAuthFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
