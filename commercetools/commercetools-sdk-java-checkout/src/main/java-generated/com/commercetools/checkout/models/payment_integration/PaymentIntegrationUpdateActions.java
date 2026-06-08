
package com.commercetools.checkout.models.payment_integration;

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
 *  <p>PaymentIntegrationUpdateActions</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationUpdateActions paymentIntegrationUpdateActions = PaymentIntegrationUpdateActions.builder()
 *             .version(1)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntegrationUpdateActionsImpl.class)
public interface PaymentIntegrationUpdateActions {

    /**
     *  <p>Expected version of the PaymentIntegration on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Integer getVersion();

    /**
     *  <p>Update actions to be performed on the PaymentIntegration.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<PaymentIntegrationUpdateAction> getActions();

    /**
     *  <p>Expected version of the PaymentIntegration on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Integer version);

    /**
     *  <p>Update actions to be performed on the PaymentIntegration.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final PaymentIntegrationUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the PaymentIntegration.</p>
     * @param actions values to be set
     */

    public void setActions(final List<PaymentIntegrationUpdateAction> actions);

    /**
     * factory method
     * @return instance of PaymentIntegrationUpdateActions
     */
    public static PaymentIntegrationUpdateActions of() {
        return new PaymentIntegrationUpdateActionsImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntegrationUpdateActions
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntegrationUpdateActions of(final PaymentIntegrationUpdateActions template) {
        PaymentIntegrationUpdateActionsImpl instance = new PaymentIntegrationUpdateActionsImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public PaymentIntegrationUpdateActions copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegrationUpdateActions
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegrationUpdateActions deepCopy(@Nullable final PaymentIntegrationUpdateActions template) {
        if (template == null) {
            return null;
        }
        PaymentIntegrationUpdateActionsImpl instance = new PaymentIntegrationUpdateActionsImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(
                            com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for PaymentIntegrationUpdateActions
     * @return builder
     */
    public static PaymentIntegrationUpdateActionsBuilder builder() {
        return PaymentIntegrationUpdateActionsBuilder.of();
    }

    /**
     * create builder for PaymentIntegrationUpdateActions instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationUpdateActionsBuilder builder(final PaymentIntegrationUpdateActions template) {
        return PaymentIntegrationUpdateActionsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegrationUpdateActions(Function<PaymentIntegrationUpdateActions, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationUpdateActions> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationUpdateActions>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegrationUpdateActions>";
            }
        };
    }
}
