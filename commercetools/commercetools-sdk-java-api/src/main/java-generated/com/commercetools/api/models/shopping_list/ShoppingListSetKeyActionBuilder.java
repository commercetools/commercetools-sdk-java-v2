
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetKeyAction shoppingListSetKeyAction = ShoppingListSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetKeyActionBuilder implements Builder<ShoppingListSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public ShoppingListSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ShoppingListSetKeyAction with checking for non-null required values
     * @return ShoppingListSetKeyAction
     */
    public ShoppingListSetKeyAction build() {
        return new ShoppingListSetKeyActionImpl(key);
    }

    /**
     * builds ShoppingListSetKeyAction without checking for non-null required values
     * @return ShoppingListSetKeyAction
     */
    public ShoppingListSetKeyAction buildUnchecked() {
        return new ShoppingListSetKeyActionImpl(key);
    }

    public static ShoppingListSetKeyActionBuilder of() {
        return new ShoppingListSetKeyActionBuilder();
    }

    public static ShoppingListSetKeyActionBuilder of(final ShoppingListSetKeyAction template) {
        ShoppingListSetKeyActionBuilder builder = new ShoppingListSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
