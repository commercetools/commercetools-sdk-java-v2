
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SyntaxErrorErrorBuilder {

    private String message;

    public SyntaxErrorErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public SyntaxErrorError build() {
        return new SyntaxErrorErrorImpl(message);
    }

    public static SyntaxErrorErrorBuilder of() {
        return new SyntaxErrorErrorBuilder();
    }

    public static SyntaxErrorErrorBuilder of(final SyntaxErrorError template) {
        SyntaxErrorErrorBuilder builder = new SyntaxErrorErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
