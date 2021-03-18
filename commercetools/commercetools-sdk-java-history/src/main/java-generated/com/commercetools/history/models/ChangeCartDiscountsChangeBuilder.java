
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeCartDiscountsChangeBuilder {

    private String change;

    private java.util.List<com.commercetools.history.models.Reference> previousValue;

    private java.util.List<com.commercetools.history.models.Reference> nextValue;

    public ChangeCartDiscountsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeCartDiscountsChangeBuilder previousValue(
            final com.commercetools.history.models.Reference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public ChangeCartDiscountsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.Reference> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeCartDiscountsChangeBuilder nextValue(final com.commercetools.history.models.Reference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public ChangeCartDiscountsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.Reference> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.Reference> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.Reference> getNextValue() {
        return this.nextValue;
    }

    public ChangeCartDiscountsChange build() {
        return new ChangeCartDiscountsChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeCartDiscountsChangeBuilder of() {
        return new ChangeCartDiscountsChangeBuilder();
    }

    public static ChangeCartDiscountsChangeBuilder of(final ChangeCartDiscountsChange template) {
        ChangeCartDiscountsChangeBuilder builder = new ChangeCartDiscountsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
