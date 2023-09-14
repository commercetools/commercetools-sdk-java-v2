
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomFieldAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomFieldAddedMessagePayload orderCustomFieldAddedMessagePayload = OrderCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomFieldAddedMessagePayloadBuilder implements Builder<OrderCustomFieldAddedMessagePayload> {

    private String name;

    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field that has been added.</p>
     * @param name value to be set
     * @return Builder
     */

    public OrderCustomFieldAddedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     * @return Builder
     */

    public OrderCustomFieldAddedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that has been added.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds OrderCustomFieldAddedMessagePayload with checking for non-null required values
     * @return OrderCustomFieldAddedMessagePayload
     */
    public OrderCustomFieldAddedMessagePayload build() {
        Objects.requireNonNull(name, OrderCustomFieldAddedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, OrderCustomFieldAddedMessagePayload.class + ": value is missing");
        return new OrderCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * builds OrderCustomFieldAddedMessagePayload without checking for non-null required values
     * @return OrderCustomFieldAddedMessagePayload
     */
    public OrderCustomFieldAddedMessagePayload buildUnchecked() {
        return new OrderCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * factory method for an instance of OrderCustomFieldAddedMessagePayloadBuilder
     * @return builder
     */
    public static OrderCustomFieldAddedMessagePayloadBuilder of() {
        return new OrderCustomFieldAddedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomFieldAddedMessagePayloadBuilder of(final OrderCustomFieldAddedMessagePayload template) {
        OrderCustomFieldAddedMessagePayloadBuilder builder = new OrderCustomFieldAddedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
