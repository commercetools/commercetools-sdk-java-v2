
package com.commercetools.importapi.models.products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomTokenizerImpl.class)
public interface CustomTokenizer extends SuggestTokenizer {

    String CUSTOM = "custom";

    @NotNull
    @JsonProperty("inputs")
    public List<String> getInputs();

    @JsonIgnore
    public void setInputs(final String... inputs);

    public void setInputs(final List<String> inputs);

    public static CustomTokenizer of() {
        return new CustomTokenizerImpl();
    }

    public static CustomTokenizer of(final CustomTokenizer template) {
        CustomTokenizerImpl instance = new CustomTokenizerImpl();
        instance.setInputs(template.getInputs());
        return instance;
    }

    public static CustomTokenizerBuilder builder() {
        return CustomTokenizerBuilder.of();
    }

    public static CustomTokenizerBuilder builder(final CustomTokenizer template) {
        return CustomTokenizerBuilder.of(template);
    }

    default <T> T withCustomTokenizer(Function<CustomTokenizer, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomTokenizer> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomTokenizer>() {
            @Override
            public String toString() {
                return "TypeReference<CustomTokenizer>";
            }
        };
    }
}
