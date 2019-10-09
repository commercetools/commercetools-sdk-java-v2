package com.commercetools.models.product;

import com.commercetools.models.product.SuggestTokenizer;
import com.commercetools.models.product.WhitespaceTokenizerImpl;

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