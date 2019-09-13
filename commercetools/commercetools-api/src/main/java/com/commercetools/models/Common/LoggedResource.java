package com.commercetools.models.common;

import com.commercetools.models.cart.Cart;
import com.commercetools.models.cart_discount.CartDiscount;
import com.commercetools.models.category.Category;
import com.commercetools.models.channel.Channel;
import com.commercetools.models.common.BaseResource;
import com.commercetools.models.common.CreatedBy;
import com.commercetools.models.common.LastModifiedBy;
import com.commercetools.models.customer.Customer;
import com.commercetools.models.customer_group.CustomerGroup;
import com.commercetools.models.discount_code.DiscountCode;
import com.commercetools.models.extension.Extension;
import com.commercetools.models.inventory.InventoryEntry;
import com.commercetools.models.me.MyCart;
import com.commercetools.models.me.MyCustomer;
import com.commercetools.models.order.Order;
import com.commercetools.models.order_edit.OrderEdit;
import com.commercetools.models.payment.Payment;
import com.commercetools.models.product.Product;
import com.commercetools.models.product_discount.ProductDiscount;
import com.commercetools.models.product_type.ProductType;
import com.commercetools.models.review.Review;
import com.commercetools.models.shopping_list.MyShoppingList;
import com.commercetools.models.shopping_list.ShoppingList;
import com.commercetools.models.state.State;
import com.commercetools.models.subscription.Subscription;
import com.commercetools.models.tax_category.TaxCategory;
import com.commercetools.models.type.Type;
import com.commercetools.models.common.LoggedResourceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = LoggedResourceImpl.class)
public interface LoggedResource extends BaseResource {

   
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();

   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
   
   public void setCreatedBy(final CreatedBy createdBy);
   
   public static LoggedResourceImpl of(){
      return new LoggedResourceImpl();
   }
   

   public static LoggedResourceImpl of(final LoggedResource template) {
      LoggedResourceImpl instance = new LoggedResourceImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      return instance;
   }

}