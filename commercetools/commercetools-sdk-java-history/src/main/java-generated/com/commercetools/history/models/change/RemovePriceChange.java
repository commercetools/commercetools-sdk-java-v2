
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
@JsonDeserialize(as = RemovePriceChangeImpl.class)
public interface RemovePriceChange extends Change {

    String REMOVE_PRICE_CHANGE = "RemovePriceChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for removing prices</p>
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

    public static RemovePriceChange of() {
        return new RemovePriceChangeImpl();
    }

    public static RemovePriceChange of(final RemovePriceChange template) {
        RemovePriceChangeImpl instance = new RemovePriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPriceId(template.getPriceId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static RemovePriceChangeBuilder builder() {
        return RemovePriceChangeBuilder.of();
    }

    public static RemovePriceChangeBuilder builder(final RemovePriceChange template) {
        return RemovePriceChangeBuilder.of(template);
    }

    default <T> T withRemovePriceChange(Function<RemovePriceChange, T> helper) {
        return helper.apply(this);
    }
}
