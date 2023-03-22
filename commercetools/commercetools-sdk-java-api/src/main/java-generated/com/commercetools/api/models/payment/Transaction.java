
package com.commercetools.api.models.payment;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Represents a financial transaction typically created as a result of a notification from the payment service.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Transaction transaction = Transaction.builder()
 *             .id("{id}")
 *             .type(TransactionType.AUTHORIZATION)
 *             .amount(amountBuilder -> amountBuilder)
 *             .state(TransactionState.INITIAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TransactionImpl.class)
public interface Transaction extends com.commercetools.api.models.Customizable<Transaction> {

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     * @return timestamp
     */

    @JsonProperty("timestamp")
    public ZonedDateTime getTimestamp();

    /**
     *  <p>Type of the Transaction. For example, <code>Authorization</code>.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public TransactionType getType();

    /**
     *  <p>Money value of the Transaction.</p>
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public CentPrecisionMoney getAmount();

    /**
     *  <p>Identifier used by the interface that manages the Transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction can be found with this ID.</p>
     * @return interactionId
     */

    @JsonProperty("interactionId")
    public String getInteractionId();

    /**
     *  <p>State of the Transaction.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public TransactionState getState();

    /**
     *  <p>Custom Fields defined for the Transaction.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setTimestamp(final ZonedDateTime timestamp);

    public void setType(final TransactionType type);

    public void setAmount(final CentPrecisionMoney amount);

    public void setInteractionId(final String interactionId);

    public void setState(final TransactionState state);

    public void setCustom(final CustomFields custom);

    public static Transaction of() {
        return new TransactionImpl();
    }

    public static Transaction of(final Transaction template) {
        TransactionImpl instance = new TransactionImpl();
        instance.setId(template.getId());
        instance.setTimestamp(template.getTimestamp());
        instance.setType(template.getType());
        instance.setAmount(template.getAmount());
        instance.setInteractionId(template.getInteractionId());
        instance.setState(template.getState());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static TransactionBuilder builder() {
        return TransactionBuilder.of();
    }

    public static TransactionBuilder builder(final Transaction template) {
        return TransactionBuilder.of(template);
    }

    default <T> T withTransaction(Function<Transaction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Transaction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Transaction>() {
            @Override
            public String toString() {
                return "TypeReference<Transaction>";
            }
        };
    }
}
