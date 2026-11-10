
package com.commercetools.api.models.recurring_order;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderBuilder builder) {
        RecurringOrder recurringOrder = builder.buildUnchecked();
        Assertions.assertThat(recurringOrder).isInstanceOf(RecurringOrder.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", RecurringOrder.builder().id("id") },
                new Object[] { "key", RecurringOrder.builder().key("key") },
                new Object[] { "version", RecurringOrder.builder().version(2L) },
                new Object[] { "cart",
                        RecurringOrder.builder().cart(new com.commercetools.api.models.cart.CartReferenceImpl()) },
                new Object[] { "originOrder",
                        RecurringOrder.builder()
                                .originOrder(new com.commercetools.api.models.order.OrderReferenceImpl()) },
                new Object[] { "startsAt",
                        RecurringOrder.builder().startsAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "resumesAt",
                        RecurringOrder.builder().resumesAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "expiresAt",
                        RecurringOrder.builder().expiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastOrderAt",
                        RecurringOrder.builder().lastOrderAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "nextOrderAt",
                        RecurringOrder.builder().nextOrderAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "skipConfiguration", RecurringOrder.builder()
                        .skipConfiguration(new com.commercetools.api.models.recurring_order.SkipConfigurationImpl()) },
                new Object[] { "store",
                        RecurringOrder.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "businessUnit", RecurringOrder.builder()
                        .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "state",
                        RecurringOrder.builder().state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "recurringOrderState",
                        RecurringOrder.builder()
                                .recurringOrderState(com.commercetools.api.models.recurring_order.RecurringOrderState
                                        .findEnum("Active")) },
                new Object[] { "schedule", RecurringOrder.builder()
                        .schedule(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl()) },
                new Object[] { "customer",
                        RecurringOrder.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "customerEmail", RecurringOrder.builder().customerEmail("customerEmail") },
                new Object[] { "custom",
                        RecurringOrder.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "createdAt",
                        RecurringOrder.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        RecurringOrder.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        RecurringOrder.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        RecurringOrder.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) } };
    }

    @Test
    public void id() {
        RecurringOrder value = RecurringOrder.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        RecurringOrder value = RecurringOrder.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void version() {
        RecurringOrder value = RecurringOrder.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void cart() {
        RecurringOrder value = RecurringOrder.of();
        value.setCart(new com.commercetools.api.models.cart.CartReferenceImpl());
        Assertions.assertThat(value.getCart()).isEqualTo(new com.commercetools.api.models.cart.CartReferenceImpl());
    }

    @Test
    public void originOrder() {
        RecurringOrder value = RecurringOrder.of();
        value.setOriginOrder(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getOriginOrder())
                .isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }

    @Test
    public void startsAt() {
        RecurringOrder value = RecurringOrder.of();
        value.setStartsAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getStartsAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void resumesAt() {
        RecurringOrder value = RecurringOrder.of();
        value.setResumesAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getResumesAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void expiresAt() {
        RecurringOrder value = RecurringOrder.of();
        value.setExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastOrderAt() {
        RecurringOrder value = RecurringOrder.of();
        value.setLastOrderAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastOrderAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void nextOrderAt() {
        RecurringOrder value = RecurringOrder.of();
        value.setNextOrderAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getNextOrderAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void skipConfiguration() {
        RecurringOrder value = RecurringOrder.of();
        value.setSkipConfiguration(new com.commercetools.api.models.recurring_order.SkipConfigurationImpl());
        Assertions.assertThat(value.getSkipConfiguration())
                .isEqualTo(new com.commercetools.api.models.recurring_order.SkipConfigurationImpl());
    }

    @Test
    public void store() {
        RecurringOrder value = RecurringOrder.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void businessUnit() {
        RecurringOrder value = RecurringOrder.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void state() {
        RecurringOrder value = RecurringOrder.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void recurringOrderState() {
        RecurringOrder value = RecurringOrder.of();
        value.setRecurringOrderState(
            com.commercetools.api.models.recurring_order.RecurringOrderState.findEnum("Active"));
        Assertions.assertThat(value.getRecurringOrderState())
                .isEqualTo(com.commercetools.api.models.recurring_order.RecurringOrderState.findEnum("Active"));
    }

    @Test
    public void schedule() {
        RecurringOrder value = RecurringOrder.of();
        value.setSchedule(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl());
        Assertions.assertThat(value.getSchedule())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl());
    }

    @Test
    public void customer() {
        RecurringOrder value = RecurringOrder.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void customerEmail() {
        RecurringOrder value = RecurringOrder.of();
        value.setCustomerEmail("customerEmail");
        Assertions.assertThat(value.getCustomerEmail()).isEqualTo("customerEmail");
    }

    @Test
    public void custom() {
        RecurringOrder value = RecurringOrder.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void createdAt() {
        RecurringOrder value = RecurringOrder.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        RecurringOrder value = RecurringOrder.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        RecurringOrder value = RecurringOrder.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        RecurringOrder value = RecurringOrder.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }
}
