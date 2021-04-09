
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCompanyNameChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetCompanyNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCompanyNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetCompanyNameChangeBuilder nextValue(final String nextValue) {
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

    public SetCompanyNameChange build() {
        return new SetCompanyNameChangeImpl(change, previousValue, nextValue);
    }

    public static SetCompanyNameChangeBuilder of() {
        return new SetCompanyNameChangeBuilder();
    }

    public static SetCompanyNameChangeBuilder of(final SetCompanyNameChange template) {
        SetCompanyNameChangeBuilder builder = new SetCompanyNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
