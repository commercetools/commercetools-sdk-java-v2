
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetAnonymousIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetAnonymousIdAction shoppingListSetAnonymousIdAction = ShoppingListSetAnonymousIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetAnonymousIdActionBuilder implements Builder<ShoppingListSetAnonymousIdAction> {

    @Nullable
    private String anonymousId;

    /**
     *  <p>Anonymous ID of the anonymous customer that this shopping list belongs to. If this field is not set any existing <code>anonymousId</code> is removed.</p>
     */

    public ShoppingListSetAnonymousIdActionBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public ShoppingListSetAnonymousIdAction build() {
        return new ShoppingListSetAnonymousIdActionImpl(anonymousId);
    }

    /**
     * builds ShoppingListSetAnonymousIdAction without checking for non null required values
     */
    public ShoppingListSetAnonymousIdAction buildUnchecked() {
        return new ShoppingListSetAnonymousIdActionImpl(anonymousId);
    }

    public static ShoppingListSetAnonymousIdActionBuilder of() {
        return new ShoppingListSetAnonymousIdActionBuilder();
    }

    public static ShoppingListSetAnonymousIdActionBuilder of(final ShoppingListSetAnonymousIdAction template) {
        ShoppingListSetAnonymousIdActionBuilder builder = new ShoppingListSetAnonymousIdActionBuilder();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
