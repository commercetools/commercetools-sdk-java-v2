
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxedPriceImpl.class)
public interface TaxedPrice {

    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public TypedMoney getTotalNet();

    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public TypedMoney getTotalGross();

    /**
    *  <p>TaxedPrice fields that can be used in query predicates: <code>totalNet</code>, <code>totalGross</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("taxPortions")
    public List<TaxPortion> getTaxPortions();

    public void setTotalNet(final TypedMoney totalNet);

    public void setTotalGross(final TypedMoney totalGross);

    @JsonIgnore
    public void setTaxPortions(final TaxPortion... taxPortions);

    public void setTaxPortions(final List<TaxPortion> taxPortions);

    public static TaxedPrice of() {
        return new TaxedPriceImpl();
    }

    public static TaxedPrice of(final TaxedPrice template) {
        TaxedPriceImpl instance = new TaxedPriceImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        instance.setTaxPortions(template.getTaxPortions());
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
}
