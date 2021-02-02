
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RequiredFieldErrorBuilder {

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
