
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InvalidInputErrorBuilder implements Builder<InvalidInputError> {

    private String message;

    public InvalidInputErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidInputError build() {
        Objects.requireNonNull(message, InvalidInputError.class + ": message is missing");
        return new InvalidInputErrorImpl(message);
    }

    /**
     * builds InvalidInputError without checking for non null required values
     */
    public InvalidInputError buildUnchecked() {
        return new InvalidInputErrorImpl(message);
    }

    public static InvalidInputErrorBuilder of() {
        return new InvalidInputErrorBuilder();
    }

    public static InvalidInputErrorBuilder of(final InvalidInputError template) {
        InvalidInputErrorBuilder builder = new InvalidInputErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
