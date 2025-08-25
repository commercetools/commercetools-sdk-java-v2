
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * TextLineItemDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TextLineItemDraft textLineItemDraft = TextLineItemDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TextLineItemDraftImpl.class)
public interface TextLineItemDraft extends com.commercetools.api.models.CustomizableDraft<TextLineItemDraft>,
        io.vrap.rmf.base.client.Draft<TextLineItemDraft> {

    /**
     *  <p>User-defined unique identifier of the TextLineItem. Must be unique per <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Date and time the TextLineItem is added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>. If not set, the current date and time (UTC) is used.</p>
     * @return addedAt
     */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>Custom Fields for the TextLineItem.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Description of the TextLineItem.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

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

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>User-defined unique identifier of the TextLineItem. Must be unique per <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Date and time the TextLineItem is added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>. If not set, the current date and time (UTC) is used.</p>
     * @param addedAt value to be set
     */

    public void setAddedAt(final ZonedDateTime addedAt);

    /**
     *  <p>Custom Fields for the TextLineItem.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>Description of the TextLineItem.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

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
     * @return instance of TextLineItemDraft
     */
    public static TextLineItemDraft of() {
        return new TextLineItemDraftImpl();
    }

    /**
     * factory method to create a shallow copy TextLineItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static TextLineItemDraft of(final TextLineItemDraft template) {
        TextLineItemDraftImpl instance = new TextLineItemDraftImpl();
        instance.setKey(template.getKey());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        instance.setDescription(template.getDescription());
        instance.setName(template.getName());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public TextLineItemDraft copyDeep();

    /**
     * factory method to create a deep copy of TextLineItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TextLineItemDraft deepCopy(@Nullable final TextLineItemDraft template) {
        if (template == null) {
            return null;
        }
        TextLineItemDraftImpl instance = new TextLineItemDraftImpl();
        instance.setKey(template.getKey());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for TextLineItemDraft
     * @return builder
     */
    public static TextLineItemDraftBuilder builder() {
        return TextLineItemDraftBuilder.of();
    }

    /**
     * create builder for TextLineItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TextLineItemDraftBuilder builder(final TextLineItemDraft template) {
        return TextLineItemDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTextLineItemDraft(Function<TextLineItemDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TextLineItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TextLineItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TextLineItemDraft>";
            }
        };
    }
}
