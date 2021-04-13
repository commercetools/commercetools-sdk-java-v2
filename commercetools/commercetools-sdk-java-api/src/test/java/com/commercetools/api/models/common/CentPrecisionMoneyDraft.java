package com.commercetools.api.models.common;

import com.commercetools.api.models.common.MoneyType;
import com.commercetools.api.models.common.TypedMoneyDraft;
import com.commercetools.api.models.common.CentPrecisionMoneyDraftImpl;

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
@JsonDeserialize(as = CentPrecisionMoneyDraftImpl.class)
public interface CentPrecisionMoneyDraft extends TypedMoneyDraft {

    String CENT_PRECISION = "centPrecision";



    public static CentPrecisionMoneyDraft of(){
        return new CentPrecisionMoneyDraftImpl();
    }
    

    public static CentPrecisionMoneyDraft of(final CentPrecisionMoneyDraft template) {
        CentPrecisionMoneyDraftImpl instance = new CentPrecisionMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        return instance;
    }

    public static CentPrecisionMoneyDraftBuilder builder(){
        return CentPrecisionMoneyDraftBuilder.of();
    }
    
    public static CentPrecisionMoneyDraftBuilder builder(final CentPrecisionMoneyDraft template){
        return CentPrecisionMoneyDraftBuilder.of(template);
    }
    

    default <T> T withCentPrecisionMoneyDraft(Function<CentPrecisionMoneyDraft, T> helper) {
        return helper.apply(this);
    }
}
