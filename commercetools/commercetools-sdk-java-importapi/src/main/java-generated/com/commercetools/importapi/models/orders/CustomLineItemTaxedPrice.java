
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomLineItemTaxedPriceImpl.class)
public interface CustomLineItemTaxedPrice {

    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public TypedMoney getTotalNet();

    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public TypedMoney getTotalGross();

    public void setTotalNet(final TypedMoney totalNet);

    public void setTotalGross(final TypedMoney totalGross);

    public static CustomLineItemTaxedPrice of() {
        return new CustomLineItemTaxedPriceImpl();
    }

    public static CustomLineItemTaxedPrice of(final CustomLineItemTaxedPrice template) {
        CustomLineItemTaxedPriceImpl instance = new CustomLineItemTaxedPriceImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        return instance;
    }

    public static CustomLineItemTaxedPriceBuilder builder() {
        return CustomLineItemTaxedPriceBuilder.of();
    }

    public static CustomLineItemTaxedPriceBuilder builder(final CustomLineItemTaxedPrice template) {
        return CustomLineItemTaxedPriceBuilder.of(template);
    }

    default <T> T withCustomLineItemTaxedPrice(Function<CustomLineItemTaxedPrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItemTaxedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItemTaxedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItemTaxedPrice>";
            }
        };
    }
}
