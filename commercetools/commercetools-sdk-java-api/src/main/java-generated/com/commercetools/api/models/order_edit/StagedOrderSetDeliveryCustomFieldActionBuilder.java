
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDeliveryCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryCustomFieldAction stagedOrderSetDeliveryCustomFieldAction = StagedOrderSetDeliveryCustomFieldAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetDeliveryCustomFieldActionBuilder
        implements Builder<StagedOrderSetDeliveryCustomFieldAction> {

    private String deliveryId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *
     * @param deliveryId value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryCustomFieldActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds StagedOrderSetDeliveryCustomFieldAction with checking for non-null required values
     * @return StagedOrderSetDeliveryCustomFieldAction
     */
    public StagedOrderSetDeliveryCustomFieldAction build() {
        Objects.requireNonNull(deliveryId, StagedOrderSetDeliveryCustomFieldAction.class + ": deliveryId is missing");
        Objects.requireNonNull(name, StagedOrderSetDeliveryCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetDeliveryCustomFieldActionImpl(deliveryId, name, value);
    }

    /**
     * builds StagedOrderSetDeliveryCustomFieldAction without checking for non-null required values
     * @return StagedOrderSetDeliveryCustomFieldAction
     */
    public StagedOrderSetDeliveryCustomFieldAction buildUnchecked() {
        return new StagedOrderSetDeliveryCustomFieldActionImpl(deliveryId, name, value);
    }

    public static StagedOrderSetDeliveryCustomFieldActionBuilder of() {
        return new StagedOrderSetDeliveryCustomFieldActionBuilder();
    }

    public static StagedOrderSetDeliveryCustomFieldActionBuilder of(
            final StagedOrderSetDeliveryCustomFieldAction template) {
        StagedOrderSetDeliveryCustomFieldActionBuilder builder = new StagedOrderSetDeliveryCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
