
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
 *  <p>The ProductVariant to be included in the ShoppingListLineItem must be specified using the <code>productID</code> and <code>variantID</code>, or by the <code>sku</code>. If the ShoppingList already contains a ShoppingListLineItem for the same Product Variant with the same Custom Fields, then only the quantity of the existing ShoppingListLineItem is increased. A ShoppingListLineItem with an empty <code>variantId</code> is not considered the same as a ShoppingListLineItem with a <code>variantId</code> currently referring to the Master Variant.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListAddLineItemAction shoppingListAddLineItemAction = ShoppingListAddLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListAddLineItemActionImpl.class)
public interface ShoppingListAddLineItemAction extends ShoppingListUpdateAction,
        com.commercetools.api.models.CustomizableDraft<ShoppingListAddLineItemAction> {

    String ADD_LINE_ITEM = "addLineItem";

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     */

    @JsonProperty("sku")
    public String getSku();

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
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>Custom Fields defined for the ShoppingListLineItem.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setSku(final String sku);

    public void setProductId(final String productId);

    public void setVariantId(final Long variantId);

    public void setQuantity(final Long quantity);

    public void setAddedAt(final ZonedDateTime addedAt);

    public void setCustom(final CustomFieldsDraft custom);

    public static ShoppingListAddLineItemAction of() {
        return new ShoppingListAddLineItemActionImpl();
    }

    public static ShoppingListAddLineItemAction of(final ShoppingListAddLineItemAction template) {
        ShoppingListAddLineItemActionImpl instance = new ShoppingListAddLineItemActionImpl();
        instance.setSku(template.getSku());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static ShoppingListAddLineItemActionBuilder builder() {
        return ShoppingListAddLineItemActionBuilder.of();
    }

    public static ShoppingListAddLineItemActionBuilder builder(final ShoppingListAddLineItemAction template) {
        return ShoppingListAddLineItemActionBuilder.of(template);
    }

    default <T> T withShoppingListAddLineItemAction(Function<ShoppingListAddLineItemAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListAddLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListAddLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListAddLineItemAction>";
            }
        };
    }
}
