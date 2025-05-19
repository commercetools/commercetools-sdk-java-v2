
package com.commercetools.api.models.me;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.payment.TransactionType;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * MyTransactionDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyTransactionDraft myTransactionDraft = MyTransactionDraft.builder()
 *             .type(TransactionType.AUTHORIZATION)
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyTransactionDraftImpl.class)
public interface MyTransactionDraft extends com.commercetools.api.models.CustomizableDraft<MyTransactionDraft>,
        io.vrap.rmf.base.client.Draft<MyTransactionDraft> {

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     * @return timestamp
     */

    @JsonProperty("timestamp")
    public ZonedDateTime getTimestamp();

    /**
     *  <p>Type of the Transaction. Only <code>Authorization</code> or <code>Charge</code> is allowed.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public TransactionType getType();

    /**
     *  <p>Money value for the Transaction.</p>
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    /**
     *  <p>Identifier used by the payment service that manages the Transaction. Can be used to correlate the Transaction to an interface interaction.</p>
     * @return interactionId
     */

    @JsonProperty("interactionId")
    public String getInteractionId();

    /**
     *  <p>Custom Fields of the Transaction.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     * @param timestamp value to be set
     */

    public void setTimestamp(final ZonedDateTime timestamp);

    /**
     *  <p>Type of the Transaction. Only <code>Authorization</code> or <code>Charge</code> is allowed.</p>
     * @param type value to be set
     */

    public void setType(final TransactionType type);

    /**
     *  <p>Money value for the Transaction.</p>
     * @param amount value to be set
     */

    public void setAmount(final Money amount);

    /**
     *  <p>Identifier used by the payment service that manages the Transaction. Can be used to correlate the Transaction to an interface interaction.</p>
     * @param interactionId value to be set
     */

    public void setInteractionId(final String interactionId);

    /**
     *  <p>Custom Fields of the Transaction.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of MyTransactionDraft
     */
    public static MyTransactionDraft of() {
        return new MyTransactionDraftImpl();
    }

    /**
     * factory method to create a shallow copy MyTransactionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyTransactionDraft of(final MyTransactionDraft template) {
        MyTransactionDraftImpl instance = new MyTransactionDraftImpl();
        instance.setTimestamp(template.getTimestamp());
        instance.setType(template.getType());
        instance.setAmount(template.getAmount());
        instance.setInteractionId(template.getInteractionId());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public MyTransactionDraft copyDeep();

    /**
     * factory method to create a deep copy of MyTransactionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyTransactionDraft deepCopy(@Nullable final MyTransactionDraft template) {
        if (template == null) {
            return null;
        }
        MyTransactionDraftImpl instance = new MyTransactionDraftImpl();
        instance.setTimestamp(template.getTimestamp());
        instance.setType(template.getType());
        instance.setAmount(com.commercetools.api.models.common.Money.deepCopy(template.getAmount()));
        instance.setInteractionId(template.getInteractionId());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for MyTransactionDraft
     * @return builder
     */
    public static MyTransactionDraftBuilder builder() {
        return MyTransactionDraftBuilder.of();
    }

    /**
     * create builder for MyTransactionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyTransactionDraftBuilder builder(final MyTransactionDraft template) {
        return MyTransactionDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyTransactionDraft(Function<MyTransactionDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyTransactionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyTransactionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyTransactionDraft>";
            }
        };
    }
}
