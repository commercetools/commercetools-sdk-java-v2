
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Transition State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatusStateTransitionMessage paymentStatusStateTransitionMessage = PaymentStatusStateTransitionMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentStatusStateTransitionMessageImpl.class)
public interface PaymentStatusStateTransitionMessage extends Message {

    /**
     * discriminator value for PaymentStatusStateTransitionMessage
     */
    String PAYMENT_STATUS_STATE_TRANSITION = "PaymentStatusStateTransition";

    /**
     *  <p>State of the Payment after the Transition State update action.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>Whether State transition validations were turned off during the Change Transaction State update action.</p>
     * @return force
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    /**
     *  <p>State of the Payment after the Transition State update action.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>Whether State transition validations were turned off during the Change Transaction State update action.</p>
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of PaymentStatusStateTransitionMessage
     */
    public static PaymentStatusStateTransitionMessage of() {
        return new PaymentStatusStateTransitionMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentStatusStateTransitionMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentStatusStateTransitionMessage of(final PaymentStatusStateTransitionMessage template) {
        PaymentStatusStateTransitionMessageImpl instance = new PaymentStatusStateTransitionMessageImpl();
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
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * factory method to create a deep copy of PaymentStatusStateTransitionMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentStatusStateTransitionMessage deepCopy(
            @Nullable final PaymentStatusStateTransitionMessage template) {
        if (template == null) {
            return null;
        }
        PaymentStatusStateTransitionMessageImpl instance = new PaymentStatusStateTransitionMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for PaymentStatusStateTransitionMessage
     * @return builder
     */
    public static PaymentStatusStateTransitionMessageBuilder builder() {
        return PaymentStatusStateTransitionMessageBuilder.of();
    }

    /**
     * create builder for PaymentStatusStateTransitionMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentStatusStateTransitionMessageBuilder builder(
            final PaymentStatusStateTransitionMessage template) {
        return PaymentStatusStateTransitionMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentStatusStateTransitionMessage(Function<PaymentStatusStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentStatusStateTransitionMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentStatusStateTransitionMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentStatusStateTransitionMessage>";
            }
        };
    }
}
