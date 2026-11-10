
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryCustomTypeRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryCustomTypeRemovedMessagePayload deliveryCustomTypeRemovedMessagePayload = DeliveryCustomTypeRemovedMessagePayload.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryCustomTypeRemovedMessagePayloadBuilder
        implements Builder<DeliveryCustomTypeRemovedMessagePayload> {

    @Nullable
    private String previousTypeId;

    private String deliveryId;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     * @return Builder
     */

    public DeliveryCustomTypeRemovedMessagePayloadBuilder previousTypeId(@Nullable final String previousTypeId) {
        this.previousTypeId = previousTypeId;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public DeliveryCustomTypeRemovedMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @Nullable
    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     * builds DeliveryCustomTypeRemovedMessagePayload with checking for non-null required values
     * @return DeliveryCustomTypeRemovedMessagePayload
     */
    public DeliveryCustomTypeRemovedMessagePayload build() {
        Objects.requireNonNull(deliveryId, DeliveryCustomTypeRemovedMessagePayload.class + ": deliveryId is missing");
        return new DeliveryCustomTypeRemovedMessagePayloadImpl(previousTypeId, deliveryId);
    }

    /**
     * builds DeliveryCustomTypeRemovedMessagePayload without checking for non-null required values
     * @return DeliveryCustomTypeRemovedMessagePayload
     */
    public DeliveryCustomTypeRemovedMessagePayload buildUnchecked() {
        return new DeliveryCustomTypeRemovedMessagePayloadImpl(previousTypeId, deliveryId);
    }

    /**
     * factory method for an instance of DeliveryCustomTypeRemovedMessagePayloadBuilder
     * @return builder
     */
    public static DeliveryCustomTypeRemovedMessagePayloadBuilder of() {
        return new DeliveryCustomTypeRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for DeliveryCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryCustomTypeRemovedMessagePayloadBuilder of(
            final DeliveryCustomTypeRemovedMessagePayload template) {
        DeliveryCustomTypeRemovedMessagePayloadBuilder builder = new DeliveryCustomTypeRemovedMessagePayloadBuilder();
        builder.previousTypeId = template.getPreviousTypeId();
        builder.deliveryId = template.getDeliveryId();
        return builder;
    }

}
