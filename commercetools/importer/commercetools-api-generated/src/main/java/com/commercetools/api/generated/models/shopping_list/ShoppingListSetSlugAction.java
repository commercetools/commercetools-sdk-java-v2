package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetSlugActionImpl;

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
@JsonDeserialize(as = ShoppingListSetSlugActionImpl.class)
public interface ShoppingListSetSlugAction extends ShoppingListUpdateAction {

   
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();

   public void setSlug(final LocalizedString slug);
   
   public static ShoppingListSetSlugActionImpl of(){
      return new ShoppingListSetSlugActionImpl();
   }
   

   public static ShoppingListSetSlugActionImpl of(final ShoppingListSetSlugAction template) {
      ShoppingListSetSlugActionImpl instance = new ShoppingListSetSlugActionImpl();
      instance.setSlug(template.getSlug());
      return instance;
   }

}