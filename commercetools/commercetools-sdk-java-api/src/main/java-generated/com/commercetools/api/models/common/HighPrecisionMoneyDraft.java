package com.commercetools.api.models.common;

import com.commercetools.api.models.common.MoneyType;
import com.commercetools.api.models.common.TypedMoneyDraft;
import com.commercetools.api.models.common.HighPrecisionMoneyDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = HighPrecisionMoneyDraftImpl.class)
public interface HighPrecisionMoneyDraft extends TypedMoneyDraft {

    
    @NotNull
    @JsonProperty("preciseAmount")
    public Long getPreciseAmount();

    public void setPreciseAmount(final Long preciseAmount);

    public static HighPrecisionMoneyDraftImpl of(){
        return new HighPrecisionMoneyDraftImpl();
    }
    

    public static HighPrecisionMoneyDraftImpl of(final HighPrecisionMoneyDraft template) {
        HighPrecisionMoneyDraftImpl instance = new HighPrecisionMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setPreciseAmount(template.getPreciseAmount());
        return instance;
    }

    default <T extends Accessor<HighPrecisionMoneyDraft>> T withHighPrecisionMoneyDraft(Function<HighPrecisionMoneyDraft, T> helper) {
        return helper.apply(this);
    }
}
