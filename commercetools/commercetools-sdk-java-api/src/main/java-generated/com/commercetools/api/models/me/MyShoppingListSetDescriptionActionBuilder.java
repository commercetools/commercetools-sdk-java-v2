
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetDescriptionAction myShoppingListSetDescriptionAction = MyShoppingListSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListSetDescriptionActionBuilder implements Builder<MyShoppingListSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public MyShoppingListSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public MyShoppingListSetDescriptionActionBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public MyShoppingListSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
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
     * builds MyShoppingListSetDescriptionAction with checking for non-null required values
     * @return MyShoppingListSetDescriptionAction
     */
    public MyShoppingListSetDescriptionAction build() {
        return new MyShoppingListSetDescriptionActionImpl(description);
    }

    /**
     * builds MyShoppingListSetDescriptionAction without checking for non-null required values
     * @return MyShoppingListSetDescriptionAction
     */
    public MyShoppingListSetDescriptionAction buildUnchecked() {
        return new MyShoppingListSetDescriptionActionImpl(description);
    }

    /**
     * factory method for an instance of MyShoppingListSetDescriptionActionBuilder
     * @return builder
     */
    public static MyShoppingListSetDescriptionActionBuilder of() {
        return new MyShoppingListSetDescriptionActionBuilder();
    }

    /**
     * create builder for MyShoppingListSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetDescriptionActionBuilder of(final MyShoppingListSetDescriptionAction template) {
        MyShoppingListSetDescriptionActionBuilder builder = new MyShoppingListSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
