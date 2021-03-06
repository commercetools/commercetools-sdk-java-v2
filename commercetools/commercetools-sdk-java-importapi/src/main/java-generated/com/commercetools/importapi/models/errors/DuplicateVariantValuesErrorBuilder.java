
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DuplicateVariantValuesErrorBuilder {

    private String message;

    private com.commercetools.importapi.models.errors.VariantValues variantValues;

    public DuplicateVariantValuesErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public DuplicateVariantValuesErrorBuilder variantValues(
            final com.commercetools.importapi.models.errors.VariantValues variantValues) {
        this.variantValues = variantValues;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public com.commercetools.importapi.models.errors.VariantValues getVariantValues() {
        return this.variantValues;
    }

    public DuplicateVariantValuesError build() {
        return new DuplicateVariantValuesErrorImpl(message, variantValues);
    }

    public static DuplicateVariantValuesErrorBuilder of() {
        return new DuplicateVariantValuesErrorBuilder();
    }

    public static DuplicateVariantValuesErrorBuilder of(final DuplicateVariantValuesError template) {
        DuplicateVariantValuesErrorBuilder builder = new DuplicateVariantValuesErrorBuilder();
        builder.message = template.getMessage();
        builder.variantValues = template.getVariantValues();
        return builder;
    }

}
