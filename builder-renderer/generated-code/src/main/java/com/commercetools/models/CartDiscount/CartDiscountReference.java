package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscount;
import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.CartDiscount.CartDiscountReferenceImpl;

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
@JsonDeserialize(as = CartDiscountReferenceImpl.class)
public interface CartDiscountReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public CartDiscount getObj();

   public void setObj(final CartDiscount obj);
   
   public static CartDiscountReferenceImpl of(){
      return new CartDiscountReferenceImpl();
   }
   

   public static CartDiscountReferenceImpl of(final CartDiscountReference template) {
      CartDiscountReferenceImpl instance = new CartDiscountReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}