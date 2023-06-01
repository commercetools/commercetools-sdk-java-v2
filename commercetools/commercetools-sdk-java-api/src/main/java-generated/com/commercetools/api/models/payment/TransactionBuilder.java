package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.payment.TransactionState;
import com.commercetools.api.models.payment.TransactionType;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.payment.Transaction;
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
 *             .type(TransactionType.AUTHORIZATION)
 *             .amount(amountBuilder -> amountBuilder)
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
    
    
    @Nullable
    private java.time.ZonedDateTime timestamp;
    
    
    
    private com.commercetools.api.models.payment.TransactionType type;
    
    
    
    private com.commercetools.api.models.common.CentPrecisionMoney amount;
    
    
    @Nullable
    private String interactionId;
    
    
    
    private com.commercetools.api.models.payment.TransactionState state;
    
    
    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    
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
     *  <p>Date and time (UTC) the Transaction took place.</p>
     * @param timestamp value to be set
     * @return Builder
     */
    
    public TransactionBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
    
    
    
    /**
     *  <p>Type of the Transaction. For example, <code>Authorization</code>.</p>
     * @param type value to be set
     * @return Builder
     */
    
    public TransactionBuilder type( final com.commercetools.api.models.payment.TransactionType type) {
        this.type = type;
        return this;
    }
    
    
    
    
    /**
     *  <p>Money value of the Transaction.</p>
     * @param builder function to build the amount value
     * @return Builder
     */
    
    public TransactionBuilder amount(Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Money value of the Transaction.</p>
     * @param builder function to build the amount value
     * @return Builder
     */
    
    public TransactionBuilder withAmount(Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Money value of the Transaction.</p>
     * @param amount value to be set
     * @return Builder
     */
    
    public TransactionBuilder amount( final com.commercetools.api.models.common.CentPrecisionMoney amount) {
        this.amount = amount;
        return this;
    }
    
    
    
    
    /**
     *  <p>Identifier used by the interface that manages the Transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction can be found with this ID.</p>
     * @param interactionId value to be set
     * @return Builder
     */
    
    public TransactionBuilder interactionId(@Nullable final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }
    
    
    
    
    /**
     *  <p>State of the Transaction.</p>
     * @param state value to be set
     * @return Builder
     */
    
    public TransactionBuilder state( final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
        return this;
    }
    
    
    
    
    /**
     *  <p>Custom Fields defined for the Transaction.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public TransactionBuilder custom(Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Custom Fields defined for the Transaction.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public TransactionBuilder withCustom(Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Custom Fields defined for the Transaction.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public TransactionBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
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
     *  <p>Date and time (UTC) the Transaction took place.</p>
     * @return timestamp
     */
    
    @Nullable
    public java.time.ZonedDateTime getTimestamp(){
        return this.timestamp;
    }
    
    /**
     *  <p>Type of the Transaction. For example, <code>Authorization</code>.</p>
     * @return type
     */
    
    
    public com.commercetools.api.models.payment.TransactionType getType(){
        return this.type;
    }
    
    /**
     *  <p>Money value of the Transaction.</p>
     * @return amount
     */
    
    
    public com.commercetools.api.models.common.CentPrecisionMoney getAmount(){
        return this.amount;
    }
    
    /**
     *  <p>Identifier used by the interface that manages the Transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction can be found with this ID.</p>
     * @return interactionId
     */
    
    @Nullable
    public String getInteractionId(){
        return this.interactionId;
    }
    
    /**
     *  <p>State of the Transaction.</p>
     * @return state
     */
    
    
    public com.commercetools.api.models.payment.TransactionState getState(){
        return this.state;
    }
    
    /**
     *  <p>Custom Fields defined for the Transaction.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
    }

    /**
     * builds Transaction with checking for non-null required values
     * @return Transaction
     */
    public Transaction build() {
        Objects.requireNonNull(id, Transaction.class + ": id is missing");
        Objects.requireNonNull(type, Transaction.class + ": type is missing");
        Objects.requireNonNull(amount, Transaction.class + ": amount is missing");
        Objects.requireNonNull(state, Transaction.class + ": state is missing");
        return new TransactionImpl(id, timestamp, type, amount, interactionId, state, custom);
    }
    
    /**
     * builds Transaction without checking for non-null required values
     * @return Transaction
     */
    public Transaction buildUnchecked() {
        return new TransactionImpl(id, timestamp, type, amount, interactionId, state, custom);
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
        builder.custom = template.getCustom();
        return builder;
    }

}
