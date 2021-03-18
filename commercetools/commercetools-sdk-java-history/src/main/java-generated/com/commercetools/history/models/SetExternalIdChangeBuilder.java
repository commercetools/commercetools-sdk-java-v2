
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetExternalIdChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetExternalIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetExternalIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetExternalIdChangeBuilder nextValue(final String nextValue) {
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

    public SetExternalIdChange build() {
        return new SetExternalIdChangeImpl(change, previousValue, nextValue);
    }

    public static SetExternalIdChangeBuilder of() {
        return new SetExternalIdChangeBuilder();
    }

    public static SetExternalIdChangeBuilder of(final SetExternalIdChange template) {
        SetExternalIdChangeBuilder builder = new SetExternalIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
