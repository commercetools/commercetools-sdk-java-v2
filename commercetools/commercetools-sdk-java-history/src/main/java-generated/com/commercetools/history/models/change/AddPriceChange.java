
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
@JsonDeserialize(as = AddPriceChangeImpl.class)
public interface AddPriceChange extends Change {

    String ADD_PRICE_CHANGE = "AddPriceChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for adding prices</p>
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
    @JsonProperty("nextValue")
    public Price getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    public void setPriceId(final String priceId);

    public void setNextValue(final Price nextValue);

    public static AddPriceChange of() {
        return new AddPriceChangeImpl();
    }

    public static AddPriceChange of(final AddPriceChange template) {
        AddPriceChangeImpl instance = new AddPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPriceId(template.getPriceId());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddPriceChangeBuilder builder() {
        return AddPriceChangeBuilder.of();
    }

    public static AddPriceChangeBuilder builder(final AddPriceChange template) {
        return AddPriceChangeBuilder.of(template);
    }

    default <T> T withAddPriceChange(Function<AddPriceChange, T> helper) {
        return helper.apply(this);
    }
}
