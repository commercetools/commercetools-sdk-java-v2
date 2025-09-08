
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetCustomTypeAction myShoppingListSetCustomTypeAction = MyShoppingListSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListSetCustomTypeActionBuilder implements Builder<MyShoppingListSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the MyShoppingList with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the MyShoppingList.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public MyShoppingListSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the MyShoppingList with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the MyShoppingList.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public MyShoppingListSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the MyShoppingList with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the MyShoppingList.</p>
     * @param type value to be set
     * @return Builder
     */

    public MyShoppingListSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the MyShoppingList.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public MyShoppingListSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the MyShoppingList.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public MyShoppingListSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the MyShoppingList.</p>
     * @param fields value to be set
     * @return Builder
     */

    public MyShoppingListSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the MyShoppingList with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the MyShoppingList.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the MyShoppingList.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds MyShoppingListSetCustomTypeAction with checking for non-null required values
     * @return MyShoppingListSetCustomTypeAction
     */
    public MyShoppingListSetCustomTypeAction build() {
        return new MyShoppingListSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds MyShoppingListSetCustomTypeAction without checking for non-null required values
     * @return MyShoppingListSetCustomTypeAction
     */
    public MyShoppingListSetCustomTypeAction buildUnchecked() {
        return new MyShoppingListSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of MyShoppingListSetCustomTypeActionBuilder
     * @return builder
     */
    public static MyShoppingListSetCustomTypeActionBuilder of() {
        return new MyShoppingListSetCustomTypeActionBuilder();
    }

    /**
     * create builder for MyShoppingListSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetCustomTypeActionBuilder of(final MyShoppingListSetCustomTypeAction template) {
        MyShoppingListSetCustomTypeActionBuilder builder = new MyShoppingListSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
