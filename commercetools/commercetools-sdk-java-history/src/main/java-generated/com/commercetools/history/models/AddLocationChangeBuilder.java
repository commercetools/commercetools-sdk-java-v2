
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddLocationChangeBuilder {

    private String change;

    private com.commercetools.history.models.Location previousValue;

    private com.commercetools.history.models.Location nextValue;

    public AddLocationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddLocationChangeBuilder previousValue(final com.commercetools.history.models.Location previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddLocationChangeBuilder nextValue(final com.commercetools.history.models.Location nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.Location getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.Location getNextValue() {
        return this.nextValue;
    }

    public AddLocationChange build() {
        return new AddLocationChangeImpl(change, previousValue, nextValue);
    }

    public static AddLocationChangeBuilder of() {
        return new AddLocationChangeBuilder();
    }

    public static AddLocationChangeBuilder of(final AddLocationChange template) {
        AddLocationChangeBuilder builder = new AddLocationChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
