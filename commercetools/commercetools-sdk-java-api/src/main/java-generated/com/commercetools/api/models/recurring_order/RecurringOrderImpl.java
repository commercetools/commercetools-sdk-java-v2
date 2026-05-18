
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * RecurringOrder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderImpl implements RecurringOrder, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private String key;

    private com.commercetools.api.models.cart.CartReference cart;

    private com.commercetools.api.models.order.OrderReference originOrder;

    private java.time.ZonedDateTime startsAt;

    private java.time.ZonedDateTime resumesAt;

    private java.time.ZonedDateTime expiresAt;

    private java.time.ZonedDateTime lastOrderAt;

    private java.time.ZonedDateTime nextOrderAt;

    private com.commercetools.api.models.recurring_order.SkipConfiguration skipConfiguration;

    private com.commercetools.api.models.store.StoreKeyReference store;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    private com.commercetools.api.models.state.StateReference state;

    private com.commercetools.api.models.recurring_order.RecurringOrderState recurringOrderState;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule schedule;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private String customerEmail;

    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("key") final String key,
            @JsonProperty("cart") final com.commercetools.api.models.cart.CartReference cart,
            @JsonProperty("originOrder") final com.commercetools.api.models.order.OrderReference originOrder,
            @JsonProperty("startsAt") final java.time.ZonedDateTime startsAt,
            @JsonProperty("resumesAt") final java.time.ZonedDateTime resumesAt,
            @JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt,
            @JsonProperty("lastOrderAt") final java.time.ZonedDateTime lastOrderAt,
            @JsonProperty("nextOrderAt") final java.time.ZonedDateTime nextOrderAt,
            @JsonProperty("skipConfiguration") final com.commercetools.api.models.recurring_order.SkipConfiguration skipConfiguration,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit,
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("recurringOrderState") final com.commercetools.api.models.recurring_order.RecurringOrderState recurringOrderState,
            @JsonProperty("schedule") final com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule schedule,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("customerEmail") final String customerEmail,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.key = key;
        this.cart = cart;
        this.originOrder = originOrder;
        this.startsAt = startsAt;
        this.resumesAt = resumesAt;
        this.expiresAt = expiresAt;
        this.lastOrderAt = lastOrderAt;
        this.nextOrderAt = nextOrderAt;
        this.skipConfiguration = skipConfiguration;
        this.store = store;
        this.businessUnit = businessUnit;
        this.state = state;
        this.recurringOrderState = recurringOrderState;
        this.schedule = schedule;
        this.customer = customer;
        this.customerEmail = customerEmail;
        this.custom = custom;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
    }

    /**
     * create empty instance
     */
    public RecurringOrderImpl() {
    }

    /**
     *  <p>Unique identifier of the RecurringOrder.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the RecurringOrder.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder was created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined unique identifier of the RecurringOrder.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Cart for a RecurringOrder. The referenced Cart will have the <code>RecurringOrder</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:CartOrigin" rel="nofollow">CartOrigin</a>.</p>
     */

    public com.commercetools.api.models.cart.CartReference getCart() {
        return this.cart;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the original <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> that generated this RecurringOrder. This field is automatically populated when the RecurringOrder is created via the <span>Create Order from Cart</span> endpoint and the Cart contains Line Items with defined <code>recurrenceInfo</code>. When the RecurringOrder is created directly via the <span>Create RecurringOrder</span> endpoint, this field remains empty.</p>
     */

    public com.commercetools.api.models.order.OrderReference getOriginOrder() {
        return this.originOrder;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder starts creating new Orders.</p>
     */

    public java.time.ZonedDateTime getStartsAt() {
        return this.startsAt;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder resumes creating Orders after being unpaused.</p>
     */

    public java.time.ZonedDateTime getResumesAt() {
        return this.resumesAt;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder expires.</p>
     */

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     *  <p>Date and time (UTC) when the last Order was created from this RecurringOrder.</p>
     */

    public java.time.ZonedDateTime getLastOrderAt() {
        return this.lastOrderAt;
    }

    /**
     *  <p>Date and time (UTC) when the next Order will be created from this RecurringOrder.</p>
     */

    public java.time.ZonedDateTime getNextOrderAt() {
        return this.nextOrderAt;
    }

    /**
     *  <p>Information about current and future skips for this RecurringOrder.</p>
     */

    public com.commercetools.api.models.recurring_order.SkipConfiguration getSkipConfiguration() {
        return this.skipConfiguration;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Store.</p>
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Business Unit that the RecurringOrder belongs to.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the RecurringOrder in a custom workflow.</p>
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Current state of the RecurringOrder.</p>
     */

    public com.commercetools.api.models.recurring_order.RecurringOrderState getRecurringOrderState() {
        return this.recurringOrderState;
    }

    /**
     *  <p>Schedule of the RecurringOrder.</p>
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule getSchedule() {
        return this.schedule;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> that the RecurringOrder belongs to.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Email address of the Customer that the RecurringOrder belongs to.</p>
     */

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p>Custom Fields of the RecurringOrder.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>IDs and references that last modified the RecurringOrder.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the RecurringOrder.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setCart(final com.commercetools.api.models.cart.CartReference cart) {
        this.cart = cart;
    }

    public void setOriginOrder(final com.commercetools.api.models.order.OrderReference originOrder) {
        this.originOrder = originOrder;
    }

    public void setStartsAt(final java.time.ZonedDateTime startsAt) {
        this.startsAt = startsAt;
    }

    public void setResumesAt(final java.time.ZonedDateTime resumesAt) {
        this.resumesAt = resumesAt;
    }

    public void setExpiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public void setLastOrderAt(final java.time.ZonedDateTime lastOrderAt) {
        this.lastOrderAt = lastOrderAt;
    }

    public void setNextOrderAt(final java.time.ZonedDateTime nextOrderAt) {
        this.nextOrderAt = nextOrderAt;
    }

    public void setSkipConfiguration(
            final com.commercetools.api.models.recurring_order.SkipConfiguration skipConfiguration) {
        this.skipConfiguration = skipConfiguration;
    }

    public void setStore(final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
    }

    public void setRecurringOrderState(
            final com.commercetools.api.models.recurring_order.RecurringOrderState recurringOrderState) {
        this.recurringOrderState = recurringOrderState;
    }

    public void setSchedule(final com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule schedule) {
        this.schedule = schedule;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
    }

    public void setCustomerEmail(final String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderImpl that = (RecurringOrderImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(key, that.key)
                .append(cart, that.cart)
                .append(originOrder, that.originOrder)
                .append(startsAt, that.startsAt)
                .append(resumesAt, that.resumesAt)
                .append(expiresAt, that.expiresAt)
                .append(lastOrderAt, that.lastOrderAt)
                .append(nextOrderAt, that.nextOrderAt)
                .append(skipConfiguration, that.skipConfiguration)
                .append(store, that.store)
                .append(businessUnit, that.businessUnit)
                .append(state, that.state)
                .append(recurringOrderState, that.recurringOrderState)
                .append(schedule, that.schedule)
                .append(customer, that.customer)
                .append(customerEmail, that.customerEmail)
                .append(custom, that.custom)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(key, that.key)
                .append(cart, that.cart)
                .append(originOrder, that.originOrder)
                .append(startsAt, that.startsAt)
                .append(resumesAt, that.resumesAt)
                .append(expiresAt, that.expiresAt)
                .append(lastOrderAt, that.lastOrderAt)
                .append(nextOrderAt, that.nextOrderAt)
                .append(skipConfiguration, that.skipConfiguration)
                .append(store, that.store)
                .append(businessUnit, that.businessUnit)
                .append(state, that.state)
                .append(recurringOrderState, that.recurringOrderState)
                .append(schedule, that.schedule)
                .append(customer, that.customer)
                .append(customerEmail, that.customerEmail)
                .append(custom, that.custom)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(key)
                .append(cart)
                .append(originOrder)
                .append(startsAt)
                .append(resumesAt)
                .append(expiresAt)
                .append(lastOrderAt)
                .append(nextOrderAt)
                .append(skipConfiguration)
                .append(store)
                .append(businessUnit)
                .append(state)
                .append(recurringOrderState)
                .append(schedule)
                .append(customer)
                .append(customerEmail)
                .append(custom)
                .append(lastModifiedBy)
                .append(createdBy)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("key", key)
                .append("cart", cart)
                .append("originOrder", originOrder)
                .append("startsAt", startsAt)
                .append("resumesAt", resumesAt)
                .append("expiresAt", expiresAt)
                .append("lastOrderAt", lastOrderAt)
                .append("nextOrderAt", nextOrderAt)
                .append("skipConfiguration", skipConfiguration)
                .append("store", store)
                .append("businessUnit", businessUnit)
                .append("state", state)
                .append("recurringOrderState", recurringOrderState)
                .append("schedule", schedule)
                .append("customer", customer)
                .append("customerEmail", customerEmail)
                .append("custom", custom)
                .append("lastModifiedBy", lastModifiedBy)
                .append("createdBy", createdBy)
                .build();
    }

    @Override
    public RecurringOrder copyDeep() {
        return RecurringOrder.deepCopy(this);
    }
}
