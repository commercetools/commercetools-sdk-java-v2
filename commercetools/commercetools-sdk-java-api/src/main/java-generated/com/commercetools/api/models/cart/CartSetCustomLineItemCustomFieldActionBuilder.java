
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
 *             .customLineItemId("{customLineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomLineItemCustomFieldActionBuilder implements Builder<CartSetCustomLineItemCustomFieldAction> {

    private String customLineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     */

    public CartSetCustomLineItemCustomFieldActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public CartSetCustomLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public CartSetCustomLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public CartSetCustomLineItemCustomFieldAction build() {
        Objects.requireNonNull(customLineItemId,
            CartSetCustomLineItemCustomFieldAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(name, CartSetCustomLineItemCustomFieldAction.class + ": name is missing");
        return new CartSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
    }

    /**
     * builds CartSetCustomLineItemCustomFieldAction without checking for non null required values
     */
    public CartSetCustomLineItemCustomFieldAction buildUnchecked() {
        return new CartSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
    }

    public static CartSetCustomLineItemCustomFieldActionBuilder of() {
        return new CartSetCustomLineItemCustomFieldActionBuilder();
    }

    public static CartSetCustomLineItemCustomFieldActionBuilder of(
            final CartSetCustomLineItemCustomFieldAction template) {
        CartSetCustomLineItemCustomFieldActionBuilder builder = new CartSetCustomLineItemCustomFieldActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
