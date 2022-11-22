
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetLineItemCustomFieldAction orderSetLineItemCustomFieldAction = OrderSetLineItemCustomFieldAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetLineItemCustomFieldActionBuilder implements Builder<OrderSetLineItemCustomFieldAction> {

    private String lineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *
     */

    public OrderSetLineItemCustomFieldActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public OrderSetLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public OrderSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public OrderSetLineItemCustomFieldAction build() {
        Objects.requireNonNull(lineItemId, OrderSetLineItemCustomFieldAction.class + ": lineItemId is missing");
        Objects.requireNonNull(name, OrderSetLineItemCustomFieldAction.class + ": name is missing");
        return new OrderSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    /**
     * builds OrderSetLineItemCustomFieldAction without checking for non null required values
     */
    public OrderSetLineItemCustomFieldAction buildUnchecked() {
        return new OrderSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    public static OrderSetLineItemCustomFieldActionBuilder of() {
        return new OrderSetLineItemCustomFieldActionBuilder();
    }

    public static OrderSetLineItemCustomFieldActionBuilder of(final OrderSetLineItemCustomFieldAction template) {
        OrderSetLineItemCustomFieldActionBuilder builder = new OrderSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
