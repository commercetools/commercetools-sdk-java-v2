
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentUpdate paymentUpdate = PaymentUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentUpdateImpl.class)
public interface PaymentUpdate
        extends com.commercetools.api.models.ResourceUpdate<PaymentUpdate, PaymentUpdateAction, PaymentUpdateBuilder> {

    /**
     *  <p>Expected version of the Payment on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<PaymentUpdateAction> getActions();

    /**
     *  <p>Expected version of the Payment on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final PaymentUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param actions values to be set
     */

    public void setActions(final List<PaymentUpdateAction> actions);

    /**
     * factory method
     * @return instance of PaymentUpdate
     */
    public static PaymentUpdate of() {
        return new PaymentUpdateImpl();
    }

    /**
     * factory method to create a shallow copy PaymentUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentUpdate of(final PaymentUpdate template) {
        PaymentUpdateImpl instance = new PaymentUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of PaymentUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentUpdate deepCopy(@Nullable final PaymentUpdate template) {
        if (template == null) {
            return null;
        }
        PaymentUpdateImpl instance = new PaymentUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.payment.PaymentUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for PaymentUpdate
     * @return builder
     */
    public static PaymentUpdateBuilder builder() {
        return PaymentUpdateBuilder.of();
    }

    /**
     * create builder for PaymentUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentUpdateBuilder builder(final PaymentUpdate template) {
        return PaymentUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentUpdate(Function<PaymentUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentUpdate>";
            }
        };
    }
}
