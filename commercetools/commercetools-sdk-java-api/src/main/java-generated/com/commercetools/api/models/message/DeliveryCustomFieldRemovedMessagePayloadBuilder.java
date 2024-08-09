
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryCustomFieldRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryCustomFieldRemovedMessagePayload deliveryCustomFieldRemovedMessagePayload = DeliveryCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryCustomFieldRemovedMessagePayloadBuilder
        implements Builder<DeliveryCustomFieldRemovedMessagePayload> {

    private String name;

    private String deliveryId;

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public DeliveryCustomFieldRemovedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public DeliveryCustomFieldRemovedMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     * builds DeliveryCustomFieldRemovedMessagePayload with checking for non-null required values
     * @return DeliveryCustomFieldRemovedMessagePayload
     */
    public DeliveryCustomFieldRemovedMessagePayload build() {
        Objects.requireNonNull(name, DeliveryCustomFieldRemovedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(deliveryId, DeliveryCustomFieldRemovedMessagePayload.class + ": deliveryId is missing");
        return new DeliveryCustomFieldRemovedMessagePayloadImpl(name, deliveryId);
    }

    /**
     * builds DeliveryCustomFieldRemovedMessagePayload without checking for non-null required values
     * @return DeliveryCustomFieldRemovedMessagePayload
     */
    public DeliveryCustomFieldRemovedMessagePayload buildUnchecked() {
        return new DeliveryCustomFieldRemovedMessagePayloadImpl(name, deliveryId);
    }

    /**
     * factory method for an instance of DeliveryCustomFieldRemovedMessagePayloadBuilder
     * @return builder
     */
    public static DeliveryCustomFieldRemovedMessagePayloadBuilder of() {
        return new DeliveryCustomFieldRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for DeliveryCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryCustomFieldRemovedMessagePayloadBuilder of(
            final DeliveryCustomFieldRemovedMessagePayload template) {
        DeliveryCustomFieldRemovedMessagePayloadBuilder builder = new DeliveryCustomFieldRemovedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.deliveryId = template.getDeliveryId();
        return builder;
    }

}
