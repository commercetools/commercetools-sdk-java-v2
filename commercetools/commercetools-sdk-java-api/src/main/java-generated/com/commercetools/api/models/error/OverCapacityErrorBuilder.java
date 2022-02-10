
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OverCapacityErrorBuilder implements Builder<OverCapacityError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public OverCapacityErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public OverCapacityErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public OverCapacityErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public OverCapacityError build() {
        Objects.requireNonNull(message, OverCapacityError.class + ": message is missing");
        Objects.requireNonNull(values, OverCapacityError.class + ": values are missing");
        return new OverCapacityErrorImpl(message, values);
    }

    /**
     * builds OverCapacityError without checking for non null required values
     */
    public OverCapacityError buildUnchecked() {
        return new OverCapacityErrorImpl(message, values);
    }

    public static OverCapacityErrorBuilder of() {
        return new OverCapacityErrorBuilder();
    }

    public static OverCapacityErrorBuilder of(final OverCapacityError template) {
        OverCapacityErrorBuilder builder = new OverCapacityErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
