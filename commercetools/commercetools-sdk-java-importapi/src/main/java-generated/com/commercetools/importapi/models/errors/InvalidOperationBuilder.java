
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InvalidOperationBuilder implements Builder<InvalidOperation> {

    private String message;

    public InvalidOperationBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidOperation build() {
        Objects.requireNonNull(message, InvalidOperation.class + ": message is missing");
        return new InvalidOperationImpl(message);
    }

    /**
     * builds InvalidOperation without checking for non null required values
     */
    public InvalidOperation buildUnchecked() {
        return new InvalidOperationImpl(message);
    }

    public static InvalidOperationBuilder of() {
        return new InvalidOperationBuilder();
    }

    public static InvalidOperationBuilder of(final InvalidOperation template) {
        InvalidOperationBuilder builder = new InvalidOperationBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
