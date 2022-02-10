
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SyntaxErrorErrorBuilder implements Builder<SyntaxErrorError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public SyntaxErrorErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public SyntaxErrorErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public SyntaxErrorErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public SyntaxErrorError build() {
        Objects.requireNonNull(message, SyntaxErrorError.class + ": message is missing");
        Objects.requireNonNull(values, SyntaxErrorError.class + ": values are missing");
        return new SyntaxErrorErrorImpl(message, values);
    }

    /**
     * builds SyntaxErrorError without checking for non null required values
     */
    public SyntaxErrorError buildUnchecked() {
        return new SyntaxErrorErrorImpl(message, values);
    }

    public static SyntaxErrorErrorBuilder of() {
        return new SyntaxErrorErrorBuilder();
    }

    public static SyntaxErrorErrorBuilder of(final SyntaxErrorError template) {
        SyntaxErrorErrorBuilder builder = new SyntaxErrorErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
