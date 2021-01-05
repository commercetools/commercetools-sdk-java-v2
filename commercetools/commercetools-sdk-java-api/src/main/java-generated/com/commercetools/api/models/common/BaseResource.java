package com.commercetools.api.models.common;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart_discount.CartDiscount;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.custom_object.CustomObject;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer_group.CustomerGroup;
import com.commercetools.api.models.discount_code.DiscountCode;
import com.commercetools.api.models.extension.Extension;
import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.me.MyCart;
import com.commercetools.api.models.me.MyCustomer;
import com.commercetools.api.models.me.MyOrder;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.payment.Payment;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product_discount.ProductDiscount;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.shipping_method.ShippingMethod;
import com.commercetools.api.models.shopping_list.MyShoppingList;
import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.state.State;
import com.commercetools.api.models.store.Store;
import com.commercetools.api.models.subscription.Subscription;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.type.Type;
import com.commercetools.api.models.zone.Zone;
import java.time.ZonedDateTime;


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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface BaseResource  {

    
    @NotNull
    @JsonProperty("id")
    public String getId();
    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();
    
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    public void setId(final String id);
    
    public void setVersion(final Long version);
    
    public void setCreatedAt(final ZonedDateTime createdAt);
    
    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);




    default <T> T withBaseResource(Function<BaseResource, T> helper) {
        return helper.apply(this);
    }
}
