
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
     *
     */

    public MyShoppingListChangeTextLineItemNameActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public MyShoppingListChangeTextLineItemNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public MyShoppingListChangeTextLineItemNameActionBuilder name(
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

    public MyShoppingListChangeTextLineItemNameAction build() {
        Objects.requireNonNull(textLineItemId,
            MyShoppingListChangeTextLineItemNameAction.class + ": textLineItemId is missing");
        Objects.requireNonNull(name, MyShoppingListChangeTextLineItemNameAction.class + ": name is missing");
        return new MyShoppingListChangeTextLineItemNameActionImpl(textLineItemId, name);
    }

    /**
     * builds MyShoppingListChangeTextLineItemNameAction without checking for non null required values
     */
    public MyShoppingListChangeTextLineItemNameAction buildUnchecked() {
        return new MyShoppingListChangeTextLineItemNameActionImpl(textLineItemId, name);
    }

    public static MyShoppingListChangeTextLineItemNameActionBuilder of() {
        return new MyShoppingListChangeTextLineItemNameActionBuilder();
    }

    public static MyShoppingListChangeTextLineItemNameActionBuilder of(
            final MyShoppingListChangeTextLineItemNameAction template) {
        MyShoppingListChangeTextLineItemNameActionBuilder builder = new MyShoppingListChangeTextLineItemNameActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.name = template.getName();
        return builder;
    }

}
