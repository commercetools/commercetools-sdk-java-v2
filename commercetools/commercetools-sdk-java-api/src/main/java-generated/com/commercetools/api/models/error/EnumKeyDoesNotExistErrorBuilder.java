
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class EnumKeyDoesNotExistErrorBuilder {

    private String message;

    private String conflictingEnumKey;

    private String conflictingAttributeName;

    public EnumKeyDoesNotExistErrorBuilder message(final String message) {
        this.message = message;
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

    public String getConflictingEnumKey() {
        return this.conflictingEnumKey;
    }

    public String getConflictingAttributeName() {
        return this.conflictingAttributeName;
    }

    public EnumKeyDoesNotExistError build() {
        return new EnumKeyDoesNotExistErrorImpl(message, conflictingEnumKey, conflictingAttributeName);
    }

    public static EnumKeyDoesNotExistErrorBuilder of() {
        return new EnumKeyDoesNotExistErrorBuilder();
    }

    public static EnumKeyDoesNotExistErrorBuilder of(final EnumKeyDoesNotExistError template) {
        EnumKeyDoesNotExistErrorBuilder builder = new EnumKeyDoesNotExistErrorBuilder();
        builder.message = template.getMessage();
        builder.conflictingEnumKey = template.getConflictingEnumKey();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
