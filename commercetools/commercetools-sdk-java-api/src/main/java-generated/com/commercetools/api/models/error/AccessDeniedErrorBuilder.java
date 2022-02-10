
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AccessDeniedErrorBuilder implements Builder<AccessDeniedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public AccessDeniedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public AccessDeniedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public AccessDeniedErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public AccessDeniedError build() {
        Objects.requireNonNull(message, AccessDeniedError.class + ": message is missing");
        Objects.requireNonNull(values, AccessDeniedError.class + ": values are missing");
        return new AccessDeniedErrorImpl(message, values);
    }

    /**
     * builds AccessDeniedError without checking for non null required values
     */
    public AccessDeniedError buildUnchecked() {
        return new AccessDeniedErrorImpl(message, values);
    }

    public static AccessDeniedErrorBuilder of() {
        return new AccessDeniedErrorBuilder();
    }

    public static AccessDeniedErrorBuilder of(final AccessDeniedError template) {
        AccessDeniedErrorBuilder builder = new AccessDeniedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
