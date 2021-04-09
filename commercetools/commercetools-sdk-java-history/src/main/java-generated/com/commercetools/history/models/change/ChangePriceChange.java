
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangePriceChangeImpl.class)
public interface ChangePriceChange extends Change {

    String CHANGE_PRICE_CHANGE = "ChangePriceChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for changing prices</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Price getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Price getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    public void setPriceId(final String priceId);

    public void setPreviousValue(final Price previousValue);

    public void setNextValue(final Price nextValue);

    public static ChangePriceChange of() {
        return new ChangePriceChangeImpl();
    }

    public static ChangePriceChange of(final ChangePriceChange template) {
        ChangePriceChangeImpl instance = new ChangePriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPriceId(template.getPriceId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangePriceChangeBuilder builder() {
        return ChangePriceChangeBuilder.of();
    }

    public static ChangePriceChangeBuilder builder(final ChangePriceChange template) {
        return ChangePriceChangeBuilder.of(template);
    }

    default <T> T withChangePriceChange(Function<ChangePriceChange, T> helper) {
        return helper.apply(this);
    }
}
