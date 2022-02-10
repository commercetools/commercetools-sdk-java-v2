
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AnonymousIdAlreadyInUseErrorBuilder implements Builder<AnonymousIdAlreadyInUseError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public AnonymousIdAlreadyInUseErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public AnonymousIdAlreadyInUseErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public AnonymousIdAlreadyInUseErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public AnonymousIdAlreadyInUseError build() {
        Objects.requireNonNull(message, AnonymousIdAlreadyInUseError.class + ": message is missing");
        Objects.requireNonNull(values, AnonymousIdAlreadyInUseError.class + ": values are missing");
        return new AnonymousIdAlreadyInUseErrorImpl(message, values);
    }

    /**
     * builds AnonymousIdAlreadyInUseError without checking for non null required values
     */
    public AnonymousIdAlreadyInUseError buildUnchecked() {
        return new AnonymousIdAlreadyInUseErrorImpl(message, values);
    }

    public static AnonymousIdAlreadyInUseErrorBuilder of() {
        return new AnonymousIdAlreadyInUseErrorBuilder();
    }

    public static AnonymousIdAlreadyInUseErrorBuilder of(final AnonymousIdAlreadyInUseError template) {
        AnonymousIdAlreadyInUseErrorBuilder builder = new AnonymousIdAlreadyInUseErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
