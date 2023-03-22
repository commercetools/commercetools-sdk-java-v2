
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentStatusDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatusDraft paymentStatusDraft = PaymentStatusDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentStatusDraftImpl.class)
public interface PaymentStatusDraft extends io.vrap.rmf.base.client.Draft<PaymentStatusDraft> {

    /**
     *  <p>External reference that identifies the current status of the Payment.</p>
     */

    @JsonProperty("interfaceCode")
    public String getInterfaceCode();

    /**
     *  <p>Text describing the current status of the Payment.</p>
     */

    @JsonProperty("interfaceText")
    public String getInterfaceText();

    /**
     *  <p>ResourceIdentifier to a State.</p>
     */
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    public void setInterfaceCode(final String interfaceCode);

    public void setInterfaceText(final String interfaceText);

    public void setState(final StateResourceIdentifier state);

    public static PaymentStatusDraft of() {
        return new PaymentStatusDraftImpl();
    }

    public static PaymentStatusDraft of(final PaymentStatusDraft template) {
        PaymentStatusDraftImpl instance = new PaymentStatusDraftImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        instance.setInterfaceText(template.getInterfaceText());
        instance.setState(template.getState());
        return instance;
    }

    public static PaymentStatusDraftBuilder builder() {
        return PaymentStatusDraftBuilder.of();
    }

    public static PaymentStatusDraftBuilder builder(final PaymentStatusDraft template) {
        return PaymentStatusDraftBuilder.of(template);
    }

    default <T> T withPaymentStatusDraft(Function<PaymentStatusDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentStatusDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentStatusDraft>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentStatusDraft>";
            }
        };
    }
}
