
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * RecurringOrder
 *
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
@JsonDeserialize(as = RecurringOrderImpl.class)
public interface RecurringOrder extends BaseResource {

    /**
     *  <p>Unique identifier of the RecurringOrder.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the RecurringOrder.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Current version of the RecurringOrder.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Reference to the Cart for a RecurringOrder. The referenced Cart will have the <code>RecurringOrder</code> CartOrigin.</p>
     * @return cart
     */
    @NotNull
    @Valid
    @JsonProperty("cart")
    public CartReference getCart();

    /**
     *  <p>Reference to the original Order that generated this RecurringOrder.</p>
     * @return originOrder
     */
    @NotNull
    @Valid
    @JsonProperty("originOrder")
    public OrderReference getOriginOrder();

    /**
     *  <p>Date and time (UTC) when the RecurringOrder starts creating new Orders.</p>
     * @return startsAt
     */
    @NotNull
    @JsonProperty("startsAt")
    public ZonedDateTime getStartsAt();

    /**
     *  <p>Date and time (UTC) when the RecurringOrder resumes creating Orders after being unpaused.</p>
     * @return resumesAt
     */

    @JsonProperty("resumesAt")
    public ZonedDateTime getResumesAt();

    /**
     *  <p>Date and time (UTC) when the RecurringOrder expires.</p>
     * @return expiresAt
     */

    @JsonProperty("expiresAt")
    public ZonedDateTime getExpiresAt();

    /**
     *  <p>Date and time (UTC) when the last Order was created from this RecurringOrder.</p>
     * @return lastOrderAt
     */

    @JsonProperty("lastOrderAt")
    public ZonedDateTime getLastOrderAt();

    /**
     *  <p>Date and time (UTC) when the next Order will be created from this RecurringOrder.</p>
     * @return nextOrderAt
     */

    @JsonProperty("nextOrderAt")
    public ZonedDateTime getNextOrderAt();

    /**
     *  <p>Information about current and future skips for this RecurringOrder.</p>
     * @return skipConfiguration
     */
    @Valid
    @JsonProperty("skipConfiguration")
    public SkipConfiguration getSkipConfiguration();

    /**
     *  <p>Reference to a Store.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>Reference to the Business Unit that the RecurringOrder belongs to.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    /**
     *  <p>State of the RecurringOrder in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>Current state of the RecurringOrder.</p>
     * @return recurringOrderState
     */
    @NotNull
    @JsonProperty("recurringOrderState")
    public RecurringOrderState getRecurringOrderState();

    /**
     *  <p>Schedule of the RecurringOrder.</p>
     * @return schedule
     */
    @NotNull
    @Valid
    @JsonProperty("schedule")
    public RecurrencePolicySchedule getSchedule();

