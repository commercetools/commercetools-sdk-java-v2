package com.commercetools.api.models.common;

import com.commercetools.api.models.common.MoneyType;
import com.commercetools.api.models.common.TypedMoneyDraft;
import com.commercetools.api.models.common.HighPrecisionMoneyDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class HighPrecisionMoneyDraftBuilder {

    
    private Long centAmount;
    
    
    private String currencyCode;
    
    
    private Long preciseAmount;

    public HighPrecisionMoneyDraftBuilder centAmount( final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }
    
    public HighPrecisionMoneyDraftBuilder currencyCode( final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    
    public HighPrecisionMoneyDraftBuilder preciseAmount( final Long preciseAmount) {
        this.preciseAmount = preciseAmount;
        return this;
    }

    
    public Long getCentAmount(){
        return this.centAmount;
    }
    
    
    public String getCurrencyCode(){
        return this.currencyCode;
    }
    
    
    public Long getPreciseAmount(){
        return this.preciseAmount;
    }

    public HighPrecisionMoneyDraft build() {
        return new HighPrecisionMoneyDraftImpl(centAmount, currencyCode, preciseAmount);
    }

    public static HighPrecisionMoneyDraftBuilder of() {
        return new HighPrecisionMoneyDraftBuilder();
    }

    public static HighPrecisionMoneyDraftBuilder of(final HighPrecisionMoneyDraft template) {
        HighPrecisionMoneyDraftBuilder builder = new HighPrecisionMoneyDraftBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.preciseAmount = template.getPreciseAmount();
        return builder;
    }

}
