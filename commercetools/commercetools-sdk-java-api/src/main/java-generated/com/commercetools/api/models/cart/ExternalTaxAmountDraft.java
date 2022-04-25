
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
@JsonDeserialize(as = ExternalTaxAmountDraftImpl.class)
public interface ExternalTaxAmountDraft {

    /**
    *  <p>The total gross amount of the item (totalNet + taxes).</p>
    */
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public Money getTotalGross();

    @NotNull
    @Valid
    @JsonProperty("taxRate")
    public ExternalTaxRateDraft getTaxRate();

    public void setTotalGross(final Money totalGross);

    public void setTaxRate(final ExternalTaxRateDraft taxRate);

    public static ExternalTaxAmountDraft of() {
        return new ExternalTaxAmountDraftImpl();
    }

    public static ExternalTaxAmountDraft of(final ExternalTaxAmountDraft template) {
        ExternalTaxAmountDraftImpl instance = new ExternalTaxAmountDraftImpl();
        instance.setTotalGross(template.getTotalGross());
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

    public static ExternalTaxAmountDraftBuilder builder() {
        return ExternalTaxAmountDraftBuilder.of();
    }

    public static ExternalTaxAmountDraftBuilder builder(final ExternalTaxAmountDraft template) {
        return ExternalTaxAmountDraftBuilder.of(template);
    }

    default <T> T withExternalTaxAmountDraft(Function<ExternalTaxAmountDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExternalTaxAmountDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExternalTaxAmountDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ExternalTaxAmountDraft>";
            }
        };
    }
}
