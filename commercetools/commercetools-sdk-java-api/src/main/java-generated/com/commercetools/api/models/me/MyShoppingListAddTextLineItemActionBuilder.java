
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListAddTextLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListAddTextLineItemAction myShoppingListAddTextLineItemAction = MyShoppingListAddTextLineItemAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListAddTextLineItemActionBuilder implements Builder<MyShoppingListAddTextLineItemAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private Long quantity;

    @Nullable
    private java.time.ZonedDateTime addedAt;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public MyShoppingListAddTextLineItemActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public MyShoppingListAddTextLineItemActionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a>.</p>
     * @param name value to be set
     * @return Builder
     */

    public MyShoppingListAddTextLineItemActionBuilder name(
            final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined identifier of the TextLineItem. Must be unique per <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param key value to be set
     * @return Builder
     */

    public MyShoppingListAddTextLineItemActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Description of the TextLineItem.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public MyShoppingListAddTextLineItemActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the TextLineItem.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public MyShoppingListAddTextLineItemActionBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the TextLineItem.</p>
     * @param description value to be set
     * @return Builder
     */

    public MyShoppingListAddTextLineItemActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Number of entries in the TextLineItem.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public MyShoppingListAddTextLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Date and time the TextLineItem is added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>. If not set, the current date and time (UTC) is used.</p>
     * @param addedAt value to be set
     * @return Builder
     */

    public MyShoppingListAddTextLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>Custom Fields defined for the TextLineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyShoppingListAddTextLineItemActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields defined for the TextLineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyShoppingListAddTextLineItemActionBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields defined for the TextLineItem.</p>
     * @param custom value to be set
     * @return Builder
     */

    public MyShoppingListAddTextLineItemActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a>.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined identifier of the TextLineItem. Must be unique per <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Description of the TextLineItem.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Number of entries in the TextLineItem.</p>
     * @return quantity
     */

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Date and time the TextLineItem is added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>. If not set, the current date and time (UTC) is used.</p>
     * @return addedAt
     */

    @Nullable
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
     *  <p>Custom Fields defined for the TextLineItem.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds MyShoppingListAddTextLineItemAction with checking for non-null required values
     * @return MyShoppingListAddTextLineItemAction
     */
    public MyShoppingListAddTextLineItemAction build() {
        Objects.requireNonNull(name, MyShoppingListAddTextLineItemAction.class + ": name is missing");
        return new MyShoppingListAddTextLineItemActionImpl(name, key, description, quantity, addedAt, custom);
    }

    /**
     * builds MyShoppingListAddTextLineItemAction without checking for non-null required values
     * @return MyShoppingListAddTextLineItemAction
     */
    public MyShoppingListAddTextLineItemAction buildUnchecked() {
        return new MyShoppingListAddTextLineItemActionImpl(name, key, description, quantity, addedAt, custom);
    }

    /**
     * factory method for an instance of MyShoppingListAddTextLineItemActionBuilder
     * @return builder
     */
    public static MyShoppingListAddTextLineItemActionBuilder of() {
        return new MyShoppingListAddTextLineItemActionBuilder();
    }

    /**
     * create builder for MyShoppingListAddTextLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListAddTextLineItemActionBuilder of(final MyShoppingListAddTextLineItemAction template) {
        MyShoppingListAddTextLineItemActionBuilder builder = new MyShoppingListAddTextLineItemActionBuilder();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.quantity = template.getQuantity();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        return builder;
    }

}
