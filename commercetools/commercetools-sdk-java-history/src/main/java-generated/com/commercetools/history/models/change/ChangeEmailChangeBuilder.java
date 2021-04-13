
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeEmailChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public ChangeEmailChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeEmailChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeEmailChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public ChangeEmailChange build() {
        return new ChangeEmailChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeEmailChangeBuilder of() {
        return new ChangeEmailChangeBuilder();
    }

    public static ChangeEmailChangeBuilder of(final ChangeEmailChange template) {
        ChangeEmailChangeBuilder builder = new ChangeEmailChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
