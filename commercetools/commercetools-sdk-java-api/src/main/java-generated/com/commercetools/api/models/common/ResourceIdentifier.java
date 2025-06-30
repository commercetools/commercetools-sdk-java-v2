
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Draft type to create a Reference or a KeyReference to a resource. Provide either the <code>id</code> or (wherever supported) the <code>key</code> of the resource to reference, but depending on the API endpoint the response returns either a Reference or a KeyReference. For example, the field <code>parent</code> of a CategoryDraft takes a ResourceIdentifier for its value while the value of the corresponding field of a Category is a Reference.</p>
 *  <p>Each resource type has its corresponding ResourceIdentifier, like ChannelResourceIdentifier.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceIdentifier resourceIdentifier = ResourceIdentifier.associateRoleBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = ResourceIdentifierImpl.class, visible = true)
@JsonDeserialize(as = ResourceIdentifierImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ResourceIdentifier extends com.commercetools.api.models.WithKey {

    /**
     *  <p>Type of referenced resource. If given, it must match the expected ReferenceTypeId of the referenced resource.</p>
     * @return typeId
     */

    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    public ResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of ResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ResourceIdentifier deepCopy(@Nullable final ResourceIdentifier template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ResourceIdentifierImpl)) {
            return template.copyDeep();
        }
        ResourceIdentifierImpl instance = new ResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder for associateRole subtype
     * @return builder
     */
    public static com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder associateRoleBuilder() {
        return com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder.of();
    }

    /**
     * builder for attributeGroup subtype
     * @return builder
     */
    public static com.commercetools.api.models.attribute_group.AttributeGroupResourceIdentifierBuilder attributeGroupBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupResourceIdentifierBuilder.of();
    }

    /**
     * builder for businessUnit subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder businessUnitBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of();
    }

    /**
     * builder for cartDiscount subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder cartDiscountBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder.of();
    }

    /**
     * builder for cart subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartResourceIdentifierBuilder cartBuilder() {
        return com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of();
    }

    /**
     * builder for category subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategoryResourceIdentifierBuilder categoryBuilder() {
        return com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of();
    }

    /**
     * builder for channel subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder channelBuilder() {
        return com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of();
    }

    /**
     * builder for customerGroup subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder customerGroupBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of();
    }

    /**
     * builder for customer subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder customerBuilder() {
        return com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of();
    }

    /**
     * builder for discountCode subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierBuilder discountCodeBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierBuilder.of();
    }

    /**
     * builder for discountGroup subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierBuilder discountGroupBuilder() {
        return com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierBuilder.of();
    }

    /**
     * builder for inventoryEntry subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntryResourceIdentifierBuilder inventoryEntryBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryResourceIdentifierBuilder.of();
    }

    /**
     * builder for orderEdit subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.OrderEditResourceIdentifierBuilder orderEditBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditResourceIdentifierBuilder.of();
    }

    /**
     * builder for payment subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder paymentBuilder() {
        return com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of();
    }

    /**
     * builder for productDiscount subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierBuilder productDiscountBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierBuilder.of();
    }

    /**
     * builder for product subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductResourceIdentifierBuilder productBuilder() {
        return com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of();
    }

    /**
     * builder for productSelection subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder productSelectionBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of();
    }

    /**
     * builder for productTailoring subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringResourceIdentifierBuilder productTailoringBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringResourceIdentifierBuilder.of();
    }

    /**
     * builder for productType subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder productTypeBuilder() {
        return com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder.of();
    }

    /**
     * builder for quoteRequest subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder quoteRequestBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder.of();
    }

    /**
     * builder for quote subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder quoteBuilder() {
        return com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder.of();
    }

    /**
     * builder for review subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewResourceIdentifierBuilder reviewBuilder() {
        return com.commercetools.api.models.review.ReviewResourceIdentifierBuilder.of();
    }

    /**
     * builder for shippingMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder shippingMethodBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of();
    }

    /**
     * builder for shoppingList subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder shoppingListBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder.of();
    }

    /**
     * builder for stagedQuote subtype
     * @return builder
     */
    public static com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder stagedQuoteBuilder() {
        return com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder.of();
    }

    /**
     * builder for standalonePrice subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceResourceIdentifierBuilder standalonePriceBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceResourceIdentifierBuilder.of();
    }

    /**
     * builder for state subtype
     * @return builder
     */
    public static com.commercetools.api.models.state.StateResourceIdentifierBuilder stateBuilder() {
        return com.commercetools.api.models.state.StateResourceIdentifierBuilder.of();
    }

    /**
     * builder for store subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreResourceIdentifierBuilder storeBuilder() {
        return com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of();
    }

    /**
     * builder for taxCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder taxCategoryBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of();
    }

    /**
     * builder for type subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeResourceIdentifierBuilder typeBuilder() {
        return com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of();
    }

    /**
     * builder for zone subtype
     * @return builder
     */
    public static com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder zoneBuilder() {
        return com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withResourceIdentifier(Function<ResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceIdentifier>";
            }
        };
    }
}