    /**
     *  <p>The Customer that the RecurringOrder belongs to.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Email address of the Customer that the RecurringOrder belongs to.</p>
     * @return customerEmail
     */

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
     *  <p>Custom Fields of the RecurringOrder.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Date and time (UTC) when the RecurringOrder was created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) when the RecurringOrder was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the RecurringOrder.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the RecurringOrder.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Unique identifier of the RecurringOrder.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the RecurringOrder.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Current version of the RecurringOrder.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Reference to the Cart for a RecurringOrder. The referenced Cart will have the <code>RecurringOrder</code> CartOrigin.</p>
     * @param cart value to be set
     */

    public void setCart(final CartReference cart);

    /**
     *  <p>Reference to the original Order that generated this RecurringOrder.</p>
     * @param originOrder value to be set
     */

    public void setOriginOrder(final OrderReference originOrder);

    /**
     *  <p>Date and time (UTC) when the RecurringOrder starts creating new Orders.</p>
     * @param startsAt value to be set
     */

    public void setStartsAt(final ZonedDateTime startsAt);

    /**
     *  <p>Date and time (UTC) when the RecurringOrder resumes creating Orders after being unpaused.</p>
     * @param resumesAt value to be set
     */

    public void setResumesAt(final ZonedDateTime resumesAt);

    /**
     *  <p>Date and time (UTC) when the RecurringOrder expires.</p>
     * @param expiresAt value to be set
     */

    public void setExpiresAt(final ZonedDateTime expiresAt);

    /**
     *  <p>Date and time (UTC) when the last Order was created from this RecurringOrder.</p>
     * @param lastOrderAt value to be set
     */

    public void setLastOrderAt(final ZonedDateTime lastOrderAt);

    /**
     *  <p>Date and time (UTC) when the next Order will be created from this RecurringOrder.</p>
     * @param nextOrderAt value to be set
     */

    public void setNextOrderAt(final ZonedDateTime nextOrderAt);

    /**
     *  <p>Information about current and future skips for this RecurringOrder.</p>
     * @param skipConfiguration value to be set
     */

    public void setSkipConfiguration(final SkipConfiguration skipConfiguration);

    /**
     *  <p>Reference to a Store.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     *  <p>Reference to the Business Unit that the RecurringOrder belongs to.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    /**
     *  <p>State of the RecurringOrder in a custom workflow.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>Current state of the RecurringOrder.</p>
     * @param recurringOrderState value to be set
     */

    public void setRecurringOrderState(final RecurringOrderState recurringOrderState);

    /**
     *  <p>Schedule of the RecurringOrder.</p>
     * @param schedule value to be set
     */

    public void setSchedule(final RecurrencePolicySchedule schedule);

    /**
     *  <p>The Customer that the RecurringOrder belongs to.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>Email address of the Customer that the RecurringOrder belongs to.</p>
     * @param customerEmail value to be set
     */

    public void setCustomerEmail(final String customerEmail);

    /**
     *  <p>Custom Fields of the RecurringOrder.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Date and time (UTC) when the RecurringOrder was created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) when the RecurringOrder was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the RecurringOrder.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the RecurringOrder.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     * factory method
     * @return instance of RecurringOrder
     */
    public static RecurringOrder of() {
        return new RecurringOrderImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrder
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrder of(final RecurringOrder template) {
        RecurringOrderImpl instance = new RecurringOrderImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setCart(template.getCart());
        instance.setOriginOrder(template.getOriginOrder());
        instance.setStartsAt(template.getStartsAt());
        instance.setResumesAt(template.getResumesAt());
        instance.setExpiresAt(template.getExpiresAt());
        instance.setLastOrderAt(template.getLastOrderAt());
        instance.setNextOrderAt(template.getNextOrderAt());
        instance.setSkipConfiguration(template.getSkipConfiguration());
        instance.setStore(template.getStore());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setState(template.getState());
        instance.setRecurringOrderState(template.getRecurringOrderState());
        instance.setSchedule(template.getSchedule());
        instance.setCustomer(template.getCustomer());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setCustom(template.getCustom());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        return instance;
    }

    public RecurringOrder copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrder
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrder deepCopy(@Nullable final RecurringOrder template) {
        if (template == null) {
            return null;
        }
        RecurringOrderImpl instance = new RecurringOrderImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setCart(com.commercetools.api.models.cart.CartReference.deepCopy(template.getCart()));
        instance.setOriginOrder(com.commercetools.api.models.order.OrderReference.deepCopy(template.getOriginOrder()));
        instance.setStartsAt(template.getStartsAt());
        instance.setResumesAt(template.getResumesAt());
        instance.setExpiresAt(template.getExpiresAt());
        instance.setLastOrderAt(template.getLastOrderAt());
        instance.setNextOrderAt(template.getNextOrderAt());
        instance.setSkipConfiguration(
            com.commercetools.api.models.recurring_order.SkipConfiguration.deepCopy(template.getSkipConfiguration()));
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setBusinessUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getBusinessUnit()));
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setRecurringOrderState(template.getRecurringOrderState());
        instance.setSchedule(
            com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule.deepCopy(template.getSchedule()));
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        return instance;
    }

    /**
     * builder factory method for RecurringOrder
     * @return builder
     */
    public static RecurringOrderBuilder builder() {
        return RecurringOrderBuilder.of();
    }

    /**
     * create builder for RecurringOrder instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderBuilder builder(final RecurringOrder template) {
        return RecurringOrderBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrder(Function<RecurringOrder, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrder> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrder>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrder>";
            }
        };
    }
}
