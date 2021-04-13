
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentLabelImpl.class)
public interface PaymentLabel extends Label {

    String PAYMENT_LABEL = "PaymentLabel";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @Valid
    @JsonProperty("amountPlanned")
    public Money getAmountPlanned();

    public void setKey(final String key);

    public void setAmountPlanned(final Money amountPlanned);

    public static PaymentLabel of() {
        return new PaymentLabelImpl();
    }

    public static PaymentLabel of(final PaymentLabel template) {
        PaymentLabelImpl instance = new PaymentLabelImpl();
        instance.setKey(template.getKey());
        instance.setAmountPlanned(template.getAmountPlanned());
        return instance;
    }

    public static PaymentLabelBuilder builder() {
        return PaymentLabelBuilder.of();
    }

    public static PaymentLabelBuilder builder(final PaymentLabel template) {
        return PaymentLabelBuilder.of(template);
    }

    default <T> T withPaymentLabel(Function<PaymentLabel, T> helper) {
        return helper.apply(this);
    }
}
