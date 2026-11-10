
package com.commercetools.checkout.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderReference orderReference = OrderReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderReferenceBuilder implements Builder<OrderReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <span>Order</span>.</p>
     * @param id value to be set
     * @return Builder
     */

    public OrderReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <span>Order</span>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds OrderReference with checking for non-null required values
     * @return OrderReference
     */
    public OrderReference build() {
        Objects.requireNonNull(id, OrderReference.class + ": id is missing");
        return new OrderReferenceImpl(id);
    }

    /**
     * builds OrderReference without checking for non-null required values
     * @return OrderReference
     */
    public OrderReference buildUnchecked() {
        return new OrderReferenceImpl(id);
    }

    /**
     * factory method for an instance of OrderReferenceBuilder
     * @return builder
     */
    public static OrderReferenceBuilder of() {
        return new OrderReferenceBuilder();
    }

    /**
     * create builder for OrderReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderReferenceBuilder of(final OrderReference template) {
        OrderReferenceBuilder builder = new OrderReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
