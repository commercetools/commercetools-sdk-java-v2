
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddTaxRateChangeImpl.class)
public interface AddTaxRateChange extends Change {

    String ADD_TAX_RATE_CHANGE = "AddTaxRateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addTaxRate</code> on tax categories</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
    */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxRate getNextValue();

    public void setChange(final String change);

    public void setNextValue(final TaxRate nextValue);

    public static AddTaxRateChange of() {
        return new AddTaxRateChangeImpl();
    }

    public static AddTaxRateChange of(final AddTaxRateChange template) {
        AddTaxRateChangeImpl instance = new AddTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddTaxRateChangeBuilder builder() {
        return AddTaxRateChangeBuilder.of();
    }

    public static AddTaxRateChangeBuilder builder(final AddTaxRateChange template) {
        return AddTaxRateChangeBuilder.of(template);
    }

    default <T> T withAddTaxRateChange(Function<AddTaxRateChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddTaxRateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddTaxRateChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddTaxRateChange>";
            }
        };
    }
}
