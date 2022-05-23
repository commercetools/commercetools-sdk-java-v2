
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CartSetDeliveryAddressCustomFieldAction cartSetDeliveryAddressCustomFieldAction = CartSetDeliveryAddressCustomFieldAction.builder()
           .deliveryId("{deliveryId}")
           .name("{name}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetDeliveryAddressCustomFieldActionBuilder
        implements Builder<CartSetDeliveryAddressCustomFieldAction> {

    private String deliveryId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public CartSetDeliveryAddressCustomFieldActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public CartSetDeliveryAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public CartSetDeliveryAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public CartSetDeliveryAddressCustomFieldAction build() {
        Objects.requireNonNull(deliveryId, CartSetDeliveryAddressCustomFieldAction.class + ": deliveryId is missing");
        Objects.requireNonNull(name, CartSetDeliveryAddressCustomFieldAction.class + ": name is missing");
        return new CartSetDeliveryAddressCustomFieldActionImpl(deliveryId, name, value);
    }

    /**
     * builds CartSetDeliveryAddressCustomFieldAction without checking for non null required values
     */
    public CartSetDeliveryAddressCustomFieldAction buildUnchecked() {
        return new CartSetDeliveryAddressCustomFieldActionImpl(deliveryId, name, value);
    }

    public static CartSetDeliveryAddressCustomFieldActionBuilder of() {
        return new CartSetDeliveryAddressCustomFieldActionBuilder();
    }

    public static CartSetDeliveryAddressCustomFieldActionBuilder of(
            final CartSetDeliveryAddressCustomFieldAction template) {
        CartSetDeliveryAddressCustomFieldActionBuilder builder = new CartSetDeliveryAddressCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
