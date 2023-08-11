
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetTextLineItemDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetTextLineItemDescriptionAction shoppingListSetTextLineItemDescriptionAction = ShoppingListSetTextLineItemDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetTextLineItemDescriptionActionBuilder
        implements Builder<ShoppingListSetTextLineItemDescriptionAction> {

    @Nullable
    private String textLineItemId;

    @Nullable
    private String textLineItemKey;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *  <p>The <code>id</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemId value to be set
     * @return Builder
     */

    public ShoppingListSetTextLineItemDescriptionActionBuilder textLineItemId(@Nullable final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemKey value to be set
     * @return Builder
     */

    public ShoppingListSetTextLineItemDescriptionActionBuilder textLineItemKey(@Nullable final String textLineItemKey) {
        this.textLineItemKey = textLineItemKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ShoppingListSetTextLineItemDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ShoppingListSetTextLineItemDescriptionActionBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public ShoppingListSetTextLineItemDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     * builds ShoppingListSetTextLineItemDescriptionAction with checking for non-null required values
     * @return ShoppingListSetTextLineItemDescriptionAction
     */
    public ShoppingListSetTextLineItemDescriptionAction build() {
        return new ShoppingListSetTextLineItemDescriptionActionImpl(textLineItemId, textLineItemKey, description);
    }

    /**
     * builds ShoppingListSetTextLineItemDescriptionAction without checking for non-null required values
     * @return ShoppingListSetTextLineItemDescriptionAction
     */
    public ShoppingListSetTextLineItemDescriptionAction buildUnchecked() {
        return new ShoppingListSetTextLineItemDescriptionActionImpl(textLineItemId, textLineItemKey, description);
    }

    /**
     * factory method for an instance of ShoppingListSetTextLineItemDescriptionActionBuilder
     * @return builder
     */
    public static ShoppingListSetTextLineItemDescriptionActionBuilder of() {
        return new ShoppingListSetTextLineItemDescriptionActionBuilder();
    }

    /**
     * create builder for ShoppingListSetTextLineItemDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetTextLineItemDescriptionActionBuilder of(
            final ShoppingListSetTextLineItemDescriptionAction template) {
        ShoppingListSetTextLineItemDescriptionActionBuilder builder = new ShoppingListSetTextLineItemDescriptionActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.textLineItemKey = template.getTextLineItemKey();
        builder.description = template.getDescription();
        return builder;
    }

}
