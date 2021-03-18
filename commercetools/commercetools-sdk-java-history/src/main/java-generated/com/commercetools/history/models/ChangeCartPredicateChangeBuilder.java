
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeCartPredicateChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public ChangeCartPredicateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeCartPredicateChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeCartPredicateChangeBuilder nextValue(final String nextValue) {
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

    public ChangeCartPredicateChange build() {
        return new ChangeCartPredicateChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeCartPredicateChangeBuilder of() {
        return new ChangeCartPredicateChangeBuilder();
    }

    public static ChangeCartPredicateChangeBuilder of(final ChangeCartPredicateChange template) {
        ChangeCartPredicateChangeBuilder builder = new ChangeCartPredicateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
