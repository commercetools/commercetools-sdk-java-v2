
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
public class ChangeAssociateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeAssociateChangeBuilder builder) {
        ChangeAssociateChange changeAssociateChange = builder.buildUnchecked();
        Assertions.assertThat(changeAssociateChange).isInstanceOf(ChangeAssociateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeAssociateChange.builder().change("change") },
                new Object[] { ChangeAssociateChange.builder()
                        .previousValue(new com.commercetools.history.models.common.AssociateImpl()) },
                new Object[] { ChangeAssociateChange.builder()
                        .nextValue(new com.commercetools.history.models.common.AssociateImpl()) } };
    }

    @Test
    public void change() {
        ChangeAssociateChange value = ChangeAssociateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAssociateChange value = ChangeAssociateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AssociateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AssociateImpl());
    }

    @Test
    public void nextValue() {
        ChangeAssociateChange value = ChangeAssociateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AssociateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AssociateImpl());
    }
}
