
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SearchKeywordsImpl.class)
public interface SearchKeywords {

    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, List<SearchKeyword>> values();

    @JsonAnySetter
    public void setValue(String key, List<SearchKeyword> value);

    public static SearchKeywords of() {
        return new SearchKeywordsImpl();
    }

    public static SearchKeywords of(final SearchKeywords template) {
        SearchKeywordsImpl instance = new SearchKeywordsImpl();
        return instance;
    }

    public static SearchKeywordsBuilder builder() {
        return SearchKeywordsBuilder.of();
    }

    public static SearchKeywordsBuilder builder(final SearchKeywords template) {
        return SearchKeywordsBuilder.of(template);
    }

    default <T> T withSearchKeywords(Function<SearchKeywords, T> helper) {
        return helper.apply(this);
    }
}
