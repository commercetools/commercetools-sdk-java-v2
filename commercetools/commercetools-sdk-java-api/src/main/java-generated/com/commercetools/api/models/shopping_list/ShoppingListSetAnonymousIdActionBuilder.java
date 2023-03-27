
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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public ShoppingListSetAnonymousIdActionBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return anonymousId
     */

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     * builds ShoppingListSetAnonymousIdAction with checking for non-null required values
     * @return ShoppingListSetAnonymousIdAction
     */
    public ShoppingListSetAnonymousIdAction build() {
        return new ShoppingListSetAnonymousIdActionImpl(anonymousId);
    }

    /**
     * builds ShoppingListSetAnonymousIdAction without checking for non-null required values
     * @return ShoppingListSetAnonymousIdAction
     */
    public ShoppingListSetAnonymousIdAction buildUnchecked() {
        return new ShoppingListSetAnonymousIdActionImpl(anonymousId);
    }

    /**
     * factory method for an instance of ShoppingListSetAnonymousIdActionBuilder
     * @return builder
     */
    public static ShoppingListSetAnonymousIdActionBuilder of() {
        return new ShoppingListSetAnonymousIdActionBuilder();
    }

    /**
     * create builder for ShoppingListSetAnonymousIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetAnonymousIdActionBuilder of(final ShoppingListSetAnonymousIdAction template) {
        ShoppingListSetAnonymousIdActionBuilder builder = new ShoppingListSetAnonymousIdActionBuilder();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
