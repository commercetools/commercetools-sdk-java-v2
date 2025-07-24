
package com.commercetools.api.models.shopping_list;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListBuilder builder) {
        ShoppingList shoppingList = builder.buildUnchecked();
        Assertions.assertThat(shoppingList).isInstanceOf(ShoppingList.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ShoppingList.builder().id("id") },
                new Object[] { "version", ShoppingList.builder().version(2L) },
                new Object[] { "name",
                        ShoppingList.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "key", ShoppingList.builder().key("key") },
                new Object[] { "customer",
                        ShoppingList.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "slug",
                        ShoppingList.builder().slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        ShoppingList.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "lineItems",
                        ShoppingList.builder()
                                .lineItems(Collections.singletonList(
                                    new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl())) },
                new Object[] { "textLineItems",
                        ShoppingList.builder()
                                .textLineItems(Collections.singletonList(
                                    new com.commercetools.api.models.shopping_list.TextLineItemImpl())) },
                new Object[] { "deleteDaysAfterLastModification",
                        ShoppingList.builder().deleteDaysAfterLastModification(3) },
                new Object[] { "anonymousId", ShoppingList.builder().anonymousId("anonymousId") },
                new Object[] { "store",
                        ShoppingList.builder().store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "businessUnit", ShoppingList.builder()
                        .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "custom",
                        ShoppingList.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "createdAt",
                        ShoppingList.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        ShoppingList.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        ShoppingList.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        ShoppingList.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) } };
    }

    @Test
    public void id() {
        ShoppingList value = ShoppingList.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ShoppingList value = ShoppingList.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void name() {
        ShoppingList value = ShoppingList.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        ShoppingList value = ShoppingList.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void customer() {
        ShoppingList value = ShoppingList.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void slug() {
        ShoppingList value = ShoppingList.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        ShoppingList value = ShoppingList.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItems() {
        ShoppingList value = ShoppingList.of();
        value.setLineItems(
            Collections.singletonList(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl()));
        Assertions.assertThat(value.getLineItems())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl()));
    }

    @Test
    public void textLineItems() {
        ShoppingList value = ShoppingList.of();
        value.setTextLineItems(
            Collections.singletonList(new com.commercetools.api.models.shopping_list.TextLineItemImpl()));
        Assertions.assertThat(value.getTextLineItems())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.shopping_list.TextLineItemImpl()));
    }

    @Test
    public void deleteDaysAfterLastModification() {
        ShoppingList value = ShoppingList.of();
        value.setDeleteDaysAfterLastModification(3);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3);
    }

    @Test
    public void anonymousId() {
        ShoppingList value = ShoppingList.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void store() {
        ShoppingList value = ShoppingList.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void businessUnit() {
        ShoppingList value = ShoppingList.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void custom() {
        ShoppingList value = ShoppingList.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void createdAt() {
        ShoppingList value = ShoppingList.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        ShoppingList value = ShoppingList.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        ShoppingList value = ShoppingList.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        ShoppingList value = ShoppingList.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }
}
