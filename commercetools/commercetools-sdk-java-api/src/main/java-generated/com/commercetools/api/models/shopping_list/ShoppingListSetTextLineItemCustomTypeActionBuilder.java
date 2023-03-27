
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetTextLineItemCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetTextLineItemCustomTypeAction shoppingListSetTextLineItemCustomTypeAction = ShoppingListSetTextLineItemCustomTypeAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetTextLineItemCustomTypeActionBuilder
        implements Builder<ShoppingListSetTextLineItemCustomTypeAction> {

    private String textLineItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @param textLineItemId value to be set
     * @return Builder
     */

    public ShoppingListSetTextLineItemCustomTypeActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the TextLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the TextLineItem.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ShoppingListSetTextLineItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the TextLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the TextLineItem.</p>
     * @param type value to be set
     * @return Builder
     */

    public ShoppingListSetTextLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the TextLineItem.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ShoppingListSetTextLineItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the TextLineItem.</p>
     * @param fields value to be set
     * @return Builder
     */

    public ShoppingListSetTextLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @return textLineItemId
     */

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    /**
     *  <p>Defines the Type that extends the TextLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the TextLineItem.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the TextLineItem.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds ShoppingListSetTextLineItemCustomTypeAction with checking for non-null required values
     * @return ShoppingListSetTextLineItemCustomTypeAction
     */
    public ShoppingListSetTextLineItemCustomTypeAction build() {
        Objects.requireNonNull(textLineItemId,
            ShoppingListSetTextLineItemCustomTypeAction.class + ": textLineItemId is missing");
        return new ShoppingListSetTextLineItemCustomTypeActionImpl(textLineItemId, type, fields);
    }

    /**
     * builds ShoppingListSetTextLineItemCustomTypeAction without checking for non-null required values
     * @return ShoppingListSetTextLineItemCustomTypeAction
     */
    public ShoppingListSetTextLineItemCustomTypeAction buildUnchecked() {
        return new ShoppingListSetTextLineItemCustomTypeActionImpl(textLineItemId, type, fields);
    }

    /**
     * factory method for an instance of ShoppingListSetTextLineItemCustomTypeActionBuilder
     * @return builder
     */
    public static ShoppingListSetTextLineItemCustomTypeActionBuilder of() {
        return new ShoppingListSetTextLineItemCustomTypeActionBuilder();
    }

    /**
     * create builder for ShoppingListSetTextLineItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetTextLineItemCustomTypeActionBuilder of(
            final ShoppingListSetTextLineItemCustomTypeAction template) {
        ShoppingListSetTextLineItemCustomTypeActionBuilder builder = new ShoppingListSetTextLineItemCustomTypeActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
