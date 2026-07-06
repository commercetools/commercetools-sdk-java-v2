
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomLineItemCustomFieldAction cartSetCustomLineItemCustomFieldAction = CartSetCustomLineItemCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomLineItemCustomFieldActionBuilder implements Builder<CartSetCustomLineItemCustomFieldAction> {

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

    public CartSetCustomLineItemCustomFieldActionBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public CartSetCustomLineItemCustomFieldActionBuilder customLineItemKey(@Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public CartSetCustomLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public CartSetCustomLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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
     * builds CartSetCustomLineItemCustomFieldAction with checking for non-null required values
     * @return CartSetCustomLineItemCustomFieldAction
     */
    public CartSetCustomLineItemCustomFieldAction build() {
        Objects.requireNonNull(name, CartSetCustomLineItemCustomFieldAction.class + ": name is missing");
        return new CartSetCustomLineItemCustomFieldActionImpl(customLineItemId, customLineItemKey, name, value);
    }

    /**
     * builds CartSetCustomLineItemCustomFieldAction without checking for non-null required values
     * @return CartSetCustomLineItemCustomFieldAction
     */
    public CartSetCustomLineItemCustomFieldAction buildUnchecked() {
        return new CartSetCustomLineItemCustomFieldActionImpl(customLineItemId, customLineItemKey, name, value);
    }

    /**
     * factory method for an instance of CartSetCustomLineItemCustomFieldActionBuilder
     * @return builder
     */
    public static CartSetCustomLineItemCustomFieldActionBuilder of() {
        return new CartSetCustomLineItemCustomFieldActionBuilder();
    }

    /**
     * create builder for CartSetCustomLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomLineItemCustomFieldActionBuilder of(
            final CartSetCustomLineItemCustomFieldAction template) {
        CartSetCustomLineItemCustomFieldActionBuilder builder = new CartSetCustomLineItemCustomFieldActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
