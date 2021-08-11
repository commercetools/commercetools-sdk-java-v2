
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ValidFromAndUntilValueBuilder implements Builder<ValidFromAndUntilValue> {

    private String validFrom;

    private String validUntil;

    public ValidFromAndUntilValueBuilder validFrom(final String validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public ValidFromAndUntilValueBuilder validUntil(final String validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public String getValidFrom() {
        return this.validFrom;
    }

    public String getValidUntil() {
        return this.validUntil;
    }

    public ValidFromAndUntilValue build() {
        Objects.requireNonNull(validFrom, ValidFromAndUntilValue.class + ": validFrom is missing");
        Objects.requireNonNull(validUntil, ValidFromAndUntilValue.class + ": validUntil is missing");
        return new ValidFromAndUntilValueImpl(validFrom, validUntil);
    }

    /**
     * builds ValidFromAndUntilValue without checking for non null required values
     */
    public ValidFromAndUntilValue buildUnchecked() {
        return new ValidFromAndUntilValueImpl(validFrom, validUntil);
    }

    public static ValidFromAndUntilValueBuilder of() {
        return new ValidFromAndUntilValueBuilder();
    }

    public static ValidFromAndUntilValueBuilder of(final ValidFromAndUntilValue template) {
        ValidFromAndUntilValueBuilder builder = new ValidFromAndUntilValueBuilder();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
