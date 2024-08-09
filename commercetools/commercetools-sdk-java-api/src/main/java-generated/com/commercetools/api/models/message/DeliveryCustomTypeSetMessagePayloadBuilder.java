
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryCustomTypeSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryCustomTypeSetMessagePayload deliveryCustomTypeSetMessagePayload = DeliveryCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryCustomTypeSetMessagePayloadBuilder implements Builder<DeliveryCustomTypeSetMessagePayload> {

    private com.commercetools.api.models.type.CustomFields customFields;

    @Nullable
    private String previousTypeId;

    private String deliveryId;

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public DeliveryCustomTypeSetMessagePayloadBuilder customFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public DeliveryCustomTypeSetMessagePayloadBuilder withCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param customFields value to be set
     * @return Builder
     */

    public DeliveryCustomTypeSetMessagePayloadBuilder customFields(
            final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
        return this;
    }

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     * @return Builder
     */

    public DeliveryCustomTypeSetMessagePayloadBuilder previousTypeId(@Nullable final String previousTypeId) {
        this.previousTypeId = previousTypeId;
        return this;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public DeliveryCustomTypeSetMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @return customFields
     */

    public com.commercetools.api.models.type.CustomFields getCustomFields() {
        return this.customFields;
    }

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @Nullable
    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     * builds DeliveryCustomTypeSetMessagePayload with checking for non-null required values
     * @return DeliveryCustomTypeSetMessagePayload
     */
    public DeliveryCustomTypeSetMessagePayload build() {
        Objects.requireNonNull(customFields, DeliveryCustomTypeSetMessagePayload.class + ": customFields is missing");
        Objects.requireNonNull(deliveryId, DeliveryCustomTypeSetMessagePayload.class + ": deliveryId is missing");
        return new DeliveryCustomTypeSetMessagePayloadImpl(customFields, previousTypeId, deliveryId);
    }

    /**
     * builds DeliveryCustomTypeSetMessagePayload without checking for non-null required values
     * @return DeliveryCustomTypeSetMessagePayload
     */
    public DeliveryCustomTypeSetMessagePayload buildUnchecked() {
        return new DeliveryCustomTypeSetMessagePayloadImpl(customFields, previousTypeId, deliveryId);
    }

    /**
     * factory method for an instance of DeliveryCustomTypeSetMessagePayloadBuilder
     * @return builder
     */
    public static DeliveryCustomTypeSetMessagePayloadBuilder of() {
        return new DeliveryCustomTypeSetMessagePayloadBuilder();
    }

    /**
     * create builder for DeliveryCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryCustomTypeSetMessagePayloadBuilder of(final DeliveryCustomTypeSetMessagePayload template) {
        DeliveryCustomTypeSetMessagePayloadBuilder builder = new DeliveryCustomTypeSetMessagePayloadBuilder();
        builder.customFields = template.getCustomFields();
        builder.previousTypeId = template.getPreviousTypeId();
        builder.deliveryId = template.getDeliveryId();
        return builder;
    }

}
