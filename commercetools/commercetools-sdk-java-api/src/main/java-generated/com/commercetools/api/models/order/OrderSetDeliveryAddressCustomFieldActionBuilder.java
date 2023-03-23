
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
     *
     * @param deliveryId
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomFieldActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public OrderSetDeliveryAddressCustomFieldAction build() {
        Objects.requireNonNull(deliveryId, OrderSetDeliveryAddressCustomFieldAction.class + ": deliveryId is missing");
        Objects.requireNonNull(name, OrderSetDeliveryAddressCustomFieldAction.class + ": name is missing");
        return new OrderSetDeliveryAddressCustomFieldActionImpl(deliveryId, name, value);
    }

    /**
     * builds OrderSetDeliveryAddressCustomFieldAction without checking for non null required values
     */
    public OrderSetDeliveryAddressCustomFieldAction buildUnchecked() {
        return new OrderSetDeliveryAddressCustomFieldActionImpl(deliveryId, name, value);
    }

    public static OrderSetDeliveryAddressCustomFieldActionBuilder of() {
        return new OrderSetDeliveryAddressCustomFieldActionBuilder();
    }

    public static OrderSetDeliveryAddressCustomFieldActionBuilder of(
            final OrderSetDeliveryAddressCustomFieldAction template) {
        OrderSetDeliveryAddressCustomFieldActionBuilder builder = new OrderSetDeliveryAddressCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
