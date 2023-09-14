
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDeliveryAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryAddressCustomFieldAction stagedOrderSetDeliveryAddressCustomFieldAction = StagedOrderSetDeliveryAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetDeliveryAddressCustomFieldActionBuilder
        implements Builder<StagedOrderSetDeliveryAddressCustomFieldAction> {

    @Nullable
    private String deliveryId;

    @Nullable
    private String deliveryKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryAddressCustomFieldActionBuilder deliveryId(@Nullable final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryKey value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryAddressCustomFieldActionBuilder deliveryKey(@Nullable final String deliveryKey) {
        this.deliveryKey = deliveryKey;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryId
     */

    @Nullable
    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryKey
     */

    @Nullable
    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds StagedOrderSetDeliveryAddressCustomFieldAction with checking for non-null required values
     * @return StagedOrderSetDeliveryAddressCustomFieldAction
     */
    public StagedOrderSetDeliveryAddressCustomFieldAction build() {
        Objects.requireNonNull(name, StagedOrderSetDeliveryAddressCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetDeliveryAddressCustomFieldActionImpl(deliveryId, deliveryKey, name, value);
    }

    /**
     * builds StagedOrderSetDeliveryAddressCustomFieldAction without checking for non-null required values
     * @return StagedOrderSetDeliveryAddressCustomFieldAction
     */
    public StagedOrderSetDeliveryAddressCustomFieldAction buildUnchecked() {
        return new StagedOrderSetDeliveryAddressCustomFieldActionImpl(deliveryId, deliveryKey, name, value);
    }

    /**
     * factory method for an instance of StagedOrderSetDeliveryAddressCustomFieldActionBuilder
     * @return builder
     */
    public static StagedOrderSetDeliveryAddressCustomFieldActionBuilder of() {
        return new StagedOrderSetDeliveryAddressCustomFieldActionBuilder();
    }

    /**
     * create builder for StagedOrderSetDeliveryAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDeliveryAddressCustomFieldActionBuilder of(
            final StagedOrderSetDeliveryAddressCustomFieldAction template) {
        StagedOrderSetDeliveryAddressCustomFieldActionBuilder builder = new StagedOrderSetDeliveryAddressCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.deliveryKey = template.getDeliveryKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
