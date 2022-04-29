
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
@JsonDeserialize(as = SetDiscountedPriceChangeImpl.class)
public interface SetDiscountedPriceChange extends Change {

    String SET_DISCOUNTED_PRICE_CHANGE = "SetDiscountedPriceChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setDiscountedPrice</code></p>
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

    public void setVariant(final String variant);

    public void setPriceId(final String priceId);

    public void setPreviousValue(final Price previousValue);

    public void setNextValue(final Price nextValue);

    public static SetDiscountedPriceChange of() {
        return new SetDiscountedPriceChangeImpl();
    }

    public static SetDiscountedPriceChange of(final SetDiscountedPriceChange template) {
        SetDiscountedPriceChangeImpl instance = new SetDiscountedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        instance.setPriceId(template.getPriceId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetDiscountedPriceChangeBuilder builder() {
        return SetDiscountedPriceChangeBuilder.of();
    }

    public static SetDiscountedPriceChangeBuilder builder(final SetDiscountedPriceChange template) {
        return SetDiscountedPriceChangeBuilder.of(template);
    }

    default <T> T withSetDiscountedPriceChange(Function<SetDiscountedPriceChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetDiscountedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDiscountedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDiscountedPriceChange>";
            }
        };
    }
}
