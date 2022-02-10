
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class InternalConstraintViolatedErrorBuilder implements Builder<InternalConstraintViolatedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public InternalConstraintViolatedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public InternalConstraintViolatedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public InternalConstraintViolatedErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public InternalConstraintViolatedError build() {
        Objects.requireNonNull(message, InternalConstraintViolatedError.class + ": message is missing");
        Objects.requireNonNull(values, InternalConstraintViolatedError.class + ": values are missing");
        return new InternalConstraintViolatedErrorImpl(message, values);
    }

    /**
     * builds InternalConstraintViolatedError without checking for non null required values
     */
    public InternalConstraintViolatedError buildUnchecked() {
        return new InternalConstraintViolatedErrorImpl(message, values);
    }

    public static InternalConstraintViolatedErrorBuilder of() {
        return new InternalConstraintViolatedErrorBuilder();
    }

    public static InternalConstraintViolatedErrorBuilder of(final InternalConstraintViolatedError template) {
        InternalConstraintViolatedErrorBuilder builder = new InternalConstraintViolatedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
