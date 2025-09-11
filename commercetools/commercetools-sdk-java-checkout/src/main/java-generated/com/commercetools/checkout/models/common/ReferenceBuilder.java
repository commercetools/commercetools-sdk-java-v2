
package com.commercetools.checkout.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReferenceBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReferenceBuilder {

    public com.commercetools.checkout.models.application.ApplicationReferenceBuilder applicationBuilder() {
        return com.commercetools.checkout.models.application.ApplicationReferenceBuilder.of();
    }

    public com.commercetools.checkout.models.cart.CartReferenceBuilder cartBuilder() {
        return com.commercetools.checkout.models.cart.CartReferenceBuilder.of();
    }

    public com.commercetools.checkout.models.cart.OrderReferenceBuilder orderBuilder() {
        return com.commercetools.checkout.models.cart.OrderReferenceBuilder.of();
    }

    public com.commercetools.checkout.models.payment_integration.PaymentIntegrationReferenceBuilder paymentIntegrationBuilder() {
        return com.commercetools.checkout.models.payment_integration.PaymentIntegrationReferenceBuilder.of();
    }

    public com.commercetools.checkout.models.payment.PaymentReferenceBuilder paymentBuilder() {
        return com.commercetools.checkout.models.payment.PaymentReferenceBuilder.of();
    }

    /**
     * factory method for an instance of ReferenceBuilder
     * @return builder
     */
    public static ReferenceBuilder of() {
        return new ReferenceBuilder();
    }

}
