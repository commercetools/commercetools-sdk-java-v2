
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DuplicateAttributeValueErrorBuilder implements Builder<DuplicateAttributeValueError> {

    private String message;

    private com.commercetools.importapi.models.productvariants.Attribute attribute;

    public DuplicateAttributeValueErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public DuplicateAttributeValueErrorBuilder attribute(
            final com.commercetools.importapi.models.productvariants.Attribute attribute) {
        this.attribute = attribute;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public com.commercetools.importapi.models.productvariants.Attribute getAttribute() {
        return this.attribute;
    }

    public DuplicateAttributeValueError build() {
        Objects.requireNonNull(message, DuplicateAttributeValueError.class + ": message is missing");
        Objects.requireNonNull(attribute, DuplicateAttributeValueError.class + ": attribute is missing");
        return new DuplicateAttributeValueErrorImpl(message, attribute);
    }

    /**
     * builds DuplicateAttributeValueError without checking for non null required values
     */
    public DuplicateAttributeValueError buildUnchecked() {
        return new DuplicateAttributeValueErrorImpl(message, attribute);
    }

    public static DuplicateAttributeValueErrorBuilder of() {
        return new DuplicateAttributeValueErrorBuilder();
    }

    public static DuplicateAttributeValueErrorBuilder of(final DuplicateAttributeValueError template) {
        DuplicateAttributeValueErrorBuilder builder = new DuplicateAttributeValueErrorBuilder();
        builder.message = template.getMessage();
        builder.attribute = template.getAttribute();
        return builder;
    }

}
