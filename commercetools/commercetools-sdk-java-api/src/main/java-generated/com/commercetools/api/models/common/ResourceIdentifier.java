
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifier;
import com.commercetools.api.models.inventory.InventoryEntryResourceIdentifier;
import com.commercetools.api.models.order.OrderResourceIdentifier;
import com.commercetools.api.models.order_edit.OrderEditResourceIdentifier;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifier;
import com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier;
import com.commercetools.api.models.product_type.ProductTypeResourceIdentifier;
import com.commercetools.api.models.review.ReviewResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Draft type to create a <a href="ctp:api:type:Reference">Reference</a> or a <a href="ctp:api:type:KeyReference">KeyReference</a> to a resource. Provide either the <code>id</code> or (wherever supported) the <code>key</code> of the resource to reference, but depending on the API endpoint the response returns either a Reference or a KeyReference. For example, the field <code>parent</code> of a <a href="ctp:api:type:CategoryDraft">CategoryDraft</a> takes a ResourceIdentifier for its value while the value of the corresponding field of a <a href="ctp:api:type:Category">Category</a> is a Reference.</p>
*  <p>Each resource type has its corresponding ResourceIdentifier, like <a href="ctp:api:type:ChannelResourceIdentifier">ChannelResourceIdentifier</a>.</p>
*/
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl.class, name = CartDiscountResourceIdentifier.CART_DISCOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartResourceIdentifierImpl.class, name = CartResourceIdentifier.CART),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryResourceIdentifierImpl.class, name = CategoryResourceIdentifier.CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelResourceIdentifierImpl.class, name = ChannelResourceIdentifier.CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl.class, name = CustomerGroupResourceIdentifier.CUSTOMER_GROUP),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerResourceIdentifierImpl.class, name = CustomerResourceIdentifier.CUSTOMER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierImpl.class, name = DiscountCodeResourceIdentifier.DISCOUNT_CODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryResourceIdentifierImpl.class, name = InventoryEntryResourceIdentifier.INVENTORY_ENTRY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditResourceIdentifierImpl.class, name = OrderEditResourceIdentifier.ORDER_EDIT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderResourceIdentifierImpl.class, name = OrderResourceIdentifier.ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentResourceIdentifierImpl.class, name = PaymentResourceIdentifier.PAYMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierImpl.class, name = ProductDiscountResourceIdentifier.PRODUCT_DISCOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductResourceIdentifierImpl.class, name = ProductResourceIdentifier.PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl.class, name = ProductSelectionResourceIdentifier.PRODUCT_SELECTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeResourceIdentifierImpl.class, name = ProductTypeResourceIdentifier.PRODUCT_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewResourceIdentifierImpl.class, name = ReviewResourceIdentifier.REVIEW),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl.class, name = ShippingMethodResourceIdentifier.SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierImpl.class, name = ShoppingListResourceIdentifier.SHOPPING_LIST),
        @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateResourceIdentifierImpl.class, name = StateResourceIdentifier.STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreResourceIdentifierImpl.class, name = StoreResourceIdentifier.STORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl.class, name = TaxCategoryResourceIdentifier.TAX_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeResourceIdentifierImpl.class, name = TypeResourceIdentifier.TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneResourceIdentifierImpl.class, name = ZoneResourceIdentifier.ZONE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = ResourceIdentifierImpl.class, visible = true)
@JsonDeserialize(as = ResourceIdentifierImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ResourceIdentifier {

    /**
    *  <p>Type of referenced resource. If given, it must match the expected <a href="#referencetypeid">ReferenceTypeId</a> of the referenced resource.</p>
    */

    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
    *  <p>Platform-generated unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder cartDiscountBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartResourceIdentifierBuilder cartBuilder() {
        return com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.category.CategoryResourceIdentifierBuilder categoryBuilder() {
        return com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder channelBuilder() {
        return com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder customerGroupBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder customerBuilder() {
        return com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierBuilder discountCodeBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.inventory.InventoryEntryResourceIdentifierBuilder inventoryEntryBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.OrderEditResourceIdentifierBuilder orderEditBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderResourceIdentifierBuilder orderBuilder() {
        return com.commercetools.api.models.order.OrderResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder paymentBuilder() {
        return com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierBuilder productDiscountBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductResourceIdentifierBuilder productBuilder() {
        return com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder productSelectionBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder productTypeBuilder() {
        return com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.review.ReviewResourceIdentifierBuilder reviewBuilder() {
        return com.commercetools.api.models.review.ReviewResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder shippingMethodBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder shoppingListBuilder() {
        return com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.state.StateResourceIdentifierBuilder stateBuilder() {
        return com.commercetools.api.models.state.StateResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreResourceIdentifierBuilder storeBuilder() {
        return com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder taxCategoryBuilder() {
        return com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.type.TypeResourceIdentifierBuilder typeBuilder() {
        return com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of();
    }

    public static com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder zoneBuilder() {
        return com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of();
    }

    default <T> T withResourceIdentifier(Function<ResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceIdentifier>";
            }
        };
    }
}
