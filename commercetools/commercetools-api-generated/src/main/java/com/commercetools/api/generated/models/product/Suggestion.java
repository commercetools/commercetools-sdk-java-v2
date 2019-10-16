package com.commercetools.api.generated.models.product;


import com.commercetools.api.generated.models.product.SuggestionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = SuggestionImpl.class)
public interface Suggestion  {

   
   @NotNull
   @JsonProperty("text")
   public String getText();

   public void setText(final String text);
   
   public static SuggestionImpl of(){
      return new SuggestionImpl();
   }
   

   public static SuggestionImpl of(final Suggestion template) {
      SuggestionImpl instance = new SuggestionImpl();
      instance.setText(template.getText());
      return instance;
   }

}