
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SuggestionImpl.class)
public interface Suggestion {

    /**
    *  <p>The suggested text.</p>
    */
    @NotNull
    @JsonProperty("text")
    public String getText();

    public void setText(final String text);

    public static Suggestion of() {
        return new SuggestionImpl();
    }

    public static Suggestion of(final Suggestion template) {
        SuggestionImpl instance = new SuggestionImpl();
        instance.setText(template.getText());
        return instance;
    }

    public static SuggestionBuilder builder() {
        return SuggestionBuilder.of();
    }

    public static SuggestionBuilder builder(final Suggestion template) {
        return SuggestionBuilder.of(template);
    }

    default <T> T withSuggestion(Function<Suggestion, T> helper) {
        return helper.apply(this);
    }
}
