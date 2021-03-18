
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddAddressChangeBuilder {

    private String change;

    private com.commercetools.history.models.Address nextValue;

    private com.commercetools.history.models.Address previousValue;

    public AddAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddAddressChangeBuilder nextValue(final com.commercetools.history.models.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddAddressChangeBuilder previousValue(final com.commercetools.history.models.Address previousValue) {
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

    public AddAddressChange build() {
        return new AddAddressChangeImpl(change, nextValue, previousValue);
    }

    public static AddAddressChangeBuilder of() {
        return new AddAddressChangeBuilder();
    }

    public static AddAddressChangeBuilder of(final AddAddressChange template) {
        AddAddressChangeBuilder builder = new AddAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
