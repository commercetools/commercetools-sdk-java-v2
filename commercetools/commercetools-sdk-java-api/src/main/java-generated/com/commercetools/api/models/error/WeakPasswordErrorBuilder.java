
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class WeakPasswordErrorBuilder {

    private String message;

    public WeakPasswordErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public WeakPasswordError build() {
        return new WeakPasswordErrorImpl(message);
    }

    public static WeakPasswordErrorBuilder of() {
        return new WeakPasswordErrorBuilder();
    }

    public static WeakPasswordErrorBuilder of(final WeakPasswordError template) {
        WeakPasswordErrorBuilder builder = new WeakPasswordErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
