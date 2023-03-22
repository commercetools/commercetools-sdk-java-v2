
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentInteractionAddedMessageImpl.class)
public interface PaymentInteractionAddedMessage extends Message {

    String PAYMENT_INTERACTION_ADDED = "PaymentInteractionAdded";

    /**
     *  <p>The interface interaction that was added to the Payment.</p>
     * @return interaction
     */
    @NotNull
    @Valid
    @JsonProperty("interaction")
    public CustomFields getInteraction();

    public void setInteraction(final CustomFields interaction);

    public static PaymentInteractionAddedMessage of() {
        return new PaymentInteractionAddedMessageImpl();
    }

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

    public static PaymentInteractionAddedMessageBuilder builder() {
        return PaymentInteractionAddedMessageBuilder.of();
    }

    public static PaymentInteractionAddedMessageBuilder builder(final PaymentInteractionAddedMessage template) {
        return PaymentInteractionAddedMessageBuilder.of(template);
    }

    default <T> T withPaymentInteractionAddedMessage(Function<PaymentInteractionAddedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentInteractionAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentInteractionAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentInteractionAddedMessage>";
            }
        };
    }
}
