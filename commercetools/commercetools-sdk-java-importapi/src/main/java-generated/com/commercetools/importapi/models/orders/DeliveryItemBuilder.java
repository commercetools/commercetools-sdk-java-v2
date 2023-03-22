
package com.commercetools.importapi.models.orders;

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
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryItemBuilder implements Builder<DeliveryItem> {

    private String id;

    private Double quantity;

    /**
     *
     * @param id
     * @return Builder
     */

    public DeliveryItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @param quantity
     * @return Builder
     */

    public DeliveryItemBuilder quantity(final Double quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public DeliveryItem build() {
        Objects.requireNonNull(id, DeliveryItem.class + ": id is missing");
        Objects.requireNonNull(quantity, DeliveryItem.class + ": quantity is missing");
        return new DeliveryItemImpl(id, quantity);
    }

    /**
     * builds DeliveryItem without checking for non null required values
     */
    public DeliveryItem buildUnchecked() {
        return new DeliveryItemImpl(id, quantity);
    }

    public static DeliveryItemBuilder of() {
        return new DeliveryItemBuilder();
    }

    public static DeliveryItemBuilder of(final DeliveryItem template) {
        DeliveryItemBuilder builder = new DeliveryItemBuilder();
        builder.id = template.getId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
