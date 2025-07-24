
package com.commercetools.api.models.shopping_list;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListDraftBuilder builder) {
        ShoppingListDraft shoppingListDraft = builder.buildUnchecked();
        Assertions.assertThat(shoppingListDraft).isInstanceOf(ShoppingListDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        ShoppingListDraft.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "slug",
                        ShoppingListDraft.builder()
                                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "customer",
                        ShoppingListDraft.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] { "key", ShoppingListDraft.builder().key("key") },
                new Object[] { "description",
                        ShoppingListDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "anonymousId", ShoppingListDraft.builder().anonymousId("anonymousId") },
                new Object[] { "deleteDaysAfterLastModification",
                        ShoppingListDraft.builder().deleteDaysAfterLastModification(3) },
                new Object[] { "lineItems",
                        ShoppingListDraft.builder()
                                .lineItems(Collections.singletonList(
                                    new com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftImpl())) },
                new Object[] { "textLineItems",
                        ShoppingListDraft.builder()
                                .textLineItems(Collections.singletonList(
                                    new com.commercetools.api.models.shopping_list.TextLineItemDraftImpl())) },
                new Object[] { "store",
                        ShoppingListDraft.builder()
                                .store(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()) },
                new Object[] { "businessUnit", ShoppingListDraft.builder()
                        .businessUnit(
                            new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) },
                new Object[] { "custom", ShoppingListDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void name() {
        ShoppingListDraft value = ShoppingListDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        ShoppingListDraft value = ShoppingListDraft.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void customer() {
        ShoppingListDraft value = ShoppingListDraft.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }

    @Test
    public void key() {
        ShoppingListDraft value = ShoppingListDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void description() {
        ShoppingListDraft value = ShoppingListDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void anonymousId() {
        ShoppingListDraft value = ShoppingListDraft.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void deleteDaysAfterLastModification() {
        ShoppingListDraft value = ShoppingListDraft.of();
        value.setDeleteDaysAfterLastModification(3);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3);
    }

    @Test
    public void lineItems() {
        ShoppingListDraft value = ShoppingListDraft.of();
        value.setLineItems(
            Collections.singletonList(new com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftImpl()));
        Assertions.assertThat(value.getLineItems())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftImpl()));
    }

    @Test
    public void textLineItems() {
        ShoppingListDraft value = ShoppingListDraft.of();
        value.setTextLineItems(
            Collections.singletonList(new com.commercetools.api.models.shopping_list.TextLineItemDraftImpl()));
        Assertions.assertThat(value.getTextLineItems())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.shopping_list.TextLineItemDraftImpl()));
    }

    @Test
    public void store() {
        ShoppingListDraft value = ShoppingListDraft.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }

    @Test
    public void businessUnit() {
        ShoppingListDraft value = ShoppingListDraft.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }

    @Test
    public void custom() {
        ShoppingListDraft value = ShoppingListDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
