
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class VerifyEmailChangeBuilder implements Builder<VerifyEmailChange> {

    private String change;

    public VerifyEmailChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public VerifyEmailChange build() {
        Objects.requireNonNull(change, VerifyEmailChange.class + ": change is missing");
        return new VerifyEmailChangeImpl(change);
    }

    /**
     * builds VerifyEmailChange without checking for non null required values
     */
    public VerifyEmailChange buildUnchecked() {
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
