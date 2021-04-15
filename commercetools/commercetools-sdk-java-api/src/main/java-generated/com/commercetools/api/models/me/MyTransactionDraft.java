
package com.commercetools.api.models.me;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.payment.TransactionType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyTransactionDraftImpl.class)
public interface MyTransactionDraft {

    /**
    *  <p>The time at which the transaction took place.</p>
    */

    @JsonProperty("timestamp")
    public ZonedDateTime getTimestamp();

    /**
    *  <p>The type of this transaction.
    *  Only the <code>Authorization</code> or <code>Charge</code>
    *  TransactionTypes are allowed here.</p>
    */
    @NotNull
    @JsonProperty("type")
    public TransactionType getType();

    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    /**
    *  <p>The identifier that is used by the interface that managed the transaction (usually the PSP).
    *  If a matching interaction was logged in the interfaceInteractions array,
    *  the corresponding interaction should be findable with this ID.
    *  The <code>state</code> is set to the <code>Initial</code> TransactionState.</p>
    */

    @JsonProperty("interactionId")
    public String getInteractionId();

    public void setTimestamp(final ZonedDateTime timestamp);

    public void setType(final TransactionType type);

    public void setAmount(final Money amount);

    public void setInteractionId(final String interactionId);

    public static MyTransactionDraft of() {
        return new MyTransactionDraftImpl();
    }

    public static MyTransactionDraft of(final MyTransactionDraft template) {
        MyTransactionDraftImpl instance = new MyTransactionDraftImpl();
        instance.setTimestamp(template.getTimestamp());
        instance.setType(template.getType());
        instance.setAmount(template.getAmount());
        instance.setInteractionId(template.getInteractionId());
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
}
