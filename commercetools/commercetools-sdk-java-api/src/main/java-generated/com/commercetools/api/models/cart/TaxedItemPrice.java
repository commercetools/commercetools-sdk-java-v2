
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
@JsonDeserialize(as = TaxedItemPriceImpl.class)
public interface TaxedItemPrice {

    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public TypedMoney getTotalNet();

    /**
    *  <p>TaxedItemPrice fields can not be used in query predicates.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public TypedMoney getTotalGross();

    public void setTotalNet(final TypedMoney totalNet);

    public void setTotalGross(final TypedMoney totalGross);

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
