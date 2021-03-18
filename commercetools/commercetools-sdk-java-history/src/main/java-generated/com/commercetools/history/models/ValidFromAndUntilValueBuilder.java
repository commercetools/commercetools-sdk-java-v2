
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ValidFromAndUntilValueBuilder {

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
