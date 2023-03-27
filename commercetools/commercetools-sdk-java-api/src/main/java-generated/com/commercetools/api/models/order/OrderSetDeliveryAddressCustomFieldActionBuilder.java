
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetDeliveryAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryAddressCustomFieldAction orderSetDeliveryAddressCustomFieldAction = OrderSetDeliveryAddressCustomFieldAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetDeliveryAddressCustomFieldActionBuilder
        implements Builder<OrderSetDeliveryAddressCustomFieldAction> {

    private String deliveryId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     * set the value to the deliveryId
     * @param deliveryId value to be set
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomFieldActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     * value of deliveryId}
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds OrderSetDeliveryAddressCustomFieldAction with checking for non-null required values
     * @return OrderSetDeliveryAddressCustomFieldAction
     */
    public OrderSetDeliveryAddressCustomFieldAction build() {
        Objects.requireNonNull(deliveryId, OrderSetDeliveryAddressCustomFieldAction.class + ": deliveryId is missing");
        Objects.requireNonNull(name, OrderSetDeliveryAddressCustomFieldAction.class + ": name is missing");
        return new OrderSetDeliveryAddressCustomFieldActionImpl(deliveryId, name, value);
    }

    /**
     * builds OrderSetDeliveryAddressCustomFieldAction without checking for non-null required values
     * @return OrderSetDeliveryAddressCustomFieldAction
     */
    public OrderSetDeliveryAddressCustomFieldAction buildUnchecked() {
        return new OrderSetDeliveryAddressCustomFieldActionImpl(deliveryId, name, value);
    }

    /**
     * factory method for an instance of OrderSetDeliveryAddressCustomFieldActionBuilder
     * @return builder
     */
    public static OrderSetDeliveryAddressCustomFieldActionBuilder of() {
        return new OrderSetDeliveryAddressCustomFieldActionBuilder();
    }

    /**
     * create builder for OrderSetDeliveryAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetDeliveryAddressCustomFieldActionBuilder of(
            final OrderSetDeliveryAddressCustomFieldAction template) {
        OrderSetDeliveryAddressCustomFieldActionBuilder builder = new OrderSetDeliveryAddressCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
