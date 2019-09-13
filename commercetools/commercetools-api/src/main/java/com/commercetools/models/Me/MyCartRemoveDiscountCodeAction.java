package com.commercetools.models.me;

import com.commercetools.models.discount_code.DiscountCodeReference;
import com.commercetools.models.me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCartRemoveDiscountCodeActionImpl;

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
@JsonDeserialize(as = MyCartRemoveDiscountCodeActionImpl.class)
public interface MyCartRemoveDiscountCodeAction extends MyCartUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("discountCode")
   public DiscountCodeReference getDiscountCode();

   public void setDiscountCode(final DiscountCodeReference discountCode);
   
   public static MyCartRemoveDiscountCodeActionImpl of(){
      return new MyCartRemoveDiscountCodeActionImpl();
   }
   

   public static MyCartRemoveDiscountCodeActionImpl of(final MyCartRemoveDiscountCodeAction template) {
      MyCartRemoveDiscountCodeActionImpl instance = new MyCartRemoveDiscountCodeActionImpl();
      instance.setDiscountCode(template.getDiscountCode());
      return instance;
   }

}