
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetCustomLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomLineItemCustomFieldAction orderSetCustomLineItemCustomFieldAction = OrderSetCustomLineItemCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetCustomLineItemCustomFieldActionBuilder
        implements Builder<OrderSetCustomLineItemCustomFieldAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public OrderSetCustomLineItemCustomFieldActionBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public OrderSetCustomLineItemCustomFieldActionBuilder customLineItemKey(@Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public OrderSetCustomLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public OrderSetCustomLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds OrderSetCustomLineItemCustomFieldAction with checking for non-null required values
     * @return OrderSetCustomLineItemCustomFieldAction
     */
    public OrderSetCustomLineItemCustomFieldAction build() {
        Objects.requireNonNull(name, OrderSetCustomLineItemCustomFieldAction.class + ": name is missing");
        return new OrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, customLineItemKey, name, value);
    }

    /**
     * builds OrderSetCustomLineItemCustomFieldAction without checking for non-null required values
     * @return OrderSetCustomLineItemCustomFieldAction
     */
    public OrderSetCustomLineItemCustomFieldAction buildUnchecked() {
        return new OrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, customLineItemKey, name, value);
    }

    /**
     * factory method for an instance of OrderSetCustomLineItemCustomFieldActionBuilder
     * @return builder
     */
    public static OrderSetCustomLineItemCustomFieldActionBuilder of() {
        return new OrderSetCustomLineItemCustomFieldActionBuilder();
    }

    /**
     * create builder for OrderSetCustomLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetCustomLineItemCustomFieldActionBuilder of(
            final OrderSetCustomLineItemCustomFieldAction template) {
        OrderSetCustomLineItemCustomFieldActionBuilder builder = new OrderSetCustomLineItemCustomFieldActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
