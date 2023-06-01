package com.commercetools.history.models.common;

import com.commercetools.history.models.common.CustomFields;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.TextLineItem;
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
 *             .addedAt("{addedAt}")
 *             .custom(customBuilder -> customBuilder)
 *             .description(descriptionBuilder -> descriptionBuilder)
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .quantity(1)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TextLineItemBuilder implements Builder<TextLineItem> {

    
    
    private String addedAt;
    
    
    
    private com.commercetools.history.models.common.CustomFields custom;
    
    
    
    private com.commercetools.history.models.common.LocalizedString description;
    
    
    
    private String id;
    
    
    
    private com.commercetools.history.models.common.LocalizedString name;
    
    
    
    private Integer quantity;

    
    /**
     * set the value to the addedAt
     * @param addedAt value to be set
     * @return Builder
     */
    
    public TextLineItemBuilder addedAt( final String addedAt) {
        this.addedAt = addedAt;
        return this;
    }
    
    
    
    
    /**
     * set the value to the custom using the builder function
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public TextLineItemBuilder custom(Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the custom using the builder function
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public TextLineItemBuilder withCustom(Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the custom
     * @param custom value to be set
     * @return Builder
     */
    
    public TextLineItemBuilder custom( final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
        return this;
    }
    
    
    
    
    /**
     * set the value to the description using the builder function
     * @param builder function to build the description value
     * @return Builder
     */
    
    public TextLineItemBuilder description(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the description using the builder function
     * @param builder function to build the description value
     * @return Builder
     */
    
    public TextLineItemBuilder withDescription(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the description
     * @param description value to be set
     * @return Builder
     */
    
    public TextLineItemBuilder description( final com.commercetools.history.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    
    
    
    /**
     * set the value to the id
     * @param id value to be set
     * @return Builder
     */
    
    public TextLineItemBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     * set the value to the name using the builder function
     * @param builder function to build the name value
     * @return Builder
     */
    
    public TextLineItemBuilder name(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the name using the builder function
     * @param builder function to build the name value
     * @return Builder
     */
    
    public TextLineItemBuilder withName(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */
    
    public TextLineItemBuilder name( final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */
    
    public TextLineItemBuilder quantity( final Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    
    

    /**
     * value of addedAt}
     * @return addedAt
     */
    
    
    public String getAddedAt(){
        return this.addedAt;
    }
    
    /**
     * value of custom}
     * @return custom
     */
    
    
    public com.commercetools.history.models.common.CustomFields getCustom(){
        return this.custom;
    }
    
    /**
     * value of description}
     * @return description
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
     * value of id}
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     * value of name}
     * @return name
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     * value of quantity}
     * @return quantity
     */
    
    
    public Integer getQuantity(){
        return this.quantity;
    }

    /**
     * builds TextLineItem with checking for non-null required values
     * @return TextLineItem
     */
    public TextLineItem build() {
        Objects.requireNonNull(addedAt, TextLineItem.class + ": addedAt is missing");
        Objects.requireNonNull(custom, TextLineItem.class + ": custom is missing");
        Objects.requireNonNull(description, TextLineItem.class + ": description is missing");
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
