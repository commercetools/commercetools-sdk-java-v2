package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.missing_data.MissingPricesProductLevel;
import com.commercetools.api.ml.generated.models.missing_data.MissingPricesVariantLevel;
import com.commercetools.api.ml.generated.models.missing_data.MissingPricesProductCountImpl;

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
@JsonDeserialize(as = MissingPricesProductCountImpl.class)
public interface MissingPricesProductCount  {

   
   @NotNull
   @JsonProperty("total")
   public Long getTotal();
   
   @NotNull
   @JsonProperty("missingPrices")
   public Long getMissingPrices();

   public void setTotal(final Long total);
   
   public void setMissingPrices(final Long missingPrices);
   
   public static MissingPricesProductCountImpl of(){
      return new MissingPricesProductCountImpl();
   }
   

   public static MissingPricesProductCountImpl of(final MissingPricesProductCount template) {
      MissingPricesProductCountImpl instance = new MissingPricesProductCountImpl();
      instance.setTotal(template.getTotal());
      instance.setMissingPrices(template.getMissingPrices());
      return instance;
   }

}
