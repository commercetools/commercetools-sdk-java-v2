
package com.commercetools.checkout.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelReference" rel="nofollow">ChannelReference</a>. A referenced resource can be embedded through <span>Reference Expansion</span>. The expanded reference is the value of an additional <code>obj</code> field then.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Reference reference = Reference.applicationBuilder()
 *             id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = ReferenceImpl.class, visible = true)
@JsonDeserialize(as = ReferenceImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Reference {

    /**
     *  <p>Type of referenced resource.</p>
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *  <p>Unique ID of the referenced resource.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique ID of the referenced resource.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    public Reference copyDeep();

    /**
     * factory method to create a deep copy of Reference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Reference deepCopy(@Nullable final Reference template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ReferenceImpl)) {
            return template.copyDeep();
        }
        ReferenceImpl instance = new ReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder for application subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.ApplicationReferenceBuilder applicationBuilder() {
        return com.commercetools.checkout.models.application.ApplicationReferenceBuilder.of();
    }

    /**
     * builder for cart subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.cart.CartReferenceBuilder cartBuilder() {
        return com.commercetools.checkout.models.cart.CartReferenceBuilder.of();
    }

    /**
     * builder for order subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.cart.OrderReferenceBuilder orderBuilder() {
        return com.commercetools.checkout.models.cart.OrderReferenceBuilder.of();
    }

    /**
     * builder for paymentIntegration subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.PaymentIntegrationReferenceBuilder paymentIntegrationBuilder() {
        return com.commercetools.checkout.models.payment_integration.PaymentIntegrationReferenceBuilder.of();
    }

    /**
     * builder for payment subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment.PaymentReferenceBuilder paymentBuilder() {
        return com.commercetools.checkout.models.payment.PaymentReferenceBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReference(Function<Reference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Reference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Reference>() {
            @Override
            public String toString() {
                return "TypeReference<Reference>";
            }
        };
    }
}
