package com.commercetools.api.models.product;

import com.commercetools.api.models.product.CustomTokenizer;
import com.commercetools.api.models.product.WhitespaceTokenizer;
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
public final class SuggestTokenizerImpl implements SuggestTokenizer {

   private String type;

   @JsonCreator
   SuggestTokenizerImpl() {
      this.type = "null";
   }



   public String getType(){
      return this.type;
   }


}
