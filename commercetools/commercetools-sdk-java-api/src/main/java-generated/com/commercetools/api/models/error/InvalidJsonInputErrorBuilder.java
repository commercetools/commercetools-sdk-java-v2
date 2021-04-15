
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InvalidJsonInputErrorBuilder {

    private String message;

    public InvalidJsonInputErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidJsonInputError build() {
        return new InvalidJsonInputErrorImpl(message);
    }

    public static InvalidJsonInputErrorBuilder of() {
        return new InvalidJsonInputErrorBuilder();
    }

    public static InvalidJsonInputErrorBuilder of(final InvalidJsonInputError template) {
        InvalidJsonInputErrorBuilder builder = new InvalidJsonInputErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
