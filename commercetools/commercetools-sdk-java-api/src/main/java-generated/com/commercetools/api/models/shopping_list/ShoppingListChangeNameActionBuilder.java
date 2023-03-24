
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeNameAction shoppingListChangeNameAction = ShoppingListChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListChangeNameActionBuilder implements Builder<ShoppingListChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ShoppingListChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     * @return Builder
     */

    public ShoppingListChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds ShoppingListChangeNameAction with checking for non-null required values
     * @return ShoppingListChangeNameAction
     */
    public ShoppingListChangeNameAction build() {
        Objects.requireNonNull(name, ShoppingListChangeNameAction.class + ": name is missing");
        return new ShoppingListChangeNameActionImpl(name);
    }

    /**
     * builds ShoppingListChangeNameAction without checking for non-null required values
     * @return ShoppingListChangeNameAction
     */
    public ShoppingListChangeNameAction buildUnchecked() {
        return new ShoppingListChangeNameActionImpl(name);
    }

    public static ShoppingListChangeNameActionBuilder of() {
        return new ShoppingListChangeNameActionBuilder();
    }

    public static ShoppingListChangeNameActionBuilder of(final ShoppingListChangeNameAction template) {
        ShoppingListChangeNameActionBuilder builder = new ShoppingListChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
