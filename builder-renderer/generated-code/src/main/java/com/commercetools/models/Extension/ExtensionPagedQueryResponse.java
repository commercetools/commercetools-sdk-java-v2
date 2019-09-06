package com.commercetools.models.Extension;

import com.commercetools.models.Extension.Extension;
import java.lang.Long;
import com.commercetools.models.Extension.ExtensionPagedQueryResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ExtensionPagedQueryResponseImpl.class)
public interface ExtensionPagedQueryResponse  {

   
   @NotNull
   @JsonProperty("count")
   public Long getCount();
   
   
   @JsonProperty("total")
   public Long getTotal();
   
   @NotNull
   @JsonProperty("offset")
   public Long getOffset();
   
   @NotNull
   @Valid
   @JsonProperty("results")
   public List<Extension> getResults();

   public void setCount(final Long count);
   
   public void setTotal(final Long total);
   
   public void setOffset(final Long offset);
   
   public void setResults(final List<Extension> results);
   
   public static ExtensionPagedQueryResponseImpl of(){
      return new ExtensionPagedQueryResponseImpl();
   }
   

   public static ExtensionPagedQueryResponseImpl of(final ExtensionPagedQueryResponse template) {
      ExtensionPagedQueryResponseImpl instance = new ExtensionPagedQueryResponseImpl();
      instance.setTotal(template.getTotal());
      instance.setOffset(template.getOffset());
      instance.setCount(template.getCount());
      instance.setResults(template.getResults());
      return instance;
   }

}