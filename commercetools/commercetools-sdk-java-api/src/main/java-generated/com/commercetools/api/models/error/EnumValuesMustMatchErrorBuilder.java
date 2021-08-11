
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class EnumValuesMustMatchErrorBuilder implements Builder<EnumValuesMustMatchError> {

    private String message;

    public EnumValuesMustMatchErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public EnumValuesMustMatchError build() {
        Objects.requireNonNull(message, EnumValuesMustMatchError.class + ": message is missing");
        return new EnumValuesMustMatchErrorImpl(message);
    }

    /**
     * builds EnumValuesMustMatchError without checking for non null required values
     */
    public EnumValuesMustMatchError buildUnchecked() {
        return new EnumValuesMustMatchErrorImpl(message);
    }

    public static EnumValuesMustMatchErrorBuilder of() {
        return new EnumValuesMustMatchErrorBuilder();
    }

    public static EnumValuesMustMatchErrorBuilder of(final EnumValuesMustMatchError template) {
        EnumValuesMustMatchErrorBuilder builder = new EnumValuesMustMatchErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
