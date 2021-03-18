
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class VerifyEmailChangeBuilder {

    private String change;

    public VerifyEmailChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public VerifyEmailChange build() {
        return new VerifyEmailChangeImpl(change);
    }

    public static VerifyEmailChangeBuilder of() {
        return new VerifyEmailChangeBuilder();
    }

    public static VerifyEmailChangeBuilder of(final VerifyEmailChange template) {
        VerifyEmailChangeBuilder builder = new VerifyEmailChangeBuilder();
        builder.change = template.getChange();
        return builder;
    }

}
