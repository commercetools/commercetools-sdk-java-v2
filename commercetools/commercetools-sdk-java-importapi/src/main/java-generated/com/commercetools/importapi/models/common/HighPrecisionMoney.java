package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.MoneyType;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.common.HighPrecisionMoneyImpl;

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
@JsonDeserialize(as = HighPrecisionMoneyImpl.class)
public interface HighPrecisionMoney extends TypedMoney {

    
    @NotNull
    @JsonProperty("preciseAmount")
    public Long getPreciseAmount();

    public void setPreciseAmount(final Long preciseAmount);

    public static HighPrecisionMoneyImpl of(){
        return new HighPrecisionMoneyImpl();
    }
    

    public static HighPrecisionMoneyImpl of(final HighPrecisionMoney template) {
        HighPrecisionMoneyImpl instance = new HighPrecisionMoneyImpl();
        instance.setFractionDigits(template.getFractionDigits());
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setPreciseAmount(template.getPreciseAmount());
        return instance;
    }

    default <T> T withHighPrecisionMoney(Function<HighPrecisionMoney, T> helper) {
        return helper.apply(this);
    }
}
