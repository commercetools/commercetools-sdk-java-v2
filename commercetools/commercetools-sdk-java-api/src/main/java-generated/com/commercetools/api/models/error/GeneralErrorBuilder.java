
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GeneralErrorBuilder {

    private String message;

    public GeneralErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public GeneralError build() {
        return new GeneralErrorImpl(message);
    }

    public static GeneralErrorBuilder of() {
        return new GeneralErrorBuilder();
    }

    public static GeneralErrorBuilder of(final GeneralError template) {
        GeneralErrorBuilder builder = new GeneralErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
