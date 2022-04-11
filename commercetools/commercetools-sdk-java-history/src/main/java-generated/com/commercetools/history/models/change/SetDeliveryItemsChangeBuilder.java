
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SetDeliveryItemsChangeBuilder implements Builder<SetDeliveryItemsChange> {

    private String change;

    private String deliveryId;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> nextValue;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> previousValue;

    public SetDeliveryItemsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetDeliveryItemsChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public SetDeliveryItemsChangeBuilder nextValue(
            final com.commercetools.history.models.common.DeliveryItem... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetDeliveryItemsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.DeliveryItem> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetDeliveryItemsChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.DeliveryItem... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    public SetDeliveryItemsChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    public SetDeliveryItemsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    public SetDeliveryItemsChangeBuilder previousValue(
            final com.commercetools.history.models.common.DeliveryItem... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetDeliveryItemsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.DeliveryItem> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetDeliveryItemsChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.DeliveryItem... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    public SetDeliveryItemsChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    public SetDeliveryItemsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getPreviousValue() {
        return this.previousValue;
    }

    public SetDeliveryItemsChange build() {
        Objects.requireNonNull(change, SetDeliveryItemsChange.class + ": change is missing");
        Objects.requireNonNull(deliveryId, SetDeliveryItemsChange.class + ": deliveryId is missing");
        Objects.requireNonNull(nextValue, SetDeliveryItemsChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetDeliveryItemsChange.class + ": previousValue is missing");
        return new SetDeliveryItemsChangeImpl(change, deliveryId, nextValue, previousValue);
    }

    /**
     * builds SetDeliveryItemsChange without checking for non null required values
     */
    public SetDeliveryItemsChange buildUnchecked() {
        return new SetDeliveryItemsChangeImpl(change, deliveryId, nextValue, previousValue);
    }

    public static SetDeliveryItemsChangeBuilder of() {
        return new SetDeliveryItemsChangeBuilder();
    }

    public static SetDeliveryItemsChangeBuilder of(final SetDeliveryItemsChange template) {
        SetDeliveryItemsChangeBuilder builder = new SetDeliveryItemsChangeBuilder();
        builder.change = template.getChange();
        builder.deliveryId = template.getDeliveryId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
