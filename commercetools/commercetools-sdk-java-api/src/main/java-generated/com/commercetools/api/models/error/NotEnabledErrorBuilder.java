
package com.commercetools.api.models.error;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.NotEnabledError;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class NotEnabledErrorBuilder {

    private String message;

    public NotEnabledErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public NotEnabledError build() {
        return new NotEnabledErrorImpl(message);
    }

    public static NotEnabledErrorBuilder of() {
        return new NotEnabledErrorBuilder();
    }

    public static NotEnabledErrorBuilder of(final NotEnabledError template) {
        NotEnabledErrorBuilder builder = new NotEnabledErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
