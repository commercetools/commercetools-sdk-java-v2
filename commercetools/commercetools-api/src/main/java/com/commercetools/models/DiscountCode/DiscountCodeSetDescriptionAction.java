package com.commercetools.models.DiscountCode;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.String;
import com.commercetools.models.DiscountCode.DiscountCodeSetDescriptionActionImpl;

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
@JsonDeserialize(as = DiscountCodeSetDescriptionActionImpl.class)
public interface DiscountCodeSetDescriptionAction extends DiscountCodeUpdateAction {

   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setDescription(final LocalizedString description);
   
   public static DiscountCodeSetDescriptionActionImpl of(){
      return new DiscountCodeSetDescriptionActionImpl();
   }
   

   public static DiscountCodeSetDescriptionActionImpl of(final DiscountCodeSetDescriptionAction template) {
      DiscountCodeSetDescriptionActionImpl instance = new DiscountCodeSetDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      return instance;
   }

}