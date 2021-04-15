
package com.commercetools.api.models.product;

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
}
