
package com.commercetools.history.models.common;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>ShoppingListLineItems are Line Items that contain references to <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a> in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
 *  <p>In addition to standard <span>Reference Expansion</span>, a ShoppingListLineItem offers expansion on <code>productSlug</code> and <code>variant</code>, defined with the query parameter <code>expand</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListLineItem shoppingListLineItem = ShoppingListLineItem.builder()
 *             .addedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .productId("{productId}")
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .published(true)
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListLineItemImpl.class)
public interface ShoppingListLineItem {

    /**
     *  <p>Date and time (UTC) the ShoppingListLineItem was added to the ShoppingList.</p>
     * @return addedAt
     */
    @NotNull
    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>If the Product or Product Variant is deleted, <code>deactivatedAt</code> is the date and time (UTC) of deletion.</p>
     *  <p>This data is updated in an <span>eventual consistent manner</span> when the Product Variant cannot be ordered anymore.</p>
     * @return deactivatedAt
     */

    @JsonProperty("deactivatedAt")
    public ZonedDateTime getDeactivatedAt();

    /**
     *  <p>Unique identifier of the ShoppingListLineItem.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined identifier of the ShoppingListLineItem. It is unique per <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the Product.</p>
     *  <p>This data is updated in an <span>eventual consistent manner</span> when the Product's name changes.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Unique identifier of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return productId
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p>The Product Type defining the Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return productType
     */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeReference getProductType();

    /**
     *  <p>Whether the related <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> is published or not.</p>
     *  <p>This data is updated in an <span>eventual consistent manner</span> when the Product's published status changes.</p>
     * @return published
     */
    @NotNull
    @JsonProperty("published")
    public Boolean getPublished();

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> the ShoppingListLineItem refers to. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Data of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>. This data includes all the Product Attributes and Variant Attributes to ensure the full Attribute context of the Product Variant.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].variant</code>. You cannot expand only a single element of the array.</p>
     * @return variant
     */
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();

    /**
     *  <p>Slug of the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductData" rel="nofollow">ProductData</a>.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].productSlug</code>. You cannot expand only a single element of the array.</p>
     * @return productSlug
     */
    @Valid
    @JsonProperty("productSlug")
    public LocalizedString getProductSlug();

    /**
     *  <p>Date and time (UTC) the ShoppingListLineItem was added to the ShoppingList.</p>
     * @param addedAt value to be set
     */

    public void setAddedAt(final ZonedDateTime addedAt);

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>If the Product or Product Variant is deleted, <code>deactivatedAt</code> is the date and time (UTC) of deletion.</p>
     *  <p>This data is updated in an <span>eventual consistent manner</span> when the Product Variant cannot be ordered anymore.</p>
     * @param deactivatedAt value to be set
     */

    public void setDeactivatedAt(final ZonedDateTime deactivatedAt);

    /**
     *  <p>Unique identifier of the ShoppingListLineItem.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined identifier of the ShoppingListLineItem. It is unique per <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the Product.</p>
     *  <p>This data is updated in an <span>eventual consistent manner</span> when the Product's name changes.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Unique identifier of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p>The Product Type defining the Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param productType value to be set
     */

    public void setProductType(final ProductTypeReference productType);

    /**
     *  <p>Whether the related <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> is published or not.</p>
     *  <p>This data is updated in an <span>eventual consistent manner</span> when the Product's published status changes.</p>
     * @param published value to be set
     */

    public void setPublished(final Boolean published);

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> the ShoppingListLineItem refers to. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>Data of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>. This data includes all the Product Attributes and Variant Attributes to ensure the full Attribute context of the Product Variant.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].variant</code>. You cannot expand only a single element of the array.</p>
     * @param variant value to be set
     */

    public void setVariant(final ProductVariant variant);

    /**
     *  <p>Slug of the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductData" rel="nofollow">ProductData</a>.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].productSlug</code>. You cannot expand only a single element of the array.</p>
     * @param productSlug value to be set
     */

    public void setProductSlug(final LocalizedString productSlug);

    /**
     * factory method
     * @return instance of ShoppingListLineItem
     */
    public static ShoppingListLineItem of() {
        return new ShoppingListLineItemImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListLineItem
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListLineItem of(final ShoppingListLineItem template) {
        ShoppingListLineItemImpl instance = new ShoppingListLineItemImpl();
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        instance.setDeactivatedAt(template.getDeactivatedAt());
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setProductId(template.getProductId());
        instance.setProductType(template.getProductType());
        instance.setPublished(template.getPublished());
        instance.setQuantity(template.getQuantity());
        instance.setVariantId(template.getVariantId());
        instance.setVariant(template.getVariant());
        instance.setProductSlug(template.getProductSlug());
        return instance;
    }

    public ShoppingListLineItem copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListLineItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListLineItem deepCopy(@Nullable final ShoppingListLineItem template) {
        if (template == null) {
            return null;
        }
        ShoppingListLineItemImpl instance = new ShoppingListLineItemImpl();
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(com.commercetools.history.models.common.CustomFields.deepCopy(template.getCustom()));
        instance.setDeactivatedAt(template.getDeactivatedAt());
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setProductId(template.getProductId());
        instance.setProductType(
            com.commercetools.history.models.common.ProductTypeReference.deepCopy(template.getProductType()));
        instance.setPublished(template.getPublished());
        instance.setQuantity(template.getQuantity());
        instance.setVariantId(template.getVariantId());
        instance.setVariant(com.commercetools.history.models.common.ProductVariant.deepCopy(template.getVariant()));
        instance.setProductSlug(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getProductSlug()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListLineItem
     * @return builder
     */
    public static ShoppingListLineItemBuilder builder() {
        return ShoppingListLineItemBuilder.of();
    }

    /**
     * create builder for ShoppingListLineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListLineItemBuilder builder(final ShoppingListLineItem template) {
        return ShoppingListLineItemBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListLineItem(Function<ShoppingListLineItem, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItem>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListLineItem>";
            }
        };
    }
}
