
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
@JsonDeserialize(as = TaxedItemPriceImpl.class)
public interface TaxedItemPrice {

    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public Money getTotalNet();

    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public Money getTotalGross();

    public void setTotalNet(final Money totalNet);

    public void setTotalGross(final Money totalGross);

    public static TaxedItemPrice of() {
        return new TaxedItemPriceImpl();
    }

    public static TaxedItemPrice of(final TaxedItemPrice template) {
        TaxedItemPriceImpl instance = new TaxedItemPriceImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        return instance;
    }

    public static TaxedItemPriceBuilder builder() {
        return TaxedItemPriceBuilder.of();
    }

    public static TaxedItemPriceBuilder builder(final TaxedItemPrice template) {
        return TaxedItemPriceBuilder.of(template);
    }

    default <T> T withTaxedItemPrice(Function<TaxedItemPrice, T> helper) {
        return helper.apply(this);
    }
}
