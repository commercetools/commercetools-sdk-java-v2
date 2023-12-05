
package com.commercetools.api.models.cart;

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
public class CartSetDeleteDaysAfterLastModificationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetDeleteDaysAfterLastModificationActionBuilder builder) {
        CartSetDeleteDaysAfterLastModificationAction cartSetDeleteDaysAfterLastModificationAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartSetDeleteDaysAfterLastModificationAction)
                .isInstanceOf(CartSetDeleteDaysAfterLastModificationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                CartSetDeleteDaysAfterLastModificationAction.builder().deleteDaysAfterLastModification(3) } };
    }

    @Test
    public void deleteDaysAfterLastModification() {
        CartSetDeleteDaysAfterLastModificationAction value = CartSetDeleteDaysAfterLastModificationAction.of();
        value.setDeleteDaysAfterLastModification(3);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3);
    }
}
