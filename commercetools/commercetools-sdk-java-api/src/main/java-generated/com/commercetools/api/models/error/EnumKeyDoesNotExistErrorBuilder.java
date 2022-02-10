
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class EnumKeyDoesNotExistErrorBuilder implements Builder<EnumKeyDoesNotExistError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String conflictingEnumKey;

    private String conflictingAttributeName;

    public EnumKeyDoesNotExistErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public EnumKeyDoesNotExistErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public EnumKeyDoesNotExistErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public EnumKeyDoesNotExistErrorBuilder conflictingEnumKey(final String conflictingEnumKey) {
        this.conflictingEnumKey = conflictingEnumKey;
        return this;
    }

    public EnumKeyDoesNotExistErrorBuilder conflictingAttributeName(final String conflictingAttributeName) {
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

    public EnumKeyDoesNotExistError build() {
        Objects.requireNonNull(message, EnumKeyDoesNotExistError.class + ": message is missing");
        Objects.requireNonNull(values, EnumKeyDoesNotExistError.class + ": values are missing");
        Objects.requireNonNull(conflictingEnumKey, EnumKeyDoesNotExistError.class + ": conflictingEnumKey is missing");
        Objects.requireNonNull(conflictingAttributeName,
            EnumKeyDoesNotExistError.class + ": conflictingAttributeName is missing");
        return new EnumKeyDoesNotExistErrorImpl(message, values, conflictingEnumKey, conflictingAttributeName);
    }

    /**
     * builds EnumKeyDoesNotExistError without checking for non null required values
     */
    public EnumKeyDoesNotExistError buildUnchecked() {
        return new EnumKeyDoesNotExistErrorImpl(message, values, conflictingEnumKey, conflictingAttributeName);
    }

    public static EnumKeyDoesNotExistErrorBuilder of() {
        return new EnumKeyDoesNotExistErrorBuilder();
    }

    public static EnumKeyDoesNotExistErrorBuilder of(final EnumKeyDoesNotExistError template) {
        EnumKeyDoesNotExistErrorBuilder builder = new EnumKeyDoesNotExistErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingEnumKey = template.getConflictingEnumKey();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
