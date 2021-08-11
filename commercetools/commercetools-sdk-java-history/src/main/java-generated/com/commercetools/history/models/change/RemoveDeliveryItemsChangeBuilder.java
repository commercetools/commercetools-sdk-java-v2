
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveDeliveryItemsChangeBuilder implements Builder<RemoveDeliveryItemsChange> {

    private String change;

    private com.commercetools.history.models.common.Delivery previousValue;

    public RemoveDeliveryItemsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveDeliveryItemsChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.DeliveryBuilder, com.commercetools.history.models.common.DeliveryBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DeliveryBuilder.of()).build();
        return this;
    }

    public RemoveDeliveryItemsChangeBuilder previousValue(
            final com.commercetools.history.models.common.Delivery previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Delivery getPreviousValue() {
        return this.previousValue;
    }

    public RemoveDeliveryItemsChange build() {
        Objects.requireNonNull(change, RemoveDeliveryItemsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveDeliveryItemsChange.class + ": previousValue is missing");
        return new RemoveDeliveryItemsChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveDeliveryItemsChange without checking for non null required values
     */
    public RemoveDeliveryItemsChange buildUnchecked() {
        return new RemoveDeliveryItemsChangeImpl(change, previousValue);
    }

    public static RemoveDeliveryItemsChangeBuilder of() {
        return new RemoveDeliveryItemsChangeBuilder();
    }

    public static RemoveDeliveryItemsChangeBuilder of(final RemoveDeliveryItemsChange template) {
        RemoveDeliveryItemsChangeBuilder builder = new RemoveDeliveryItemsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
