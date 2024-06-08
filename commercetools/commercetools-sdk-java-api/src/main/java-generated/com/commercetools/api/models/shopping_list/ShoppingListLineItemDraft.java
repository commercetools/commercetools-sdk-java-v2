
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>The ProductVariant to be included in the ShoppingListLineItem must be specified using the <code>productID</code> and <code>variantID</code>, or by the <code>sku</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListLineItemDraft shoppingListLineItemDraft = ShoppingListLineItemDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListLineItemDraftImpl.class)
public interface ShoppingListLineItemDraft
        extends com.commercetools.api.models.CustomizableDraft<ShoppingListLineItemDraft>,
        io.vrap.rmf.base.client.Draft<ShoppingListLineItemDraft> {

    /**
     *  <p>User-defined identifier of the ShoppingListLineItem. Must be unique per ShoppingList.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of a Product.</p>
     * @return productId
     */

    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p><code>id</code> of the ProductVariant. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Date and time the ShoppingListLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @return addedAt
     */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @return quantity
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>User-defined identifier of the ShoppingListLineItem. Must be unique per ShoppingList.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Unique identifier of a Product.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p><code>id</code> of the ProductVariant. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Date and time the ShoppingListLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @param addedAt value to be set
     */

    public void setAddedAt(final ZonedDateTime addedAt);

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of ShoppingListLineItemDraft
     */
    public static ShoppingListLineItemDraft of() {
        return new ShoppingListLineItemDraftImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListLineItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListLineItemDraft of(final ShoppingListLineItemDraft template) {
        ShoppingListLineItemDraftImpl instance = new ShoppingListLineItemDraftImpl();
        instance.setKey(template.getKey());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingListLineItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListLineItemDraft deepCopy(@Nullable final ShoppingListLineItemDraft template) {
        if (template == null) {
            return null;
        }
        ShoppingListLineItemDraftImpl instance = new ShoppingListLineItemDraftImpl();
        instance.setKey(template.getKey());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for ShoppingListLineItemDraft
     * @return builder
     */
    public static ShoppingListLineItemDraftBuilder builder() {
        return ShoppingListLineItemDraftBuilder.of();
    }

    /**
     * create builder for ShoppingListLineItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListLineItemDraftBuilder builder(final ShoppingListLineItemDraft template) {
        return ShoppingListLineItemDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListLineItemDraft(Function<ShoppingListLineItemDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListLineItemDraft>";
            }
        };
    }
}
