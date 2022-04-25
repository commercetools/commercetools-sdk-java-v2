
package com.commercetools.importapi.models.products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SearchKeywordImpl.class)
public interface SearchKeyword {

    @NotNull
    @JsonProperty("text")
    public String getText();

    /**
    *  <p>The tokenizer defines the tokens that are used to match against the <a href="/../products-suggestions#suggest-query">Suggest Query</a> input.</p>
    */
    @Valid
    @JsonProperty("suggestTokenizer")
    public SuggestTokenizer getSuggestTokenizer();

    public void setText(final String text);

    public void setSuggestTokenizer(final SuggestTokenizer suggestTokenizer);

    public static SearchKeyword of() {
        return new SearchKeywordImpl();
    }

    public static SearchKeyword of(final SearchKeyword template) {
        SearchKeywordImpl instance = new SearchKeywordImpl();
        instance.setText(template.getText());
        instance.setSuggestTokenizer(template.getSuggestTokenizer());
        return instance;
    }

    public static SearchKeywordBuilder builder() {
        return SearchKeywordBuilder.of();
    }

    public static SearchKeywordBuilder builder(final SearchKeyword template) {
        return SearchKeywordBuilder.of(template);
    }

    default <T> T withSearchKeyword(Function<SearchKeyword, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SearchKeyword> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchKeyword>() {
            @Override
            public String toString() {
                return "TypeReference<SearchKeyword>";
            }
        };
    }
}
