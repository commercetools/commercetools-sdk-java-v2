package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.payment.TransactionState;
import com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentTransactionStateChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentTransactionStateChangedMessagePayload paymentTransactionStateChangedMessagePayload = PaymentTransactionStateChangedMessagePayload.builder()
 *             .transactionId("{transactionId}")
 *             .state(TransactionState.INITIAL)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentTransactionStateChangedMessagePayloadBuilder implements Builder<PaymentTransactionStateChangedMessagePayload> {

    
    
    private String transactionId;
    
    
    
    private com.commercetools.api.models.payment.TransactionState state;

    
    /**
     *  <p>Unique identifier for the Transaction for which the Transaction State changed.</p>
     * @param transactionId value to be set
     * @return Builder
     */
    
    public PaymentTransactionStateChangedMessagePayloadBuilder transactionId( final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Transaction State after the Change Transaction State update action.</p>
     * @param state value to be set
     * @return Builder
     */
    
    public PaymentTransactionStateChangedMessagePayloadBuilder state( final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier for the Transaction for which the Transaction State changed.</p>
     * @return transactionId
     */
    
    
    public String getTransactionId(){
        return this.transactionId;
    }
    
    /**
     *  <p>Transaction State after the Change Transaction State update action.</p>
     * @return state
     */
    
    
    public com.commercetools.api.models.payment.TransactionState getState(){
        return this.state;
    }

    /**
     * builds PaymentTransactionStateChangedMessagePayload with checking for non-null required values
     * @return PaymentTransactionStateChangedMessagePayload
     */
    public PaymentTransactionStateChangedMessagePayload build() {
        Objects.requireNonNull(transactionId, PaymentTransactionStateChangedMessagePayload.class + ": transactionId is missing");
        Objects.requireNonNull(state, PaymentTransactionStateChangedMessagePayload.class + ": state is missing");
        return new PaymentTransactionStateChangedMessagePayloadImpl(transactionId, state);
    }
    
    /**
     * builds PaymentTransactionStateChangedMessagePayload without checking for non-null required values
     * @return PaymentTransactionStateChangedMessagePayload
     */
    public PaymentTransactionStateChangedMessagePayload buildUnchecked() {
        return new PaymentTransactionStateChangedMessagePayloadImpl(transactionId, state);
    }

    /**
     * factory method for an instance of PaymentTransactionStateChangedMessagePayloadBuilder
     * @return builder 
     */
    public static PaymentTransactionStateChangedMessagePayloadBuilder of() {
        return new PaymentTransactionStateChangedMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentTransactionStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentTransactionStateChangedMessagePayloadBuilder of(final PaymentTransactionStateChangedMessagePayload template) {
        PaymentTransactionStateChangedMessagePayloadBuilder builder = new PaymentTransactionStateChangedMessagePayloadBuilder();
        builder.transactionId = template.getTransactionId();
        builder.state = template.getState();
        return builder;
    }

}
