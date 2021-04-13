
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetTaxCategoryChangeImpl.class)
public interface SetTaxCategoryChange extends Change {

    String SET_TAX_CATEGORY_CHANGE = "SetTaxCategoryChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setTaxCategory</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Reference previousValue);

    public void setNextValue(final Reference nextValue);

    public static SetTaxCategoryChange of() {
        return new SetTaxCategoryChangeImpl();
    }

    public static SetTaxCategoryChange of(final SetTaxCategoryChange template) {
        SetTaxCategoryChangeImpl instance = new SetTaxCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetTaxCategoryChangeBuilder builder() {
        return SetTaxCategoryChangeBuilder.of();
    }

    public static SetTaxCategoryChangeBuilder builder(final SetTaxCategoryChange template) {
        return SetTaxCategoryChangeBuilder.of(template);
    }

    default <T> T withSetTaxCategoryChange(Function<SetTaxCategoryChange, T> helper) {
        return helper.apply(this);
    }
}
