package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetInterfaceIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetInterfaceIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetInterfaceIdAction paymentSetInterfaceIdAction = PaymentSetInterfaceIdAction.builder()
 *             .interfaceId("{interfaceId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentSetInterfaceIdActionBuilder implements Builder<PaymentSetInterfaceIdAction> {

    
    
    private String interfaceId;

    
    /**
     *  <p>Value to set. Once set, the <code>interfaceId</code> cannot be changed.</p>
     * @param interfaceId value to be set
     * @return Builder
     */
    
    public PaymentSetInterfaceIdActionBuilder interfaceId( final String interfaceId) {
        this.interfaceId = interfaceId;
        return this;
    }
    
    

    /**
     *  <p>Value to set. Once set, the <code>interfaceId</code> cannot be changed.</p>
     * @return interfaceId
     */
    
    
    public String getInterfaceId(){
        return this.interfaceId;
    }

    /**
     * builds PaymentSetInterfaceIdAction with checking for non-null required values
     * @return PaymentSetInterfaceIdAction
     */
    public PaymentSetInterfaceIdAction build() {
        Objects.requireNonNull(interfaceId, PaymentSetInterfaceIdAction.class + ": interfaceId is missing");
        return new PaymentSetInterfaceIdActionImpl(interfaceId);
    }
    
    /**
     * builds PaymentSetInterfaceIdAction without checking for non-null required values
     * @return PaymentSetInterfaceIdAction
     */
    public PaymentSetInterfaceIdAction buildUnchecked() {
        return new PaymentSetInterfaceIdActionImpl(interfaceId);
    }

    /**
     * factory method for an instance of PaymentSetInterfaceIdActionBuilder
     * @return builder 
     */
    public static PaymentSetInterfaceIdActionBuilder of() {
        return new PaymentSetInterfaceIdActionBuilder();
    }

    /**
     * create builder for PaymentSetInterfaceIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetInterfaceIdActionBuilder of(final PaymentSetInterfaceIdAction template) {
        PaymentSetInterfaceIdActionBuilder builder = new PaymentSetInterfaceIdActionBuilder();
        builder.interfaceId = template.getInterfaceId();
        return builder;
    }

}
