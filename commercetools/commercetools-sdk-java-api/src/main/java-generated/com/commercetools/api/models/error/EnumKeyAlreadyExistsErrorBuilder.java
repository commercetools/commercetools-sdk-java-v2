
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class EnumKeyAlreadyExistsErrorBuilder implements Builder<EnumKeyAlreadyExistsError> {

    private String message;

    private String conflictingEnumKey;

    private String conflictingAttributeName;

    public EnumKeyAlreadyExistsErrorBuilder message(final String message) {
        this.message = message;
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

    public String getConflictingEnumKey() {
        return this.conflictingEnumKey;
    }

    public String getConflictingAttributeName() {
        return this.conflictingAttributeName;
    }

    public EnumKeyAlreadyExistsError build() {
        Objects.requireNonNull(message, EnumKeyAlreadyExistsError.class + ": message is missing");
        Objects.requireNonNull(conflictingEnumKey, EnumKeyAlreadyExistsError.class + ": conflictingEnumKey is missing");
        Objects.requireNonNull(conflictingAttributeName,
            EnumKeyAlreadyExistsError.class + ": conflictingAttributeName is missing");
        return new EnumKeyAlreadyExistsErrorImpl(message, conflictingEnumKey, conflictingAttributeName);
    }

    /**
     * builds EnumKeyAlreadyExistsError without checking for non null required values
     */
    public EnumKeyAlreadyExistsError buildUnchecked() {
        return new EnumKeyAlreadyExistsErrorImpl(message, conflictingEnumKey, conflictingAttributeName);
    }

    public static EnumKeyAlreadyExistsErrorBuilder of() {
        return new EnumKeyAlreadyExistsErrorBuilder();
    }

    public static EnumKeyAlreadyExistsErrorBuilder of(final EnumKeyAlreadyExistsError template) {
        EnumKeyAlreadyExistsErrorBuilder builder = new EnumKeyAlreadyExistsErrorBuilder();
        builder.message = template.getMessage();
        builder.conflictingEnumKey = template.getConflictingEnumKey();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
