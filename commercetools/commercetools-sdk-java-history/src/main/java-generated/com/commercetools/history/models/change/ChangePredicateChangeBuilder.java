
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangePredicateChangeBuilder implements Builder<ChangePredicateChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    public ChangePredicateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangePredicateChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangePredicateChangeBuilder nextValue(final String nextValue) {
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

    public ChangePredicateChange build() {
        Objects.requireNonNull(change, ChangePredicateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangePredicateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangePredicateChange.class + ": nextValue is missing");
        return new ChangePredicateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangePredicateChange without checking for non null required values
     */
    public ChangePredicateChange buildUnchecked() {
        return new ChangePredicateChangeImpl(change, previousValue, nextValue);
    }

    public static ChangePredicateChangeBuilder of() {
        return new ChangePredicateChangeBuilder();
    }

    public static ChangePredicateChangeBuilder of(final ChangePredicateChange template) {
        ChangePredicateChangeBuilder builder = new ChangePredicateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
