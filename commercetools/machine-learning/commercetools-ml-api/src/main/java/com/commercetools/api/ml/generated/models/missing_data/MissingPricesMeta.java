package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.missing_data.MissingPricesProductLevel;
import com.commercetools.api.ml.generated.models.missing_data.MissingPricesVariantLevel;
import com.commercetools.api.ml.generated.models.missing_data.MissingPricesMetaImpl;

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
@JsonDeserialize(as = MissingPricesMetaImpl.class)
public interface MissingPricesMeta  {

   
   @NotNull
   @Valid
   @JsonProperty("productLevel")
   public MissingPricesProductLevel getProductLevel();
   
   @NotNull
   @Valid
   @JsonProperty("variantLevel")
   public MissingPricesVariantLevel getVariantLevel();

   public void setProductLevel(final MissingPricesProductLevel productLevel);
   
   public void setVariantLevel(final MissingPricesVariantLevel variantLevel);
   
   public static MissingPricesMetaImpl of(){
      return new MissingPricesMetaImpl();
   }
   

   public static MissingPricesMetaImpl of(final MissingPricesMeta template) {
      MissingPricesMetaImpl instance = new MissingPricesMetaImpl();
      instance.setProductLevel(template.getProductLevel());
      instance.setVariantLevel(template.getVariantLevel());
      return instance;
   }

}
