
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeOrderHintChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public ChangeOrderHintChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeOrderHintChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeOrderHintChangeBuilder nextValue(final String nextValue) {
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

    public ChangeOrderHintChange build() {
        return new ChangeOrderHintChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeOrderHintChangeBuilder of() {
        return new ChangeOrderHintChangeBuilder();
    }

    public static ChangeOrderHintChangeBuilder of(final ChangeOrderHintChange template) {
        ChangeOrderHintChangeBuilder builder = new ChangeOrderHintChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
