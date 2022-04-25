
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
@JsonDeserialize(as = RemoveTaxRateChangeImpl.class)
public interface RemoveTaxRateChange extends Change {

    String REMOVE_TAX_RATE_CHANGE = "RemoveTaxRateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>removeTaxRate</code> on tax categories</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
    */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TaxRate getPreviousValue();

    /**
    *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
    */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxRate getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final TaxRate previousValue);

    public void setNextValue(final TaxRate nextValue);

    public static RemoveTaxRateChange of() {
        return new RemoveTaxRateChangeImpl();
    }

    public static RemoveTaxRateChange of(final RemoveTaxRateChange template) {
        RemoveTaxRateChangeImpl instance = new RemoveTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static RemoveTaxRateChangeBuilder builder() {
        return RemoveTaxRateChangeBuilder.of();
    }

    public static RemoveTaxRateChangeBuilder builder(final RemoveTaxRateChange template) {
        return RemoveTaxRateChangeBuilder.of(template);
    }

    default <T> T withRemoveTaxRateChange(Function<RemoveTaxRateChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RemoveTaxRateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveTaxRateChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveTaxRateChange>";
            }
        };
    }
}
