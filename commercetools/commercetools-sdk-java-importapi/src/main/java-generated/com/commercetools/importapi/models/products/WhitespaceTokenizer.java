package com.commercetools.importapi.models.products;

import com.commercetools.importapi.models.products.SuggestTokenizer;
import com.commercetools.importapi.models.products.WhitespaceTokenizerImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = WhitespaceTokenizerImpl.class)
public interface WhitespaceTokenizer extends SuggestTokenizer {



    public static WhitespaceTokenizerImpl of(){
        return new WhitespaceTokenizerImpl();
    }
    

    public static WhitespaceTokenizerImpl of(final WhitespaceTokenizer template) {
        WhitespaceTokenizerImpl instance = new WhitespaceTokenizerImpl();
        return instance;
    }

    default <T> T withWhitespaceTokenizer(Function<WhitespaceTokenizer, T> helper) {
        return helper.apply(this);
    }
}
