
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class BadGatewayErrorBuilder implements Builder<BadGatewayError> {

    private String message;

    public BadGatewayErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public BadGatewayError build() {
        Objects.requireNonNull(message, BadGatewayError.class + ": message is missing");
        return new BadGatewayErrorImpl(message);
    }

    /**
     * builds BadGatewayError without checking for non null required values
     */
    public BadGatewayError buildUnchecked() {
        return new BadGatewayErrorImpl(message);
    }

    public static BadGatewayErrorBuilder of() {
        return new BadGatewayErrorBuilder();
    }

    public static BadGatewayErrorBuilder of(final BadGatewayError template) {
        BadGatewayErrorBuilder builder = new BadGatewayErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
