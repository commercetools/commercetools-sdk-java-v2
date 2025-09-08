
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adding a Payment interaction generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentInteractionAddedMessage" rel="nofollow">PaymentInteractionAdded</a> Message.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("addInterfaceInteraction")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentAddInterfaceInteractionActionImpl.class)
public interface PaymentAddInterfaceInteractionAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentAddInterfaceInteractionAction
     */
    String ADD_INTERFACE_INTERACTION = "addInterfaceInteraction";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return type
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p><span>Custom Fields</span> as per <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinitions</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p><span>Custom Fields</span> as per <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinitions</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
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

    public PaymentAddInterfaceInteractionAction copyDeep();

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
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
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
