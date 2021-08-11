
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeRequiresDiscountCodeChangeBuilder implements Builder<ChangeRequiresDiscountCodeChange> {

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
        Objects.requireNonNull(change, ChangeRequiresDiscountCodeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeRequiresDiscountCodeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeRequiresDiscountCodeChange.class + ": nextValue is missing");
        return new ChangeRequiresDiscountCodeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeRequiresDiscountCodeChange without checking for non null required values
     */
    public ChangeRequiresDiscountCodeChange buildUnchecked() {
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
