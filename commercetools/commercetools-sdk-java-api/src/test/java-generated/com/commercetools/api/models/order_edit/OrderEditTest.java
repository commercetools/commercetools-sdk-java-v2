
package com.commercetools.api.models.order_edit;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditBuilder builder) {
        OrderEdit orderEdit = builder.buildUnchecked();
        Assertions.assertThat(orderEdit).isInstanceOf(OrderEdit.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", OrderEdit.builder().id("id") },
                new Object[] { "version", OrderEdit.builder().version(2L) },
                new Object[] { "key", OrderEdit.builder().key("key") },
                new Object[] { "resource",
                        OrderEdit.builder().resource(new com.commercetools.api.models.order.OrderReferenceImpl()) },
                new Object[] { "stagedActions",
                        OrderEdit.builder()
                                .stagedActions(Collections.singletonList(
                                    new com.commercetools.api.models.order.StagedOrderUpdateActionImpl())) },
                new Object[] { "result",
                        OrderEdit.builder().result(new com.commercetools.api.models.order_edit.OrderEditResultImpl()) },
                new Object[] { "comment", OrderEdit.builder().comment("comment") },
                new Object[] { "custom",
                        OrderEdit.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "createdAt", OrderEdit.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        OrderEdit.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        OrderEdit.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        OrderEdit.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) } };
    }

    @Test
    public void id() {
        OrderEdit value = OrderEdit.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        OrderEdit value = OrderEdit.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void key() {
        OrderEdit value = OrderEdit.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void resource() {
        OrderEdit value = OrderEdit.of();
        value.setResource(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getResource())
                .isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }

    @Test
    public void stagedActions() {
        OrderEdit value = OrderEdit.of();
        value.setStagedActions(
            Collections.singletonList(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl()));
        Assertions.assertThat(value.getStagedActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl()));
    }

    @Test
    public void result() {
        OrderEdit value = OrderEdit.of();
        value.setResult(new com.commercetools.api.models.order_edit.OrderEditResultImpl());
        Assertions.assertThat(value.getResult())
                .isEqualTo(new com.commercetools.api.models.order_edit.OrderEditResultImpl());
    }

    @Test
    public void comment() {
        OrderEdit value = OrderEdit.of();
        value.setComment("comment");
        Assertions.assertThat(value.getComment()).isEqualTo("comment");
    }

    @Test
    public void custom() {
        OrderEdit value = OrderEdit.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void createdAt() {
        OrderEdit value = OrderEdit.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        OrderEdit value = OrderEdit.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        OrderEdit value = OrderEdit.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        OrderEdit value = OrderEdit.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }
}
