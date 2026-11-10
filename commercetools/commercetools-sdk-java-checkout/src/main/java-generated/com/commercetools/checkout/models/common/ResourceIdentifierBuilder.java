
package com.commercetools.checkout.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceIdentifierBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceIdentifierBuilder {

    public com.commercetools.checkout.models.application.ApplicationResourceIdentifierBuilder applicationBuilder() {
        return com.commercetools.checkout.models.application.ApplicationResourceIdentifierBuilder.of();
    }

    public com.commercetools.checkout.models.cart.CartResourceIdentifierBuilder cartBuilder() {
        return com.commercetools.checkout.models.cart.CartResourceIdentifierBuilder.of();
    }

    public com.commercetools.checkout.models.order.OrderResourceIdentifierBuilder orderBuilder() {
        return com.commercetools.checkout.models.order.OrderResourceIdentifierBuilder.of();
    }

    public com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifierBuilder paymentIntegrationBuilder() {
        return com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifierBuilder.of();
    }

    public com.commercetools.checkout.models.payment.PaymentResourceIdentifierBuilder paymentBuilder() {
        return com.commercetools.checkout.models.payment.PaymentResourceIdentifierBuilder.of();
    }

    /**
     * factory method for an instance of ResourceIdentifierBuilder
     * @return builder
     */
    public static ResourceIdentifierBuilder of() {
        return new ResourceIdentifierBuilder();
    }

}
