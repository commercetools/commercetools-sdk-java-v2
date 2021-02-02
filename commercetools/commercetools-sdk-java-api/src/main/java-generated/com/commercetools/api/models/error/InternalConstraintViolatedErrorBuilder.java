
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InternalConstraintViolatedErrorBuilder {

    private String message;

    public InternalConstraintViolatedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InternalConstraintViolatedError build() {
        return new InternalConstraintViolatedErrorImpl(message);
    }

    public static InternalConstraintViolatedErrorBuilder of() {
        return new InternalConstraintViolatedErrorBuilder();
    }

    public static InternalConstraintViolatedErrorBuilder of(final InternalConstraintViolatedError template) {
        InternalConstraintViolatedErrorBuilder builder = new InternalConstraintViolatedErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
