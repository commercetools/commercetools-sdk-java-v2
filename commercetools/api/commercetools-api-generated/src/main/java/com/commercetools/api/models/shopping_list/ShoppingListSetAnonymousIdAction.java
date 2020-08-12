package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdActionImpl;

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
@JsonDeserialize(as = ShoppingListSetAnonymousIdActionImpl.class)
public interface ShoppingListSetAnonymousIdAction extends ShoppingListUpdateAction {

   /**
   *  <p>Anonymous ID of the anonymous customer that this shopping list belongs to.
   *  If this field is not set any existing <code>anonymousId</code> is removed.</p>
   */
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();

   public void setAnonymousId(final String anonymousId);
   
   public static ShoppingListSetAnonymousIdActionImpl of(){
      return new ShoppingListSetAnonymousIdActionImpl();
   }
   

   public static ShoppingListSetAnonymousIdActionImpl of(final ShoppingListSetAnonymousIdAction template) {
      ShoppingListSetAnonymousIdActionImpl instance = new ShoppingListSetAnonymousIdActionImpl();
      instance.setAnonymousId(template.getAnonymousId());
      return instance;
   }

}
