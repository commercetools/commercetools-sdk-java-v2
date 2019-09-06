package com.commercetools.models.Product;

import com.commercetools.models.Product.CustomTokenizer;
import com.commercetools.models.Product.WhitespaceTokenizer;
import java.lang.String;


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

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Product.WhitespaceTokenizerImpl.class, name = "whitespace"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.CustomTokenizerImpl.class, name = "custom")
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