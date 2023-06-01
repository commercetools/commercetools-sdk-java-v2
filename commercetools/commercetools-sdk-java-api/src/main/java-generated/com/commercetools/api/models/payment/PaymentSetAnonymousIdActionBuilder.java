package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetAnonymousIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetAnonymousIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetAnonymousIdAction paymentSetAnonymousIdAction = PaymentSetAnonymousIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentSetAnonymousIdActionBuilder implements Builder<PaymentSetAnonymousIdAction> {

    
    @Nullable
    private String anonymousId;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param anonymousId value to be set
     * @return Builder
     */
    
    public PaymentSetAnonymousIdActionBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return anonymousId
     */
    
    @Nullable
    public String getAnonymousId(){
        return this.anonymousId;
    }

    /**
     * builds PaymentSetAnonymousIdAction with checking for non-null required values
     * @return PaymentSetAnonymousIdAction
     */
    public PaymentSetAnonymousIdAction build() {
        return new PaymentSetAnonymousIdActionImpl(anonymousId);
    }
    
    /**
     * builds PaymentSetAnonymousIdAction without checking for non-null required values
     * @return PaymentSetAnonymousIdAction
     */
    public PaymentSetAnonymousIdAction buildUnchecked() {
        return new PaymentSetAnonymousIdActionImpl(anonymousId);
    }

    /**
     * factory method for an instance of PaymentSetAnonymousIdActionBuilder
     * @return builder 
     */
    public static PaymentSetAnonymousIdActionBuilder of() {
        return new PaymentSetAnonymousIdActionBuilder();
    }

    /**
     * create builder for PaymentSetAnonymousIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetAnonymousIdActionBuilder of(final PaymentSetAnonymousIdAction template) {
        PaymentSetAnonymousIdActionBuilder builder = new PaymentSetAnonymousIdActionBuilder();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
