
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetLineItemCustomFieldAction shoppingListSetLineItemCustomFieldAction = ShoppingListSetLineItemCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetLineItemCustomFieldActionBuilder
        implements Builder<ShoppingListSetLineItemCustomFieldAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public ShoppingListSetLineItemCustomFieldActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public ShoppingListSetLineItemCustomFieldActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public ShoppingListSetLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public ShoppingListSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
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
     * builds ShoppingListSetLineItemCustomFieldAction with checking for non-null required values
     * @return ShoppingListSetLineItemCustomFieldAction
     */
    public ShoppingListSetLineItemCustomFieldAction build() {
        Objects.requireNonNull(name, ShoppingListSetLineItemCustomFieldAction.class + ": name is missing");
        return new ShoppingListSetLineItemCustomFieldActionImpl(lineItemId, lineItemKey, name, value);
    }

    /**
     * builds ShoppingListSetLineItemCustomFieldAction without checking for non-null required values
     * @return ShoppingListSetLineItemCustomFieldAction
     */
    public ShoppingListSetLineItemCustomFieldAction buildUnchecked() {
        return new ShoppingListSetLineItemCustomFieldActionImpl(lineItemId, lineItemKey, name, value);
    }

    /**
     * factory method for an instance of ShoppingListSetLineItemCustomFieldActionBuilder
     * @return builder
     */
    public static ShoppingListSetLineItemCustomFieldActionBuilder of() {
        return new ShoppingListSetLineItemCustomFieldActionBuilder();
    }

    /**
     * create builder for ShoppingListSetLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetLineItemCustomFieldActionBuilder of(
            final ShoppingListSetLineItemCustomFieldAction template) {
        ShoppingListSetLineItemCustomFieldActionBuilder builder = new ShoppingListSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
