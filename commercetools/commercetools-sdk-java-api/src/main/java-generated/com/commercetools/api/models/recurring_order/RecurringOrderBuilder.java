
package com.commercetools.api.models.recurring_order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrder recurringOrder = RecurringOrder.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .cart(cartBuilder -> cartBuilder)
 *             .originOrder(originOrderBuilder -> originOrderBuilder)
 *             .startsAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .recurringOrderState(RecurringOrderState.ACTIVE)
 *             .schedule(scheduleBuilder -> scheduleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderBuilder implements Builder<RecurringOrder> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private String key;

    private com.commercetools.api.models.cart.CartReference cart;

    private com.commercetools.api.models.order.OrderReference originOrder;

    private java.time.ZonedDateTime startsAt;

    @Nullable
    private java.time.ZonedDateTime resumesAt;

    @Nullable
    private java.time.ZonedDateTime expiresAt;

    @Nullable
    private java.time.ZonedDateTime lastOrderAt;

    @Nullable
    private java.time.ZonedDateTime nextOrderAt;

    @Nullable
    private com.commercetools.api.models.recurring_order.SkipConfiguration skipConfiguration;

    @Nullable
    private com.commercetools.api.models.store.StoreKeyReference store;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    private com.commercetools.api.models.recurring_order.RecurringOrderState recurringOrderState;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule schedule;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private String customerEmail;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    /**
     *  <p>Unique identifier of the RecurringOrder.</p>
     * @param id value to be set
     * @return Builder
     */

    public RecurringOrderBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the RecurringOrder.</p>
     * @param version value to be set
     * @return Builder
     */

    public RecurringOrderBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder was created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public RecurringOrderBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public RecurringOrderBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the RecurringOrder.</p>
     * @param key value to be set
     * @return Builder
     */

    public RecurringOrderBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Reference to the Cart for a RecurringOrder. The referenced Cart will have the <code>RecurringOrder</code> CartOrigin.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public RecurringOrderBuilder cart(
            Function<com.commercetools.api.models.cart.CartReferenceBuilder, com.commercetools.api.models.cart.CartReferenceBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Cart for a RecurringOrder. The referenced Cart will have the <code>RecurringOrder</code> CartOrigin.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public RecurringOrderBuilder withCart(
            Function<com.commercetools.api.models.cart.CartReferenceBuilder, com.commercetools.api.models.cart.CartReference> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Cart for a RecurringOrder. The referenced Cart will have the <code>RecurringOrder</code> CartOrigin.</p>
     * @param cart value to be set
     * @return Builder
     */

    public RecurringOrderBuilder cart(final com.commercetools.api.models.cart.CartReference cart) {
        this.cart = cart;
        return this;
    }

    /**
     *  <p>Reference to the original Order that generated this RecurringOrder.</p>
     * @param builder function to build the originOrder value
     * @return Builder
     */

    public RecurringOrderBuilder originOrder(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReferenceBuilder> builder) {
        this.originOrder = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the original Order that generated this RecurringOrder.</p>
     * @param builder function to build the originOrder value
     * @return Builder
     */

    public RecurringOrderBuilder withOriginOrder(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReference> builder) {
        this.originOrder = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the original Order that generated this RecurringOrder.</p>
     * @param originOrder value to be set
     * @return Builder
     */

    public RecurringOrderBuilder originOrder(final com.commercetools.api.models.order.OrderReference originOrder) {
        this.originOrder = originOrder;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder starts creating new Orders.</p>
     * @param startsAt value to be set
     * @return Builder
     */

    public RecurringOrderBuilder startsAt(final java.time.ZonedDateTime startsAt) {
        this.startsAt = startsAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder resumes creating Orders after being unpaused.</p>
     * @param resumesAt value to be set
     * @return Builder
     */

    public RecurringOrderBuilder resumesAt(@Nullable final java.time.ZonedDateTime resumesAt) {
        this.resumesAt = resumesAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder expires.</p>
     * @param expiresAt value to be set
     * @return Builder
     */

    public RecurringOrderBuilder expiresAt(@Nullable final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the last Order was created from this RecurringOrder.</p>
     * @param lastOrderAt value to be set
     * @return Builder
     */

    public RecurringOrderBuilder lastOrderAt(@Nullable final java.time.ZonedDateTime lastOrderAt) {
        this.lastOrderAt = lastOrderAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the next Order will be created from this RecurringOrder.</p>
     * @param nextOrderAt value to be set
     * @return Builder
     */

    public RecurringOrderBuilder nextOrderAt(@Nullable final java.time.ZonedDateTime nextOrderAt) {
        this.nextOrderAt = nextOrderAt;
        return this;
    }

    /**
     *  <p>Information about current and future skips for this RecurringOrder.</p>
     * @param skipConfiguration value to be set
     * @return Builder
     */

    public RecurringOrderBuilder skipConfiguration(
            @Nullable final com.commercetools.api.models.recurring_order.SkipConfiguration skipConfiguration) {
        this.skipConfiguration = skipConfiguration;
        return this;
    }

    /**
     *  <p>Information about current and future skips for this RecurringOrder.</p>
     * @param builder function to build the skipConfiguration value
     * @return Builder
     */

    public RecurringOrderBuilder skipConfiguration(
            Function<com.commercetools.api.models.recurring_order.SkipConfigurationBuilder, Builder<? extends com.commercetools.api.models.recurring_order.SkipConfiguration>> builder) {
        this.skipConfiguration = builder
                .apply(com.commercetools.api.models.recurring_order.SkipConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a Store.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public RecurringOrderBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Store.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public RecurringOrderBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a Store.</p>
     * @param store value to be set
     * @return Builder
     */

    public RecurringOrderBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Reference to the Business Unit that the RecurringOrder belongs to.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public RecurringOrderBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the Business Unit that the RecurringOrder belongs to.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public RecurringOrderBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Business Unit that the RecurringOrder belongs to.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public RecurringOrderBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>State of the RecurringOrder in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public RecurringOrderBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the RecurringOrder in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public RecurringOrderBuilder withState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State of the RecurringOrder in a custom workflow.</p>
     * @param state value to be set
     * @return Builder
     */

    public RecurringOrderBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Current state of the RecurringOrder.</p>
     * @param recurringOrderState value to be set
     * @return Builder
     */

    public RecurringOrderBuilder recurringOrderState(
            final com.commercetools.api.models.recurring_order.RecurringOrderState recurringOrderState) {
        this.recurringOrderState = recurringOrderState;
        return this;
    }

    /**
     *  <p>Schedule of the RecurringOrder.</p>
     * @param schedule value to be set
     * @return Builder
     */

    public RecurringOrderBuilder schedule(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     *  <p>Schedule of the RecurringOrder.</p>
     * @param builder function to build the schedule value
     * @return Builder
     */

    public RecurringOrderBuilder schedule(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleBuilder, Builder<? extends com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule>> builder) {
        this.schedule = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Customer that the RecurringOrder belongs to.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public RecurringOrderBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Customer that the RecurringOrder belongs to.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public RecurringOrderBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Customer that the RecurringOrder belongs to.</p>
     * @param customer value to be set
     * @return Builder
     */

    public RecurringOrderBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Email address of the Customer that the RecurringOrder belongs to.</p>
     * @param customerEmail value to be set
     * @return Builder
     */

    public RecurringOrderBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     *  <p>Custom Fields of the RecurringOrder.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public RecurringOrderBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the RecurringOrder.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public RecurringOrderBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the RecurringOrder.</p>
     * @param custom value to be set
     * @return Builder
     */

    public RecurringOrderBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the RecurringOrder.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public RecurringOrderBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the RecurringOrder.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public RecurringOrderBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the RecurringOrder.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public RecurringOrderBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the RecurringOrder.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public RecurringOrderBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the RecurringOrder.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public RecurringOrderBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the RecurringOrder.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public RecurringOrderBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Unique identifier of the RecurringOrder.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the RecurringOrder.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder was created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined unique identifier of the RecurringOrder.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Reference to the Cart for a RecurringOrder. The referenced Cart will have the <code>RecurringOrder</code> CartOrigin.</p>
     * @return cart
     */

    public com.commercetools.api.models.cart.CartReference getCart() {
        return this.cart;
    }

    /**
     *  <p>Reference to the original Order that generated this RecurringOrder.</p>
     * @return originOrder
     */

    public com.commercetools.api.models.order.OrderReference getOriginOrder() {
        return this.originOrder;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder starts creating new Orders.</p>
     * @return startsAt
     */

    public java.time.ZonedDateTime getStartsAt() {
        return this.startsAt;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder resumes creating Orders after being unpaused.</p>
     * @return resumesAt
     */

    @Nullable
    public java.time.ZonedDateTime getResumesAt() {
        return this.resumesAt;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder expires.</p>
     * @return expiresAt
     */

    @Nullable
    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     *  <p>Date and time (UTC) when the last Order was created from this RecurringOrder.</p>
     * @return lastOrderAt
     */

    @Nullable
    public java.time.ZonedDateTime getLastOrderAt() {
        return this.lastOrderAt;
    }

    /**
     *  <p>Date and time (UTC) when the next Order will be created from this RecurringOrder.</p>
     * @return nextOrderAt
     */

    @Nullable
    public java.time.ZonedDateTime getNextOrderAt() {
        return this.nextOrderAt;
    }

    /**
     *  <p>Information about current and future skips for this RecurringOrder.</p>
     * @return skipConfiguration
     */

    @Nullable
    public com.commercetools.api.models.recurring_order.SkipConfiguration getSkipConfiguration() {
        return this.skipConfiguration;
    }

    /**
     *  <p>Reference to a Store.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>Reference to the Business Unit that the RecurringOrder belongs to.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>State of the RecurringOrder in a custom workflow.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Current state of the RecurringOrder.</p>
     * @return recurringOrderState
     */

    public com.commercetools.api.models.recurring_order.RecurringOrderState getRecurringOrderState() {
        return this.recurringOrderState;
    }

    /**
     *  <p>Schedule of the RecurringOrder.</p>
     * @return schedule
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule getSchedule() {
        return this.schedule;
    }

    /**
     *  <p>The Customer that the RecurringOrder belongs to.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Email address of the Customer that the RecurringOrder belongs to.</p>
     * @return customerEmail
     */

    @Nullable
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p>Custom Fields of the RecurringOrder.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>IDs and references that last modified the RecurringOrder.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the RecurringOrder.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     * builds RecurringOrder with checking for non-null required values
     * @return RecurringOrder
     */
    public RecurringOrder build() {
        Objects.requireNonNull(id, RecurringOrder.class + ": id is missing");
        Objects.requireNonNull(version, RecurringOrder.class + ": version is missing");
        Objects.requireNonNull(createdAt, RecurringOrder.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, RecurringOrder.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(cart, RecurringOrder.class + ": cart is missing");
        Objects.requireNonNull(originOrder, RecurringOrder.class + ": originOrder is missing");
        Objects.requireNonNull(startsAt, RecurringOrder.class + ": startsAt is missing");
        Objects.requireNonNull(recurringOrderState, RecurringOrder.class + ": recurringOrderState is missing");
        Objects.requireNonNull(schedule, RecurringOrder.class + ": schedule is missing");
        return new RecurringOrderImpl(id, version, createdAt, lastModifiedAt, key, cart, originOrder, startsAt,
            resumesAt, expiresAt, lastOrderAt, nextOrderAt, skipConfiguration, store, businessUnit, state,
            recurringOrderState, schedule, customer, customerEmail, custom, lastModifiedBy, createdBy);
    }

    /**
     * builds RecurringOrder without checking for non-null required values
     * @return RecurringOrder
     */
    public RecurringOrder buildUnchecked() {
        return new RecurringOrderImpl(id, version, createdAt, lastModifiedAt, key, cart, originOrder, startsAt,
            resumesAt, expiresAt, lastOrderAt, nextOrderAt, skipConfiguration, store, businessUnit, state,
            recurringOrderState, schedule, customer, customerEmail, custom, lastModifiedBy, createdBy);
    }

    /**
     * factory method for an instance of RecurringOrderBuilder
     * @return builder
     */
    public static RecurringOrderBuilder of() {
        return new RecurringOrderBuilder();
    }

    /**
     * create builder for RecurringOrder instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderBuilder of(final RecurringOrder template) {
        RecurringOrderBuilder builder = new RecurringOrderBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.key = template.getKey();
        builder.cart = template.getCart();
        builder.originOrder = template.getOriginOrder();
        builder.startsAt = template.getStartsAt();
        builder.resumesAt = template.getResumesAt();
        builder.expiresAt = template.getExpiresAt();
        builder.lastOrderAt = template.getLastOrderAt();
        builder.nextOrderAt = template.getNextOrderAt();
        builder.skipConfiguration = template.getSkipConfiguration();
        builder.store = template.getStore();
        builder.businessUnit = template.getBusinessUnit();
        builder.state = template.getState();
        builder.recurringOrderState = template.getRecurringOrderState();
        builder.schedule = template.getSchedule();
        builder.customer = template.getCustomer();
        builder.customerEmail = template.getCustomerEmail();
        builder.custom = template.getCustom();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        return builder;
    }

}
