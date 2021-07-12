
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetShippingAddressCustomFieldActionBuilder {

    private String name;

    @Nullable
    private java.lang.Object value;

    public StagedOrderSetShippingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public StagedOrderSetShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public StagedOrderSetShippingAddressCustomFieldAction build() {
        return new StagedOrderSetShippingAddressCustomFieldActionImpl(name, value);
    }

    public static StagedOrderSetShippingAddressCustomFieldActionBuilder of() {
        return new StagedOrderSetShippingAddressCustomFieldActionBuilder();
    }

    public static StagedOrderSetShippingAddressCustomFieldActionBuilder of(
            final StagedOrderSetShippingAddressCustomFieldAction template) {
        StagedOrderSetShippingAddressCustomFieldActionBuilder builder = new StagedOrderSetShippingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
