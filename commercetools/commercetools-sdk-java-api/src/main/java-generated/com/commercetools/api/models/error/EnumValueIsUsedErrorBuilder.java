
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class EnumValueIsUsedErrorBuilder implements Builder<EnumValueIsUsedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public EnumValueIsUsedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public EnumValueIsUsedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public EnumValueIsUsedErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public EnumValueIsUsedError build() {
        Objects.requireNonNull(message, EnumValueIsUsedError.class + ": message is missing");
        Objects.requireNonNull(values, EnumValueIsUsedError.class + ": values are missing");
        return new EnumValueIsUsedErrorImpl(message, values);
    }

    /**
     * builds EnumValueIsUsedError without checking for non null required values
     */
    public EnumValueIsUsedError buildUnchecked() {
        return new EnumValueIsUsedErrorImpl(message, values);
    }

    public static EnumValueIsUsedErrorBuilder of() {
        return new EnumValueIsUsedErrorBuilder();
    }

    public static EnumValueIsUsedErrorBuilder of(final EnumValueIsUsedError template) {
        EnumValueIsUsedErrorBuilder builder = new EnumValueIsUsedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
