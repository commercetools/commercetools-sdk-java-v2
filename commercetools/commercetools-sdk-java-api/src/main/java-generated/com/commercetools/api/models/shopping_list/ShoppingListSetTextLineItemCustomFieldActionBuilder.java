
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetTextLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetTextLineItemCustomFieldAction shoppingListSetTextLineItemCustomFieldAction = ShoppingListSetTextLineItemCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetTextLineItemCustomFieldActionBuilder
        implements Builder<ShoppingListSetTextLineItemCustomFieldAction> {

    @Nullable
    private String textLineItemId;

    @Nullable
    private String textLineItemKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>The <code>id</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemId value to be set
     * @return Builder
     */

    public ShoppingListSetTextLineItemCustomFieldActionBuilder textLineItemId(@Nullable final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemKey value to be set
     * @return Builder
     */

    public ShoppingListSetTextLineItemCustomFieldActionBuilder textLineItemKey(@Nullable final String textLineItemKey) {
        this.textLineItemKey = textLineItemKey;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public ShoppingListSetTextLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public ShoppingListSetTextLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemId
     */

    @Nullable
    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    /**
     *  <p>The <code>key</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemKey
     */

    @Nullable
    public String getTextLineItemKey() {
        return this.textLineItemKey;
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
     * builds ShoppingListSetTextLineItemCustomFieldAction with checking for non-null required values
     * @return ShoppingListSetTextLineItemCustomFieldAction
     */
    public ShoppingListSetTextLineItemCustomFieldAction build() {
        Objects.requireNonNull(name, ShoppingListSetTextLineItemCustomFieldAction.class + ": name is missing");
        return new ShoppingListSetTextLineItemCustomFieldActionImpl(textLineItemId, textLineItemKey, name, value);
    }

    /**
     * builds ShoppingListSetTextLineItemCustomFieldAction without checking for non-null required values
     * @return ShoppingListSetTextLineItemCustomFieldAction
     */
    public ShoppingListSetTextLineItemCustomFieldAction buildUnchecked() {
        return new ShoppingListSetTextLineItemCustomFieldActionImpl(textLineItemId, textLineItemKey, name, value);
    }

    /**
     * factory method for an instance of ShoppingListSetTextLineItemCustomFieldActionBuilder
     * @return builder
     */
    public static ShoppingListSetTextLineItemCustomFieldActionBuilder of() {
        return new ShoppingListSetTextLineItemCustomFieldActionBuilder();
    }

    /**
     * create builder for ShoppingListSetTextLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetTextLineItemCustomFieldActionBuilder of(
            final ShoppingListSetTextLineItemCustomFieldAction template) {
        ShoppingListSetTextLineItemCustomFieldActionBuilder builder = new ShoppingListSetTextLineItemCustomFieldActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.textLineItemKey = template.getTextLineItemKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
