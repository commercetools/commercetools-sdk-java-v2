package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingPricesProductLevel;
import com.commercetools.ml.models.missing_data.MissingPricesVariantLevel;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingPricesProductCountImpl implements MissingPricesProductCount {

   private Long total;

   private Long missingPrices;

   @JsonCreator
   MissingPricesProductCountImpl(@JsonProperty("total") final Long total, @JsonProperty("missingPrices") final Long missingPrices) {
      this.total = total;
      this.missingPrices = missingPrices;
   }
   public MissingPricesProductCountImpl() {

   }


   public Long getTotal(){
      return this.total;
   }


   public Long getMissingPrices(){
      return this.missingPrices;
   }

   public void setTotal(final Long total){
      this.total = total;
   }

   public void setMissingPrices(final Long missingPrices){
      this.missingPrices = missingPrices;
   }

}
