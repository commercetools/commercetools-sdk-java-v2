package com.commercetools.api.models.common;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.PriceTierDraftImpl;

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
@JsonDeserialize(as = PriceTierDraftImpl.class)
public interface PriceTierDraft  {

    
    @NotNull
    @JsonProperty("minimumQuantity")
    public Long getMinimumQuantity();
    
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    public void setMinimumQuantity(final Long minimumQuantity);
    
    public void setValue(final Money value);

    public static PriceTierDraftImpl of(){
        return new PriceTierDraftImpl();
    }
    

    public static PriceTierDraftImpl of(final PriceTierDraft template) {
        PriceTierDraftImpl instance = new PriceTierDraftImpl();
        instance.setMinimumQuantity(template.getMinimumQuantity());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withPriceTierDraft(Function<PriceTierDraft, T> helper) {
        return helper.apply(this);
    }
}
