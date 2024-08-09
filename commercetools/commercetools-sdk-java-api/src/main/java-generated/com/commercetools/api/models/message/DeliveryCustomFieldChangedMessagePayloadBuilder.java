
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryCustomFieldChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryCustomFieldChangedMessagePayload deliveryCustomFieldChangedMessagePayload = DeliveryCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryCustomFieldChangedMessagePayloadBuilder
        implements Builder<DeliveryCustomFieldChangedMessagePayload> {

    private String name;

    private java.lang.Object value;

    @Nullable
    private java.lang.Object previousValue;

    private String deliveryId;

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     * @return Builder
     */

    public DeliveryCustomFieldChangedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @param value value to be set
     * @return Builder
     */

    public DeliveryCustomFieldChangedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Delivery before, a Delivery Custom Field Added Message is generated instead.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public DeliveryCustomFieldChangedMessagePayloadBuilder previousValue(
            @Nullable final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public DeliveryCustomFieldChangedMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
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
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Delivery before, a Delivery Custom Field Added Message is generated instead.</p>
     * @return previousValue
     */

    @Nullable
    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     * builds DeliveryCustomFieldChangedMessagePayload with checking for non-null required values
     * @return DeliveryCustomFieldChangedMessagePayload
     */
    public DeliveryCustomFieldChangedMessagePayload build() {
        Objects.requireNonNull(name, DeliveryCustomFieldChangedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, DeliveryCustomFieldChangedMessagePayload.class + ": value is missing");
        Objects.requireNonNull(deliveryId, DeliveryCustomFieldChangedMessagePayload.class + ": deliveryId is missing");
        return new DeliveryCustomFieldChangedMessagePayloadImpl(name, value, previousValue, deliveryId);
    }

    /**
     * builds DeliveryCustomFieldChangedMessagePayload without checking for non-null required values
     * @return DeliveryCustomFieldChangedMessagePayload
     */
    public DeliveryCustomFieldChangedMessagePayload buildUnchecked() {
        return new DeliveryCustomFieldChangedMessagePayloadImpl(name, value, previousValue, deliveryId);
    }

    /**
     * factory method for an instance of DeliveryCustomFieldChangedMessagePayloadBuilder
     * @return builder
     */
    public static DeliveryCustomFieldChangedMessagePayloadBuilder of() {
        return new DeliveryCustomFieldChangedMessagePayloadBuilder();
    }

    /**
     * create builder for DeliveryCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryCustomFieldChangedMessagePayloadBuilder of(
            final DeliveryCustomFieldChangedMessagePayload template) {
        DeliveryCustomFieldChangedMessagePayloadBuilder builder = new DeliveryCustomFieldChangedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.previousValue = template.getPreviousValue();
        builder.deliveryId = template.getDeliveryId();
        return builder;
    }

}
