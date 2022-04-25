
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
@JsonDeserialize(as = TaxedPriceImpl.class)
public interface TaxedPrice {

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

    public static TaxedPrice of() {
        return new TaxedPriceImpl();
    }

    public static TaxedPrice of(final TaxedPrice template) {
        TaxedPriceImpl instance = new TaxedPriceImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        return instance;
    }

    public static TaxedPriceBuilder builder() {
        return TaxedPriceBuilder.of();
    }

    public static TaxedPriceBuilder builder(final TaxedPrice template) {
        return TaxedPriceBuilder.of(template);
    }

    default <T> T withTaxedPrice(Function<TaxedPrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<TaxedPrice>";
            }
        };
    }
}
