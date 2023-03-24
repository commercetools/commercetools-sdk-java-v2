
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentInteractionAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentInteractionAddedMessagePayload paymentInteractionAddedMessagePayload = PaymentInteractionAddedMessagePayload.builder()
 *             .interaction(interactionBuilder -> interactionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentInteractionAddedMessagePayloadBuilder implements Builder<PaymentInteractionAddedMessagePayload> {

    private com.commercetools.api.models.type.CustomFields interaction;

    /**
     *  <p>The interface interaction that was added to the Payment.</p>
     * @param builder function to build the interaction value
     * @return Builder
     */

    public PaymentInteractionAddedMessagePayloadBuilder interaction(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.interaction = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The interface interaction that was added to the Payment.</p>
     * @param interaction value to be set
     * @return Builder
     */

    public PaymentInteractionAddedMessagePayloadBuilder interaction(
            final com.commercetools.api.models.type.CustomFields interaction) {
        this.interaction = interaction;
        return this;
    }

    public com.commercetools.api.models.type.CustomFields getInteraction() {
        return this.interaction;
    }

    /**
     * builds PaymentInteractionAddedMessagePayload with checking for non-null required values
     * @return PaymentInteractionAddedMessagePayload
     */
    public PaymentInteractionAddedMessagePayload build() {
        Objects.requireNonNull(interaction, PaymentInteractionAddedMessagePayload.class + ": interaction is missing");
        return new PaymentInteractionAddedMessagePayloadImpl(interaction);
    }

    /**
     * builds PaymentInteractionAddedMessagePayload without checking for non-null required values
     * @return PaymentInteractionAddedMessagePayload
     */
    public PaymentInteractionAddedMessagePayload buildUnchecked() {
        return new PaymentInteractionAddedMessagePayloadImpl(interaction);
    }

    public static PaymentInteractionAddedMessagePayloadBuilder of() {
        return new PaymentInteractionAddedMessagePayloadBuilder();
    }

    public static PaymentInteractionAddedMessagePayloadBuilder of(
            final PaymentInteractionAddedMessagePayload template) {
        PaymentInteractionAddedMessagePayloadBuilder builder = new PaymentInteractionAddedMessagePayloadBuilder();
        builder.interaction = template.getInteraction();
        return builder;
    }

}
