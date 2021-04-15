
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentStatusDraftImpl.class)
public interface PaymentStatusDraft {

    @JsonProperty("interfaceCode")
    public String getInterfaceCode();

    @JsonProperty("interfaceText")
    public String getInterfaceText();

    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    public void setInterfaceCode(final String interfaceCode);

    public void setInterfaceText(final String interfaceText);

    public void setState(final StateResourceIdentifier state);

    public static PaymentStatusDraft of() {
        return new PaymentStatusDraftImpl();
    }

    public static PaymentStatusDraft of(final PaymentStatusDraft template) {
        PaymentStatusDraftImpl instance = new PaymentStatusDraftImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        instance.setInterfaceText(template.getInterfaceText());
        instance.setState(template.getState());
        return instance;
    }

    public static PaymentStatusDraftBuilder builder() {
        return PaymentStatusDraftBuilder.of();
    }

    public static PaymentStatusDraftBuilder builder(final PaymentStatusDraft template) {
        return PaymentStatusDraftBuilder.of(template);
    }

    default <T> T withPaymentStatusDraft(Function<PaymentStatusDraft, T> helper) {
        return helper.apply(this);
    }
}
