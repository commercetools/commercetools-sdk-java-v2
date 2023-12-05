
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
public class ChangeParentChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeParentChangeBuilder builder) {
        ChangeParentChange changeParentChange = builder.buildUnchecked();
        Assertions.assertThat(changeParentChange).isInstanceOf(ChangeParentChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeParentChange.builder().change("change") },
                new Object[] { ChangeParentChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { ChangeParentChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void change() {
        ChangeParentChange value = ChangeParentChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeParentChange value = ChangeParentChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void nextValue() {
        ChangeParentChange value = ChangeParentChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
