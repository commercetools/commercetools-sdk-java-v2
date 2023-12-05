
package com.commercetools.history.models.change;

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
public class SetDeleteDaysAfterLastModificationChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetDeleteDaysAfterLastModificationChangeBuilder builder) {
        SetDeleteDaysAfterLastModificationChange setDeleteDaysAfterLastModificationChange = builder.buildUnchecked();
        Assertions.assertThat(setDeleteDaysAfterLastModificationChange)
                .isInstanceOf(SetDeleteDaysAfterLastModificationChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetDeleteDaysAfterLastModificationChange.builder().change("change") },
                new Object[] { SetDeleteDaysAfterLastModificationChange.builder().previousValue(8) },
                new Object[] { SetDeleteDaysAfterLastModificationChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        SetDeleteDaysAfterLastModificationChange value = SetDeleteDaysAfterLastModificationChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDeleteDaysAfterLastModificationChange value = SetDeleteDaysAfterLastModificationChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        SetDeleteDaysAfterLastModificationChange value = SetDeleteDaysAfterLastModificationChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
