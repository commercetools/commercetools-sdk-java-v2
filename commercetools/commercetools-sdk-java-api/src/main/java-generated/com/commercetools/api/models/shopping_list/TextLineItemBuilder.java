package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.shopping_list.TextLineItem;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TextLineItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TextLineItem textLineItem = TextLineItem.builder()
 *             .addedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TextLineItemBuilder implements Builder<TextLineItem> {

    
    
    private java.time.ZonedDateTime addedAt;
    
    
    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;
    
    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;
    
    
    
    private String id;
    
    
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    
    
    private Long quantity;

    
    /**
     *  <p>Date and time (UTC) the TextLineItem was added to the ShoppingList.</p>
     * @param addedAt value to be set
     * @return Builder
     */
    
    public TextLineItemBuilder addedAt( final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Custom Fields of the TextLineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public TextLineItemBuilder custom(Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Custom Fields of the TextLineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public TextLineItemBuilder withCustom(Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Custom Fields of the TextLineItem.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public TextLineItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }
    
    
    
    
    /**
     *  <p>Description of the TextLineItem.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public TextLineItemBuilder description(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Description of the TextLineItem.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public TextLineItemBuilder withDescription(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Description of the TextLineItem.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public TextLineItemBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    
    
    
    /**
     *  <p>Unique identifier of the TextLineItem.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public TextLineItemBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the TextLineItem.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public TextLineItemBuilder name(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Name of the TextLineItem.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public TextLineItemBuilder withName(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Name of the TextLineItem.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public TextLineItemBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>Number of entries in the TextLineItem.</p>
     * @param quantity value to be set
     * @return Builder
     */
    
    public TextLineItemBuilder quantity( final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    

    /**
     *  <p>Date and time (UTC) the TextLineItem was added to the ShoppingList.</p>
     * @return addedAt
     */
    
    
    public java.time.ZonedDateTime getAddedAt(){
        return this.addedAt;
    }
    
    /**
     *  <p>Custom Fields of the TextLineItem.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
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
     *  <p>Unique identifier of the TextLineItem.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Name of the TextLineItem.</p>
     * @return name
     */
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *  <p>Number of entries in the TextLineItem.</p>
     * @return quantity
     */
    
    
    public Long getQuantity(){
        return this.quantity;
    }

    /**
     * builds TextLineItem with checking for non-null required values
     * @return TextLineItem
     */
    public TextLineItem build() {
        Objects.requireNonNull(addedAt, TextLineItem.class + ": addedAt is missing");
        Objects.requireNonNull(id, TextLineItem.class + ": id is missing");
        Objects.requireNonNull(name, TextLineItem.class + ": name is missing");
        Objects.requireNonNull(quantity, TextLineItem.class + ": quantity is missing");
        return new TextLineItemImpl(addedAt, custom, description, id, name, quantity);
    }
    
    /**
     * builds TextLineItem without checking for non-null required values
     * @return TextLineItem
     */
    public TextLineItem buildUnchecked() {
        return new TextLineItemImpl(addedAt, custom, description, id, name, quantity);
    }

    /**
     * factory method for an instance of TextLineItemBuilder
     * @return builder 
     */
    public static TextLineItemBuilder of() {
        return new TextLineItemBuilder();
    }

    /**
     * create builder for TextLineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TextLineItemBuilder of(final TextLineItem template) {
        TextLineItemBuilder builder = new TextLineItemBuilder();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        builder.description = template.getDescription();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
