
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class InvalidSubjectErrorBuilder implements Builder<InvalidSubjectError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public InvalidSubjectErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public InvalidSubjectErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public InvalidSubjectErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public InvalidSubjectError build() {
        Objects.requireNonNull(message, InvalidSubjectError.class + ": message is missing");
        Objects.requireNonNull(values, InvalidSubjectError.class + ": values are missing");
        return new InvalidSubjectErrorImpl(message, values);
    }

    /**
     * builds InvalidSubjectError without checking for non null required values
     */
    public InvalidSubjectError buildUnchecked() {
        return new InvalidSubjectErrorImpl(message, values);
    }

    public static InvalidSubjectErrorBuilder of() {
        return new InvalidSubjectErrorBuilder();
    }

    public static InvalidSubjectErrorBuilder of(final InvalidSubjectError template) {
        InvalidSubjectErrorBuilder builder = new InvalidSubjectErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
