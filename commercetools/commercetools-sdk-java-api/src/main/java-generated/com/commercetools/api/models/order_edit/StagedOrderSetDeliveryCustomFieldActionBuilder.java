
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetDeliveryCustomFieldActionBuilder
        implements Builder<StagedOrderSetDeliveryCustomFieldAction> {

    private String deliveryId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public StagedOrderSetDeliveryCustomFieldActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public StagedOrderSetDeliveryCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public StagedOrderSetDeliveryCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public StagedOrderSetDeliveryCustomFieldAction build() {
        Objects.requireNonNull(deliveryId, StagedOrderSetDeliveryCustomFieldAction.class + ": deliveryId is missing");
        Objects.requireNonNull(name, StagedOrderSetDeliveryCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetDeliveryCustomFieldActionImpl(deliveryId, name, value);
    }

    /**
     * builds StagedOrderSetDeliveryCustomFieldAction without checking for non null required values
     */
    public StagedOrderSetDeliveryCustomFieldAction buildUnchecked() {
        return new StagedOrderSetDeliveryCustomFieldActionImpl(deliveryId, name, value);
    }

    public static StagedOrderSetDeliveryCustomFieldActionBuilder of() {
        return new StagedOrderSetDeliveryCustomFieldActionBuilder();
    }

    public static StagedOrderSetDeliveryCustomFieldActionBuilder of(
            final StagedOrderSetDeliveryCustomFieldAction template) {
        StagedOrderSetDeliveryCustomFieldActionBuilder builder = new StagedOrderSetDeliveryCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
