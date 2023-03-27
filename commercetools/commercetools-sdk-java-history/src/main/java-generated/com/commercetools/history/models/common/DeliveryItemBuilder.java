
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryItem deliveryItem = DeliveryItem.builder()
 *             .id("{id}")
 *             .quantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryItemBuilder implements Builder<DeliveryItem> {

    private String id;

    private Integer quantity;

    /**
     * set the value to the id
     * @param id value to be set
     * @return Builder
     */

    public DeliveryItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */

    public DeliveryItemBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * value of id}
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * value of quantity}
     * @return quantity
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * builds DeliveryItem with checking for non-null required values
     * @return DeliveryItem
     */
    public DeliveryItem build() {
        Objects.requireNonNull(id, DeliveryItem.class + ": id is missing");
        Objects.requireNonNull(quantity, DeliveryItem.class + ": quantity is missing");
        return new DeliveryItemImpl(id, quantity);
    }

    /**
     * builds DeliveryItem without checking for non-null required values
     * @return DeliveryItem
     */
    public DeliveryItem buildUnchecked() {
        return new DeliveryItemImpl(id, quantity);
    }

    /**
     * factory method for an instance of DeliveryItemBuilder
     * @return builder
     */
    public static DeliveryItemBuilder of() {
        return new DeliveryItemBuilder();
    }

    /**
     * create builder for DeliveryItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryItemBuilder of(final DeliveryItem template) {
        DeliveryItemBuilder builder = new DeliveryItemBuilder();
        builder.id = template.getId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
