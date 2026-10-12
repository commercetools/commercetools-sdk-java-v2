
package com.commercetools.checkout.models.recurring_payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Request body to update a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPayment" rel="nofollow">RecurringPayment</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentUpdateActions recurringPaymentUpdateActions = RecurringPaymentUpdateActions.builder()
 *             .version(1)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringPaymentUpdateActionsImpl.class)
public interface RecurringPaymentUpdateActions {

    /**
     *  <p>Expected version of the RecurringPayment on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Integer getVersion();

    /**
     *  <p>Update actions to be performed on the RecurringPayment.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<RecurringPaymentUpdateAction> getActions();

    /**
     *  <p>Expected version of the RecurringPayment on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Integer version);

    /**
     *  <p>Update actions to be performed on the RecurringPayment.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final RecurringPaymentUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the RecurringPayment.</p>
     * @param actions values to be set
     */

    public void setActions(final List<RecurringPaymentUpdateAction> actions);

    /**
     * factory method
     * @return instance of RecurringPaymentUpdateActions
     */
    public static RecurringPaymentUpdateActions of() {
        return new RecurringPaymentUpdateActionsImpl();
    }

    /**
     * factory method to create a shallow copy RecurringPaymentUpdateActions
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringPaymentUpdateActions of(final RecurringPaymentUpdateActions template) {
        RecurringPaymentUpdateActionsImpl instance = new RecurringPaymentUpdateActionsImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public RecurringPaymentUpdateActions copyDeep();

    /**
     * factory method to create a deep copy of RecurringPaymentUpdateActions
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringPaymentUpdateActions deepCopy(@Nullable final RecurringPaymentUpdateActions template) {
        if (template == null) {
            return null;
        }
        RecurringPaymentUpdateActionsImpl instance = new RecurringPaymentUpdateActionsImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for RecurringPaymentUpdateActions
     * @return builder
     */
    public static RecurringPaymentUpdateActionsBuilder builder() {
        return RecurringPaymentUpdateActionsBuilder.of();
    }

    /**
     * create builder for RecurringPaymentUpdateActions instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentUpdateActionsBuilder builder(final RecurringPaymentUpdateActions template) {
        return RecurringPaymentUpdateActionsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringPaymentUpdateActions(Function<RecurringPaymentUpdateActions, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringPaymentUpdateActions> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringPaymentUpdateActions>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringPaymentUpdateActions>";
            }
        };
    }
}
