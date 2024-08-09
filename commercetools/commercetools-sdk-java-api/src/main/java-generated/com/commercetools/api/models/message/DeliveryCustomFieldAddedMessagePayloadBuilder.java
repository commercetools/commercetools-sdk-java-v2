
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryCustomFieldAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryCustomFieldAddedMessagePayload deliveryCustomFieldAddedMessagePayload = DeliveryCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryCustomFieldAddedMessagePayloadBuilder implements Builder<DeliveryCustomFieldAddedMessagePayload> {

    private String name;

    private java.lang.Object value;

    private String deliveryId;

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     * @return Builder
     */

    public DeliveryCustomFieldAddedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     * @return Builder
     */

    public DeliveryCustomFieldAddedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public DeliveryCustomFieldAddedMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that was added.</p>
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
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     * builds DeliveryCustomFieldAddedMessagePayload with checking for non-null required values
     * @return DeliveryCustomFieldAddedMessagePayload
     */
    public DeliveryCustomFieldAddedMessagePayload build() {
        Objects.requireNonNull(name, DeliveryCustomFieldAddedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, DeliveryCustomFieldAddedMessagePayload.class + ": value is missing");
        Objects.requireNonNull(deliveryId, DeliveryCustomFieldAddedMessagePayload.class + ": deliveryId is missing");
        return new DeliveryCustomFieldAddedMessagePayloadImpl(name, value, deliveryId);
    }

    /**
     * builds DeliveryCustomFieldAddedMessagePayload without checking for non-null required values
     * @return DeliveryCustomFieldAddedMessagePayload
     */
    public DeliveryCustomFieldAddedMessagePayload buildUnchecked() {
        return new DeliveryCustomFieldAddedMessagePayloadImpl(name, value, deliveryId);
    }

    /**
     * factory method for an instance of DeliveryCustomFieldAddedMessagePayloadBuilder
     * @return builder
     */
    public static DeliveryCustomFieldAddedMessagePayloadBuilder of() {
        return new DeliveryCustomFieldAddedMessagePayloadBuilder();
    }

    /**
     * create builder for DeliveryCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryCustomFieldAddedMessagePayloadBuilder of(
            final DeliveryCustomFieldAddedMessagePayload template) {
        DeliveryCustomFieldAddedMessagePayloadBuilder builder = new DeliveryCustomFieldAddedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.deliveryId = template.getDeliveryId();
        return builder;
    }

}
