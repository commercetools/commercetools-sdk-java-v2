
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Reference reference = Reference.associateRoleBuilder()
 *             id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = ReferenceImpl.class, visible = true)
@JsonDeserialize(as = ReferenceImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Reference extends ReferenceMixin {

    /**
     *  <p>Type of referenced resource.</p>
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *  <p>Unique ID of the referenced resource.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique ID of the referenced resource.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    public Reference copyDeep();

    /**
     * factory method to create a deep copy of Reference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Reference deepCopy(@Nullable final Reference template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ReferenceImpl)) {
            return template.copyDeep();
        }
        ReferenceImpl instance = new ReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder for associateRole subtype
     * @return builder
     */
    public static com.commercetools.api.models.associate_role.AssociateRoleReferenceBuilder associateRoleBuilder() {
        return com.commercetools.api.models.associate_role.AssociateRoleReferenceBuilder.of();
    }

    /**
     * builder for attributeGroup subtype
     * @return builder
     */
    public static com.commercetools.api.models.attribute_group.AttributeGroupReferenceBuilder attributeGroupBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupReferenceBuilder.of();
    }

    /**
     * builder for businessUnit subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitReferenceBuilder businessUnitBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitReferenceBuilder.of();
    }

    /**
     * builder for cartDiscount subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder cartDiscountBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of();
    }

    /**
     * builder for cart subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartReferenceBuilder cartBuilder() {
        return com.commercetools.api.models.cart.CartReferenceBuilder.of();
    }

    /**
     * builder for category subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategoryReferenceBuilder categoryBuilder() {
        return com.commercetools.api.models.category.CategoryReferenceBuilder.of();
    }

    /**
     * builder for channel subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelReferenceBuilder channelBuilder() {
        return com.commercetools.api.models.channel.ChannelReferenceBuilder.of();
    }

    /**
     * builder for keyValueDocument subtype
     * @return builder
     */
    public static com.commercetools.api.models.custom_object.CustomObjectReferenceBuilder keyValueDocumentBuilder() {
        return com.commercetools.api.models.custom_object.CustomObjectReferenceBuilder.of();
    }

    /**
     * builder for customerEmailToken subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerEmailTokenReferenceBuilder customerEmailTokenBuilder() {
        return com.commercetools.api.models.customer.CustomerEmailTokenReferenceBuilder.of();
    }

    /**
     * builder for customerGroup subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder customerGroupBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of();
    }

    /**
     * builder for customerPasswordToken subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerPasswordTokenReferenceBuilder customerPasswordTokenBuilder() {
        return com.commercetools.api.models.customer.CustomerPasswordTokenReferenceBuilder.of();
    }

    /**
     * builder for customer subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerReferenceBuilder customerBuilder() {
        return com.commercetools.api.models.customer.CustomerReferenceBuilder.of();
    }

    /**
     * builder for directDiscount subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.DirectDiscountReferenceBuilder directDiscountBuilder() {
        return com.commercetools.api.models.cart.DirectDiscountReferenceBuilder.of();
    }

    /**
     * builder for discountCode subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder discountCodeBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of();
    }

    /**
     * builder for discountGroup subtype
     * @return builder
     */
    public static com.commercetools.api.models.discount_group.DiscountGroupReferenceBuilder discountGroupBuilder() {
        return com.commercetools.api.models.discount_group.DiscountGroupReferenceBuilder.of();
    }

    /**
     * builder for inventoryEntry subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntryReferenceBuilder inventoryEntryBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryReferenceBuilder.of();
    }

    /**
     * builder for orderEdit subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.OrderEditReferenceBuilder orderEditBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditReferenceBuilder.of();
    }

    /**
     * builder for order subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.OrderReferenceBuilder orderBuilder() {
        return com.commercetools.api.models.order.OrderReferenceBuilder.of();
    }

    /**
     * builder for paymentMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment_method.PaymentMethodReferenceBuilder paymentMethodBuilder() {
        return com.commercetools.api.models.payment_method.PaymentMethodReferenceBuilder.of();
    }

    /**
     * builder for payment subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentReferenceBuilder paymentBuilder() {
        return com.commercetools.api.models.payment.PaymentReferenceBuilder.of();
    }

    /**
     * builder for productDiscount subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder productDiscountBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder.of();
    }

    /**
     * builder for product subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductReferenceBuilder productBuilder() {
        return com.commercetools.api.models.product.ProductReferenceBuilder.of();
    }

    /**
     * builder for productSelection subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder productSelectionBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder.of();
    }

    /**
     * builder for productTailoring subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringReferenceBuilder productTailoringBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringReferenceBuilder.of();
    }

    /**
     * builder for productType subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.ProductTypeReferenceBuilder productTypeBuilder() {
        return com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of();
    }

    /**
     * builder for quote subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote.QuoteReferenceBuilder quoteBuilder() {
        return com.commercetools.api.models.quote.QuoteReferenceBuilder.of();
    }

    /**
     * builder for quoteRequest subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder quoteRequestBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder.of();
    }

    /**
     * builder for review subtype
     * @return builder
     */
    public static com.commercetools.api.models.review.ReviewReferenceBuilder reviewBuilder() {
        return com.commercetools.api.models.review.ReviewReferenceBuilder.of();
    }

    /**
     * builder for shippingMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder shippingMethodBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder.of();
    }

    /**
     * builder for shoppingList subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListReferenceBuilder shoppingListBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListReferenceBuilder.of();
    }

    /**
     * builder for stagedQuote subtype
     * @return builder
     */
    public static com.commercetools.api.models.staged_quote.StagedQuoteReferenceBuilder stagedQuoteBuilder() {
        return com.commercetools.api.models.staged_quote.StagedQuoteReferenceBuilder.of();
    }

    /**
     * builder for standalonePrice subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder standalonePriceBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder.of();
    }

    /**
     * builder for state subtype
     * @return builder
     */
    public static com.commercetools.api.models.state.StateReferenceBuilder stateBuilder() {
        return com.commercetools.api.models.state.StateReferenceBuilder.of();
    }

    /**
     * builder for store subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreReferenceBuilder storeBuilder() {
        return com.commercetools.api.models.store.StoreReferenceBuilder.of();
    }

    /**
     * builder for taxCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder taxCategoryBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder.of();
    }

    /**
     * builder for type subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.TypeReferenceBuilder typeBuilder() {
        return com.commercetools.api.models.type.TypeReferenceBuilder.of();
    }

    /**
     * builder for zone subtype
     * @return builder
     */
    public static com.commercetools.api.models.zone.ZoneReferenceBuilder zoneBuilder() {
        return com.commercetools.api.models.zone.ZoneReferenceBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReference(Function<Reference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Reference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Reference>() {
            @Override
            public String toString() {
                return "TypeReference<Reference>";
            }
        };
    }
}
