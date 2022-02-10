
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AttributeNameDoesNotExistErrorBuilder implements Builder<AttributeNameDoesNotExistError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String invalidAttributeName;

    public AttributeNameDoesNotExistErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public AttributeNameDoesNotExistErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public AttributeNameDoesNotExistErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public AttributeNameDoesNotExistErrorBuilder invalidAttributeName(final String invalidAttributeName) {
        this.invalidAttributeName = invalidAttributeName;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public String getInvalidAttributeName() {
        return this.invalidAttributeName;
    }

    public AttributeNameDoesNotExistError build() {
        Objects.requireNonNull(message, AttributeNameDoesNotExistError.class + ": message is missing");
        Objects.requireNonNull(values, AttributeNameDoesNotExistError.class + ": values are missing");
        Objects.requireNonNull(invalidAttributeName,
            AttributeNameDoesNotExistError.class + ": invalidAttributeName is missing");
        return new AttributeNameDoesNotExistErrorImpl(message, values, invalidAttributeName);
    }

    /**
     * builds AttributeNameDoesNotExistError without checking for non null required values
     */
    public AttributeNameDoesNotExistError buildUnchecked() {
        return new AttributeNameDoesNotExistErrorImpl(message, values, invalidAttributeName);
    }

    public static AttributeNameDoesNotExistErrorBuilder of() {
        return new AttributeNameDoesNotExistErrorBuilder();
    }

    public static AttributeNameDoesNotExistErrorBuilder of(final AttributeNameDoesNotExistError template) {
        AttributeNameDoesNotExistErrorBuilder builder = new AttributeNameDoesNotExistErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.invalidAttributeName = template.getInvalidAttributeName();
        return builder;
    }

}
