package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.SuggestTokenizer;
import com.commercetools.api.generated.models.product.WhitespaceTokenizerImpl;

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
@JsonDeserialize(as = WhitespaceTokenizerImpl.class)
public interface WhitespaceTokenizer extends SuggestTokenizer {


   
   public static WhitespaceTokenizerImpl of(){
      return new WhitespaceTokenizerImpl();
   }
   

   public static WhitespaceTokenizerImpl of(final WhitespaceTokenizer template) {
      WhitespaceTokenizerImpl instance = new WhitespaceTokenizerImpl();
      return instance;
   }

}