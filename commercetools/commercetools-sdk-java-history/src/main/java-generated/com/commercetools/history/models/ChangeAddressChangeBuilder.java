
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeAddressChangeBuilder {

    private String change;

    private com.commercetools.history.models.Address nextValue;

    private com.commercetools.history.models.Address previousValue;

    public ChangeAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeAddressChangeBuilder nextValue(final com.commercetools.history.models.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeAddressChangeBuilder previousValue(final com.commercetools.history.models.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.Address getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.Address getPreviousValue() {
        return this.previousValue;
    }

    public ChangeAddressChange build() {
        return new ChangeAddressChangeImpl(change, nextValue, previousValue);
    }

    public static ChangeAddressChangeBuilder of() {
        return new ChangeAddressChangeBuilder();
    }

    public static ChangeAddressChangeBuilder of(final ChangeAddressChange template) {
        ChangeAddressChangeBuilder builder = new ChangeAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
