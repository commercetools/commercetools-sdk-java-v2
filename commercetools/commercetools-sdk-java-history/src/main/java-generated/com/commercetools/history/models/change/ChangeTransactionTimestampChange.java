
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

/**
 * ChangeTransactionTimestampChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTransactionTimestampChange changeTransactionTimestampChange = ChangeTransactionTimestampChange.builder()
 *             .change("{change}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .nextValue("{nextValue}")
 *             .previousValue("{previousValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTransactionTimestampChangeImpl.class)
public interface ChangeTransactionTimestampChange extends Change {

    String CHANGE_TRANSACTION_TIMESTAMP_CHANGE = "ChangeTransactionTimestampChange";

    /**
     *  <p>Update action for <code>changeTransactionTimestamp</code> on payments</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return transaction
     */
    @NotNull
    @Valid
    @JsonProperty("transaction")
    public TransactionChangeValue getTransaction();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    public void setChange(final String change);

    public void setTransaction(final TransactionChangeValue transaction);

    public void setNextValue(final String nextValue);

    public void setPreviousValue(final String previousValue);

    public static ChangeTransactionTimestampChange of() {
        return new ChangeTransactionTimestampChangeImpl();
    }

    public static ChangeTransactionTimestampChange of(final ChangeTransactionTimestampChange template) {
        ChangeTransactionTimestampChangeImpl instance = new ChangeTransactionTimestampChangeImpl();
        instance.setChange(template.getChange());
        instance.setTransaction(template.getTransaction());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeTransactionTimestampChangeBuilder builder() {
        return ChangeTransactionTimestampChangeBuilder.of();
    }

    public static ChangeTransactionTimestampChangeBuilder builder(final ChangeTransactionTimestampChange template) {
        return ChangeTransactionTimestampChangeBuilder.of(template);
    }

    default <T> T withChangeTransactionTimestampChange(Function<ChangeTransactionTimestampChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTransactionTimestampChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTransactionTimestampChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTransactionTimestampChange>";
            }
        };
    }
}
