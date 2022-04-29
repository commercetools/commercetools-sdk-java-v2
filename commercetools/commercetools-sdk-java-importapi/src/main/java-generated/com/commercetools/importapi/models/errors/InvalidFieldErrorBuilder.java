
package com.commercetools.importapi.models.errors;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class InvalidFieldErrorBuilder implements Builder<InvalidFieldError> {

    private String message;

    private String field;

    private java.lang.Object invalidValue;

    @Nullable
    private java.util.List<java.lang.Object> allowedValues;

    @Nullable
    private Long resourceIndex;

    public InvalidFieldErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public InvalidFieldErrorBuilder field(final String field) {
        this.field = field;
        return this;
    }

    public InvalidFieldErrorBuilder invalidValue(final java.lang.Object invalidValue) {
        this.invalidValue = invalidValue;
        return this;
    }

    public InvalidFieldErrorBuilder allowedValues(@Nullable final java.lang.Object... allowedValues) {
        this.allowedValues = new ArrayList<>(Arrays.asList(allowedValues));
        return this;
    }

    public InvalidFieldErrorBuilder allowedValues(@Nullable final java.util.List<java.lang.Object> allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    public InvalidFieldErrorBuilder plusAllowedValues(@Nullable final java.lang.Object... allowedValues) {
        if (this.allowedValues == null) {
            this.allowedValues = new ArrayList<>();
        }
        this.allowedValues.addAll(Arrays.asList(allowedValues));
        return this;
    }

    public InvalidFieldErrorBuilder resourceIndex(@Nullable final Long resourceIndex) {
        this.resourceIndex = resourceIndex;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public String getField() {
        return this.field;
    }

    public java.lang.Object getInvalidValue() {
        return this.invalidValue;
    }

    @Nullable
    public java.util.List<java.lang.Object> getAllowedValues() {
        return this.allowedValues;
    }

    @Nullable
    public Long getResourceIndex() {
        return this.resourceIndex;
    }

    public InvalidFieldError build() {
        Objects.requireNonNull(message, InvalidFieldError.class + ": message is missing");
        Objects.requireNonNull(field, InvalidFieldError.class + ": field is missing");
        Objects.requireNonNull(invalidValue, InvalidFieldError.class + ": invalidValue is missing");
        return new InvalidFieldErrorImpl(message, field, invalidValue, allowedValues, resourceIndex);
    }

    /**
     * builds InvalidFieldError without checking for non null required values
     */
    public InvalidFieldError buildUnchecked() {
        return new InvalidFieldErrorImpl(message, field, invalidValue, allowedValues, resourceIndex);
    }

    public static InvalidFieldErrorBuilder of() {
        return new InvalidFieldErrorBuilder();
    }

    public static InvalidFieldErrorBuilder of(final InvalidFieldError template) {
        InvalidFieldErrorBuilder builder = new InvalidFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.field = template.getField();
        builder.invalidValue = template.getInvalidValue();
        builder.allowedValues = template.getAllowedValues();
        builder.resourceIndex = template.getResourceIndex();
        return builder;
    }

}
