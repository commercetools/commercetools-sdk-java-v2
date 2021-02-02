
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangeTaxCalculationModeActionImpl.class)
public interface StagedOrderChangeTaxCalculationModeAction extends StagedOrderUpdateAction {

    String CHANGE_TAX_CALCULATION_MODE = "changeTaxCalculationMode";

    @NotNull
    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    public static StagedOrderChangeTaxCalculationModeAction of() {
        return new StagedOrderChangeTaxCalculationModeActionImpl();
    }

    public static StagedOrderChangeTaxCalculationModeAction of(
            final StagedOrderChangeTaxCalculationModeAction template) {
        StagedOrderChangeTaxCalculationModeActionImpl instance = new StagedOrderChangeTaxCalculationModeActionImpl();
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        return instance;
    }

    public static StagedOrderChangeTaxCalculationModeActionBuilder builder() {
        return StagedOrderChangeTaxCalculationModeActionBuilder.of();
    }

    public static StagedOrderChangeTaxCalculationModeActionBuilder builder(
            final StagedOrderChangeTaxCalculationModeAction template) {
        return StagedOrderChangeTaxCalculationModeActionBuilder.of(template);
    }

    default <T> T withStagedOrderChangeTaxCalculationModeAction(
            Function<StagedOrderChangeTaxCalculationModeAction, T> helper) {
        return helper.apply(this);
    }
}
