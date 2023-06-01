package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyPaymentUpdateAction;
import com.commercetools.api.models.payment.TransactionDraft;
import com.commercetools.api.models.me.MyPaymentAddTransactionAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentAddTransactionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentAddTransactionAction myPaymentAddTransactionAction = MyPaymentAddTransactionAction.builder()
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyPaymentAddTransactionActionBuilder implements Builder<MyPaymentAddTransactionAction> {

    
    
    private com.commercetools.api.models.payment.TransactionDraft transaction;

    
    /**
     *  <p>Transaction to add to the Payment.</p>
     * @param builder function to build the transaction value
     * @return Builder
     */
    
    public MyPaymentAddTransactionActionBuilder transaction(Function<com.commercetools.api.models.payment.TransactionDraftBuilder, com.commercetools.api.models.payment.TransactionDraftBuilder> builder) {
        this.transaction = builder.apply(com.commercetools.api.models.payment.TransactionDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Transaction to add to the Payment.</p>
     * @param builder function to build the transaction value
     * @return Builder
     */
    
    public MyPaymentAddTransactionActionBuilder withTransaction(Function<com.commercetools.api.models.payment.TransactionDraftBuilder, com.commercetools.api.models.payment.TransactionDraft> builder) {
        this.transaction = builder.apply(com.commercetools.api.models.payment.TransactionDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Transaction to add to the Payment.</p>
     * @param transaction value to be set
     * @return Builder
     */
    
    public MyPaymentAddTransactionActionBuilder transaction( final com.commercetools.api.models.payment.TransactionDraft transaction) {
        this.transaction = transaction;
        return this;
    }
    
    

    /**
     *  <p>Transaction to add to the Payment.</p>
     * @return transaction
     */
    
    
    public com.commercetools.api.models.payment.TransactionDraft getTransaction(){
        return this.transaction;
    }

    /**
     * builds MyPaymentAddTransactionAction with checking for non-null required values
     * @return MyPaymentAddTransactionAction
     */
    public MyPaymentAddTransactionAction build() {
        Objects.requireNonNull(transaction, MyPaymentAddTransactionAction.class + ": transaction is missing");
        return new MyPaymentAddTransactionActionImpl(transaction);
    }
    
    /**
     * builds MyPaymentAddTransactionAction without checking for non-null required values
     * @return MyPaymentAddTransactionAction
     */
    public MyPaymentAddTransactionAction buildUnchecked() {
        return new MyPaymentAddTransactionActionImpl(transaction);
    }

    /**
     * factory method for an instance of MyPaymentAddTransactionActionBuilder
     * @return builder 
     */
    public static MyPaymentAddTransactionActionBuilder of() {
        return new MyPaymentAddTransactionActionBuilder();
    }

    /**
     * create builder for MyPaymentAddTransactionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentAddTransactionActionBuilder of(final MyPaymentAddTransactionAction template) {
        MyPaymentAddTransactionActionBuilder builder = new MyPaymentAddTransactionActionBuilder();
        builder.transaction = template.getTransaction();
        return builder;
    }

}
