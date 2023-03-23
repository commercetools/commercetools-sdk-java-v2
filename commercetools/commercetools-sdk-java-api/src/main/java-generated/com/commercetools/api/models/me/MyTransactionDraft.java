
package com.commercetools.api.models.me;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.payment.TransactionType;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    public void setTimestamp(final ZonedDateTime timestamp);

    public void setType(final TransactionType type);

    public void setAmount(final Money amount);

    public void setInteractionId(final String interactionId);

    public void setCustom(final CustomFieldsDraft custom);

    public static MyTransactionDraft of() {
        return new MyTransactionDraftImpl();
    }

    public static MyTransactionDraft of(final MyTransactionDraft template) {
        MyTransactionDraftImpl instance = new MyTransactionDraftImpl();
        instance.setTimestamp(template.getTimestamp());
        instance.setType(template.getType());
        instance.setAmount(template.getAmount());
        instance.setInteractionId(template.getInteractionId());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static MyTransactionDraftBuilder builder() {
        return MyTransactionDraftBuilder.of();
    }

    public static MyTransactionDraftBuilder builder(final MyTransactionDraft template) {
        return MyTransactionDraftBuilder.of(template);
    }

    default <T> T withMyTransactionDraft(Function<MyTransactionDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyTransactionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyTransactionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyTransactionDraft>";
            }
        };
    }
}
