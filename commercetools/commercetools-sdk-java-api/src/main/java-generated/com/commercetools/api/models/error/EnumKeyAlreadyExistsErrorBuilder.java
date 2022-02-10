
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class EnumKeyAlreadyExistsErrorBuilder implements Builder<EnumKeyAlreadyExistsError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String conflictingEnumKey;

    private String conflictingAttributeName;

    public EnumKeyAlreadyExistsErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public EnumKeyAlreadyExistsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public EnumKeyAlreadyExistsErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public EnumKeyAlreadyExistsErrorBuilder conflictingEnumKey(final String conflictingEnumKey) {
        this.conflictingEnumKey = conflictingEnumKey;
        return this;
    }

    public EnumKeyAlreadyExistsErrorBuilder conflictingAttributeName(final String conflictingAttributeName) {
        this.conflictingAttributeName = conflictingAttributeName;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public String getConflictingEnumKey() {
        return this.conflictingEnumKey;
    }

    public String getConflictingAttributeName() {
        return this.conflictingAttributeName;
    }

    public EnumKeyAlreadyExistsError build() {
        Objects.requireNonNull(message, EnumKeyAlreadyExistsError.class + ": message is missing");
        Objects.requireNonNull(values, EnumKeyAlreadyExistsError.class + ": values are missing");
        Objects.requireNonNull(conflictingEnumKey, EnumKeyAlreadyExistsError.class + ": conflictingEnumKey is missing");
        Objects.requireNonNull(conflictingAttributeName,
            EnumKeyAlreadyExistsError.class + ": conflictingAttributeName is missing");
        return new EnumKeyAlreadyExistsErrorImpl(message, values, conflictingEnumKey, conflictingAttributeName);
    }

    /**
     * builds EnumKeyAlreadyExistsError without checking for non null required values
     */
    public EnumKeyAlreadyExistsError buildUnchecked() {
        return new EnumKeyAlreadyExistsErrorImpl(message, values, conflictingEnumKey, conflictingAttributeName);
    }

    public static EnumKeyAlreadyExistsErrorBuilder of() {
        return new EnumKeyAlreadyExistsErrorBuilder();
    }

    public static EnumKeyAlreadyExistsErrorBuilder of(final EnumKeyAlreadyExistsError template) {
        EnumKeyAlreadyExistsErrorBuilder builder = new EnumKeyAlreadyExistsErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingEnumKey = template.getConflictingEnumKey();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
