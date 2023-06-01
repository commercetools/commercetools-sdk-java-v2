package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetStatusInterfaceTextActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetStatusInterfaceTextAction paymentSetStatusInterfaceTextAction = PaymentSetStatusInterfaceTextAction.builder()
 *             .interfaceText("{interfaceText}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentSetStatusInterfaceTextActionBuilder implements Builder<PaymentSetStatusInterfaceTextAction> {

    
    
    private String interfaceText;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param interfaceText value to be set
     * @return Builder
     */
    
    public PaymentSetStatusInterfaceTextActionBuilder interfaceText( final String interfaceText) {
        this.interfaceText = interfaceText;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return interfaceText
     */
    
    
    public String getInterfaceText(){
        return this.interfaceText;
    }

    /**
     * builds PaymentSetStatusInterfaceTextAction with checking for non-null required values
     * @return PaymentSetStatusInterfaceTextAction
     */
    public PaymentSetStatusInterfaceTextAction build() {
        Objects.requireNonNull(interfaceText, PaymentSetStatusInterfaceTextAction.class + ": interfaceText is missing");
        return new PaymentSetStatusInterfaceTextActionImpl(interfaceText);
    }
    
    /**
     * builds PaymentSetStatusInterfaceTextAction without checking for non-null required values
     * @return PaymentSetStatusInterfaceTextAction
     */
    public PaymentSetStatusInterfaceTextAction buildUnchecked() {
        return new PaymentSetStatusInterfaceTextActionImpl(interfaceText);
    }

    /**
     * factory method for an instance of PaymentSetStatusInterfaceTextActionBuilder
     * @return builder 
     */
    public static PaymentSetStatusInterfaceTextActionBuilder of() {
        return new PaymentSetStatusInterfaceTextActionBuilder();
    }

    /**
     * create builder for PaymentSetStatusInterfaceTextAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetStatusInterfaceTextActionBuilder of(final PaymentSetStatusInterfaceTextAction template) {
        PaymentSetStatusInterfaceTextActionBuilder builder = new PaymentSetStatusInterfaceTextActionBuilder();
        builder.interfaceText = template.getInterfaceText();
        return builder;
    }

}
