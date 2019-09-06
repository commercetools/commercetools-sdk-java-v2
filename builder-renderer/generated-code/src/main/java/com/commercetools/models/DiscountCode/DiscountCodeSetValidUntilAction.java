package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.DiscountCode.DiscountCodeSetValidUntilActionImpl;

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
@JsonDeserialize(as = DiscountCodeSetValidUntilActionImpl.class)
public interface DiscountCodeSetValidUntilAction extends DiscountCodeUpdateAction {

   
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();

   public void setValidUntil(final ZonedDateTime validUntil);
   
   public static DiscountCodeSetValidUntilActionImpl of(){
      return new DiscountCodeSetValidUntilActionImpl();
   }
   

   public static DiscountCodeSetValidUntilActionImpl of(final DiscountCodeSetValidUntilAction template) {
      DiscountCodeSetValidUntilActionImpl instance = new DiscountCodeSetValidUntilActionImpl();
      instance.setValidUntil(template.getValidUntil());
      return instance;
   }

}