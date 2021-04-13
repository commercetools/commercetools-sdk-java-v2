
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.CategoryOrderHints;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCategoryOrderHintChangeImpl.class)
public interface SetCategoryOrderHintChange extends Change {

    String SET_CATEGORY_ORDER_HINT_CHANGE = "SetCategoryOrderHintChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setCategoryOrderHint</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    @NotNull
    @JsonProperty("categoryId")
    public String getCategoryId();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CategoryOrderHints getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CategoryOrderHints getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    public void setCategoryId(final String categoryId);

    public void setPreviousValue(final CategoryOrderHints previousValue);

    public void setNextValue(final CategoryOrderHints nextValue);

    public static SetCategoryOrderHintChange of() {
        return new SetCategoryOrderHintChangeImpl();
    }

    public static SetCategoryOrderHintChange of(final SetCategoryOrderHintChange template) {
        SetCategoryOrderHintChangeImpl instance = new SetCategoryOrderHintChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setCategoryId(template.getCategoryId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetCategoryOrderHintChangeBuilder builder() {
        return SetCategoryOrderHintChangeBuilder.of();
    }

    public static SetCategoryOrderHintChangeBuilder builder(final SetCategoryOrderHintChange template) {
        return SetCategoryOrderHintChangeBuilder.of(template);
    }

    default <T> T withSetCategoryOrderHintChange(Function<SetCategoryOrderHintChange, T> helper) {
        return helper.apply(this);
    }
}
