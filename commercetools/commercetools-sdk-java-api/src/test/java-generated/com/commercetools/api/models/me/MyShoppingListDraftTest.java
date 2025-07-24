
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListDraftBuilder builder) {
        MyShoppingListDraft myShoppingListDraft = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListDraft).isInstanceOf(MyShoppingListDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        MyShoppingListDraft.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        MyShoppingListDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "lineItems",
                        MyShoppingListDraft.builder()
                                .lineItems(Collections.singletonList(
                                    new com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftImpl())) },
                new Object[] { "textLineItems",
                        MyShoppingListDraft.builder()
                                .textLineItems(Collections.singletonList(
                                    new com.commercetools.api.models.shopping_list.TextLineItemDraftImpl())) },
                new Object[] { "custom",
                        MyShoppingListDraft.builder()
                                .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { "deleteDaysAfterLastModification",
                        MyShoppingListDraft.builder().deleteDaysAfterLastModification(3) },
                new Object[] { "store", MyShoppingListDraft.builder()
                        .store(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()) } };
    }

    @Test
    public void name() {
        MyShoppingListDraft value = MyShoppingListDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        MyShoppingListDraft value = MyShoppingListDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItems() {
        MyShoppingListDraft value = MyShoppingListDraft.of();
        value.setLineItems(
            Collections.singletonList(new com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftImpl()));
        Assertions.assertThat(value.getLineItems())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftImpl()));
    }

    @Test
    public void textLineItems() {
        MyShoppingListDraft value = MyShoppingListDraft.of();
        value.setTextLineItems(
            Collections.singletonList(new com.commercetools.api.models.shopping_list.TextLineItemDraftImpl()));
        Assertions.assertThat(value.getTextLineItems())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.shopping_list.TextLineItemDraftImpl()));
    }

    @Test
    public void custom() {
        MyShoppingListDraft value = MyShoppingListDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void deleteDaysAfterLastModification() {
        MyShoppingListDraft value = MyShoppingListDraft.of();
        value.setDeleteDaysAfterLastModification(3);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3);
    }

    @Test
    public void store() {
        MyShoppingListDraft value = MyShoppingListDraft.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }
}
