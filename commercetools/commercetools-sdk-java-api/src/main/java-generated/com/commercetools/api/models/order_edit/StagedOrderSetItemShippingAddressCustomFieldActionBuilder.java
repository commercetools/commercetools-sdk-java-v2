
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetItemShippingAddressCustomFieldActionBuilder
        implements Builder<StagedOrderSetItemShippingAddressCustomFieldAction> {

    private String addressKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    public StagedOrderSetItemShippingAddressCustomFieldActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public StagedOrderSetItemShippingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public StagedOrderSetItemShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public StagedOrderSetItemShippingAddressCustomFieldAction build() {
        Objects.requireNonNull(addressKey,
            StagedOrderSetItemShippingAddressCustomFieldAction.class + ": addressKey is missing");
        Objects.requireNonNull(name, StagedOrderSetItemShippingAddressCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    /**
     * builds StagedOrderSetItemShippingAddressCustomFieldAction without checking for non null required values
     */
    public StagedOrderSetItemShippingAddressCustomFieldAction buildUnchecked() {
        return new StagedOrderSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    public static StagedOrderSetItemShippingAddressCustomFieldActionBuilder of() {
        return new StagedOrderSetItemShippingAddressCustomFieldActionBuilder();
    }

    public static StagedOrderSetItemShippingAddressCustomFieldActionBuilder of(
            final StagedOrderSetItemShippingAddressCustomFieldAction template) {
        StagedOrderSetItemShippingAddressCustomFieldActionBuilder builder = new StagedOrderSetItemShippingAddressCustomFieldActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
