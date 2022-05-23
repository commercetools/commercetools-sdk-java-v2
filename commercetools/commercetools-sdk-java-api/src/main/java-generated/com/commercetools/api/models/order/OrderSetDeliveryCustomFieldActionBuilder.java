
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   OrderSetDeliveryCustomFieldAction orderSetDeliveryCustomFieldAction = OrderSetDeliveryCustomFieldAction.builder()
           .deliveryId("{deliveryId}")
           .name("{name}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetDeliveryCustomFieldActionBuilder implements Builder<OrderSetDeliveryCustomFieldAction> {

    private String deliveryId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public OrderSetDeliveryCustomFieldActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public OrderSetDeliveryCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public OrderSetDeliveryCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public OrderSetDeliveryCustomFieldAction build() {
        Objects.requireNonNull(deliveryId, OrderSetDeliveryCustomFieldAction.class + ": deliveryId is missing");
        Objects.requireNonNull(name, OrderSetDeliveryCustomFieldAction.class + ": name is missing");
        return new OrderSetDeliveryCustomFieldActionImpl(deliveryId, name, value);
    }

    /**
     * builds OrderSetDeliveryCustomFieldAction without checking for non null required values
     */
    public OrderSetDeliveryCustomFieldAction buildUnchecked() {
        return new OrderSetDeliveryCustomFieldActionImpl(deliveryId, name, value);
    }

    public static OrderSetDeliveryCustomFieldActionBuilder of() {
        return new OrderSetDeliveryCustomFieldActionBuilder();
    }

    public static OrderSetDeliveryCustomFieldActionBuilder of(final OrderSetDeliveryCustomFieldAction template) {
        OrderSetDeliveryCustomFieldActionBuilder builder = new OrderSetDeliveryCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
