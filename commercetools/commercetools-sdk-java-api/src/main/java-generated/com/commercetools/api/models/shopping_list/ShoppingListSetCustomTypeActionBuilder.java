
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
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ShoppingList with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShoppingList.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ShoppingListSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ShoppingList with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShoppingList.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ShoppingListSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ShoppingList with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShoppingList.</p>
     * @param type value to be set
     * @return Builder
     */

    public ShoppingListSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ShoppingList.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ShoppingListSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ShoppingList.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ShoppingListSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ShoppingList.</p>
     * @param fields value to be set
     * @return Builder
     */

    public ShoppingListSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ShoppingList with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShoppingList.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ShoppingList.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds ShoppingListSetCustomTypeAction with checking for non-null required values
     * @return ShoppingListSetCustomTypeAction
     */
    public ShoppingListSetCustomTypeAction build() {
        return new ShoppingListSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds ShoppingListSetCustomTypeAction without checking for non-null required values
     * @return ShoppingListSetCustomTypeAction
     */
    public ShoppingListSetCustomTypeAction buildUnchecked() {
        return new ShoppingListSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of ShoppingListSetCustomTypeActionBuilder
     * @return builder
     */
    public static ShoppingListSetCustomTypeActionBuilder of() {
        return new ShoppingListSetCustomTypeActionBuilder();
    }

    /**
     * create builder for ShoppingListSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetCustomTypeActionBuilder of(final ShoppingListSetCustomTypeAction template) {
        ShoppingListSetCustomTypeActionBuilder builder = new ShoppingListSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
