
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ErrorObjectBuilder implements Builder<ErrorObject> {

    private String code;

    private String message;

    public ErrorObjectBuilder code(final String code) {
        this.code = code;
        return this;
    }

    public ErrorObjectBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public ErrorObject build() {
        Objects.requireNonNull(code, ErrorObject.class + ": code is missing");
        Objects.requireNonNull(message, ErrorObject.class + ": message is missing");
        return new ErrorObjectImpl(code, message);
    }

    /**
     * builds ErrorObject without checking for non null required values
     */
    public ErrorObject buildUnchecked() {
        return new ErrorObjectImpl(code, message);
    }

    public static ErrorObjectBuilder of() {
        return new ErrorObjectBuilder();
    }

    public static ErrorObjectBuilder of(final ErrorObject template) {
        ErrorObjectBuilder builder = new ErrorObjectBuilder();
        builder.code = template.getCode();
        builder.message = template.getMessage();
        return builder;
    }

}
