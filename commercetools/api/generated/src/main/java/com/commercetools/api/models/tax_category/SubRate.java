package com.commercetools.api.models.tax_category;


import com.commercetools.api.models.tax_category.SubRateImpl;

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
@JsonDeserialize(as = SubRateImpl.class)
public interface SubRate  {


   @NotNull
   @JsonProperty("name")
   public String getName();

   @NotNull
   @JsonProperty("amount")
   public Integer getAmount();

   public void setName(final String name);

   public void setAmount(final Integer amount);

   public static SubRateImpl of(){
      return new SubRateImpl();
   }


   public static SubRateImpl of(final SubRate template) {
      SubRateImpl instance = new SubRateImpl();
      instance.setAmount(template.getAmount());
      instance.setName(template.getName());
      return instance;
   }

}
