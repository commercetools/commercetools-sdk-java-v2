
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TaxedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetShippingInfoTaxedPriceChangeImpl.class)
public interface SetShippingInfoTaxedPriceChange extends Change {

    String SET_SHIPPING_INFO_TAXED_PRICE_CHANGE = "SetShippingInfoTaxedPriceChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setShippingInfoTaxedPrice</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxedPrice getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TaxedPrice getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final TaxedPrice nextValue);

    public void setPreviousValue(final TaxedPrice previousValue);

    public static SetShippingInfoTaxedPriceChange of() {
        return new SetShippingInfoTaxedPriceChangeImpl();
    }

    public static SetShippingInfoTaxedPriceChange of(final SetShippingInfoTaxedPriceChange template) {
        SetShippingInfoTaxedPriceChangeImpl instance = new SetShippingInfoTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetShippingInfoTaxedPriceChangeBuilder builder() {
        return SetShippingInfoTaxedPriceChangeBuilder.of();
    }

    public static SetShippingInfoTaxedPriceChangeBuilder builder(final SetShippingInfoTaxedPriceChange template) {
        return SetShippingInfoTaxedPriceChangeBuilder.of(template);
    }

    default <T> T withSetShippingInfoTaxedPriceChange(Function<SetShippingInfoTaxedPriceChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingInfoTaxedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingInfoTaxedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingInfoTaxedPriceChange>";
            }
        };
    }
}
