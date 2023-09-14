
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetTextLineItemDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetTextLineItemDescriptionAction myShoppingListSetTextLineItemDescriptionAction = MyShoppingListSetTextLineItemDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListSetTextLineItemDescriptionActionBuilder
        implements Builder<MyShoppingListSetTextLineItemDescriptionAction> {

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

    public MyShoppingListSetTextLineItemDescriptionActionBuilder textLineItemId(@Nullable final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemKey value to be set
     * @return Builder
     */

    public MyShoppingListSetTextLineItemDescriptionActionBuilder textLineItemKey(
            @Nullable final String textLineItemKey) {
        this.textLineItemKey = textLineItemKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public MyShoppingListSetTextLineItemDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public MyShoppingListSetTextLineItemDescriptionActionBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public MyShoppingListSetTextLineItemDescriptionActionBuilder description(
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
     * builds MyShoppingListSetTextLineItemDescriptionAction with checking for non-null required values
     * @return MyShoppingListSetTextLineItemDescriptionAction
     */
    public MyShoppingListSetTextLineItemDescriptionAction build() {
        return new MyShoppingListSetTextLineItemDescriptionActionImpl(textLineItemId, textLineItemKey, description);
    }

    /**
     * builds MyShoppingListSetTextLineItemDescriptionAction without checking for non-null required values
     * @return MyShoppingListSetTextLineItemDescriptionAction
     */
    public MyShoppingListSetTextLineItemDescriptionAction buildUnchecked() {
        return new MyShoppingListSetTextLineItemDescriptionActionImpl(textLineItemId, textLineItemKey, description);
    }

    /**
     * factory method for an instance of MyShoppingListSetTextLineItemDescriptionActionBuilder
     * @return builder
     */
    public static MyShoppingListSetTextLineItemDescriptionActionBuilder of() {
        return new MyShoppingListSetTextLineItemDescriptionActionBuilder();
    }

    /**
     * create builder for MyShoppingListSetTextLineItemDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetTextLineItemDescriptionActionBuilder of(
            final MyShoppingListSetTextLineItemDescriptionAction template) {
        MyShoppingListSetTextLineItemDescriptionActionBuilder builder = new MyShoppingListSetTextLineItemDescriptionActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.textLineItemKey = template.getTextLineItemKey();
        builder.description = template.getDescription();
        return builder;
    }

}
