
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveLocationChangeBuilder {

    private String change;

    private com.commercetools.history.models.Location previousValue;

    private com.commercetools.history.models.Location nextValue;

    public RemoveLocationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveLocationChangeBuilder previousValue(final com.commercetools.history.models.Location previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveLocationChangeBuilder nextValue(final com.commercetools.history.models.Location nextValue) {
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

    public RemoveLocationChange build() {
        return new RemoveLocationChangeImpl(change, previousValue, nextValue);
    }

    public static RemoveLocationChangeBuilder of() {
        return new RemoveLocationChangeBuilder();
    }

    public static RemoveLocationChangeBuilder of(final RemoveLocationChange template) {
        RemoveLocationChangeBuilder builder = new RemoveLocationChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
