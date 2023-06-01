package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.payment.PaymentResourceIdentifierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>ResourceIdentifier of a Payment.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentResourceIdentifier paymentResourceIdentifier = PaymentResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = PaymentResourceIdentifierImpl.class)
public interface PaymentResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Payment> {

    /**
     * discriminator value for PaymentResourceIdentifier
     */
    String PAYMENT = "payment";

    /**
     *  <p>Unique identifier of the referenced Payment. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @JsonProperty("id")
    public String getId();
    /**
     *  <p>User-defined unique identifier of the referenced Payment. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced Payment. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    
    
    /**
     *  <p>User-defined unique identifier of the referenced Payment. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of PaymentResourceIdentifier
     */
    public static PaymentResourceIdentifier of(){
        return new PaymentResourceIdentifierImpl();
    }
    

    /**
     * factory method to create a shallow copy PaymentResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentResourceIdentifier of(final PaymentResourceIdentifier template) {
        PaymentResourceIdentifierImpl instance = new PaymentResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of PaymentResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentResourceIdentifier deepCopy(@Nullable final PaymentResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        PaymentResourceIdentifierImpl instance = new PaymentResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for PaymentResourceIdentifier
     * @return builder
     */
    public static PaymentResourceIdentifierBuilder builder() {
        return PaymentResourceIdentifierBuilder.of();
    }
    
    /**
     * create builder for PaymentResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentResourceIdentifierBuilder builder(final PaymentResourceIdentifier template) {
        return PaymentResourceIdentifierBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentResourceIdentifier(Function<PaymentResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentResourceIdentifier>";
            }
        };
    }
}
