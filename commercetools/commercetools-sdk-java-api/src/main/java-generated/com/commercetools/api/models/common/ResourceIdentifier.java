package com.commercetools.api.models.common;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifier;
import com.commercetools.api.models.inventory.InventoryEntryResourceIdentifier;
import com.commercetools.api.models.order.OrderResourceIdentifier;
import com.commercetools.api.models.order_edit.OrderEditResourceIdentifier;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifier;
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
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl.class, name = "customer-group"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerResourceIdentifierImpl.class, name = "customer"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierImpl.class, name = "discount-code"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryResourceIdentifierImpl.class, name = "inventory-entry"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditResourceIdentifierImpl.class, name = "order-edit"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderResourceIdentifierImpl.class, name = "order"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentResourceIdentifierImpl.class, name = "payment"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierImpl.class, name = "product-discount"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.ProductTypeResourceIdentifierImpl.class, name = "product-type"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductResourceIdentifierImpl.class, name = "product"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewResourceIdentifierImpl.class, name = "review"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl.class, name = "shipping-method"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierImpl.class, name = "shopping-list"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateResourceIdentifierImpl.class, name = "state"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreResourceIdentifierImpl.class, name = "store"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl.class, name = "tax-category"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.TypeResourceIdentifierImpl.class, name = "type"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneResourceIdentifierImpl.class, name = "zone"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl.class, name = "cart-discount"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelResourceIdentifierImpl.class, name = "channel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartResourceIdentifierImpl.class, name = "cart"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryResourceIdentifierImpl.class, name = "category")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "typeId",
    defaultImpl = ResourceIdentifierImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ResourceIdentifier  {

    
    
    @JsonProperty("id")
    public String getId();
    
    
    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);
    
    public void setKey(final String key);



    default <T> T withResourceIdentifier(Function<ResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
