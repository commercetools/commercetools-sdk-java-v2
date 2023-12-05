
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
public class MyCartSetDeleteDaysAfterLastModificationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartSetDeleteDaysAfterLastModificationActionBuilder builder) {
        MyCartSetDeleteDaysAfterLastModificationAction myCartSetDeleteDaysAfterLastModificationAction = builder
                .buildUnchecked();
        Assertions.assertThat(myCartSetDeleteDaysAfterLastModificationAction)
                .isInstanceOf(MyCartSetDeleteDaysAfterLastModificationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                MyCartSetDeleteDaysAfterLastModificationAction.builder().deleteDaysAfterLastModification(3) } };
    }

    @Test
    public void deleteDaysAfterLastModification() {
        MyCartSetDeleteDaysAfterLastModificationAction value = MyCartSetDeleteDaysAfterLastModificationAction.of();
        value.setDeleteDaysAfterLastModification(3);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3);
    }
}
