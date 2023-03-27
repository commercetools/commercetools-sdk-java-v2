
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeNameAction myShoppingListChangeNameAction = MyShoppingListChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListChangeNameActionBuilder implements Builder<MyShoppingListChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public MyShoppingListChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     * @return Builder
     */

    public MyShoppingListChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds MyShoppingListChangeNameAction with checking for non-null required values
     * @return MyShoppingListChangeNameAction
     */
    public MyShoppingListChangeNameAction build() {
        Objects.requireNonNull(name, MyShoppingListChangeNameAction.class + ": name is missing");
        return new MyShoppingListChangeNameActionImpl(name);
    }

    /**
     * builds MyShoppingListChangeNameAction without checking for non-null required values
     * @return MyShoppingListChangeNameAction
     */
    public MyShoppingListChangeNameAction buildUnchecked() {
        return new MyShoppingListChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of MyShoppingListChangeNameActionBuilder
     * @return builder
     */
    public static MyShoppingListChangeNameActionBuilder of() {
        return new MyShoppingListChangeNameActionBuilder();
    }

    /**
     * create builder for MyShoppingListChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListChangeNameActionBuilder of(final MyShoppingListChangeNameAction template) {
        MyShoppingListChangeNameActionBuilder builder = new MyShoppingListChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
