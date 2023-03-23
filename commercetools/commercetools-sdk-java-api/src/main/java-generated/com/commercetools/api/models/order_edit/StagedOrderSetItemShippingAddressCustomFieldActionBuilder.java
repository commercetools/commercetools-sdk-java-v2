
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetItemShippingAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetItemShippingAddressCustomFieldAction stagedOrderSetItemShippingAddressCustomFieldAction = StagedOrderSetItemShippingAddressCustomFieldAction.builder()
 *             .addressKey("{addressKey}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetItemShippingAddressCustomFieldActionBuilder
        implements Builder<StagedOrderSetItemShippingAddressCustomFieldAction> {

    private String addressKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *
     * @param addressKey
     * @return Builder
     */

    public StagedOrderSetItemShippingAddressCustomFieldActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name
     * @return Builder
     */

    public StagedOrderSetItemShippingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value
     * @return Builder
     */

    public StagedOrderSetItemShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public StagedOrderSetItemShippingAddressCustomFieldAction build() {
        Objects.requireNonNull(addressKey,
            StagedOrderSetItemShippingAddressCustomFieldAction.class + ": addressKey is missing");
        Objects.requireNonNull(name, StagedOrderSetItemShippingAddressCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    /**
     * builds StagedOrderSetItemShippingAddressCustomFieldAction without checking for non null required values
     */
    public StagedOrderSetItemShippingAddressCustomFieldAction buildUnchecked() {
        return new StagedOrderSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    public static StagedOrderSetItemShippingAddressCustomFieldActionBuilder of() {
        return new StagedOrderSetItemShippingAddressCustomFieldActionBuilder();
    }

    public static StagedOrderSetItemShippingAddressCustomFieldActionBuilder of(
            final StagedOrderSetItemShippingAddressCustomFieldAction template) {
        StagedOrderSetItemShippingAddressCustomFieldActionBuilder builder = new StagedOrderSetItemShippingAddressCustomFieldActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
