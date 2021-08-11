
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OverCapacityErrorBuilder implements Builder<OverCapacityError> {

    private String message;

    public OverCapacityErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public OverCapacityError build() {
        Objects.requireNonNull(message, OverCapacityError.class + ": message is missing");
        return new OverCapacityErrorImpl(message);
    }

    /**
     * builds OverCapacityError without checking for non null required values
     */
    public OverCapacityError buildUnchecked() {
        return new OverCapacityErrorImpl(message);
    }

    public static OverCapacityErrorBuilder of() {
        return new OverCapacityErrorBuilder();
    }

    public static OverCapacityErrorBuilder of(final OverCapacityError template) {
        OverCapacityErrorBuilder builder = new OverCapacityErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
