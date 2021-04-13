
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeDescriptionChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public ChangeDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeDescriptionChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeDescriptionChangeBuilder nextValue(final String nextValue) {
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

    public ChangeDescriptionChange build() {
        return new ChangeDescriptionChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeDescriptionChangeBuilder of() {
        return new ChangeDescriptionChangeBuilder();
    }

    public static ChangeDescriptionChangeBuilder of(final ChangeDescriptionChange template) {
        ChangeDescriptionChangeBuilder builder = new ChangeDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
