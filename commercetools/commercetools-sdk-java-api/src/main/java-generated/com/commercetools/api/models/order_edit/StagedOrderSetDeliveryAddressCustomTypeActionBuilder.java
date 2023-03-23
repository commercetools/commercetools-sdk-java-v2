
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDeliveryAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryAddressCustomTypeAction stagedOrderSetDeliveryAddressCustomTypeAction = StagedOrderSetDeliveryAddressCustomTypeAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetDeliveryAddressCustomTypeActionBuilder
        implements Builder<StagedOrderSetDeliveryAddressCustomTypeAction> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *
     * @param deliveryId
     * @return Builder
     */

    public StagedOrderSetDeliveryAddressCustomTypeActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>address</code> in a Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code> in a Delivery.</p>
     * @return Builder
     */

    public StagedOrderSetDeliveryAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>address</code> in a Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code> in a Delivery.</p>
     * @param type
     * @return Builder
     */

    public StagedOrderSetDeliveryAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code> in a Delivery.</p>
     * @return Builder
     */

    public StagedOrderSetDeliveryAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code> in a Delivery.</p>
     * @param fields
     * @return Builder
     */

    public StagedOrderSetDeliveryAddressCustomTypeActionBuilder fields(
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

    public StagedOrderSetDeliveryAddressCustomTypeAction build() {
        Objects.requireNonNull(deliveryId,
            StagedOrderSetDeliveryAddressCustomTypeAction.class + ": deliveryId is missing");
        return new StagedOrderSetDeliveryAddressCustomTypeActionImpl(deliveryId, type, fields);
    }

    /**
     * builds StagedOrderSetDeliveryAddressCustomTypeAction without checking for non null required values
     */
    public StagedOrderSetDeliveryAddressCustomTypeAction buildUnchecked() {
        return new StagedOrderSetDeliveryAddressCustomTypeActionImpl(deliveryId, type, fields);
    }

    public static StagedOrderSetDeliveryAddressCustomTypeActionBuilder of() {
        return new StagedOrderSetDeliveryAddressCustomTypeActionBuilder();
    }

    public static StagedOrderSetDeliveryAddressCustomTypeActionBuilder of(
            final StagedOrderSetDeliveryAddressCustomTypeAction template) {
        StagedOrderSetDeliveryAddressCustomTypeActionBuilder builder = new StagedOrderSetDeliveryAddressCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
