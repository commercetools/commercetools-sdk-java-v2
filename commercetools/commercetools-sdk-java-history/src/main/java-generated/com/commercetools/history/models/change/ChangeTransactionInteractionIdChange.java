
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.TransactionChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeTransactionInteractionIdChangeImpl.class)
public interface ChangeTransactionInteractionIdChange extends Change {

    String CHANGE_TRANSACTION_INTERACTION_ID_CHANGE = "ChangeTransactionInteractionIdChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeTransactionInteractionId</code> on payments</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("transaction")
    public TransactionChangeValue getTransaction();

    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    public void setChange(final String change);

    public void setTransaction(final TransactionChangeValue transaction);

    public void setNextValue(final String nextValue);

    public void setPreviousValue(final String previousValue);

    public static ChangeTransactionInteractionIdChange of() {
        return new ChangeTransactionInteractionIdChangeImpl();
    }

    public static ChangeTransactionInteractionIdChange of(final ChangeTransactionInteractionIdChange template) {
        ChangeTransactionInteractionIdChangeImpl instance = new ChangeTransactionInteractionIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setTransaction(template.getTransaction());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeTransactionInteractionIdChangeBuilder builder() {
        return ChangeTransactionInteractionIdChangeBuilder.of();
    }

    public static ChangeTransactionInteractionIdChangeBuilder builder(
            final ChangeTransactionInteractionIdChange template) {
        return ChangeTransactionInteractionIdChangeBuilder.of(template);
    }

    default <T> T withChangeTransactionInteractionIdChange(Function<ChangeTransactionInteractionIdChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTransactionInteractionIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTransactionInteractionIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTransactionInteractionIdChange>";
            }
        };
    }
}
