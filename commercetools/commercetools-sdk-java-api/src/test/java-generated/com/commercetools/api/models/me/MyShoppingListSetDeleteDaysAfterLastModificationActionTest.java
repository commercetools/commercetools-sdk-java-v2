
package com.commercetools.api.models.me;

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
public class MyShoppingListSetDeleteDaysAfterLastModificationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder) {
        MyShoppingListSetDeleteDaysAfterLastModificationAction myShoppingListSetDeleteDaysAfterLastModificationAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListSetDeleteDaysAfterLastModificationAction)
                .isInstanceOf(MyShoppingListSetDeleteDaysAfterLastModificationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyShoppingListSetDeleteDaysAfterLastModificationAction.builder()
                .deleteDaysAfterLastModification(3L) } };
    }

    @Test
    public void deleteDaysAfterLastModification() {
        MyShoppingListSetDeleteDaysAfterLastModificationAction value = MyShoppingListSetDeleteDaysAfterLastModificationAction
                .of();
        value.setDeleteDaysAfterLastModification(3L);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3L);
    }
}
