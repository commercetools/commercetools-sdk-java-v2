
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetDescriptionChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetDescriptionChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetDescriptionChangeBuilder nextValue(final String nextValue) {
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

    public SetDescriptionChange build() {
        return new SetDescriptionChangeImpl(change, previousValue, nextValue);
    }

    public static SetDescriptionChangeBuilder of() {
        return new SetDescriptionChangeBuilder();
    }

    public static SetDescriptionChangeBuilder of(final SetDescriptionChange template) {
        SetDescriptionChangeBuilder builder = new SetDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
