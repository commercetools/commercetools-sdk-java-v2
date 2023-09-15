
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
public class ChangeStatusChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeStatusChangeBuilder builder) {
        ChangeStatusChange changeStatusChange = builder.buildUnchecked();
        Assertions.assertThat(changeStatusChange).isInstanceOf(ChangeStatusChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeStatusChange.builder().change("change") },
                new Object[] { ChangeStatusChange.builder()
                        .previousValue(com.commercetools.history.models.common.BusinessUnitStatus.findEnum("Active")) },
                new Object[] { ChangeStatusChange.builder()
                        .nextValue(com.commercetools.history.models.common.BusinessUnitStatus.findEnum("Active")) } };
    }

    @Test
    public void change() {
        ChangeStatusChange value = ChangeStatusChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeStatusChange value = ChangeStatusChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.BusinessUnitStatus.findEnum("Active"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitStatus.findEnum("Active"));
    }

    @Test
    public void nextValue() {
        ChangeStatusChange value = ChangeStatusChange.of();
        value.setNextValue(com.commercetools.history.models.common.BusinessUnitStatus.findEnum("Active"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitStatus.findEnum("Active"));
    }
}
