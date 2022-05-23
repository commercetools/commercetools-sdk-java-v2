
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListReference shoppingListReference = ShoppingListReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListReferenceBuilder implements Builder<ShoppingListReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.shopping_list.ShoppingList obj;

    /**
     <*  <p>Platform-generated unique identifier of the referenced ShoppingList.</p>>
     */

    public ShoppingListReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>Contains the representation of the expanded ShoppingList. Only present in responses to requests with Reference Expansion for ShoppingLists.</p>>
     */

    public ShoppingListReferenceBuilder obj(
            Function<com.commercetools.api.models.shopping_list.ShoppingListBuilder, com.commercetools.api.models.shopping_list.ShoppingListBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.shopping_list.ShoppingListBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Contains the representation of the expanded ShoppingList. Only present in responses to requests with Reference Expansion for ShoppingLists.</p>>
     */

    public ShoppingListReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.shopping_list.ShoppingList obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.shopping_list.ShoppingList getObj() {
        return this.obj;
    }

    public ShoppingListReference build() {
        Objects.requireNonNull(id, ShoppingListReference.class + ": id is missing");
        return new ShoppingListReferenceImpl(id, obj);
    }

    /**
     * builds ShoppingListReference without checking for non null required values
     */
    public ShoppingListReference buildUnchecked() {
        return new ShoppingListReferenceImpl(id, obj);
    }

    public static ShoppingListReferenceBuilder of() {
        return new ShoppingListReferenceBuilder();
    }

    public static ShoppingListReferenceBuilder of(final ShoppingListReference template) {
        ShoppingListReferenceBuilder builder = new ShoppingListReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
