
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetCustomTypeAction shoppingListSetCustomTypeAction = ShoppingListSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetCustomTypeActionBuilder implements Builder<ShoppingListSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     <*  <p>Defines the Type that extends the ShoppingList with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShoppingList.</p>>
     */

    public ShoppingListSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Defines the Type that extends the ShoppingList with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShoppingList.</p>>
     */

    public ShoppingListSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     <*  <p>Sets the Custom Fields fields for the ShoppingList.</p>>
     */

    public ShoppingListSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Sets the Custom Fields fields for the ShoppingList.</p>>
     */

    public ShoppingListSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public ShoppingListSetCustomTypeAction build() {
        return new ShoppingListSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds ShoppingListSetCustomTypeAction without checking for non null required values
     */
    public ShoppingListSetCustomTypeAction buildUnchecked() {
        return new ShoppingListSetCustomTypeActionImpl(type, fields);
    }

    public static ShoppingListSetCustomTypeActionBuilder of() {
        return new ShoppingListSetCustomTypeActionBuilder();
    }

    public static ShoppingListSetCustomTypeActionBuilder of(final ShoppingListSetCustomTypeAction template) {
        ShoppingListSetCustomTypeActionBuilder builder = new ShoppingListSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
