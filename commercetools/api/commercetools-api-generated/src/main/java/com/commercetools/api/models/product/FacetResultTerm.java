package com.commercetools.api.models.product;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.product.FacetResultTermImpl;

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
@JsonDeserialize(as = FacetResultTermImpl.class)
public interface FacetResultTerm  {

   
   @NotNull
   @JsonProperty("term")
   public JsonNode getTerm();
   
   @NotNull
   @JsonProperty("count")
   public Long getCount();
   
   
   @JsonProperty("productCount")
   public Long getProductCount();

   public void setTerm(final JsonNode term);
   
   public void setCount(final Long count);
   
   public void setProductCount(final Long productCount);
   
   public static FacetResultTermImpl of(){
      return new FacetResultTermImpl();
   }
   

   public static FacetResultTermImpl of(final FacetResultTerm template) {
      FacetResultTermImpl instance = new FacetResultTermImpl();
      instance.setCount(template.getCount());
      instance.setTerm(template.getTerm());
      instance.setProductCount(template.getProductCount());
      return instance;
   }

}
