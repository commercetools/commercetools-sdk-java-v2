package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.orders.TaxPortion;
import com.commercetools.importapi.models.orders.TaxedPriceImpl;

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
@JsonDeserialize(as = TaxedPriceImpl.class)
public interface TaxedPrice  {

    /**
    *  <p>Maps to <code>TaxedPrice.totalNet</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public Money getTotalNet();
    /**
    *  <p>Maps to <code>TaxedPrice.totalGross</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public Money getTotalGross();
    /**
    *  <p>Maps to <code>TaxedPrice.taxPortions</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("taxPortions")
    public List<TaxPortion> getTaxPortions();

    public void setTotalNet(final Money totalNet);
    
    public void setTotalGross(final Money totalGross);
    
    @JsonIgnore
    public void setTaxPortions(final TaxPortion ...taxPortions);
    public void setTaxPortions(final List<TaxPortion> taxPortions);

    public static TaxedPriceImpl of(){
        return new TaxedPriceImpl();
    }
    

    public static TaxedPriceImpl of(final TaxedPrice template) {
        TaxedPriceImpl instance = new TaxedPriceImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        instance.setTaxPortions(template.getTaxPortions());
        return instance;
    }

    default <T> T withTaxedPrice(Function<TaxedPrice, T> helper) {
        return helper.apply(this);
    }
}
