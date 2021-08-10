
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddOrderLineItemChangeBuilder implements Builder<AddOrderLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.LineItem previousValue;

    private com.commercetools.history.models.common.LineItem nextValue;

    public AddOrderLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddOrderLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.LineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddOrderLineItemChangeBuilder nextValue(final com.commercetools.history.models.common.LineItem nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LineItem getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.LineItem getNextValue() {
        return this.nextValue;
    }

    public AddOrderLineItemChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(previousValue);
        Objects.requireNonNull(nextValue);
        return new AddOrderLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds AddOrderLineItemChange without checking for non null required values
     */
    public AddOrderLineItemChange buildUnchecked() {
        return new AddOrderLineItemChangeImpl(change, previousValue, nextValue);
    }

    public static AddOrderLineItemChangeBuilder of() {
        return new AddOrderLineItemChangeBuilder();
    }

    public static AddOrderLineItemChangeBuilder of(final AddOrderLineItemChange template) {
        AddOrderLineItemChangeBuilder builder = new AddOrderLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
