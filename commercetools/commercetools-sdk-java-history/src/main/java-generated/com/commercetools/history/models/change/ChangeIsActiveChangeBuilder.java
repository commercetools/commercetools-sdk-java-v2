
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeIsActiveChangeBuilder {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    public ChangeIsActiveChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeIsActiveChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeIsActiveChangeBuilder nextValue(final Boolean nextValue) {
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

    public ChangeIsActiveChange build() {
        return new ChangeIsActiveChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeIsActiveChangeBuilder of() {
        return new ChangeIsActiveChangeBuilder();
    }

    public static ChangeIsActiveChangeBuilder of(final ChangeIsActiveChange template) {
        ChangeIsActiveChangeBuilder builder = new ChangeIsActiveChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
