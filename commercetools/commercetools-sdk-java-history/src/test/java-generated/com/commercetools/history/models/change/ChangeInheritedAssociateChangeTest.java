
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
public class ChangeInheritedAssociateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeInheritedAssociateChangeBuilder builder) {
        ChangeInheritedAssociateChange changeInheritedAssociateChange = builder.buildUnchecked();
        Assertions.assertThat(changeInheritedAssociateChange).isInstanceOf(ChangeInheritedAssociateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeInheritedAssociateChange.builder().change("change") },
                new Object[] { ChangeInheritedAssociateChange.builder()
                        .previousValue(new com.commercetools.history.models.common.InheritedAssociateImpl()) },
                new Object[] { ChangeInheritedAssociateChange.builder()
                        .nextValue(new com.commercetools.history.models.common.InheritedAssociateImpl()) } };
    }

    @Test
    public void change() {
        ChangeInheritedAssociateChange value = ChangeInheritedAssociateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeInheritedAssociateChange value = ChangeInheritedAssociateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.InheritedAssociateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.InheritedAssociateImpl());
    }

    @Test
    public void nextValue() {
        ChangeInheritedAssociateChange value = ChangeInheritedAssociateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.InheritedAssociateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.InheritedAssociateImpl());
    }
}
