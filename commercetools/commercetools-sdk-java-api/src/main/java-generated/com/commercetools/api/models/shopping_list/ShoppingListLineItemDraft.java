
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *  <p>Unique identifier of a Product.</p>
     */

    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p><code>id</code> of the ProductVariant. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Date and time the ShoppingListLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    public void setProductId(final String productId);

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setAddedAt(final ZonedDateTime addedAt);

    public void setCustom(final CustomFieldsDraft custom);

    public void setQuantity(final Long quantity);

    public static ShoppingListLineItemDraft of() {
        return new ShoppingListLineItemDraftImpl();
    }

    public static ShoppingListLineItemDraft of(final ShoppingListLineItemDraft template) {
        ShoppingListLineItemDraftImpl instance = new ShoppingListLineItemDraftImpl();
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static ShoppingListLineItemDraftBuilder builder() {
        return ShoppingListLineItemDraftBuilder.of();
    }

    public static ShoppingListLineItemDraftBuilder builder(final ShoppingListLineItemDraft template) {
        return ShoppingListLineItemDraftBuilder.of(template);
    }

    default <T> T withShoppingListLineItemDraft(Function<ShoppingListLineItemDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListLineItemDraft>";
            }
        };
    }
}
