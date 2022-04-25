
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
@JsonDeserialize(as = SetPricesChangeImpl.class)
public interface SetPricesChange extends Change {

    String SET_PRICES_CHANGE = "SetPricesChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setPrices</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Price> getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Price> getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    public void setVariant(final String variant);

    @JsonIgnore
    public void setPreviousValue(final Price... previousValue);

    public void setPreviousValue(final List<Price> previousValue);

    @JsonIgnore
    public void setNextValue(final Price... nextValue);

    public void setNextValue(final List<Price> nextValue);

    public static SetPricesChange of() {
        return new SetPricesChangeImpl();
    }

    public static SetPricesChange of(final SetPricesChange template) {
        SetPricesChangeImpl instance = new SetPricesChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetPricesChangeBuilder builder() {
        return SetPricesChangeBuilder.of();
    }

    public static SetPricesChangeBuilder builder(final SetPricesChange template) {
        return SetPricesChangeBuilder.of(template);
    }

    default <T> T withSetPricesChange(Function<SetPricesChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetPricesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetPricesChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetPricesChange>";
            }
        };
    }
}
