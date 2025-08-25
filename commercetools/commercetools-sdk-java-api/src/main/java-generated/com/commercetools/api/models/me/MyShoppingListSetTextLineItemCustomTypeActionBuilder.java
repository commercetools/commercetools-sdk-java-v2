
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetTextLineItemCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetTextLineItemCustomTypeAction myShoppingListSetTextLineItemCustomTypeAction = MyShoppingListSetTextLineItemCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListSetTextLineItemCustomTypeActionBuilder
        implements Builder<MyShoppingListSetTextLineItemCustomTypeAction> {

    @Nullable
    private String textLineItemId;

    @Nullable
    private String textLineItemKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemId value to be set
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomTypeActionBuilder textLineItemId(@Nullable final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemKey value to be set
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomTypeActionBuilder textLineItemKey(
            @Nullable final String textLineItemKey) {
        this.textLineItemKey = textLineItemKey;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the TextLineItem with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the TextLineItem.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the TextLineItem with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the TextLineItem.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the TextLineItem with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the TextLineItem.</p>
     * @param type value to be set
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the TextLineItem.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the TextLineItem.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the TextLineItem.</p>
     * @param fields value to be set
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemId
     */

    @Nullable
    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemKey
     */

    @Nullable
    public String getTextLineItemKey() {
        return this.textLineItemKey;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the TextLineItem with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the TextLineItem.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the TextLineItem.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds MyShoppingListSetTextLineItemCustomTypeAction with checking for non-null required values
     * @return MyShoppingListSetTextLineItemCustomTypeAction
     */
    public MyShoppingListSetTextLineItemCustomTypeAction build() {
        return new MyShoppingListSetTextLineItemCustomTypeActionImpl(textLineItemId, textLineItemKey, type, fields);
    }

    /**
     * builds MyShoppingListSetTextLineItemCustomTypeAction without checking for non-null required values
     * @return MyShoppingListSetTextLineItemCustomTypeAction
     */
    public MyShoppingListSetTextLineItemCustomTypeAction buildUnchecked() {
        return new MyShoppingListSetTextLineItemCustomTypeActionImpl(textLineItemId, textLineItemKey, type, fields);
    }

    /**
     * factory method for an instance of MyShoppingListSetTextLineItemCustomTypeActionBuilder
     * @return builder
     */
    public static MyShoppingListSetTextLineItemCustomTypeActionBuilder of() {
        return new MyShoppingListSetTextLineItemCustomTypeActionBuilder();
    }

    /**
     * create builder for MyShoppingListSetTextLineItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetTextLineItemCustomTypeActionBuilder of(
            final MyShoppingListSetTextLineItemCustomTypeAction template) {
        MyShoppingListSetTextLineItemCustomTypeActionBuilder builder = new MyShoppingListSetTextLineItemCustomTypeActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.textLineItemKey = template.getTextLineItemKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
