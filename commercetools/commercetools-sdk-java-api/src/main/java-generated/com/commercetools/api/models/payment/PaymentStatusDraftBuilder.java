
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentStatusDraftBuilder implements Builder<PaymentStatusDraft> {

    @Nullable
    private String interfaceCode;

    @Nullable
    private String interfaceText;

    @Nullable
    private com.commercetools.api.models.state.StateResourceIdentifier state;

    public PaymentStatusDraftBuilder interfaceCode(@Nullable final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    public PaymentStatusDraftBuilder interfaceText(@Nullable final String interfaceText) {
        this.interfaceText = interfaceText;
        return this;
    }

    public PaymentStatusDraftBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    public PaymentStatusDraftBuilder state(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    @Nullable
    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    @Nullable
    public String getInterfaceText() {
        return this.interfaceText;
    }

    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    public PaymentStatusDraft build() {
        return new PaymentStatusDraftImpl(interfaceCode, interfaceText, state);
    }

    /**
     * builds PaymentStatusDraft without checking for non null required values
     */
    public PaymentStatusDraft buildUnchecked() {
        return new PaymentStatusDraftImpl(interfaceCode, interfaceText, state);
    }

    public static PaymentStatusDraftBuilder of() {
        return new PaymentStatusDraftBuilder();
    }

    public static PaymentStatusDraftBuilder of(final PaymentStatusDraft template) {
        PaymentStatusDraftBuilder builder = new PaymentStatusDraftBuilder();
        builder.interfaceCode = template.getInterfaceCode();
        builder.interfaceText = template.getInterfaceText();
        builder.state = template.getState();
        return builder;
    }

}
