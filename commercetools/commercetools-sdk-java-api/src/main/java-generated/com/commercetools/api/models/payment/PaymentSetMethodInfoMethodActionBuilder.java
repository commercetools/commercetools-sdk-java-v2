package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoMethodAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetMethodInfoMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoMethodAction paymentSetMethodInfoMethodAction = PaymentSetMethodInfoMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentSetMethodInfoMethodActionBuilder implements Builder<PaymentSetMethodInfoMethodAction> {

    
    @Nullable
    private String method;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param method value to be set
     * @return Builder
     */
    
    public PaymentSetMethodInfoMethodActionBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return method
     */
    
    @Nullable
    public String getMethod(){
        return this.method;
    }

    /**
     * builds PaymentSetMethodInfoMethodAction with checking for non-null required values
     * @return PaymentSetMethodInfoMethodAction
     */
    public PaymentSetMethodInfoMethodAction build() {
        return new PaymentSetMethodInfoMethodActionImpl(method);
    }
    
    /**
     * builds PaymentSetMethodInfoMethodAction without checking for non-null required values
     * @return PaymentSetMethodInfoMethodAction
     */
    public PaymentSetMethodInfoMethodAction buildUnchecked() {
        return new PaymentSetMethodInfoMethodActionImpl(method);
    }

    /**
     * factory method for an instance of PaymentSetMethodInfoMethodActionBuilder
     * @return builder 
     */
    public static PaymentSetMethodInfoMethodActionBuilder of() {
        return new PaymentSetMethodInfoMethodActionBuilder();
    }

    /**
     * create builder for PaymentSetMethodInfoMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoMethodActionBuilder of(final PaymentSetMethodInfoMethodAction template) {
        PaymentSetMethodInfoMethodActionBuilder builder = new PaymentSetMethodInfoMethodActionBuilder();
        builder.method = template.getMethod();
        return builder;
    }

}
