package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.Suggestion;
import com.commercetools.api.generated.models.product.SuggestionResultImpl;

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
@JsonDeserialize(as = SuggestionResultImpl.class)
public interface SuggestionResult  {

   
   @NotNull
   @Valid
   @JsonAnyGetter
   public Map<String, List<Suggestion>> values();

   @JsonAnySetter
   public void setValue(String key, List<Suggestion> value);
   
   public static SuggestionResultImpl of(){
      return new SuggestionResultImpl();
   }
   

   public static SuggestionResultImpl of(final SuggestionResult template) {
      SuggestionResultImpl instance = new SuggestionResultImpl();
      return instance;
   }

}