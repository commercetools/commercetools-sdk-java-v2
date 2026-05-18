
package com.commercetools.checkout.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Draft type to create a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:Reference" rel="nofollow">Reference</a> to a resource. Provide either the <code>id</code> or (wherever supported) the <code>key</code> of the resource to reference, but depending on the API endpoint the response returns a Reference.</p>
 *  <p>Each resource type has its corresponding ResourceIdentifier, like <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentResourceIdentifier" rel="nofollow">PaymentResourceIdentifier</a>.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceIdentifier resourceIdentifier = ResourceIdentifier.applicationBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = ResourceIdentifierImpl.class, visible = true)
@JsonDeserialize(as = ResourceIdentifierImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ResourceIdentifier {

    /**
     *  <p>Type of referenced resource. If given, it must match the expected <a href="https://docs.commercetools.com/apis/ctp:checkout:type:ReferenceTypeId" rel="nofollow">ReferenceTypeId</a> of the referenced resource.</p>
     * @return typeId
     */

    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    public ResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of ResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ResourceIdentifier deepCopy(@Nullable final ResourceIdentifier template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ResourceIdentifierImpl)) {
            return template.copyDeep();
        }
        ResourceIdentifierImpl instance = new ResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder for application subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.ApplicationResourceIdentifierBuilder applicationBuilder() {
        return com.commercetools.checkout.models.application.ApplicationResourceIdentifierBuilder.of();
    }

    /**
     * builder for cart subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.cart.CartResourceIdentifierBuilder cartBuilder() {
        return com.commercetools.checkout.models.cart.CartResourceIdentifierBuilder.of();
    }

    /**
     * builder for order subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.order.OrderResourceIdentifierBuilder orderBuilder() {
        return com.commercetools.checkout.models.order.OrderResourceIdentifierBuilder.of();
    }

    /**
     * builder for paymentIntegration subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifierBuilder paymentIntegrationBuilder() {
        return com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifierBuilder.of();
    }

    /**
     * builder for payment subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment.PaymentResourceIdentifierBuilder paymentBuilder() {
        return com.commercetools.checkout.models.payment.PaymentResourceIdentifierBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withResourceIdentifier(Function<ResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceIdentifier>";
            }
        };
    }
}
