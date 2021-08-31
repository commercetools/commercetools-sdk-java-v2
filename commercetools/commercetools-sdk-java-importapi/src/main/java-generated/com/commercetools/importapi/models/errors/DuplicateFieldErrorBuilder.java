
package com.commercetools.importapi.models.errors;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DuplicateFieldErrorBuilder implements Builder<DuplicateFieldError> {

    private String message;

    @Nullable
    private String field;

    @Nullable
    private java.lang.Object duplicateValue;

    public DuplicateFieldErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public DuplicateFieldErrorBuilder field(@Nullable final String field) {
        this.field = field;
        return this;
    }

    public DuplicateFieldErrorBuilder duplicateValue(@Nullable final java.lang.Object duplicateValue) {
        this.duplicateValue = duplicateValue;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    @Nullable
    public String getField() {
        return this.field;
    }

    @Nullable
    public java.lang.Object getDuplicateValue() {
        return this.duplicateValue;
    }

    public DuplicateFieldError build() {
        Objects.requireNonNull(message, DuplicateFieldError.class + ": message is missing");
        return new DuplicateFieldErrorImpl(message, field, duplicateValue);
    }

    /**
     * builds DuplicateFieldError without checking for non null required values
     */
    public DuplicateFieldError buildUnchecked() {
        return new DuplicateFieldErrorImpl(message, field, duplicateValue);
    }

    public static DuplicateFieldErrorBuilder of() {
        return new DuplicateFieldErrorBuilder();
    }

    public static DuplicateFieldErrorBuilder of(final DuplicateFieldError template) {
        DuplicateFieldErrorBuilder builder = new DuplicateFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.field = template.getField();
        builder.duplicateValue = template.getDuplicateValue();
        return builder;
    }

}
