
package com.commercetools.api.models.shopping_list;

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
public class ShoppingListSetDeleteDaysAfterLastModificationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder) {
        ShoppingListSetDeleteDaysAfterLastModificationAction shoppingListSetDeleteDaysAfterLastModificationAction = builder
                .buildUnchecked();
        Assertions.assertThat(shoppingListSetDeleteDaysAfterLastModificationAction)
                .isInstanceOf(ShoppingListSetDeleteDaysAfterLastModificationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                ShoppingListSetDeleteDaysAfterLastModificationAction.builder().deleteDaysAfterLastModification(3L) } };
    }

    @Test
    public void deleteDaysAfterLastModification() {
        ShoppingListSetDeleteDaysAfterLastModificationAction value = ShoppingListSetDeleteDaysAfterLastModificationAction
                .of();
        value.setDeleteDaysAfterLastModification(3L);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3L);
    }
}
