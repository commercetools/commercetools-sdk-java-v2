package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.type.CustomFields;
import com.commercetools.api.models.message.PaymentInteractionAddedMessageImpl;

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
 *  <p>Generated after a successful Add InterfaceInteraction update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentInteractionAddedMessage paymentInteractionAddedMessage = PaymentInteractionAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .interaction(interactionBuilder -> interactionBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = PaymentInteractionAddedMessageImpl.class)
public interface PaymentInteractionAddedMessage extends Message {

    /**
     * discriminator value for PaymentInteractionAddedMessage
     */
    String PAYMENT_INTERACTION_ADDED = "PaymentInteractionAdded";

    /**
     *  <p>The interface interaction that was added to the Payment.</p>
     * @return interaction
     */
    @NotNull
    @Valid
    @JsonProperty("interaction")
    public CustomFields getInteraction();

    /**
     *  <p>The interface interaction that was added to the Payment.</p>
     * @param interaction value to be set
     */
    
    public void setInteraction(final CustomFields interaction);
    

    /**
     * factory method
     * @return instance of PaymentInteractionAddedMessage
     */
    public static PaymentInteractionAddedMessage of(){
        return new PaymentInteractionAddedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy PaymentInteractionAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentInteractionAddedMessage of(final PaymentInteractionAddedMessage template) {
        PaymentInteractionAddedMessageImpl instance = new PaymentInteractionAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setInteraction(template.getInteraction());
        return instance;
    }

    /**
     * factory method to create a deep copy of PaymentInteractionAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentInteractionAddedMessage deepCopy(@Nullable final PaymentInteractionAddedMessage template) {
        if (template == null) {
            return null;
        }
        PaymentInteractionAddedMessageImpl instance = new PaymentInteractionAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setInteraction(com.commercetools.api.models.type.CustomFields.deepCopy(template.getInteraction()));
        return instance;
    }

    /**
     * builder factory method for PaymentInteractionAddedMessage
     * @return builder
     */
    public static PaymentInteractionAddedMessageBuilder builder() {
        return PaymentInteractionAddedMessageBuilder.of();
    }
    
    /**
     * create builder for PaymentInteractionAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentInteractionAddedMessageBuilder builder(final PaymentInteractionAddedMessage template) {
        return PaymentInteractionAddedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentInteractionAddedMessage(Function<PaymentInteractionAddedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentInteractionAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentInteractionAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentInteractionAddedMessage>";
            }
        };
    }
}
