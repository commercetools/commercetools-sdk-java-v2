
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingCustomFieldAction stagedOrderSetShippingCustomFieldAction = StagedOrderSetShippingCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetShippingCustomFieldActionBuilder
        implements Builder<StagedOrderSetShippingCustomFieldAction> {

    @Nullable
    private String shippingKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>The <code>shippingKey</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> to customize. Used to specify which Shipping Method to customize on a Order with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Order.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public StagedOrderSetShippingCustomFieldActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public StagedOrderSetShippingCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public StagedOrderSetShippingCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>The <code>shippingKey</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> to customize. Used to specify which Shipping Method to customize on a Order with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Order.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds StagedOrderSetShippingCustomFieldAction with checking for non-null required values
     * @return StagedOrderSetShippingCustomFieldAction
     */
    public StagedOrderSetShippingCustomFieldAction build() {
        Objects.requireNonNull(name, StagedOrderSetShippingCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetShippingCustomFieldActionImpl(shippingKey, name, value);
    }

    /**
     * builds StagedOrderSetShippingCustomFieldAction without checking for non-null required values
     * @return StagedOrderSetShippingCustomFieldAction
     */
    public StagedOrderSetShippingCustomFieldAction buildUnchecked() {
        return new StagedOrderSetShippingCustomFieldActionImpl(shippingKey, name, value);
    }

    /**
     * factory method for an instance of StagedOrderSetShippingCustomFieldActionBuilder
     * @return builder
     */
    public static StagedOrderSetShippingCustomFieldActionBuilder of() {
        return new StagedOrderSetShippingCustomFieldActionBuilder();
    }

    /**
     * create builder for StagedOrderSetShippingCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingCustomFieldActionBuilder of(
            final StagedOrderSetShippingCustomFieldAction template) {
        StagedOrderSetShippingCustomFieldActionBuilder builder = new StagedOrderSetShippingCustomFieldActionBuilder();
        builder.shippingKey = template.getShippingKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
