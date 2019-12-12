package com.commercetools.api.generated.models.product;


import com.commercetools.api.generated.models.product.CategoryOrderHintsImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = CategoryOrderHintsImpl.class)
public interface CategoryOrderHints  {

   
   @NotNull
   @JsonAnyGetter
   public Map<String, String> values();

   @JsonAnySetter
   public void setValue(String key, String value);
   
   public static CategoryOrderHintsImpl of(){
      return new CategoryOrderHintsImpl();
   }
   

   public static CategoryOrderHintsImpl of(final CategoryOrderHints template) {
      CategoryOrderHintsImpl instance = new CategoryOrderHintsImpl();
      return instance;
   }

}