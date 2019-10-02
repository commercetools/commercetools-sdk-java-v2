package com.commercetools.models.product;

import com.commercetools.models.product.CustomTokenizer;
import com.commercetools.models.product.WhitespaceTokenizer;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.product.WhitespaceTokenizerImpl.class, name = "whitespace"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.CustomTokenizerImpl.class, name = "custom")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface SuggestTokenizer  {


   


}