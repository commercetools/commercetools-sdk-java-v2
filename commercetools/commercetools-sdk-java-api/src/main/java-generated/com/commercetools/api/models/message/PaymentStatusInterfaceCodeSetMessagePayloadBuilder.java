package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentStatusInterfaceCodeSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatusInterfaceCodeSetMessagePayload paymentStatusInterfaceCodeSetMessagePayload = PaymentStatusInterfaceCodeSetMessagePayload.builder()
 *             .paymentId("{paymentId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentStatusInterfaceCodeSetMessagePayloadBuilder implements Builder<PaymentStatusInterfaceCodeSetMessagePayload> {

    
    
    private String paymentId;
    
    
    @Nullable
    private String interfaceCode;

    
    /**
     *  <p>Unique identifier for the Payment for which the Set StatusInterfaceCode update action was applied.</p>
     * @param paymentId value to be set
     * @return Builder
     */
    
    public PaymentStatusInterfaceCodeSetMessagePayloadBuilder paymentId( final String paymentId) {
        this.paymentId = paymentId;
        return this;
    }
    
    
    
    
    /**
     *  <p>The <code>interfaceCode</code> that was set during the Set StatusInterfaceCode update action.</p>
     * @param interfaceCode value to be set
     * @return Builder
     */
    
    public PaymentStatusInterfaceCodeSetMessagePayloadBuilder interfaceCode(@Nullable final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier for the Payment for which the Set StatusInterfaceCode update action was applied.</p>
     * @return paymentId
     */
    
    
    public String getPaymentId(){
        return this.paymentId;
    }
    
    /**
     *  <p>The <code>interfaceCode</code> that was set during the Set StatusInterfaceCode update action.</p>
     * @return interfaceCode
     */
    
    @Nullable
    public String getInterfaceCode(){
        return this.interfaceCode;
    }

    /**
     * builds PaymentStatusInterfaceCodeSetMessagePayload with checking for non-null required values
     * @return PaymentStatusInterfaceCodeSetMessagePayload
     */
    public PaymentStatusInterfaceCodeSetMessagePayload build() {
        Objects.requireNonNull(paymentId, PaymentStatusInterfaceCodeSetMessagePayload.class + ": paymentId is missing");
        return new PaymentStatusInterfaceCodeSetMessagePayloadImpl(paymentId, interfaceCode);
    }
    
    /**
     * builds PaymentStatusInterfaceCodeSetMessagePayload without checking for non-null required values
     * @return PaymentStatusInterfaceCodeSetMessagePayload
     */
    public PaymentStatusInterfaceCodeSetMessagePayload buildUnchecked() {
        return new PaymentStatusInterfaceCodeSetMessagePayloadImpl(paymentId, interfaceCode);
    }

    /**
     * factory method for an instance of PaymentStatusInterfaceCodeSetMessagePayloadBuilder
     * @return builder 
     */
    public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder of() {
        return new PaymentStatusInterfaceCodeSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentStatusInterfaceCodeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder of(final PaymentStatusInterfaceCodeSetMessagePayload template) {
        PaymentStatusInterfaceCodeSetMessagePayloadBuilder builder = new PaymentStatusInterfaceCodeSetMessagePayloadBuilder();
        builder.paymentId = template.getPaymentId();
        builder.interfaceCode = template.getInterfaceCode();
        return builder;
    }

}
