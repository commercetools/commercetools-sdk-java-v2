
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ObjectNotFoundErrorBuilder implements Builder<ObjectNotFoundError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public ObjectNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ObjectNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public ObjectNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public ObjectNotFoundError build() {
        Objects.requireNonNull(message, ObjectNotFoundError.class + ": message is missing");
        Objects.requireNonNull(values, ObjectNotFoundError.class + ": values are missing");
        return new ObjectNotFoundErrorImpl(message, values);
    }

    /**
     * builds ObjectNotFoundError without checking for non null required values
     */
    public ObjectNotFoundError buildUnchecked() {
        return new ObjectNotFoundErrorImpl(message, values);
    }

    public static ObjectNotFoundErrorBuilder of() {
        return new ObjectNotFoundErrorBuilder();
    }

    public static ObjectNotFoundErrorBuilder of(final ObjectNotFoundError template) {
        ObjectNotFoundErrorBuilder builder = new ObjectNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
