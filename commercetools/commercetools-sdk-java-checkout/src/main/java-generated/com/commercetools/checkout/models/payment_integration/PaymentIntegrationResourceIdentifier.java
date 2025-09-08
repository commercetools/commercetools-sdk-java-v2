
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Resource identifier to a <span>Payment Integration</span>. Either <code>id</code> or <code>key</code> is required. If both are set, an <span>InvalidJsonInput</span> error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationResourceIdentifier paymentIntegrationResourceIdentifier = PaymentIntegrationResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment-integration")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntegrationResourceIdentifierImpl.class)
public interface PaymentIntegrationResourceIdentifier extends ResourceIdentifier {

    /**
     * discriminator value for PaymentIntegrationResourceIdentifier
     */
    String PAYMENT_INTEGRATION = "payment-integration";

    /**
     *  <p>Unique identifier of the referenced Payment Integration. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced Payment Integration. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced Payment Integration. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced Payment Integration. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of PaymentIntegrationResourceIdentifier
     */
    public static PaymentIntegrationResourceIdentifier of() {
        return new PaymentIntegrationResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntegrationResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntegrationResourceIdentifier of(final PaymentIntegrationResourceIdentifier template) {
        PaymentIntegrationResourceIdentifierImpl instance = new PaymentIntegrationResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public PaymentIntegrationResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegrationResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegrationResourceIdentifier deepCopy(
            @Nullable final PaymentIntegrationResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        PaymentIntegrationResourceIdentifierImpl instance = new PaymentIntegrationResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for PaymentIntegrationResourceIdentifier
     * @return builder
     */
    public static PaymentIntegrationResourceIdentifierBuilder builder() {
        return PaymentIntegrationResourceIdentifierBuilder.of();
    }

    /**
     * create builder for PaymentIntegrationResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationResourceIdentifierBuilder builder(
            final PaymentIntegrationResourceIdentifier template) {
        return PaymentIntegrationResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegrationResourceIdentifier(Function<PaymentIntegrationResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegrationResourceIdentifier>";
            }
        };
    }
}
