
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomFieldChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomFieldChangedMessagePayload orderCustomFieldChangedMessagePayload = OrderCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomFieldChangedMessagePayloadBuilder implements Builder<OrderCustomFieldChangedMessagePayload> {

    private String name;

    private java.lang.Object value;

    @Nullable
    private java.lang.Object previousValue;

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     * @return Builder
     */

    public OrderCustomFieldChangedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @param value value to be set
     * @return Builder
     */

    public OrderCustomFieldChangedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Order before, an Order Custom Field Added Message is generated instead.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public OrderCustomFieldChangedMessagePayloadBuilder previousValue(@Nullable final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Order before, an Order Custom Field Added Message is generated instead.</p>
     * @return previousValue
     */

    @Nullable
    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds OrderCustomFieldChangedMessagePayload with checking for non-null required values
     * @return OrderCustomFieldChangedMessagePayload
     */
    public OrderCustomFieldChangedMessagePayload build() {
        Objects.requireNonNull(name, OrderCustomFieldChangedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, OrderCustomFieldChangedMessagePayload.class + ": value is missing");
        return new OrderCustomFieldChangedMessagePayloadImpl(name, value, previousValue);
    }

    /**
     * builds OrderCustomFieldChangedMessagePayload without checking for non-null required values
     * @return OrderCustomFieldChangedMessagePayload
     */
    public OrderCustomFieldChangedMessagePayload buildUnchecked() {
        return new OrderCustomFieldChangedMessagePayloadImpl(name, value, previousValue);
    }

    /**
     * factory method for an instance of OrderCustomFieldChangedMessagePayloadBuilder
     * @return builder
     */
    public static OrderCustomFieldChangedMessagePayloadBuilder of() {
        return new OrderCustomFieldChangedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomFieldChangedMessagePayloadBuilder of(
            final OrderCustomFieldChangedMessagePayload template) {
        OrderCustomFieldChangedMessagePayloadBuilder builder = new OrderCustomFieldChangedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
