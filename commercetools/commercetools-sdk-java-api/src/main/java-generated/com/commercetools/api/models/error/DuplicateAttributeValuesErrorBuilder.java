
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DuplicateAttributeValuesErrorBuilder {

    private String message;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    public DuplicateAttributeValuesErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public DuplicateAttributeValuesErrorBuilder attributes(
            final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    public DuplicateAttributeValuesErrorBuilder attributes(
            final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    public DuplicateAttributeValuesError build() {
        return new DuplicateAttributeValuesErrorImpl(message, attributes);
    }

    public static DuplicateAttributeValuesErrorBuilder of() {
        return new DuplicateAttributeValuesErrorBuilder();
    }

    public static DuplicateAttributeValuesErrorBuilder of(final DuplicateAttributeValuesError template) {
        DuplicateAttributeValuesErrorBuilder builder = new DuplicateAttributeValuesErrorBuilder();
        builder.message = template.getMessage();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
