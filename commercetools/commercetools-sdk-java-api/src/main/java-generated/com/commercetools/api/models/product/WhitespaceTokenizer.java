
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = WhitespaceTokenizerImpl.class)
public interface WhitespaceTokenizer extends SuggestTokenizer {

    String WHITESPACE = "whitespace";

    public static WhitespaceTokenizer of() {
        return new WhitespaceTokenizerImpl();
    }

    public static WhitespaceTokenizer of(final WhitespaceTokenizer template) {
        WhitespaceTokenizerImpl instance = new WhitespaceTokenizerImpl();
        return instance;
    }

    public static WhitespaceTokenizerBuilder builder() {
        return WhitespaceTokenizerBuilder.of();
    }

    public static WhitespaceTokenizerBuilder builder(final WhitespaceTokenizer template) {
        return WhitespaceTokenizerBuilder.of(template);
    }

    default <T> T withWhitespaceTokenizer(Function<WhitespaceTokenizer, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<WhitespaceTokenizer> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<WhitespaceTokenizer>() {
            @Override
            public String toString() {
                return "TypeReference<WhitespaceTokenizer>";
            }
        };
    }
}
