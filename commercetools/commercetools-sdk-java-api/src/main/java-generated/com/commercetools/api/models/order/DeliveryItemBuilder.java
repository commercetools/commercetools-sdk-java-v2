
package com.commercetools.api.models.order;

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

    private Long quantity;

    /**
     <*  <p>Unique identifier of the DeliveryItem.</p>>
     */

    public DeliveryItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     <>
     */

    public DeliveryItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getQuantity() {
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
