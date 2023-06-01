package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.payment.PaymentMethodInfo;
import com.commercetools.api.models.payment.PaymentStatusDraft;
import com.commercetools.api.models.payment.TransactionDraft;
import com.commercetools.api.models.type.CustomFieldsDraft;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * PaymentDraft
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentDraftImpl implements PaymentDraft, ModelBase {

    
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;
    
    
    private String anonymousId;
    
    
    private String externalId;
    
    
    private String interfaceId;
    
    
    private com.commercetools.api.models.common.Money amountPlanned;
    
    
    private com.commercetools.api.models.common.Money amountAuthorized;
    
    
    private String authorizedUntil;
    
    
    private com.commercetools.api.models.common.Money amountPaid;
    
    
    private com.commercetools.api.models.common.Money amountRefunded;
    
    
    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;
    
    
    private com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus;
    
    
    private java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions;
    
    
    private java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions;
    
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    
    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentDraftImpl(@JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("externalId") final String externalId, @JsonProperty("interfaceId") final String interfaceId, @JsonProperty("amountPlanned") final com.commercetools.api.models.common.Money amountPlanned, @JsonProperty("amountAuthorized") final com.commercetools.api.models.common.Money amountAuthorized, @JsonProperty("authorizedUntil") final String authorizedUntil, @JsonProperty("amountPaid") final com.commercetools.api.models.common.Money amountPaid, @JsonProperty("amountRefunded") final com.commercetools.api.models.common.Money amountRefunded, @JsonProperty("paymentMethodInfo") final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo, @JsonProperty("paymentStatus") final com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus, @JsonProperty("transactions") final java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions, @JsonProperty("interfaceInteractions") final java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("key") final String key) {
        this.customer = customer;
        this.anonymousId = anonymousId;
        this.externalId = externalId;
        this.interfaceId = interfaceId;
        this.amountPlanned = amountPlanned;
        this.amountAuthorized = amountAuthorized;
        this.authorizedUntil = authorizedUntil;
        this.amountPaid = amountPaid;
        this.amountRefunded = amountRefunded;
        this.paymentMethodInfo = paymentMethodInfo;
        this.paymentStatus = paymentStatus;
        this.transactions = transactions;
        this.interfaceInteractions = interfaceInteractions;
        this.custom = custom;
        this.key = key;
    }
    /**
     * create empty instance
     */
    public PaymentDraftImpl() {
    }

    /**
     *  <p>Reference to a Customer associated with the Payment.</p>
     */
    
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
        return this.customer;
    }
    
    /**
     *  <p>Anonymous session associated with the Payment.</p>
     */
    
    public String getAnonymousId(){
        return this.anonymousId;
    }
    
    /**
     *  <p>Additional identifier for external systems like Customer Relationship Management (CRM) or Enterprise Resource Planning (ERP).</p>
     */
    
    public String getExternalId(){
        return this.externalId;
    }
    
    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP). The combination of <code>interfaceId</code> and the <code>paymentInterface</code> field on PaymentMethodInfo must be unique. Once set, it cannot be changed.</p>
     */
    
    public String getInterfaceId(){
        return this.interfaceId;
    }
    
    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     */
    
    public com.commercetools.api.models.common.Money getAmountPlanned(){
        return this.amountPlanned;
    }
    
    /**
     *  <p>Deprecated because the value can be calculated from the total amounts saved in the Transactions.</p>
     */
    
    public com.commercetools.api.models.common.Money getAmountAuthorized(){
        return this.amountAuthorized;
    }
    
    /**
     *  <p>Deprecated because this field is of little practical value, as it is either not reliably known, or the authorization time is fixed for a PSP.</p>
     */
    
    public String getAuthorizedUntil(){
        return this.authorizedUntil;
    }
    
    /**
     *  <p>Deprecated because the value can be calculated from the total amounts saved in the Transactions.</p>
     */
    
    public com.commercetools.api.models.common.Money getAmountPaid(){
        return this.amountPaid;
    }
    
    /**
     *  <p>Deprecated because the value can be calculated from the total amounts saved in the Transactions.</p>
     */
    
    public com.commercetools.api.models.common.Money getAmountRefunded(){
        return this.amountRefunded;
    }
    
    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     */
    
    public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
        return this.paymentMethodInfo;
    }
    
    /**
     *  <p>Current status of the Payment.</p>
     */
    
    public com.commercetools.api.models.payment.PaymentStatusDraft getPaymentStatus(){
        return this.paymentStatus;
    }
    
    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     */
    
    public java.util.List<com.commercetools.api.models.payment.TransactionDraft> getTransactions(){
        return this.transactions;
    }
    
    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     */
    
    public java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> getInterfaceInteractions(){
        return this.interfaceInteractions;
    }
    
    /**
     *  <p>Custom Fields for the Payment.</p>
     */
    
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    /**
     *  <p>User-defined unique identifier for the Payment.</p>
     */
    
    public String getKey(){
        return this.key;
    }

    
    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer){
        this.customer = customer;
    }
    
    
    public void setAnonymousId(final String anonymousId){
        this.anonymousId = anonymousId;
    }
    
    
    public void setExternalId(final String externalId){
        this.externalId = externalId;
    }
    
    
    public void setInterfaceId(final String interfaceId){
        this.interfaceId = interfaceId;
    }
    
    
    public void setAmountPlanned(final com.commercetools.api.models.common.Money amountPlanned){
        this.amountPlanned = amountPlanned;
    }
    
    
    public void setAmountAuthorized(final com.commercetools.api.models.common.Money amountAuthorized){
        this.amountAuthorized = amountAuthorized;
    }
    
    
    public void setAuthorizedUntil(final String authorizedUntil){
        this.authorizedUntil = authorizedUntil;
    }
    
    
    public void setAmountPaid(final com.commercetools.api.models.common.Money amountPaid){
        this.amountPaid = amountPaid;
    }
    
    
    public void setAmountRefunded(final com.commercetools.api.models.common.Money amountRefunded){
        this.amountRefunded = amountRefunded;
    }
    
    
    public void setPaymentMethodInfo(final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo){
        this.paymentMethodInfo = paymentMethodInfo;
    }
    
    
    public void setPaymentStatus(final com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus){
        this.paymentStatus = paymentStatus;
    }
    
    
    public void setTransactions(final com.commercetools.api.models.payment.TransactionDraft ...transactions){
       this.transactions = new ArrayList<>(Arrays.asList(transactions));
    }
    
    
    public void setTransactions(final java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions){
       this.transactions = transactions;
    }
    
    
    public void setInterfaceInteractions(final com.commercetools.api.models.type.CustomFieldsDraft ...interfaceInteractions){
       this.interfaceInteractions = new ArrayList<>(Arrays.asList(interfaceInteractions));
    }
    
    
    public void setInterfaceInteractions(final java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions){
       this.interfaceInteractions = interfaceInteractions;
    }
    
    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }
    
    
    public void setKey(final String key){
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PaymentDraftImpl that = (PaymentDraftImpl) o;
    
        return new EqualsBuilder()
                .append(customer, that.customer)
                .append(anonymousId, that.anonymousId)
                .append(externalId, that.externalId)
                .append(interfaceId, that.interfaceId)
                .append(amountPlanned, that.amountPlanned)
                .append(amountAuthorized, that.amountAuthorized)
                .append(authorizedUntil, that.authorizedUntil)
                .append(amountPaid, that.amountPaid)
                .append(amountRefunded, that.amountRefunded)
                .append(paymentMethodInfo, that.paymentMethodInfo)
                .append(paymentStatus, that.paymentStatus)
                .append(transactions, that.transactions)
                .append(interfaceInteractions, that.interfaceInteractions)
                .append(custom, that.custom)
                .append(key, that.key)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(customer)
            .append(anonymousId)
            .append(externalId)
            .append(interfaceId)
            .append(amountPlanned)
            .append(amountAuthorized)
            .append(authorizedUntil)
            .append(amountPaid)
            .append(amountRefunded)
            .append(paymentMethodInfo)
            .append(paymentStatus)
            .append(transactions)
            .append(interfaceInteractions)
            .append(custom)
            .append(key)
            .toHashCode();
    }

}
