
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RequiredFieldErrorBuilder implements Builder<RequiredFieldError> {

    private String message;

    private String field;

    public RequiredFieldErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public RequiredFieldErrorBuilder field(final String field) {
        this.field = field;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public String getField() {
        return this.field;
    }

    public RequiredFieldError build() {
        Objects.requireNonNull(message, RequiredFieldError.class + ": message is missing");
        Objects.requireNonNull(field, RequiredFieldError.class + ": field is missing");
        return new RequiredFieldErrorImpl(message, field);
    }

    /**
     * builds RequiredFieldError without checking for non null required values
     */
    public RequiredFieldError buildUnchecked() {
        return new RequiredFieldErrorImpl(message, field);
    }

    public static RequiredFieldErrorBuilder of() {
        return new RequiredFieldErrorBuilder();
    }

    public static RequiredFieldErrorBuilder of(final RequiredFieldError template) {
        RequiredFieldErrorBuilder builder = new RequiredFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.field = template.getField();
        return builder;
    }

}
