
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetDeliveryItemsChangeBuilder implements Builder<SetDeliveryItemsChange> {

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
        Objects.requireNonNull(change);
        Objects.requireNonNull(deliveryId);
        Objects.requireNonNull(nextValue);
        Objects.requireNonNull(previousValue);
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
