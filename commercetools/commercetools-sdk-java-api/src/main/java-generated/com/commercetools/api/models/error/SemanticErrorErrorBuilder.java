
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SemanticErrorErrorBuilder implements Builder<SemanticErrorError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public SemanticErrorErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public SemanticErrorErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public SemanticErrorErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public SemanticErrorError build() {
        Objects.requireNonNull(message, SemanticErrorError.class + ": message is missing");
        Objects.requireNonNull(values, SemanticErrorError.class + ": values are missing");
        return new SemanticErrorErrorImpl(message, values);
    }

    /**
     * builds SemanticErrorError without checking for non null required values
     */
    public SemanticErrorError buildUnchecked() {
        return new SemanticErrorErrorImpl(message, values);
    }

    public static SemanticErrorErrorBuilder of() {
        return new SemanticErrorErrorBuilder();
    }

    public static SemanticErrorErrorBuilder of(final SemanticErrorError template) {
        SemanticErrorErrorBuilder builder = new SemanticErrorErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
