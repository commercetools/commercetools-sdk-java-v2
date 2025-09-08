
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
 *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be included in the ShoppingListLineItem must be specified using the <code>productID</code> and <code>variantID</code>, or by the <code>sku</code>. If the ShoppingList already contains a ShoppingListLineItem for the same Product Variant with the same Custom Fields, then only the quantity of the existing ShoppingListLineItem is increased. A ShoppingListLineItem with an empty <code>variantId</code> is not considered the same as a ShoppingListLineItem with a <code>variantId</code> currently referring to the Master Variant.</p>
 *  <p>Product Attributes are merged with Variant Attributes to ensure the full Attribute context of the Product Variant.</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItemAddedMessage" rel="nofollow">Shopping List Line Item Added</a> Message.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("addLineItem")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListAddLineItemActionImpl.class)
public interface ShoppingListAddLineItemAction extends ShoppingListUpdateAction,
        com.commercetools.api.models.CustomizableDraft<ShoppingListAddLineItemAction> {

    /**
     * discriminator value for ShoppingListAddLineItemAction
     */
    String ADD_LINE_ITEM = "addLineItem";

    /**
     *  <p>User-defined identifier of the ShoppingListLineItem. Must be unique per <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Unique identifier of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return productId
     */

    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @return quantity
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Date and time the ShoppingListLineItem is added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>. If not set, the current date and time (UTC) is used.</p>
     * @return addedAt
     */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>Custom Fields defined for the ShoppingListLineItem.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined identifier of the ShoppingListLineItem. Must be unique per <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Unique identifier of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>Date and time the ShoppingListLineItem is added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>. If not set, the current date and time (UTC) is used.</p>
     * @param addedAt value to be set
     */

    public void setAddedAt(final ZonedDateTime addedAt);

    /**
     *  <p>Custom Fields defined for the ShoppingListLineItem.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of ShoppingListAddLineItemAction
     */
    public static ShoppingListAddLineItemAction of() {
        return new ShoppingListAddLineItemActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListAddLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListAddLineItemAction of(final ShoppingListAddLineItemAction template) {
        ShoppingListAddLineItemActionImpl instance = new ShoppingListAddLineItemActionImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public ShoppingListAddLineItemAction copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListAddLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListAddLineItemAction deepCopy(@Nullable final ShoppingListAddLineItemAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListAddLineItemActionImpl instance = new ShoppingListAddLineItemActionImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListAddLineItemAction
     * @return builder
     */
    public static ShoppingListAddLineItemActionBuilder builder() {
        return ShoppingListAddLineItemActionBuilder.of();
    }

    /**
     * create builder for ShoppingListAddLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListAddLineItemActionBuilder builder(final ShoppingListAddLineItemAction template) {
        return ShoppingListAddLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListAddLineItemAction(Function<ShoppingListAddLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListAddLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListAddLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListAddLineItemAction>";
            }
        };
    }
}
