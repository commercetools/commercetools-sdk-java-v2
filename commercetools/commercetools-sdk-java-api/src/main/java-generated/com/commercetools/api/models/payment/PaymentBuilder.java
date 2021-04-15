package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.payment.PaymentMethodInfo;
import com.commercetools.api.models.payment.PaymentStatus;
import com.commercetools.api.models.payment.Transaction;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.payment.Payment;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentBuilder {

    
    
    private String id;
    
    
    
    private Long version;
    
    
    
    private java.time.ZonedDateTime createdAt;
    
    
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    
    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    
    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    
    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;
    
    
    @Nullable
    private String anonymousId;
    
    
    @Nullable
    private String interfaceId;
    
    
    
    private com.commercetools.api.models.common.TypedMoney amountPlanned;
    
    
    
    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;
    
    
    
    private com.commercetools.api.models.payment.PaymentStatus paymentStatus;
    
    
    
    private java.util.List<com.commercetools.api.models.payment.Transaction> transactions;
    
    
    
    private java.util.List<com.commercetools.api.models.type.CustomFields> interfaceInteractions;
    
    
    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;
    
    
    @Nullable
    private String key;

    
    public PaymentBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    public PaymentBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    public PaymentBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    
    public PaymentBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    
    public PaymentBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    
    public PaymentBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    
    public PaymentBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }
    
    
    public PaymentBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }
    
    
    public PaymentBuilder interfaceId(@Nullable final String interfaceId) {
        this.interfaceId = interfaceId;
        return this;
    }
    
    
    public PaymentBuilder amountPlanned( final com.commercetools.api.models.common.TypedMoney amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }
    
    
    public PaymentBuilder paymentMethodInfo( final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
        return this;
    }
    
    
    public PaymentBuilder paymentStatus( final com.commercetools.api.models.payment.PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }
    
    
    public PaymentBuilder transactions( final com.commercetools.api.models.payment.Transaction ...transactions) {
        this.transactions = new ArrayList<>(Arrays.asList(transactions));
        return this;
    }
    
    
    public PaymentBuilder transactions( final java.util.List<com.commercetools.api.models.payment.Transaction> transactions) {
        this.transactions = transactions;
        return this;
    }
    
    
    public PaymentBuilder interfaceInteractions( final com.commercetools.api.models.type.CustomFields ...interfaceInteractions) {
        this.interfaceInteractions = new ArrayList<>(Arrays.asList(interfaceInteractions));
        return this;
    }
    
    
    public PaymentBuilder interfaceInteractions( final java.util.List<com.commercetools.api.models.type.CustomFields> interfaceInteractions) {
        this.interfaceInteractions = interfaceInteractions;
        return this;
    }
    
    
    public PaymentBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }
    
    
    public PaymentBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    
    
    public String getId(){
        return this.id;
    }
    
    
    
    public Long getVersion(){
        return this.version;
    }
    
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    
    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    
    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    
    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer(){
        return this.customer;
    }
    
    
    @Nullable
    public String getAnonymousId(){
        return this.anonymousId;
    }
    
    
    @Nullable
    public String getInterfaceId(){
        return this.interfaceId;
    }
    
    
    
    public com.commercetools.api.models.common.TypedMoney getAmountPlanned(){
        return this.amountPlanned;
    }
    
    
    
    public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
        return this.paymentMethodInfo;
    }
    
    
    
    public com.commercetools.api.models.payment.PaymentStatus getPaymentStatus(){
        return this.paymentStatus;
    }
    
    
    
    public java.util.List<com.commercetools.api.models.payment.Transaction> getTransactions(){
        return this.transactions;
    }
    
    
    
    public java.util.List<com.commercetools.api.models.type.CustomFields> getInterfaceInteractions(){
        return this.interfaceInteractions;
    }
    
    
    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
    }
    
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    public Payment build() {
        return new PaymentImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, customer, anonymousId, interfaceId, amountPlanned, paymentMethodInfo, paymentStatus, transactions, interfaceInteractions, custom, key);
    }

    public static PaymentBuilder of() {
        return new PaymentBuilder();
    }

    public static PaymentBuilder of(final Payment template) {
        PaymentBuilder builder = new PaymentBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        builder.interfaceId = template.getInterfaceId();
        builder.amountPlanned = template.getAmountPlanned();
        builder.paymentMethodInfo = template.getPaymentMethodInfo();
        builder.paymentStatus = template.getPaymentStatus();
        builder.transactions = template.getTransactions();
        builder.interfaceInteractions = template.getInterfaceInteractions();
        builder.custom = template.getCustom();
        builder.key = template.getKey();
        return builder;
    }

}
