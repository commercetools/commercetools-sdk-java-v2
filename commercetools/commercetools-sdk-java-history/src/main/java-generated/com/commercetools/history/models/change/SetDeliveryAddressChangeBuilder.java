
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetDeliveryAddressChangeBuilder implements Builder<SetDeliveryAddressChange> {

    private String change;

    private String deliveryId;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    public SetDeliveryAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetDeliveryAddressChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public SetDeliveryAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public SetDeliveryAddressChangeBuilder nextValue(final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetDeliveryAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public SetDeliveryAddressChangeBuilder previousValue(
            final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.history.models.common.Address getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Address getPreviousValue() {
        return this.previousValue;
    }

    public SetDeliveryAddressChange build() {
        Objects.requireNonNull(change, SetDeliveryAddressChange.class + ": change is missing");
        Objects.requireNonNull(deliveryId, SetDeliveryAddressChange.class + ": deliveryId is missing");
        Objects.requireNonNull(nextValue, SetDeliveryAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetDeliveryAddressChange.class + ": previousValue is missing");
        return new SetDeliveryAddressChangeImpl(change, deliveryId, nextValue, previousValue);
    }

    /**
     * builds SetDeliveryAddressChange without checking for non null required values
     */
    public SetDeliveryAddressChange buildUnchecked() {
        return new SetDeliveryAddressChangeImpl(change, deliveryId, nextValue, previousValue);
    }

    public static SetDeliveryAddressChangeBuilder of() {
        return new SetDeliveryAddressChangeBuilder();
    }

    public static SetDeliveryAddressChangeBuilder of(final SetDeliveryAddressChange template) {
        SetDeliveryAddressChangeBuilder builder = new SetDeliveryAddressChangeBuilder();
        builder.change = template.getChange();
        builder.deliveryId = template.getDeliveryId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
