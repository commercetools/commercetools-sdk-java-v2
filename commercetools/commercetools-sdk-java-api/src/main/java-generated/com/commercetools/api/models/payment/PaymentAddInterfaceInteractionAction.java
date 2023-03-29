
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adding a Payment interaction generates the PaymentInteractionAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentAddInterfaceInteractionAction paymentAddInterfaceInteractionAction = PaymentAddInterfaceInteractionAction.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentAddInterfaceInteractionActionImpl.class)
public interface PaymentAddInterfaceInteractionAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentAddInterfaceInteractionAction
     */
    String ADD_INTERFACE_INTERACTION = "addInterfaceInteraction";

    /**
     *  <p>ResourceIdentifier of a Type.</p>
     * @return type
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Custom Fields as per FieldDefinitions of the Type.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>ResourceIdentifier of a Type.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Custom Fields as per FieldDefinitions of the Type.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of PaymentAddInterfaceInteractionAction
     */
    public static PaymentAddInterfaceInteractionAction of() {
        return new PaymentAddInterfaceInteractionActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentAddInterfaceInteractionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentAddInterfaceInteractionAction of(final PaymentAddInterfaceInteractionAction template) {
        PaymentAddInterfaceInteractionActionImpl instance = new PaymentAddInterfaceInteractionActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of PaymentAddInterfaceInteractionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentAddInterfaceInteractionAction deepCopy(
            @Nullable final PaymentAddInterfaceInteractionAction template) {
        if (template == null) {
            return null;
        }
        PaymentAddInterfaceInteractionActionImpl instance = new PaymentAddInterfaceInteractionActionImpl();
        instance.setType(Optional.ofNullable(template.getType())
                .map(com.commercetools.api.models.type.TypeResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setFields(Optional.ofNullable(template.getFields())
                .map(com.commercetools.api.models.type.FieldContainer::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for PaymentAddInterfaceInteractionAction
     * @return builder
     */
    public static PaymentAddInterfaceInteractionActionBuilder builder() {
        return PaymentAddInterfaceInteractionActionBuilder.of();
    }

    /**
     * create builder for PaymentAddInterfaceInteractionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentAddInterfaceInteractionActionBuilder builder(
            final PaymentAddInterfaceInteractionAction template) {
        return PaymentAddInterfaceInteractionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentAddInterfaceInteractionAction(Function<PaymentAddInterfaceInteractionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentAddInterfaceInteractionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentAddInterfaceInteractionAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentAddInterfaceInteractionAction>";
            }
        };
    }
}
