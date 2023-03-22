
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ShoppingListLineItems are Line Items that contain references to ProductVariants in a Product.</p>
 *  <p>In addition to standard Reference Expansion, a ShoppingListLineItem offers expansion on <code>productSlug</code> and <code>variant</code>, defined with the query parameter <code>expand</code>.</p>
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
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListLineItemImpl.class)
public interface ShoppingListLineItem extends com.commercetools.api.models.Customizable<ShoppingListLineItem> {

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
     *  <p>This data is updated in an eventual consistent manner when the Product Variant cannot be ordered anymore.</p>
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
     *  <p>Name of the Product.</p>
     *  <p>This data is updated in an eventual consistent manner when the Product's name changes.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Unique identifier of a Product.</p>
     * @return productId
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p>The Product Type defining the Attributes of the Product.</p>
     * @return productType
     */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeReference getProductType();

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p><code>id</code> of the ProductVariant the ShoppingListLineItem refers to. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Data of the ProductVariant.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].variant</code>. You cannot expand only a single element of the array.</p>
     * @return variant
     */
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();

    /**
     *  <p>Slug of the current ProductData.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].productSlug</code>. You cannot expand only a single element of the array.</p>
     * @return productSlug
     */
    @Valid
    @JsonProperty("productSlug")
    public LocalizedString getProductSlug();

    public void setAddedAt(final ZonedDateTime addedAt);

    public void setCustom(final CustomFields custom);

    public void setDeactivatedAt(final ZonedDateTime deactivatedAt);

    public void setId(final String id);

    public void setName(final LocalizedString name);

    public void setProductId(final String productId);

    public void setProductType(final ProductTypeReference productType);

    public void setQuantity(final Long quantity);

    public void setVariantId(final Long variantId);

    public void setVariant(final ProductVariant variant);

    public void setProductSlug(final LocalizedString productSlug);

    public static ShoppingListLineItem of() {
        return new ShoppingListLineItemImpl();
    }

    public static ShoppingListLineItem of(final ShoppingListLineItem template) {
        ShoppingListLineItemImpl instance = new ShoppingListLineItemImpl();
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        instance.setDeactivatedAt(template.getDeactivatedAt());
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setProductId(template.getProductId());
        instance.setProductType(template.getProductType());
        instance.setQuantity(template.getQuantity());
        instance.setVariantId(template.getVariantId());
        instance.setVariant(template.getVariant());
        instance.setProductSlug(template.getProductSlug());
        return instance;
    }

    public static ShoppingListLineItemBuilder builder() {
        return ShoppingListLineItemBuilder.of();
    }

    public static ShoppingListLineItemBuilder builder(final ShoppingListLineItem template) {
        return ShoppingListLineItemBuilder.of(template);
    }

    default <T> T withShoppingListLineItem(Function<ShoppingListLineItem, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItem>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListLineItem>";
            }
        };
    }
}
