
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeRequiresDiscountCodeChangeBuilder {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    public ChangeRequiresDiscountCodeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeRequiresDiscountCodeChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeRequiresDiscountCodeChangeBuilder nextValue(final Boolean nextValue) {
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

    public ChangeRequiresDiscountCodeChange build() {
        return new ChangeRequiresDiscountCodeChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeRequiresDiscountCodeChangeBuilder of() {
        return new ChangeRequiresDiscountCodeChangeBuilder();
    }

    public static ChangeRequiresDiscountCodeChangeBuilder of(final ChangeRequiresDiscountCodeChange template) {
        ChangeRequiresDiscountCodeChangeBuilder builder = new ChangeRequiresDiscountCodeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
