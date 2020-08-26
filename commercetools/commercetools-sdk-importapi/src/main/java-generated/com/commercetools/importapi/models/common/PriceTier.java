package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.common.PriceTierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>A price tier is selected instead of the default price when a certain quantity of the ProductVariant is added to a cart and ordered.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PriceTierImpl.class)
public interface PriceTier  {

    /**
    *  <p>The minimum quantity this price tier is valid for.</p>
    */
    @NotNull
    @JsonProperty("minimumQuantity")
    public Long getMinimumQuantity();
    /**
    *  <p>The currency of a price tier is always the same as the currency of the base Price.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    public void setMinimumQuantity(final Long minimumQuantity);

    public void setValue(final TypedMoney value);

    public static PriceTierImpl of(){
        return new PriceTierImpl();
    }


    public static PriceTierImpl of(final PriceTier template) {
        PriceTierImpl instance = new PriceTierImpl();
        instance.setMinimumQuantity(template.getMinimumQuantity());
        instance.setValue(template.getValue());
        return instance;
    }

}
