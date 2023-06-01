package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.TransactionChangeValue;
import com.commercetools.history.models.common.TransactionState;
import com.commercetools.history.models.change.ChangeTransactionStateChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTransactionStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTransactionStateChange changeTransactionStateChange = ChangeTransactionStateChange.builder()
 *             .change("{change}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .nextValue(TransactionState.INITIAL)
 *             .previousValue(TransactionState.INITIAL)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeTransactionStateChangeBuilder implements Builder<ChangeTransactionStateChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;
    
    
    
    private com.commercetools.history.models.common.TransactionState nextValue;
    
    
    
    private com.commercetools.history.models.common.TransactionState previousValue;

    
    /**
     *  <p>Update action for <code>changeTransactionState</code> on payments</p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeTransactionStateChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the transaction using the builder function
     * @param builder function to build the transaction value
     * @return Builder
     */
    
    public ChangeTransactionStateChangeBuilder transaction(Function<com.commercetools.history.models.change_value.TransactionChangeValueBuilder, com.commercetools.history.models.change_value.TransactionChangeValueBuilder> builder) {
        this.transaction = builder.apply(com.commercetools.history.models.change_value.TransactionChangeValueBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the transaction using the builder function
     * @param builder function to build the transaction value
     * @return Builder
     */
    
    public ChangeTransactionStateChangeBuilder withTransaction(Function<com.commercetools.history.models.change_value.TransactionChangeValueBuilder, com.commercetools.history.models.change_value.TransactionChangeValue> builder) {
        this.transaction = builder.apply(com.commercetools.history.models.change_value.TransactionChangeValueBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the transaction
     * @param transaction value to be set
     * @return Builder
     */
    
    public ChangeTransactionStateChangeBuilder transaction( final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.transaction = transaction;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeTransactionStateChangeBuilder nextValue( final com.commercetools.history.models.common.TransactionState nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeTransactionStateChangeBuilder previousValue( final com.commercetools.history.models.common.TransactionState previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>changeTransactionState</code> on payments</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of transaction}
     * @return transaction
     */
    
    
    public com.commercetools.history.models.change_value.TransactionChangeValue getTransaction(){
        return this.transaction;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.TransactionState getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.TransactionState getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds ChangeTransactionStateChange with checking for non-null required values
     * @return ChangeTransactionStateChange
     */
    public ChangeTransactionStateChange build() {
        Objects.requireNonNull(change, ChangeTransactionStateChange.class + ": change is missing");
        Objects.requireNonNull(transaction, ChangeTransactionStateChange.class + ": transaction is missing");
        Objects.requireNonNull(nextValue, ChangeTransactionStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeTransactionStateChange.class + ": previousValue is missing");
        return new ChangeTransactionStateChangeImpl(change, transaction, nextValue, previousValue);
    }
    
    /**
     * builds ChangeTransactionStateChange without checking for non-null required values
     * @return ChangeTransactionStateChange
     */
    public ChangeTransactionStateChange buildUnchecked() {
        return new ChangeTransactionStateChangeImpl(change, transaction, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeTransactionStateChangeBuilder
     * @return builder 
     */
    public static ChangeTransactionStateChangeBuilder of() {
        return new ChangeTransactionStateChangeBuilder();
    }

    /**
     * create builder for ChangeTransactionStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTransactionStateChangeBuilder of(final ChangeTransactionStateChange template) {
        ChangeTransactionStateChangeBuilder builder = new ChangeTransactionStateChangeBuilder();
        builder.change = template.getChange();
        builder.transaction = template.getTransaction();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
