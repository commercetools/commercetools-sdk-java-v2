
package com.commercetools.api.models.me;

import java.time.ZonedDateTime;

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
public class MyShoppingListAddTextLineItemActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListAddTextLineItemActionBuilder builder) {
        MyShoppingListAddTextLineItemAction myShoppingListAddTextLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListAddTextLineItemAction)
                .isInstanceOf(MyShoppingListAddTextLineItemAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyShoppingListAddTextLineItemAction.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { MyShoppingListAddTextLineItemAction.builder().key("key") },
                new Object[] { MyShoppingListAddTextLineItemAction.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { MyShoppingListAddTextLineItemAction.builder().quantity(8L) },
                new Object[] { MyShoppingListAddTextLineItemAction.builder()
                        .addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { MyShoppingListAddTextLineItemAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void name() {
        MyShoppingListAddTextLineItemAction value = MyShoppingListAddTextLineItemAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        MyShoppingListAddTextLineItemAction value = MyShoppingListAddTextLineItemAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void description() {
        MyShoppingListAddTextLineItemAction value = MyShoppingListAddTextLineItemAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void quantity() {
        MyShoppingListAddTextLineItemAction value = MyShoppingListAddTextLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void addedAt() {
        MyShoppingListAddTextLineItemAction value = MyShoppingListAddTextLineItemAction.of();
        value.setAddedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAddedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        MyShoppingListAddTextLineItemAction value = MyShoppingListAddTextLineItemAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
