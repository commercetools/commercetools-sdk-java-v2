package com.commercetools.api.models.product;

import com.commercetools.api.models.product.CustomTokenizer;
import com.commercetools.api.models.product.WhitespaceTokenizer;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.CustomTokenizerImpl.class, name = "custom"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.WhitespaceTokenizerImpl.class, name = "whitespace")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    defaultImpl = SuggestTokenizerImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface SuggestTokenizer  {

    
    @NotNull
    @JsonProperty("type")
    public String getType();




    default <T> T withSuggestTokenizer(Function<SuggestTokenizer, T> helper) {
        return helper.apply(this);
    }
}
