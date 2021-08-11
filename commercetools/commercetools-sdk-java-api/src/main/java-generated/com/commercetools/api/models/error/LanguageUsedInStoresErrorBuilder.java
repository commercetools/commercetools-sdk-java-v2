
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LanguageUsedInStoresErrorBuilder implements Builder<LanguageUsedInStoresError> {

    private String message;

    public LanguageUsedInStoresErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public LanguageUsedInStoresError build() {
        Objects.requireNonNull(message, LanguageUsedInStoresError.class + ": message is missing");
        return new LanguageUsedInStoresErrorImpl(message);
    }

    /**
     * builds LanguageUsedInStoresError without checking for non null required values
     */
    public LanguageUsedInStoresError buildUnchecked() {
        return new LanguageUsedInStoresErrorImpl(message);
    }

    public static LanguageUsedInStoresErrorBuilder of() {
        return new LanguageUsedInStoresErrorBuilder();
    }

    public static LanguageUsedInStoresErrorBuilder of(final LanguageUsedInStoresError template) {
        LanguageUsedInStoresErrorBuilder builder = new LanguageUsedInStoresErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
