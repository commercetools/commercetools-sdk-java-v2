
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
public class ChangeAssociateModeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeAssociateModeChangeBuilder builder) {
        ChangeAssociateModeChange changeAssociateModeChange = builder.buildUnchecked();
        Assertions.assertThat(changeAssociateModeChange).isInstanceOf(ChangeAssociateModeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeAssociateModeChange.builder().change("change") },
                new Object[] {
                        ChangeAssociateModeChange.builder()
                                .previousValue(com.commercetools.history.models.common.BusinessUnitAssociateMode
                                        .findEnum("Explicit")) },
                new Object[] { ChangeAssociateModeChange.builder()
                        .nextValue(
                            com.commercetools.history.models.common.BusinessUnitAssociateMode.findEnum("Explicit")) } };
    }

    @Test
    public void change() {
        ChangeAssociateModeChange value = ChangeAssociateModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAssociateModeChange value = ChangeAssociateModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitAssociateMode.findEnum("Explicit"));
    }

    @Test
    public void nextValue() {
        ChangeAssociateModeChange value = ChangeAssociateModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitAssociateMode.findEnum("Explicit"));
    }
}
