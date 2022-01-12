
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetDeliveryCustomFieldActionBuilder
        implements Builder<StagedOrderSetDeliveryCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public StagedOrderSetDeliveryCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public StagedOrderSetDeliveryCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public StagedOrderSetDeliveryCustomFieldAction build() {
        Objects.requireNonNull(name, StagedOrderSetDeliveryCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetDeliveryCustomFieldActionImpl(name, value);
    }

    /**
     * builds StagedOrderSetDeliveryCustomFieldAction without checking for non null required values
     */
    public StagedOrderSetDeliveryCustomFieldAction buildUnchecked() {
        return new StagedOrderSetDeliveryCustomFieldActionImpl(name, value);
    }

    public static StagedOrderSetDeliveryCustomFieldActionBuilder of() {
        return new StagedOrderSetDeliveryCustomFieldActionBuilder();
    }

    public static StagedOrderSetDeliveryCustomFieldActionBuilder of(
            final StagedOrderSetDeliveryCustomFieldAction template) {
        StagedOrderSetDeliveryCustomFieldActionBuilder builder = new StagedOrderSetDeliveryCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
