
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.CustomTokenizerImpl.class, name = CustomTokenizer.CUSTOM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.WhitespaceTokenizerImpl.class, name = WhitespaceTokenizer.WHITESPACE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = SuggestTokenizerImpl.class, visible = true)
@JsonDeserialize(as = SuggestTokenizerImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface SuggestTokenizer {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.api.models.product.CustomTokenizerBuilder customBuilder() {
        return com.commercetools.api.models.product.CustomTokenizerBuilder.of();
    }

    public static com.commercetools.api.models.product.WhitespaceTokenizerBuilder whitespaceBuilder() {
        return com.commercetools.api.models.product.WhitespaceTokenizerBuilder.of();
    }

    default <T> T withSuggestTokenizer(Function<SuggestTokenizer, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SuggestTokenizer> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SuggestTokenizer>() {
            @Override
            public String toString() {
                return "TypeReference<SuggestTokenizer>";
            }
        };
    }
}
