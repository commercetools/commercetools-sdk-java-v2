
package com.commercetools.importapi.models.products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The tokenizer defines the tokens that are used to match against the <a href="/../products-suggestions#suggest-query">Suggest Query</a> input.</p>
*/
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.products.CustomTokenizerImpl.class, name = CustomTokenizer.CUSTOM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.products.WhitespaceTokenizerImpl.class, name = WhitespaceTokenizer.WHITESPACE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = SuggestTokenizerImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface SuggestTokenizer {

    @NotNull
    @JsonProperty("type")
    public String getType();

    default <T> T withSuggestTokenizer(Function<SuggestTokenizer, T> helper) {
        return helper.apply(this);
    }
}
