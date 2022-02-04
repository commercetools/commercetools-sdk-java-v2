
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentTransitionStateActionBuilder implements Builder<PaymentTransitionStateAction> {

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean force;

    public PaymentTransitionStateActionBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    public PaymentTransitionStateActionBuilder state(
            final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    public PaymentTransitionStateActionBuilder force(@Nullable final Boolean force) {
        this.force = force;
        return this;
    }

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    @Nullable
    public Boolean getForce() {
        return this.force;
    }

    public PaymentTransitionStateAction build() {
        Objects.requireNonNull(state, PaymentTransitionStateAction.class + ": state is missing");
        return new PaymentTransitionStateActionImpl(state, force);
    }

    /**
     * builds PaymentTransitionStateAction without checking for non null required values
     */
    public PaymentTransitionStateAction buildUnchecked() {
        return new PaymentTransitionStateActionImpl(state, force);
    }

    public static PaymentTransitionStateActionBuilder of() {
        return new PaymentTransitionStateActionBuilder();
    }

    public static PaymentTransitionStateActionBuilder of(final PaymentTransitionStateAction template) {
        PaymentTransitionStateActionBuilder builder = new PaymentTransitionStateActionBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
