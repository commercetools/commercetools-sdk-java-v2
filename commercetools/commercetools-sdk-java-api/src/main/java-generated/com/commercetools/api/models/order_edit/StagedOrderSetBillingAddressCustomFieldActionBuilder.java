
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetBillingAddressCustomFieldActionBuilder
        implements Builder<StagedOrderSetBillingAddressCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public StagedOrderSetBillingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public StagedOrderSetBillingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public StagedOrderSetBillingAddressCustomFieldAction build() {
        Objects.requireNonNull(name, StagedOrderSetBillingAddressCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetBillingAddressCustomFieldActionImpl(name, value);
    }

    /**
     * builds StagedOrderSetBillingAddressCustomFieldAction without checking for non null required values
     */
    public StagedOrderSetBillingAddressCustomFieldAction buildUnchecked() {
        return new StagedOrderSetBillingAddressCustomFieldActionImpl(name, value);
    }

    public static StagedOrderSetBillingAddressCustomFieldActionBuilder of() {
        return new StagedOrderSetBillingAddressCustomFieldActionBuilder();
    }

    public static StagedOrderSetBillingAddressCustomFieldActionBuilder of(
            final StagedOrderSetBillingAddressCustomFieldAction template) {
        StagedOrderSetBillingAddressCustomFieldActionBuilder builder = new StagedOrderSetBillingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
