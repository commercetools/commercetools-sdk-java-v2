
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>TextLineItems are Line Items that use text values instead of references to Products.</p>
 *
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TextLineItemImpl.class)
public interface TextLineItem extends com.commercetools.api.models.Customizable<TextLineItem> {

    /**
     *  <p>Date and time (UTC) the TextLineItem was added to the ShoppingList.</p>
     * @return addedAt
     */
    @NotNull
    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>Custom Fields of the TextLineItem.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Description of the TextLineItem.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Unique identifier of the TextLineItem.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Name of the TextLineItem.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Number of entries in the TextLineItem.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Date and time (UTC) the TextLineItem was added to the ShoppingList.</p>
     * @param addedAt value to be set
     */

    public void setAddedAt(final ZonedDateTime addedAt);

    /**
     *  <p>Custom Fields of the TextLineItem.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Description of the TextLineItem.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Unique identifier of the TextLineItem.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Name of the TextLineItem.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Number of entries in the TextLineItem.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of TextLineItem
     */
    public static TextLineItem of() {
        return new TextLineItemImpl();
    }

    /**
     * factory method to create a shallow copy TextLineItem
     * @param template instance to be copied
     * @return copy instance
     */
    public static TextLineItem of(final TextLineItem template) {
        TextLineItemImpl instance = new TextLineItemImpl();
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        instance.setDescription(template.getDescription());
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * factory method to create a deep copy of TextLineItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TextLineItem deepCopy(@Nullable final TextLineItem template) {
        if (template == null) {
            return null;
        }
        TextLineItemImpl instance = new TextLineItemImpl();
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFields::deepCopy)
                .orElse(null));
        instance.setDescription(Optional.ofNullable(template.getDescription())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setId(template.getId());
        instance.setName(Optional.ofNullable(template.getName())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for TextLineItem
     * @return builder
     */
    public static TextLineItemBuilder builder() {
        return TextLineItemBuilder.of();
    }

    /**
     * create builder for TextLineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TextLineItemBuilder builder(final TextLineItem template) {
        return TextLineItemBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTextLineItem(Function<TextLineItem, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TextLineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TextLineItem>() {
            @Override
            public String toString() {
                return "TypeReference<TextLineItem>";
            }
        };
    }
}
