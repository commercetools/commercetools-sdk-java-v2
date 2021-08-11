
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeNameDoesNotExistErrorBuilder implements Builder<AttributeNameDoesNotExistError> {

    private String message;

    private String invalidAttributeName;

    public AttributeNameDoesNotExistErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public AttributeNameDoesNotExistErrorBuilder invalidAttributeName(final String invalidAttributeName) {
        this.invalidAttributeName = invalidAttributeName;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public String getInvalidAttributeName() {
        return this.invalidAttributeName;
    }

    public AttributeNameDoesNotExistError build() {
        Objects.requireNonNull(message, AttributeNameDoesNotExistError.class + ": message is missing");
        Objects.requireNonNull(invalidAttributeName,
            AttributeNameDoesNotExistError.class + ": invalidAttributeName is missing");
        return new AttributeNameDoesNotExistErrorImpl(message, invalidAttributeName);
    }

    /**
     * builds AttributeNameDoesNotExistError without checking for non null required values
     */
    public AttributeNameDoesNotExistError buildUnchecked() {
        return new AttributeNameDoesNotExistErrorImpl(message, invalidAttributeName);
    }

    public static AttributeNameDoesNotExistErrorBuilder of() {
        return new AttributeNameDoesNotExistErrorBuilder();
    }

    public static AttributeNameDoesNotExistErrorBuilder of(final AttributeNameDoesNotExistError template) {
        AttributeNameDoesNotExistErrorBuilder builder = new AttributeNameDoesNotExistErrorBuilder();
        builder.message = template.getMessage();
        builder.invalidAttributeName = template.getInvalidAttributeName();
        return builder;
    }

}
