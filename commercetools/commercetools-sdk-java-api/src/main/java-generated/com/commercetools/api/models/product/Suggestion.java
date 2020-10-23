package com.commercetools.api.models.product;


import com.commercetools.api.models.product.SuggestionImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = SuggestionImpl.class)
public interface Suggestion  {

    /**
    *  <p>The suggested text.</p>
    */
    @NotNull
    @JsonProperty("text")
    public String getText();

    public void setText(final String text);

    public static SuggestionImpl of(){
        return new SuggestionImpl();
    }
    

    public static SuggestionImpl of(final Suggestion template) {
        SuggestionImpl instance = new SuggestionImpl();
        instance.setText(template.getText());
        return instance;
    }

    default <T> T withSuggestion(Function<Suggestion, T> helper) {
        return helper.apply(this);
    }
}
