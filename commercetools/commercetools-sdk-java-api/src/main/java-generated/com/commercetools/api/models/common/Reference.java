package com.commercetools.api.models.common;

import com.commercetools.api.models.associate_role.AssociateRoleReference;
import com.commercetools.api.models.attribute_group.AttributeGroupReference;
import com.commercetools.api.models.business_unit.BusinessUnitReference;
import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart.DirectDiscountReference;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.custom_object.CustomObjectReference;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.inventory.InventoryEntryReference;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order_edit.OrderEditReference;
import com.commercetools.api.models.payment.PaymentReference;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_discount.ProductDiscountReference;
import com.commercetools.api.models.product_selection.ProductSelectionReference;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.quote.QuoteReference;
import com.commercetools.api.models.quote_request.QuoteRequestReference;
import com.commercetools.api.models.review.ReviewReference;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.models.shopping_list.ShoppingListReference;
import com.commercetools.api.models.staged_quote.StagedQuoteReference;
import com.commercetools.api.models.standalone_price.StandalonePriceReference;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreReference;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.type.TypeReference;
import com.commercetools.api.models.zone.ZoneReference;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.associate_role.AssociateRoleReferenceImpl.class, name = AssociateRoleReference.ASSOCIATE_ROLE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.attribute_group.AttributeGroupReferenceImpl.class, name = AttributeGroupReference.ATTRIBUTE_GROUP),
   @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitReferenceImpl.class, name = BusinessUnitReference.BUSINESS_UNIT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountReferenceImpl.class, name = CartDiscountReference.CART_DISCOUNT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartReferenceImpl.class, name = CartReference.CART),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryReferenceImpl.class, name = CategoryReference.CATEGORY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelReferenceImpl.class, name = ChannelReference.CHANNEL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.custom_object.CustomObjectReferenceImpl.class, name = CustomObjectReference.KEY_VALUE_DOCUMENT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl.class, name = CustomerGroupReference.CUSTOMER_GROUP),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerReferenceImpl.class, name = CustomerReference.CUSTOMER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.DirectDiscountReferenceImpl.class, name = DirectDiscountReference.DIRECT_DISCOUNT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl.class, name = DiscountCodeReference.DISCOUNT_CODE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryReferenceImpl.class, name = InventoryEntryReference.INVENTORY_ENTRY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditReferenceImpl.class, name = OrderEditReference.ORDER_EDIT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderReferenceImpl.class, name = OrderReference.ORDER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentReferenceImpl.class, name = PaymentReference.PAYMENT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl.class, name = ProductDiscountReference.PRODUCT_DISCOUNT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductReferenceImpl.class, name = ProductReference.PRODUCT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionReferenceImpl.class, name = ProductSelectionReference.PRODUCT_SELECTION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeReferenceImpl.class, name = ProductTypeReference.PRODUCT_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.quote.QuoteReferenceImpl.class, name = QuoteReference.QUOTE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.quote_request.QuoteRequestReferenceImpl.class, name = QuoteRequestReference.QUOTE_REQUEST),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewReferenceImpl.class, name = ReviewReference.REVIEW),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodReferenceImpl.class, name = ShippingMethodReference.SHIPPING_METHOD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListReferenceImpl.class, name = ShoppingListReference.SHOPPING_LIST),
   @JsonSubTypes.Type(value = com.commercetools.api.models.staged_quote.StagedQuoteReferenceImpl.class, name = StagedQuoteReference.STAGED_QUOTE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl.class, name = StandalonePriceReference.STANDALONE_PRICE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateReferenceImpl.class, name = StateReference.STATE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreReferenceImpl.class, name = StoreReference.STORE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl.class, name = TaxCategoryReference.TAX_CATEGORY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeReferenceImpl.class, name = TypeReference.TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneReferenceImpl.class, name = ZoneReference.ZONE)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "typeId",
    defaultImpl = ReferenceImpl.class,
    visible = true
)
@JsonDeserialize(as = ReferenceImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
        if (template instanceof com.commercetools.api.models.associate_role.AssociateRoleReference) {
            return com.commercetools.api.models.associate_role.AssociateRoleReference.deepCopy((com.commercetools.api.models.associate_role.AssociateRoleReference)template);
        }
        if (template instanceof com.commercetools.api.models.attribute_group.AttributeGroupReference) {
            return com.commercetools.api.models.attribute_group.AttributeGroupReference.deepCopy((com.commercetools.api.models.attribute_group.AttributeGroupReference)template);
        }
        if (template instanceof com.commercetools.api.models.business_unit.BusinessUnitReference) {
            return com.commercetools.api.models.business_unit.BusinessUnitReference.deepCopy((com.commercetools.api.models.business_unit.BusinessUnitReference)template);
        }
        if (template instanceof com.commercetools.api.models.cart_discount.CartDiscountReference) {
            return com.commercetools.api.models.cart_discount.CartDiscountReference.deepCopy((com.commercetools.api.models.cart_discount.CartDiscountReference)template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartReference) {
            return com.commercetools.api.models.cart.CartReference.deepCopy((com.commercetools.api.models.cart.CartReference)template);
        }
        if (template instanceof com.commercetools.api.models.category.CategoryReference) {
            return com.commercetools.api.models.category.CategoryReference.deepCopy((com.commercetools.api.models.category.CategoryReference)template);
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelReference) {
            return com.commercetools.api.models.channel.ChannelReference.deepCopy((com.commercetools.api.models.channel.ChannelReference)template);
        }
        if (template instanceof com.commercetools.api.models.custom_object.CustomObjectReference) {
            return com.commercetools.api.models.custom_object.CustomObjectReference.deepCopy((com.commercetools.api.models.custom_object.CustomObjectReference)template);
        }
        if (template instanceof com.commercetools.api.models.customer_group.CustomerGroupReference) {
            return com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy((com.commercetools.api.models.customer_group.CustomerGroupReference)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerReference) {
            return com.commercetools.api.models.customer.CustomerReference.deepCopy((com.commercetools.api.models.customer.CustomerReference)template);
        }
        if (template instanceof com.commercetools.api.models.cart.DirectDiscountReference) {
            return com.commercetools.api.models.cart.DirectDiscountReference.deepCopy((com.commercetools.api.models.cart.DirectDiscountReference)template);
        }
        if (template instanceof com.commercetools.api.models.discount_code.DiscountCodeReference) {
            return com.commercetools.api.models.discount_code.DiscountCodeReference.deepCopy((com.commercetools.api.models.discount_code.DiscountCodeReference)template);
        }
        if (template instanceof com.commercetools.api.models.inventory.InventoryEntryReference) {
            return com.commercetools.api.models.inventory.InventoryEntryReference.deepCopy((com.commercetools.api.models.inventory.InventoryEntryReference)template);
        }
        if (template instanceof com.commercetools.api.models.order_edit.OrderEditReference) {
            return com.commercetools.api.models.order_edit.OrderEditReference.deepCopy((com.commercetools.api.models.order_edit.OrderEditReference)template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderReference) {
            return com.commercetools.api.models.order.OrderReference.deepCopy((com.commercetools.api.models.order.OrderReference)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentReference) {
            return com.commercetools.api.models.payment.PaymentReference.deepCopy((com.commercetools.api.models.payment.PaymentReference)template);
        }
        if (template instanceof com.commercetools.api.models.product_discount.ProductDiscountReference) {
            return com.commercetools.api.models.product_discount.ProductDiscountReference.deepCopy((com.commercetools.api.models.product_discount.ProductDiscountReference)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductReference) {
            return com.commercetools.api.models.product.ProductReference.deepCopy((com.commercetools.api.models.product.ProductReference)template);
        }
        if (template instanceof com.commercetools.api.models.product_selection.ProductSelectionReference) {
            return com.commercetools.api.models.product_selection.ProductSelectionReference.deepCopy((com.commercetools.api.models.product_selection.ProductSelectionReference)template);
        }
        if (template instanceof com.commercetools.api.models.product_type.ProductTypeReference) {
            return com.commercetools.api.models.product_type.ProductTypeReference.deepCopy((com.commercetools.api.models.product_type.ProductTypeReference)template);
        }
        if (template instanceof com.commercetools.api.models.quote.QuoteReference) {
            return com.commercetools.api.models.quote.QuoteReference.deepCopy((com.commercetools.api.models.quote.QuoteReference)template);
        }
        if (template instanceof com.commercetools.api.models.quote_request.QuoteRequestReference) {
            return com.commercetools.api.models.quote_request.QuoteRequestReference.deepCopy((com.commercetools.api.models.quote_request.QuoteRequestReference)template);
        }
        if (template instanceof com.commercetools.api.models.review.ReviewReference) {
            return com.commercetools.api.models.review.ReviewReference.deepCopy((com.commercetools.api.models.review.ReviewReference)template);
        }
        if (template instanceof com.commercetools.api.models.shipping_method.ShippingMethodReference) {
            return com.commercetools.api.models.shipping_method.ShippingMethodReference.deepCopy((com.commercetools.api.models.shipping_method.ShippingMethodReference)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListReference) {
            return com.commercetools.api.models.shopping_list.ShoppingListReference.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListReference)template);
        }
        if (template instanceof com.commercetools.api.models.staged_quote.StagedQuoteReference) {
            return com.commercetools.api.models.staged_quote.StagedQuoteReference.deepCopy((com.commercetools.api.models.staged_quote.StagedQuoteReference)template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceReference) {
            return com.commercetools.api.models.standalone_price.StandalonePriceReference.deepCopy((com.commercetools.api.models.standalone_price.StandalonePriceReference)template);
        }
        if (template instanceof com.commercetools.api.models.state.StateReference) {
            return com.commercetools.api.models.state.StateReference.deepCopy((com.commercetools.api.models.state.StateReference)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreReference) {
            return com.commercetools.api.models.store.StoreReference.deepCopy((com.commercetools.api.models.store.StoreReference)template);
        }
        if (template instanceof com.commercetools.api.models.tax_category.TaxCategoryReference) {
            return com.commercetools.api.models.tax_category.TaxCategoryReference.deepCopy((com.commercetools.api.models.tax_category.TaxCategoryReference)template);
        }
        if (template instanceof com.commercetools.api.models.type.TypeReference) {
            return com.commercetools.api.models.type.TypeReference.deepCopy((com.commercetools.api.models.type.TypeReference)template);
        }
        if (template instanceof com.commercetools.api.models.zone.ZoneReference) {
            return com.commercetools.api.models.zone.ZoneReference.deepCopy((com.commercetools.api.models.zone.ZoneReference)template);
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
     * builder for customerGroup subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder customerGroupBuilder() {
       return com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of();
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
