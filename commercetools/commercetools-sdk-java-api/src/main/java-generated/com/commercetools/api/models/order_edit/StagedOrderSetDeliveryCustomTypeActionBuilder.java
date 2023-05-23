
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDeliveryCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryCustomTypeAction stagedOrderSetDeliveryCustomTypeAction = StagedOrderSetDeliveryCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetDeliveryCustomTypeActionBuilder implements Builder<StagedOrderSetDeliveryCustomTypeAction> {

    @Nullable
    private String deliveryId;

    @Nullable
    private String deliveryKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryCustomTypeActionBuilder deliveryId(@Nullable final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryKey value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryCustomTypeActionBuilder deliveryKey(@Nullable final String deliveryKey) {
        this.deliveryKey = deliveryKey;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedOrderSetDeliveryCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedOrderSetDeliveryCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
     * @param type value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Delivery.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedOrderSetDeliveryCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Delivery.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedOrderSetDeliveryCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Delivery.</p>
     * @param fields value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryId
     */

    @Nullable
    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryKey
     */

    @Nullable
    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     *  <p>Defines the Type that extends the Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Delivery.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds StagedOrderSetDeliveryCustomTypeAction with checking for non-null required values
     * @return StagedOrderSetDeliveryCustomTypeAction
     */
    public StagedOrderSetDeliveryCustomTypeAction build() {
        return new StagedOrderSetDeliveryCustomTypeActionImpl(deliveryId, deliveryKey, type, fields);
    }

    /**
     * builds StagedOrderSetDeliveryCustomTypeAction without checking for non-null required values
     * @return StagedOrderSetDeliveryCustomTypeAction
     */
    public StagedOrderSetDeliveryCustomTypeAction buildUnchecked() {
        return new StagedOrderSetDeliveryCustomTypeActionImpl(deliveryId, deliveryKey, type, fields);
    }

    /**
     * factory method for an instance of StagedOrderSetDeliveryCustomTypeActionBuilder
     * @return builder
     */
    public static StagedOrderSetDeliveryCustomTypeActionBuilder of() {
        return new StagedOrderSetDeliveryCustomTypeActionBuilder();
    }

    /**
     * create builder for StagedOrderSetDeliveryCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDeliveryCustomTypeActionBuilder of(
            final StagedOrderSetDeliveryCustomTypeAction template) {
        StagedOrderSetDeliveryCustomTypeActionBuilder builder = new StagedOrderSetDeliveryCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.deliveryKey = template.getDeliveryKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
