package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.TaxPortionDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.CartSetCartTotalTaxActionImpl;

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
@JsonDeserialize(as = CartSetCartTotalTaxActionImpl.class)
public interface CartSetCartTotalTaxAction extends CartUpdateAction {

    /**
    *  <p>The total gross amount of the cart (totalNet + taxes).</p>
    */
    @NotNull
    @Valid
    @JsonProperty("externalTotalGross")
    public Money getExternalTotalGross();
    
    @Valid
    @JsonProperty("externalTaxPortions")
    public List<TaxPortionDraft> getExternalTaxPortions();

    public void setExternalTotalGross(final Money externalTotalGross);
    
    @JsonIgnore
    public void setExternalTaxPortions(final TaxPortionDraft ...externalTaxPortions);
    public void setExternalTaxPortions(final List<TaxPortionDraft> externalTaxPortions);

    public static CartSetCartTotalTaxActionImpl of(){
        return new CartSetCartTotalTaxActionImpl();
    }
    

    public static CartSetCartTotalTaxActionImpl of(final CartSetCartTotalTaxAction template) {
        CartSetCartTotalTaxActionImpl instance = new CartSetCartTotalTaxActionImpl();
        instance.setExternalTotalGross(template.getExternalTotalGross());
        instance.setExternalTaxPortions(template.getExternalTaxPortions());
        return instance;
    }

    default <T> T withCartSetCartTotalTaxAction(Function<CartSetCartTotalTaxAction, T> helper) {
        return helper.apply(this);
    }
}
