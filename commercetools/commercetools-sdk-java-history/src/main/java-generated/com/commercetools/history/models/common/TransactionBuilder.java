package com.commercetools.history.models.common;

import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.common.TransactionState;
import com.commercetools.history.models.common.TransactionType;
import com.commercetools.history.models.common.Transaction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Transaction transaction = Transaction.builder()
 *             .id("{id}")
 *             .timestamp("{timestamp}")
 *             .type(TransactionType.AUTHORIZATION)
 *             .amount(amountBuilder -> amountBuilder)
 *             .interactionId("{interactionId}")
 *             .state(TransactionState.INITIAL)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TransactionBuilder implements Builder<Transaction> {

    
    
    private String id;
    
    
    
    private String timestamp;
    
    
    
    private com.commercetools.history.models.common.TransactionType type;
    
    
    
    private com.commercetools.history.models.common.Money amount;
    
    
    
    private String interactionId;
    
    
    
    private com.commercetools.history.models.common.TransactionState state;

    
    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public TransactionBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Time at which the transaction took place.</p>
     * @param timestamp value to be set
     * @return Builder
     */
    
    public TransactionBuilder timestamp( final String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
    
    
    
    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */
    
    public TransactionBuilder type( final com.commercetools.history.models.common.TransactionType type) {
        this.type = type;
        return this;
    }
    
    
    
    
    /**
     * set the value to the amount using the builder function
     * @param builder function to build the amount value
     * @return Builder
     */
    
    public TransactionBuilder amount(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the amount using the builder function
     * @param builder function to build the amount value
     * @return Builder
     */
    
    public TransactionBuilder withAmount(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.amount = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the amount
     * @param amount value to be set
     * @return Builder
     */
    
    public TransactionBuilder amount( final com.commercetools.history.models.common.Money amount) {
        this.amount = amount;
        return this;
    }
    
    
    
    
    /**
     *  <p>Identifier used by the interface that manages the transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
     * @param interactionId value to be set
     * @return Builder
     */
    
    public TransactionBuilder interactionId( final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the state
     * @param state value to be set
     * @return Builder
     */
    
    public TransactionBuilder state( final com.commercetools.history.models.common.TransactionState state) {
        this.state = state;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Time at which the transaction took place.</p>
     * @return timestamp
     */
    
    
    public String getTimestamp(){
        return this.timestamp;
    }
    
    /**
     * value of type}
     * @return type
     */
    
    
    public com.commercetools.history.models.common.TransactionType getType(){
        return this.type;
    }
    
    /**
     * value of amount}
     * @return amount
     */
    
    
    public com.commercetools.history.models.common.Money getAmount(){
        return this.amount;
    }
    
    /**
     *  <p>Identifier used by the interface that manages the transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
     * @return interactionId
     */
    
    
    public String getInteractionId(){
        return this.interactionId;
    }
    
    /**
     * value of state}
     * @return state
     */
    
    
    public com.commercetools.history.models.common.TransactionState getState(){
        return this.state;
    }

    /**
     * builds Transaction with checking for non-null required values
     * @return Transaction
     */
    public Transaction build() {
        Objects.requireNonNull(id, Transaction.class + ": id is missing");
        Objects.requireNonNull(timestamp, Transaction.class + ": timestamp is missing");
        Objects.requireNonNull(type, Transaction.class + ": type is missing");
        Objects.requireNonNull(amount, Transaction.class + ": amount is missing");
        Objects.requireNonNull(interactionId, Transaction.class + ": interactionId is missing");
        Objects.requireNonNull(state, Transaction.class + ": state is missing");
        return new TransactionImpl(id, timestamp, type, amount, interactionId, state);
    }
    
    /**
     * builds Transaction without checking for non-null required values
     * @return Transaction
     */
    public Transaction buildUnchecked() {
        return new TransactionImpl(id, timestamp, type, amount, interactionId, state);
    }

    /**
     * factory method for an instance of TransactionBuilder
     * @return builder 
     */
    public static TransactionBuilder of() {
        return new TransactionBuilder();
    }

    /**
     * create builder for Transaction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionBuilder of(final Transaction template) {
        TransactionBuilder builder = new TransactionBuilder();
        builder.id = template.getId();
        builder.timestamp = template.getTimestamp();
        builder.type = template.getType();
        builder.amount = template.getAmount();
        builder.interactionId = template.getInteractionId();
        builder.state = template.getState();
        return builder;
    }

}
