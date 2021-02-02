
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxPortionDraftImpl.class)
public interface TaxPortionDraft {

    @JsonProperty("name")
    public String getName();

    @NotNull
    @JsonProperty("rate")
    public Double getRate();

    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    public void setName(final String name);

    public void setRate(final Double rate);

    public void setAmount(final Money amount);

    public static TaxPortionDraft of() {
        return new TaxPortionDraftImpl();
    }

    public static TaxPortionDraft of(final TaxPortionDraft template) {
        TaxPortionDraftImpl instance = new TaxPortionDraftImpl();
        instance.setName(template.getName());
        instance.setRate(template.getRate());
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static TaxPortionDraftBuilder builder() {
        return TaxPortionDraftBuilder.of();
    }

    public static TaxPortionDraftBuilder builder(final TaxPortionDraft template) {
        return TaxPortionDraftBuilder.of(template);
    }

    default <T> T withTaxPortionDraft(Function<TaxPortionDraft, T> helper) {
        return helper.apply(this);
    }
}
