
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetBillingAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetBillingAddressCustomFieldAction stagedOrderSetBillingAddressCustomFieldAction = StagedOrderSetBillingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetBillingAddressCustomFieldActionBuilder
        implements Builder<StagedOrderSetBillingAddressCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public StagedOrderSetBillingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public StagedOrderSetBillingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public StagedOrderSetBillingAddressCustomFieldAction build() {
        Objects.requireNonNull(name, StagedOrderSetBillingAddressCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetBillingAddressCustomFieldActionImpl(name, value);
    }

    /**
     * builds StagedOrderSetBillingAddressCustomFieldAction without checking for non null required values
     */
    public StagedOrderSetBillingAddressCustomFieldAction buildUnchecked() {
        return new StagedOrderSetBillingAddressCustomFieldActionImpl(name, value);
    }

    public static StagedOrderSetBillingAddressCustomFieldActionBuilder of() {
        return new StagedOrderSetBillingAddressCustomFieldActionBuilder();
    }

    public static StagedOrderSetBillingAddressCustomFieldActionBuilder of(
            final StagedOrderSetBillingAddressCustomFieldAction template) {
        StagedOrderSetBillingAddressCustomFieldActionBuilder builder = new StagedOrderSetBillingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
