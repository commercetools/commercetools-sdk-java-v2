
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class WeakPasswordErrorBuilder implements Builder<WeakPasswordError> {

    private String message;

    public WeakPasswordErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public WeakPasswordError build() {
        Objects.requireNonNull(message, WeakPasswordError.class + ": message is missing");
        return new WeakPasswordErrorImpl(message);
    }

    /**
     * builds WeakPasswordError without checking for non null required values
     */
    public WeakPasswordError buildUnchecked() {
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
