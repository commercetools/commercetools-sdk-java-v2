
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentStatusInterfaceCodeSetMessagePayloadBuilder {

    private String paymentId;

    private String interfaceCode;

    public PaymentStatusInterfaceCodeSetMessagePayloadBuilder paymentId(final String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public PaymentStatusInterfaceCodeSetMessagePayloadBuilder interfaceCode(final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    public String getPaymentId() {
        return this.paymentId;
    }

    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    public PaymentStatusInterfaceCodeSetMessagePayload build() {
        return new PaymentStatusInterfaceCodeSetMessagePayloadImpl(paymentId, interfaceCode);
    }

    public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder of() {
        return new PaymentStatusInterfaceCodeSetMessagePayloadBuilder();
    }

    public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder of(
            final PaymentStatusInterfaceCodeSetMessagePayload template) {
        PaymentStatusInterfaceCodeSetMessagePayloadBuilder builder = new PaymentStatusInterfaceCodeSetMessagePayloadBuilder();
        builder.paymentId = template.getPaymentId();
        builder.interfaceCode = template.getInterfaceCode();
        return builder;
    }

}
