package com.commercetools.api.models.product;

import com.commercetools.api.models.product.CustomTokenizer;
import com.commercetools.api.models.product.WhitespaceTokenizer;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.WhitespaceTokenizerImpl.class, name = "whitespace"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.CustomTokenizerImpl.class, name = "custom")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = SuggestTokenizerImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface SuggestTokenizer  {





    default <T extends Accessor<SuggestTokenizer>> T withSuggestTokenizer(Function<SuggestTokenizer, T> helper) {
        return helper.apply(this);
    }
}
