
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
public class MyShoppingListAddLineItemActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListAddLineItemActionBuilder builder) {
        MyShoppingListAddLineItemAction myShoppingListAddLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListAddLineItemAction).isInstanceOf(MyShoppingListAddLineItemAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyShoppingListAddLineItemAction.builder().key("key") },
                new Object[] { MyShoppingListAddLineItemAction.builder().sku("sku") },
                new Object[] { MyShoppingListAddLineItemAction.builder().productId("productId") },
                new Object[] { MyShoppingListAddLineItemAction.builder().variantId(5L) },
                new Object[] { MyShoppingListAddLineItemAction.builder().quantity(8L) },
                new Object[] {
                        MyShoppingListAddLineItemAction.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { MyShoppingListAddLineItemAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void productId() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void variantId() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void quantity() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void addedAt() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setAddedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAddedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
