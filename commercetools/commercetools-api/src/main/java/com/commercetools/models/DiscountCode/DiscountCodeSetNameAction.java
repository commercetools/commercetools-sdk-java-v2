package com.commercetools.models.DiscountCode;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.String;
import com.commercetools.models.DiscountCode.DiscountCodeSetNameActionImpl;

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
@JsonDeserialize(as = DiscountCodeSetNameActionImpl.class)
public interface DiscountCodeSetNameAction extends DiscountCodeUpdateAction {

   
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setName(final LocalizedString name);
   
   public static DiscountCodeSetNameActionImpl of(){
      return new DiscountCodeSetNameActionImpl();
   }
   

   public static DiscountCodeSetNameActionImpl of(final DiscountCodeSetNameAction template) {
      DiscountCodeSetNameActionImpl instance = new DiscountCodeSetNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}