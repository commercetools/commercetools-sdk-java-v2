
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ObjectNotFoundErrorBuilder {

    private String message;

    public ObjectNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public ObjectNotFoundError build() {
        return new ObjectNotFoundErrorImpl(message);
    }

    public static ObjectNotFoundErrorBuilder of() {
        return new ObjectNotFoundErrorBuilder();
    }

    public static ObjectNotFoundErrorBuilder of(final ObjectNotFoundError template) {
        ObjectNotFoundErrorBuilder builder = new ObjectNotFoundErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
