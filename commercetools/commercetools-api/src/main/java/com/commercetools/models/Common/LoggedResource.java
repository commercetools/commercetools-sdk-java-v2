package com.commercetools.models.Common;

import com.commercetools.models.Cart.Cart;
import com.commercetools.models.CartDiscount.CartDiscount;
import com.commercetools.models.Category.Category;
import com.commercetools.models.Channel.Channel;
import com.commercetools.models.Common.BaseResource;
import com.commercetools.models.Common.CreatedBy;
import com.commercetools.models.Common.LastModifiedBy;
import com.commercetools.models.Customer.Customer;
import com.commercetools.models.CustomerGroup.CustomerGroup;
import com.commercetools.models.DiscountCode.DiscountCode;
import com.commercetools.models.Extension.Extension;
import com.commercetools.models.Inventory.InventoryEntry;
import com.commercetools.models.Me.MyCart;
import com.commercetools.models.Me.MyCustomer;
import com.commercetools.models.Order.Order;
import com.commercetools.models.OrderEdit.OrderEdit;
import com.commercetools.models.Payment.Payment;
import com.commercetools.models.Product.Product;
import com.commercetools.models.ProductDiscount.ProductDiscount;
import com.commercetools.models.ProductType.ProductType;
import com.commercetools.models.Review.Review;
import com.commercetools.models.ShoppingList.MyShoppingList;
import com.commercetools.models.ShoppingList.ShoppingList;
import com.commercetools.models.State.State;
import com.commercetools.models.Subscription.Subscription;
import com.commercetools.models.TaxCategory.TaxCategory;
import com.commercetools.models.Type.Type;
import com.commercetools.models.Common.LoggedResourceImpl;

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