
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TaxRate;
import com.commercetools.history.models.common.TaxedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodTaxAmountChangeValueImpl.class)
public interface ShippingMethodTaxAmountChangeValue {

    @NotNull
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice();

    /**
    *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
    */
    @NotNull
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    public void setTaxedPrice(final TaxedPrice taxedPrice);

    public void setTaxRate(final TaxRate taxRate);

    public static ShippingMethodTaxAmountChangeValue of() {
        return new ShippingMethodTaxAmountChangeValueImpl();
    }

    public static ShippingMethodTaxAmountChangeValue of(final ShippingMethodTaxAmountChangeValue template) {
        ShippingMethodTaxAmountChangeValueImpl instance = new ShippingMethodTaxAmountChangeValueImpl();
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

    public static ShippingMethodTaxAmountChangeValueBuilder builder() {
        return ShippingMethodTaxAmountChangeValueBuilder.of();
    }

    public static ShippingMethodTaxAmountChangeValueBuilder builder(final ShippingMethodTaxAmountChangeValue template) {
        return ShippingMethodTaxAmountChangeValueBuilder.of(template);
    }

    default <T> T withShippingMethodTaxAmountChangeValue(Function<ShippingMethodTaxAmountChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodTaxAmountChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodTaxAmountChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodTaxAmountChangeValue>";
            }
        };
    }
}
