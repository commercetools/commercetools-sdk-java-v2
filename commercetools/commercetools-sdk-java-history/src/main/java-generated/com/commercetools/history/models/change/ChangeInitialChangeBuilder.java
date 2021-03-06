
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeInitialChangeBuilder {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    public ChangeInitialChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeInitialChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeInitialChangeBuilder nextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    public Boolean getNextValue() {
        return this.nextValue;
    }

    public ChangeInitialChange build() {
        return new ChangeInitialChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeInitialChangeBuilder of() {
        return new ChangeInitialChangeBuilder();
    }

    public static ChangeInitialChangeBuilder of(final ChangeInitialChange template) {
        ChangeInitialChangeBuilder builder = new ChangeInitialChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
