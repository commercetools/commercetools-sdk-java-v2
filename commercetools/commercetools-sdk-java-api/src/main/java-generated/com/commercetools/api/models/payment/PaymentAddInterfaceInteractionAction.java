
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentAddInterfaceInteractionActionImpl.class)
public interface PaymentAddInterfaceInteractionAction extends PaymentUpdateAction {

    String ADD_INTERFACE_INTERACTION = "addInterfaceInteraction";

    @NotNull
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static PaymentAddInterfaceInteractionAction of() {
        return new PaymentAddInterfaceInteractionActionImpl();
    }

    public static PaymentAddInterfaceInteractionAction of(final PaymentAddInterfaceInteractionAction template) {
        PaymentAddInterfaceInteractionActionImpl instance = new PaymentAddInterfaceInteractionActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static PaymentAddInterfaceInteractionActionBuilder builder() {
        return PaymentAddInterfaceInteractionActionBuilder.of();
    }

    public static PaymentAddInterfaceInteractionActionBuilder builder(
            final PaymentAddInterfaceInteractionAction template) {
        return PaymentAddInterfaceInteractionActionBuilder.of(template);
    }

    default <T> T withPaymentAddInterfaceInteractionAction(Function<PaymentAddInterfaceInteractionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentAddInterfaceInteractionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentAddInterfaceInteractionAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentAddInterfaceInteractionAction>";
            }
        };
    }
}
