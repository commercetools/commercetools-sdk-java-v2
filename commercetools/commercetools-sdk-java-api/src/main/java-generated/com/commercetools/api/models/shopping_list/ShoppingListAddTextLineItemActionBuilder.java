package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListAddTextLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListAddTextLineItemAction shoppingListAddTextLineItemAction = ShoppingListAddTextLineItemAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListAddTextLineItemActionBuilder implements Builder<ShoppingListAddTextLineItemAction> {

    
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;
    
    
    @Nullable
    private Long quantity;
    
    
    @Nullable
    private java.time.ZonedDateTime addedAt;
    
    
    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    
    /**
     *  <p>Name of the TextLineItem.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public ShoppingListAddTextLineItemActionBuilder name(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Name of the TextLineItem.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public ShoppingListAddTextLineItemActionBuilder withName(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Name of the TextLineItem.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public ShoppingListAddTextLineItemActionBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>Description of the TextLineItem.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public ShoppingListAddTextLineItemActionBuilder description(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Description of the TextLineItem.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public ShoppingListAddTextLineItemActionBuilder withDescription(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Description of the TextLineItem.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public ShoppingListAddTextLineItemActionBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    
    
    
    /**
     *  <p>Number of entries in the TextLineItem.</p>
     * @param quantity value to be set
     * @return Builder
     */
    
    public ShoppingListAddTextLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @param addedAt value to be set
     * @return Builder
     */
    
    public ShoppingListAddTextLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Custom Fields defined for the TextLineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public ShoppingListAddTextLineItemActionBuilder custom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Custom Fields defined for the TextLineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public ShoppingListAddTextLineItemActionBuilder withCustom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Custom Fields defined for the TextLineItem.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public ShoppingListAddTextLineItemActionBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }
    
    

    /**
     *  <p>Name of the TextLineItem.</p>
     * @return name
     */
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *  <p>Description of the TextLineItem.</p>
     * @return description
     */
    
    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
     *  <p>Number of entries in the TextLineItem.</p>
     * @return quantity
     */
    
    @Nullable
    public Long getQuantity(){
        return this.quantity;
    }
    
    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @return addedAt
     */
    
    @Nullable
    public java.time.ZonedDateTime getAddedAt(){
        return this.addedAt;
    }
    
    /**
     *  <p>Custom Fields defined for the TextLineItem.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }

    /**
     * builds ShoppingListAddTextLineItemAction with checking for non-null required values
     * @return ShoppingListAddTextLineItemAction
     */
    public ShoppingListAddTextLineItemAction build() {
        Objects.requireNonNull(name, ShoppingListAddTextLineItemAction.class + ": name is missing");
        return new ShoppingListAddTextLineItemActionImpl(name, description, quantity, addedAt, custom);
    }
    
    /**
     * builds ShoppingListAddTextLineItemAction without checking for non-null required values
     * @return ShoppingListAddTextLineItemAction
     */
    public ShoppingListAddTextLineItemAction buildUnchecked() {
        return new ShoppingListAddTextLineItemActionImpl(name, description, quantity, addedAt, custom);
    }

    /**
     * factory method for an instance of ShoppingListAddTextLineItemActionBuilder
     * @return builder 
     */
    public static ShoppingListAddTextLineItemActionBuilder of() {
        return new ShoppingListAddTextLineItemActionBuilder();
    }

    /**
     * create builder for ShoppingListAddTextLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListAddTextLineItemActionBuilder of(final ShoppingListAddTextLineItemAction template) {
        ShoppingListAddTextLineItemActionBuilder builder = new ShoppingListAddTextLineItemActionBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.quantity = template.getQuantity();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        return builder;
    }

}
