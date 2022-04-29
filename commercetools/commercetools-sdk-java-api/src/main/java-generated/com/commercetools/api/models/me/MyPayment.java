
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.payment.PaymentMethodInfo;
import com.commercetools.api.models.payment.Transaction;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyPaymentImpl.class)
public interface MyPayment extends com.commercetools.api.models.DomainResource<MyPayment>,
        com.commercetools.api.models.Customizable<MyPayment> {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>A reference to the customer this payment belongs to.</p>
    */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
    *  <p>Identifies payments belonging to an anonymous session (the customer has not signed up/in yet).</p>
    */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
    *  <p>How much money this payment intends to receive from the customer.
    *  The value usually matches the cart or order gross total.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("amountPlanned")
    public TypedMoney getAmountPlanned();

    @NotNull
    @Valid
    @JsonProperty("paymentMethodInfo")
    public PaymentMethodInfo getPaymentMethodInfo();

    /**
    *  <p>A list of financial transactions of different TransactionTypes
    *  with different TransactionStates.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("transactions")
    public List<Transaction> getTransactions();

    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCustomer(final CustomerReference customer);

    public void setAnonymousId(final String anonymousId);

    public void setAmountPlanned(final TypedMoney amountPlanned);

    public void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo);

    @JsonIgnore
    public void setTransactions(final Transaction... transactions);

    public void setTransactions(final List<Transaction> transactions);

    public void setCustom(final CustomFields custom);

    public static MyPayment of() {
        return new MyPaymentImpl();
    }

    public static MyPayment of(final MyPayment template) {
        MyPaymentImpl instance = new MyPaymentImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setAmountPlanned(template.getAmountPlanned());
        instance.setPaymentMethodInfo(template.getPaymentMethodInfo());
        instance.setTransactions(template.getTransactions());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static MyPaymentBuilder builder() {
        return MyPaymentBuilder.of();
    }

    public static MyPaymentBuilder builder(final MyPayment template) {
        return MyPaymentBuilder.of(template);
    }

    default <T> T withMyPayment(Function<MyPayment, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyPayment> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPayment>() {
            @Override
            public String toString() {
                return "TypeReference<MyPayment>";
            }
        };
    }
}
