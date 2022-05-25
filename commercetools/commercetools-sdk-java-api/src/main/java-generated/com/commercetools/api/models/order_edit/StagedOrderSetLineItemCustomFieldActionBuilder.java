
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemCustomFieldAction stagedOrderSetLineItemCustomFieldAction = StagedOrderSetLineItemCustomFieldAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetLineItemCustomFieldActionBuilder
        implements Builder<StagedOrderSetLineItemCustomFieldAction> {

    private String lineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *
     */

    public StagedOrderSetLineItemCustomFieldActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public StagedOrderSetLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public StagedOrderSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public StagedOrderSetLineItemCustomFieldAction build() {
        Objects.requireNonNull(lineItemId, StagedOrderSetLineItemCustomFieldAction.class + ": lineItemId is missing");
        Objects.requireNonNull(name, StagedOrderSetLineItemCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    /**
     * builds StagedOrderSetLineItemCustomFieldAction without checking for non null required values
     */
    public StagedOrderSetLineItemCustomFieldAction buildUnchecked() {
        return new StagedOrderSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    public static StagedOrderSetLineItemCustomFieldActionBuilder of() {
        return new StagedOrderSetLineItemCustomFieldActionBuilder();
    }

    public static StagedOrderSetLineItemCustomFieldActionBuilder of(
            final StagedOrderSetLineItemCustomFieldAction template) {
        StagedOrderSetLineItemCustomFieldActionBuilder builder = new StagedOrderSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
