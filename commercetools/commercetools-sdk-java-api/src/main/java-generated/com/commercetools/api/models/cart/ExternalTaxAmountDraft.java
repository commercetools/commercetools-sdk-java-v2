package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl;

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
@JsonDeserialize(as = ExternalTaxAmountDraftImpl.class)
public interface ExternalTaxAmountDraft  {

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

    public static ExternalTaxAmountDraftImpl of(){
        return new ExternalTaxAmountDraftImpl();
    }
    

    public static ExternalTaxAmountDraftImpl of(final ExternalTaxAmountDraft template) {
        ExternalTaxAmountDraftImpl instance = new ExternalTaxAmountDraftImpl();
        instance.setTotalGross(template.getTotalGross());
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

    default <T> T withExternalTaxAmountDraft(Function<ExternalTaxAmountDraft, T> helper) {
        return helper.apply(this);
    }
}
