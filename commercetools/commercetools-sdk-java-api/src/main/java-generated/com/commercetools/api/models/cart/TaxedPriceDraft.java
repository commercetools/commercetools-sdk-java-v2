
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
@JsonDeserialize(as = TaxedPriceDraftImpl.class)
public interface TaxedPriceDraft {

    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public Money getTotalNet();

    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public Money getTotalGross();

    @NotNull
    @Valid
    @JsonProperty("taxPortions")
    public List<TaxPortionDraft> getTaxPortions();

    public void setTotalNet(final Money totalNet);

    public void setTotalGross(final Money totalGross);

    @JsonIgnore
    public void setTaxPortions(final TaxPortionDraft... taxPortions);

    public void setTaxPortions(final List<TaxPortionDraft> taxPortions);

    public static TaxedPriceDraft of() {
        return new TaxedPriceDraftImpl();
    }

    public static TaxedPriceDraft of(final TaxedPriceDraft template) {
        TaxedPriceDraftImpl instance = new TaxedPriceDraftImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        instance.setTaxPortions(template.getTaxPortions());
        return instance;
    }

    public static TaxedPriceDraftBuilder builder() {
        return TaxedPriceDraftBuilder.of();
    }

    public static TaxedPriceDraftBuilder builder(final TaxedPriceDraft template) {
        return TaxedPriceDraftBuilder.of(template);
    }

    default <T> T withTaxedPriceDraft(Function<TaxedPriceDraft, T> helper) {
        return helper.apply(this);
    }
}
