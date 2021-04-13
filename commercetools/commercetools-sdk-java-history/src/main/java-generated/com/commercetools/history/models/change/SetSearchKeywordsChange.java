
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.SearchKeywords;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetSearchKeywordsChangeImpl.class)
public interface SetSearchKeywordsChange extends Change {

    String SET_SEARCH_KEYWORDS_CHANGE = "SetSearchKeywordsChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setSearchKeywords</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public SearchKeywords getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public SearchKeywords getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    public void setPreviousValue(final SearchKeywords previousValue);

    public void setNextValue(final SearchKeywords nextValue);

    public static SetSearchKeywordsChange of() {
        return new SetSearchKeywordsChangeImpl();
    }

    public static SetSearchKeywordsChange of(final SetSearchKeywordsChange template) {
        SetSearchKeywordsChangeImpl instance = new SetSearchKeywordsChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetSearchKeywordsChangeBuilder builder() {
        return SetSearchKeywordsChangeBuilder.of();
    }

    public static SetSearchKeywordsChangeBuilder builder(final SetSearchKeywordsChange template) {
        return SetSearchKeywordsChangeBuilder.of(template);
    }

    default <T> T withSetSearchKeywordsChange(Function<SetSearchKeywordsChange, T> helper) {
        return helper.apply(this);
    }
}
