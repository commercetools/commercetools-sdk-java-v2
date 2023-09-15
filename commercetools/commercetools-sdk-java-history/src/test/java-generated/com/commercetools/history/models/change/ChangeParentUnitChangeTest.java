
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
public class ChangeParentUnitChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeParentUnitChangeBuilder builder) {
        ChangeParentUnitChange changeParentUnitChange = builder.buildUnchecked();
        Assertions.assertThat(changeParentUnitChange).isInstanceOf(ChangeParentUnitChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeParentUnitChange.builder().change("change") },
                new Object[] { ChangeParentUnitChange.builder()
                        .previousValue(new com.commercetools.history.models.common.KeyReferenceImpl()) },
                new Object[] { ChangeParentUnitChange.builder()
                        .nextValue(new com.commercetools.history.models.common.KeyReferenceImpl()) } };
    }

    @Test
    public void change() {
        ChangeParentUnitChange value = ChangeParentUnitChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeParentUnitChange value = ChangeParentUnitChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.KeyReferenceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.KeyReferenceImpl());
    }

    @Test
    public void nextValue() {
        ChangeParentUnitChange value = ChangeParentUnitChange.of();
        value.setNextValue(new com.commercetools.history.models.common.KeyReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.KeyReferenceImpl());
    }
}
