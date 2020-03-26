package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.missing_data.MissingPrices;
import com.commercetools.api.ml.generated.models.missing_data.MissingPricesMeta;
import com.commercetools.api.ml.generated.models.missing_data.MissingPricesPagedQueryResultImpl;

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
@JsonDeserialize(as = MissingPricesPagedQueryResultImpl.class)
public interface MissingPricesPagedQueryResult  {

   
   @NotNull
   @JsonProperty("count")
   public Long getCount();
   
   @NotNull
   @JsonProperty("total")
   public Long getTotal();
   
   @NotNull
   @JsonProperty("offset")
   public Long getOffset();
   
   @NotNull
   @Valid
   @JsonProperty("results")
   public List<MissingPrices> getResults();
   
   @NotNull
   @Valid
   @JsonProperty("meta")
   public MissingPricesMeta getMeta();

   public void setCount(final Long count);
   
   public void setTotal(final Long total);
   
   public void setOffset(final Long offset);
   
   public void setResults(final List<MissingPrices> results);
   
   public void setMeta(final MissingPricesMeta meta);
   
   public static MissingPricesPagedQueryResultImpl of(){
      return new MissingPricesPagedQueryResultImpl();
   }
   

   public static MissingPricesPagedQueryResultImpl of(final MissingPricesPagedQueryResult template) {
      MissingPricesPagedQueryResultImpl instance = new MissingPricesPagedQueryResultImpl();
      instance.setCount(template.getCount());
      instance.setTotal(template.getTotal());
      instance.setOffset(template.getOffset());
      instance.setResults(template.getResults());
      instance.setMeta(template.getMeta());
      return instance;
   }

}
