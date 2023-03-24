
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListChangeTextLineItemNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeTextLineItemNameAction shoppingListChangeTextLineItemNameAction = ShoppingListChangeTextLineItemNameAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListChangeTextLineItemNameActionBuilder
        implements Builder<ShoppingListChangeTextLineItemNameAction> {

    private String textLineItemId;

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @param textLineItemId value to be set
     * @return Builder
     */

    public ShoppingListChangeTextLineItemNameActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ShoppingListChangeTextLineItemNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     * @return Builder
     */

    public ShoppingListChangeTextLineItemNameActionBuilder name(
            final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds ShoppingListChangeTextLineItemNameAction with checking for non-null required values
     * @return ShoppingListChangeTextLineItemNameAction
     */
    public ShoppingListChangeTextLineItemNameAction build() {
        Objects.requireNonNull(textLineItemId,
            ShoppingListChangeTextLineItemNameAction.class + ": textLineItemId is missing");
        Objects.requireNonNull(name, ShoppingListChangeTextLineItemNameAction.class + ": name is missing");
        return new ShoppingListChangeTextLineItemNameActionImpl(textLineItemId, name);
    }

    /**
     * builds ShoppingListChangeTextLineItemNameAction without checking for non-null required values
     * @return ShoppingListChangeTextLineItemNameAction
     */
    public ShoppingListChangeTextLineItemNameAction buildUnchecked() {
        return new ShoppingListChangeTextLineItemNameActionImpl(textLineItemId, name);
    }

    public static ShoppingListChangeTextLineItemNameActionBuilder of() {
        return new ShoppingListChangeTextLineItemNameActionBuilder();
    }

    public static ShoppingListChangeTextLineItemNameActionBuilder of(
            final ShoppingListChangeTextLineItemNameAction template) {
        ShoppingListChangeTextLineItemNameActionBuilder builder = new ShoppingListChangeTextLineItemNameActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.name = template.getName();
        return builder;
    }

}
