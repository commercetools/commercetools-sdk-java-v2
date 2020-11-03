package com.commercetools.api.models.cart;

import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.cart.TaxedItemPriceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TaxedItemPriceImpl.class)
public interface TaxedItemPrice  {

    
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

    public static TaxedItemPriceImpl of(){
        return new TaxedItemPriceImpl();
    }
    

    public static TaxedItemPriceImpl of(final TaxedItemPrice template) {
        TaxedItemPriceImpl instance = new TaxedItemPriceImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        return instance;
    }

    default <T> T withTaxedItemPrice(Function<TaxedItemPrice, T> helper) {
        return helper.apply(this);
    }
}
