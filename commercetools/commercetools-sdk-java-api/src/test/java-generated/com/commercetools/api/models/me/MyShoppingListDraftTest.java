
package com.commercetools.api.models.me;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class MyShoppingListDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListDraftBuilder builder) {
        MyShoppingListDraft myShoppingListDraft = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListDraft).isInstanceOf(MyShoppingListDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyShoppingListDraft.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { MyShoppingListDraft.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { MyShoppingListDraft.builder()
                        .lineItems(Collections.singletonList(
                            new com.commercetools.api.models.shopping_list.ShoppingListLineItemDraftImpl())) },
                new Object[] { MyShoppingListDraft.builder()
                        .textLineItems(Collections.singletonList(
                            new com.commercetools.api.models.shopping_list.TextLineItemDraftImpl())) },
                new Object[] { MyShoppingListDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { MyShoppingListDraft.builder().deleteDaysAfterLastModification(3L) },
                new Object[] { MyShoppingListDraft.builder()
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
        value.setDeleteDaysAfterLastModification(3L);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3L);
    }

    @Test
    public void store() {
        MyShoppingListDraft value = MyShoppingListDraft.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }
}
