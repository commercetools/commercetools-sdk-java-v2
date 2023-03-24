
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
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetDeliveryCustomTypeActionBuilder implements Builder<StagedOrderSetDeliveryCustomTypeAction> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *
     * @param deliveryId value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryCustomTypeActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
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
     * @param fields value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds StagedOrderSetDeliveryCustomTypeAction with checking for non-null required values
     * @return StagedOrderSetDeliveryCustomTypeAction
     */
    public StagedOrderSetDeliveryCustomTypeAction build() {
        Objects.requireNonNull(deliveryId, StagedOrderSetDeliveryCustomTypeAction.class + ": deliveryId is missing");
        return new StagedOrderSetDeliveryCustomTypeActionImpl(deliveryId, type, fields);
    }

    /**
     * builds StagedOrderSetDeliveryCustomTypeAction without checking for non-null required values
     * @return StagedOrderSetDeliveryCustomTypeAction
     */
    public StagedOrderSetDeliveryCustomTypeAction buildUnchecked() {
        return new StagedOrderSetDeliveryCustomTypeActionImpl(deliveryId, type, fields);
    }

    public static StagedOrderSetDeliveryCustomTypeActionBuilder of() {
        return new StagedOrderSetDeliveryCustomTypeActionBuilder();
    }

    public static StagedOrderSetDeliveryCustomTypeActionBuilder of(
            final StagedOrderSetDeliveryCustomTypeAction template) {
        StagedOrderSetDeliveryCustomTypeActionBuilder builder = new StagedOrderSetDeliveryCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
