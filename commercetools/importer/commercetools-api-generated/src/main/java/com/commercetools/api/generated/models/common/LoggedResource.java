package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.cart.Cart;
import com.commercetools.api.generated.models.cart_discount.CartDiscount;
import com.commercetools.api.generated.models.category.Category;
import com.commercetools.api.generated.models.channel.Channel;
import com.commercetools.api.generated.models.common.BaseResource;
import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.custom_object.CustomObject;
import com.commercetools.api.generated.models.customer.Customer;
import com.commercetools.api.generated.models.customer_group.CustomerGroup;
import com.commercetools.api.generated.models.discount_code.DiscountCode;
import com.commercetools.api.generated.models.extension.Extension;
import com.commercetools.api.generated.models.inventory.InventoryEntry;
import com.commercetools.api.generated.models.me.MyCart;
import com.commercetools.api.generated.models.me.MyCustomer;
import com.commercetools.api.generated.models.me.MyOrder;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.order.Order;
import com.commercetools.api.generated.models.order_edit.OrderEdit;
import com.commercetools.api.generated.models.payment.Payment;
import com.commercetools.api.generated.models.product.Product;
import com.commercetools.api.generated.models.product_discount.ProductDiscount;
import com.commercetools.api.generated.models.product_type.ProductType;
import com.commercetools.api.generated.models.review.Review;
import com.commercetools.api.generated.models.shipping_method.ShippingMethod;
import com.commercetools.api.generated.models.shopping_list.MyShoppingList;
import com.commercetools.api.generated.models.shopping_list.ShoppingList;
import com.commercetools.api.generated.models.state.State;
import com.commercetools.api.generated.models.store.Store;
import com.commercetools.api.generated.models.subscription.Subscription;
import com.commercetools.api.generated.models.tax_category.TaxCategory;
import com.commercetools.api.generated.models.type.Type;
import com.commercetools.api.generated.models.zone.Zone;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface LoggedResource extends BaseResource {

   
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();

   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
   
   public void setCreatedBy(final CreatedBy createdBy);
   


}