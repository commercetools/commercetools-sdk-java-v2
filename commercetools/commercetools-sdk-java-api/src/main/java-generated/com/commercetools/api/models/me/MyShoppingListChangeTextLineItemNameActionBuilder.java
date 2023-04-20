
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListChangeTextLineItemNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeTextLineItemNameAction myShoppingListChangeTextLineItemNameAction = MyShoppingListChangeTextLineItemNameAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListChangeTextLineItemNameActionBuilder
        implements Builder<MyShoppingListChangeTextLineItemNameAction> {

    private String textLineItemId;

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @param textLineItemId value to be set
     * @return Builder
     */

    public MyShoppingListChangeTextLineItemNameActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public MyShoppingListChangeTextLineItemNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public MyShoppingListChangeTextLineItemNameActionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     * @return Builder
     */

    public MyShoppingListChangeTextLineItemNameActionBuilder name(
            final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @return textLineItemId
     */

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds MyShoppingListChangeTextLineItemNameAction with checking for non-null required values
     * @return MyShoppingListChangeTextLineItemNameAction
     */
    public MyShoppingListChangeTextLineItemNameAction build() {
        Objects.requireNonNull(textLineItemId,
            MyShoppingListChangeTextLineItemNameAction.class + ": textLineItemId is missing");
        Objects.requireNonNull(name, MyShoppingListChangeTextLineItemNameAction.class + ": name is missing");
        return new MyShoppingListChangeTextLineItemNameActionImpl(textLineItemId, name);
    }

    /**
     * builds MyShoppingListChangeTextLineItemNameAction without checking for non-null required values
     * @return MyShoppingListChangeTextLineItemNameAction
     */
    public MyShoppingListChangeTextLineItemNameAction buildUnchecked() {
        return new MyShoppingListChangeTextLineItemNameActionImpl(textLineItemId, name);
    }

    /**
     * factory method for an instance of MyShoppingListChangeTextLineItemNameActionBuilder
     * @return builder
     */
    public static MyShoppingListChangeTextLineItemNameActionBuilder of() {
        return new MyShoppingListChangeTextLineItemNameActionBuilder();
    }

    /**
     * create builder for MyShoppingListChangeTextLineItemNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListChangeTextLineItemNameActionBuilder of(
            final MyShoppingListChangeTextLineItemNameAction template) {
        MyShoppingListChangeTextLineItemNameActionBuilder builder = new MyShoppingListChangeTextLineItemNameActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.name = template.getName();
        return builder;
    }

}
