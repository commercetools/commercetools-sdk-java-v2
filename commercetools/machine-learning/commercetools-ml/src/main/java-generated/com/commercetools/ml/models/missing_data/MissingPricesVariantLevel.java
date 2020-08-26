package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingPricesProductCount;
import com.commercetools.ml.models.missing_data.MissingPricesVariantLevelImpl;

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
@JsonDeserialize(as = MissingPricesVariantLevelImpl.class)
public interface MissingPricesVariantLevel extends MissingPricesProductCount {

   /**
   *  <p>Number of product variants scanned.</p>
   */
   @NotNull
   @JsonProperty("total")
   public Long getTotal();
   /**
   *  <p>Number of product variants missing prices.</p>
   */
   @NotNull
   @JsonProperty("missingPrices")
   public Long getMissingPrices();

   public void setTotal(final Long total);

   public void setMissingPrices(final Long missingPrices);

   public static MissingPricesVariantLevelImpl of(){
      return new MissingPricesVariantLevelImpl();
   }


   public static MissingPricesVariantLevelImpl of(final MissingPricesVariantLevel template) {
      MissingPricesVariantLevelImpl instance = new MissingPricesVariantLevelImpl();
      instance.setTotal(template.getTotal());
      instance.setMissingPrices(template.getMissingPrices());
      return instance;
   }

}
