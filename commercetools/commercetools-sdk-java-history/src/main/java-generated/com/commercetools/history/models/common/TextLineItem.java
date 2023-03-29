
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TextLineItem
 *
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TextLineItemImpl.class)
public interface TextLineItem {

    /**
     *
     * @return addedAt
     */
    @NotNull
    @JsonProperty("addedAt")
    public String getAddedAt();

    /**
     *
     * @return custom
     */
    @NotNull
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *
     * @return description
     */
    @NotNull
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    /**
     * set addedAt
     * @param addedAt value to be set
     */

    public void setAddedAt(final String addedAt);

    /**
     * set custom
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * set description
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * set quantity
     * @param quantity value to be set
     */

    public void setQuantity(final Integer quantity);

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
        instance.setCustom(com.commercetools.history.models.common.CustomFields.deepCopy(template.getCustom()));
        instance.setDescription(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setId(template.getId());
        instance.setName(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getName()));
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
