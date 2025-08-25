
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetLineItemCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetLineItemCustomTypeAction shoppingListSetLineItemCustomTypeAction = ShoppingListSetLineItemCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetLineItemCustomTypeActionBuilder
        implements Builder<ShoppingListSetLineItemCustomTypeAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public ShoppingListSetLineItemCustomTypeActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public ShoppingListSetLineItemCustomTypeActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ShoppingListLineItem with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShoppingListLineItem.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ShoppingListSetLineItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ShoppingListLineItem with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShoppingListLineItem.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ShoppingListSetLineItemCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ShoppingListLineItem with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShoppingListLineItem.</p>
     * @param type value to be set
     * @return Builder
     */

    public ShoppingListSetLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ShoppingListLineItem.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ShoppingListSetLineItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ShoppingListLineItem.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ShoppingListSetLineItemCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ShoppingListLineItem.</p>
     * @param fields value to be set
     * @return Builder
     */

    public ShoppingListSetLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ShoppingListLineItem with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShoppingListLineItem.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ShoppingListLineItem.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds ShoppingListSetLineItemCustomTypeAction with checking for non-null required values
     * @return ShoppingListSetLineItemCustomTypeAction
     */
    public ShoppingListSetLineItemCustomTypeAction build() {
        return new ShoppingListSetLineItemCustomTypeActionImpl(lineItemId, lineItemKey, type, fields);
    }

    /**
     * builds ShoppingListSetLineItemCustomTypeAction without checking for non-null required values
     * @return ShoppingListSetLineItemCustomTypeAction
     */
    public ShoppingListSetLineItemCustomTypeAction buildUnchecked() {
        return new ShoppingListSetLineItemCustomTypeActionImpl(lineItemId, lineItemKey, type, fields);
    }

    /**
     * factory method for an instance of ShoppingListSetLineItemCustomTypeActionBuilder
     * @return builder
     */
    public static ShoppingListSetLineItemCustomTypeActionBuilder of() {
        return new ShoppingListSetLineItemCustomTypeActionBuilder();
    }

    /**
     * create builder for ShoppingListSetLineItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetLineItemCustomTypeActionBuilder of(
            final ShoppingListSetLineItemCustomTypeAction template) {
        ShoppingListSetLineItemCustomTypeActionBuilder builder = new ShoppingListSetLineItemCustomTypeActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
