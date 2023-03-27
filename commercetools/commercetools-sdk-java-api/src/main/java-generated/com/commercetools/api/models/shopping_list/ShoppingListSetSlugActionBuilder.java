
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetSlugActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetSlugAction shoppingListSetSlugAction = ShoppingListSetSlugAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetSlugActionBuilder implements Builder<ShoppingListSetSlugAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code></p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ShoppingListSetSlugActionBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code></p>
     * @param slug value to be set
     * @return Builder
     */

    public ShoppingListSetSlugActionBuilder slug(
            @Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code></p>
     * @return slug
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     * builds ShoppingListSetSlugAction with checking for non-null required values
     * @return ShoppingListSetSlugAction
     */
    public ShoppingListSetSlugAction build() {
        return new ShoppingListSetSlugActionImpl(slug);
    }

    /**
     * builds ShoppingListSetSlugAction without checking for non-null required values
     * @return ShoppingListSetSlugAction
     */
    public ShoppingListSetSlugAction buildUnchecked() {
        return new ShoppingListSetSlugActionImpl(slug);
    }

    /**
     * factory method for an instance of ShoppingListSetSlugActionBuilder
     * @return builder
     */
    public static ShoppingListSetSlugActionBuilder of() {
        return new ShoppingListSetSlugActionBuilder();
    }

    /**
     * create builder for ShoppingListSetSlugAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetSlugActionBuilder of(final ShoppingListSetSlugAction template) {
        ShoppingListSetSlugActionBuilder builder = new ShoppingListSetSlugActionBuilder();
        builder.slug = template.getSlug();
        return builder;
    }

}
