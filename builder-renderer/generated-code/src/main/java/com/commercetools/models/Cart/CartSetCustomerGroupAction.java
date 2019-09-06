package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Cart.CartSetCustomerGroupActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartSetCustomerGroupActionImpl.class)
public interface CartSetCustomerGroupAction extends CartUpdateAction {

   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupResourceIdentifier getCustomerGroup();

   public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);
   
   public static CartSetCustomerGroupActionImpl of(){
      return new CartSetCustomerGroupActionImpl();
   }
   

   public static CartSetCustomerGroupActionImpl of(final CartSetCustomerGroupAction template) {
      CartSetCustomerGroupActionImpl instance = new CartSetCustomerGroupActionImpl();
      instance.setCustomerGroup(template.getCustomerGroup());
      return instance;
   }

}