package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.missing_data.MissingAttributes;
import com.commercetools.api.ml.generated.models.missing_data.MissingAttributesMeta;
import com.commercetools.api.ml.generated.models.missing_data.MissingAttributesPagedQueryResultImpl;

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
@JsonDeserialize(as = MissingAttributesPagedQueryResultImpl.class)
public interface MissingAttributesPagedQueryResult  {

   
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
   public List<MissingAttributes> getResults();
   
   @NotNull
   @Valid
   @JsonProperty("meta")
   public MissingAttributesMeta getMeta();

   public void setCount(final Long count);
   
   public void setTotal(final Long total);
   
   public void setOffset(final Long offset);
   
   public void setResults(final List<MissingAttributes> results);
   
   public void setMeta(final MissingAttributesMeta meta);
   
   public static MissingAttributesPagedQueryResultImpl of(){
      return new MissingAttributesPagedQueryResultImpl();
   }
   

   public static MissingAttributesPagedQueryResultImpl of(final MissingAttributesPagedQueryResult template) {
      MissingAttributesPagedQueryResultImpl instance = new MissingAttributesPagedQueryResultImpl();
      instance.setCount(template.getCount());
      instance.setTotal(template.getTotal());
      instance.setOffset(template.getOffset());
      instance.setResults(template.getResults());
      instance.setMeta(template.getMeta());
      return instance;
   }

}
