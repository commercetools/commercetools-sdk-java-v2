package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.Category;
import com.commercetools.api.generated.models.category.CategoryPagedQueryResponseImpl;

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
@JsonDeserialize(as = CategoryPagedQueryResponseImpl.class)
public interface CategoryPagedQueryResponse  {

   
   @NotNull
   @JsonProperty("limit")
   public Long getLimit();
   
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
   public List<Category> getResults();

   public void setLimit(final Long limit);
   
   public void setCount(final Long count);
   
   public void setTotal(final Long total);
   
   public void setOffset(final Long offset);
   
   public void setResults(final List<Category> results);
   
   public static CategoryPagedQueryResponseImpl of(){
      return new CategoryPagedQueryResponseImpl();
   }
   

   public static CategoryPagedQueryResponseImpl of(final CategoryPagedQueryResponse template) {
      CategoryPagedQueryResponseImpl instance = new CategoryPagedQueryResponseImpl();
      instance.setTotal(template.getTotal());
      instance.setOffset(template.getOffset());
      instance.setCount(template.getCount());
      instance.setLimit(template.getLimit());
      instance.setResults(template.getResults());
      return instance;
   }

}