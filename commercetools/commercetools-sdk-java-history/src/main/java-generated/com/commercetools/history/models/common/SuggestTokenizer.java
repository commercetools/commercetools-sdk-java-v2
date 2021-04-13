
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SuggestTokenizerImpl.class)
public interface SuggestTokenizer {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public void setType(final String type);

    public static SuggestTokenizer of() {
        return new SuggestTokenizerImpl();
    }

    public static SuggestTokenizer of(final SuggestTokenizer template) {
        SuggestTokenizerImpl instance = new SuggestTokenizerImpl();
        instance.setType(template.getType());
        return instance;
    }

    public static SuggestTokenizerBuilder builder() {
        return SuggestTokenizerBuilder.of();
    }

    public static SuggestTokenizerBuilder builder(final SuggestTokenizer template) {
        return SuggestTokenizerBuilder.of(template);
    }

    default <T> T withSuggestTokenizer(Function<SuggestTokenizer, T> helper) {
        return helper.apply(this);
    }
}
