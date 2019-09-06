package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountSetDescriptionActionImpl;

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
@JsonDeserialize(as = CartDiscountSetDescriptionActionImpl.class)
public interface CartDiscountSetDescriptionAction extends CartDiscountUpdateAction {

   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setDescription(final LocalizedString description);
   
   public static CartDiscountSetDescriptionActionImpl of(){
      return new CartDiscountSetDescriptionActionImpl();
   }
   

   public static CartDiscountSetDescriptionActionImpl of(final CartDiscountSetDescriptionAction template) {
      CartDiscountSetDescriptionActionImpl instance = new CartDiscountSetDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      return instance;
   }

}