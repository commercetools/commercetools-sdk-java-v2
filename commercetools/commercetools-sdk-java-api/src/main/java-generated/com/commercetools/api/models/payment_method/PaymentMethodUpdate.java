
package com.commercetools.api.models.payment_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * PaymentMethodUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodUpdate paymentMethodUpdate = PaymentMethodUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodUpdateImpl.class)
public interface PaymentMethodUpdate {

    /**
     *  <p>Expected version of the PaymentMethod on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the PaymentMethod.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<PaymentMethodUpdateAction> getActions();

    /**
     *  <p>Expected version of the PaymentMethod on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the PaymentMethod.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final PaymentMethodUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the PaymentMethod.</p>
     * @param actions values to be set
     */

    public void setActions(final List<PaymentMethodUpdateAction> actions);

    /**
     * factory method
     * @return instance of PaymentMethodUpdate
     */
    public static PaymentMethodUpdate of() {
        return new PaymentMethodUpdateImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodUpdate of(final PaymentMethodUpdate template) {
        PaymentMethodUpdateImpl instance = new PaymentMethodUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public PaymentMethodUpdate copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodUpdate deepCopy(@Nullable final PaymentMethodUpdate template) {
        if (template == null) {
            return null;
        }
        PaymentMethodUpdateImpl instance = new PaymentMethodUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.payment_method.PaymentMethodUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodUpdate
     * @return builder
     */
    public static PaymentMethodUpdateBuilder builder() {
        return PaymentMethodUpdateBuilder.of();
    }

    /**
     * create builder for PaymentMethodUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodUpdateBuilder builder(final PaymentMethodUpdate template) {
        return PaymentMethodUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodUpdate(Function<PaymentMethodUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodUpdate>";
            }
        };
    }
}
