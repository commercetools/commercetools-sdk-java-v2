
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderSetBillingAddressCustomFieldActionBuilder
        implements Builder<OrderSetBillingAddressCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
    *  <p>Name of the Custom Field.</p>
    */

    public OrderSetBillingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
    */

    public OrderSetBillingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public OrderSetBillingAddressCustomFieldAction build() {
        Objects.requireNonNull(name, OrderSetBillingAddressCustomFieldAction.class + ": name is missing");
        return new OrderSetBillingAddressCustomFieldActionImpl(name, value);
    }

    /**
     * builds OrderSetBillingAddressCustomFieldAction without checking for non null required values
     */
    public OrderSetBillingAddressCustomFieldAction buildUnchecked() {
        return new OrderSetBillingAddressCustomFieldActionImpl(name, value);
    }

    public static OrderSetBillingAddressCustomFieldActionBuilder of() {
        return new OrderSetBillingAddressCustomFieldActionBuilder();
    }

    public static OrderSetBillingAddressCustomFieldActionBuilder of(
            final OrderSetBillingAddressCustomFieldAction template) {
        OrderSetBillingAddressCustomFieldActionBuilder builder = new OrderSetBillingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
