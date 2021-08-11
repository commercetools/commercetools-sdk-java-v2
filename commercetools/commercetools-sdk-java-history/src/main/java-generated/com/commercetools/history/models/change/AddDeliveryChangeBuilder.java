
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddDeliveryChangeBuilder implements Builder<AddDeliveryChange> {

    private String change;

    private com.commercetools.history.models.change_value.DeliveryChangeValue nextValue;

    private com.commercetools.history.models.change_value.DeliveryChangeValue previousValue;

    public AddDeliveryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddDeliveryChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.DeliveryChangeValueBuilder, com.commercetools.history.models.change_value.DeliveryChangeValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.DeliveryChangeValueBuilder.of())
                .build();
        return this;
    }

    public AddDeliveryChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.DeliveryChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddDeliveryChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.DeliveryChangeValueBuilder, com.commercetools.history.models.change_value.DeliveryChangeValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.DeliveryChangeValueBuilder.of())
                .build();
        return this;
    }

    public AddDeliveryChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.DeliveryChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.DeliveryChangeValue getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.change_value.DeliveryChangeValue getPreviousValue() {
        return this.previousValue;
    }

    public AddDeliveryChange build() {
        Objects.requireNonNull(change, AddDeliveryChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddDeliveryChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, AddDeliveryChange.class + ": previousValue is missing");
        return new AddDeliveryChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds AddDeliveryChange without checking for non null required values
     */
    public AddDeliveryChange buildUnchecked() {
        return new AddDeliveryChangeImpl(change, nextValue, previousValue);
    }

    public static AddDeliveryChangeBuilder of() {
        return new AddDeliveryChangeBuilder();
    }

    public static AddDeliveryChangeBuilder of(final AddDeliveryChange template) {
        AddDeliveryChangeBuilder builder = new AddDeliveryChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
