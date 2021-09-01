
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class EnumValueIsUsedErrorBuilder implements Builder<EnumValueIsUsedError> {

    private String message;

    public EnumValueIsUsedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public EnumValueIsUsedError build() {
        Objects.requireNonNull(message, EnumValueIsUsedError.class + ": message is missing");
        return new EnumValueIsUsedErrorImpl(message);
    }

    /**
     * builds EnumValueIsUsedError without checking for non null required values
     */
    public EnumValueIsUsedError buildUnchecked() {
        return new EnumValueIsUsedErrorImpl(message);
    }

    public static EnumValueIsUsedErrorBuilder of() {
        return new EnumValueIsUsedErrorBuilder();
    }

    public static EnumValueIsUsedErrorBuilder of(final EnumValueIsUsedError template) {
        EnumValueIsUsedErrorBuilder builder = new EnumValueIsUsedErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
