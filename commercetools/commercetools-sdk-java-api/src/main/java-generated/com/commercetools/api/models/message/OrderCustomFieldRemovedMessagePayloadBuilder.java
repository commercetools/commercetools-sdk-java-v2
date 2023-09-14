
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomFieldRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomFieldRemovedMessagePayload orderCustomFieldRemovedMessagePayload = OrderCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomFieldRemovedMessagePayloadBuilder implements Builder<OrderCustomFieldRemovedMessagePayload> {

    private String name;

    /**
     *  <p>Name of the Custom Field that has been removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public OrderCustomFieldRemovedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that has been removed.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds OrderCustomFieldRemovedMessagePayload with checking for non-null required values
     * @return OrderCustomFieldRemovedMessagePayload
     */
    public OrderCustomFieldRemovedMessagePayload build() {
        Objects.requireNonNull(name, OrderCustomFieldRemovedMessagePayload.class + ": name is missing");
        return new OrderCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * builds OrderCustomFieldRemovedMessagePayload without checking for non-null required values
     * @return OrderCustomFieldRemovedMessagePayload
     */
    public OrderCustomFieldRemovedMessagePayload buildUnchecked() {
        return new OrderCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * factory method for an instance of OrderCustomFieldRemovedMessagePayloadBuilder
     * @return builder
     */
    public static OrderCustomFieldRemovedMessagePayloadBuilder of() {
        return new OrderCustomFieldRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomFieldRemovedMessagePayloadBuilder of(
            final OrderCustomFieldRemovedMessagePayload template) {
        OrderCustomFieldRemovedMessagePayloadBuilder builder = new OrderCustomFieldRemovedMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
