
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
public class ChangeProductSelectionActiveChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeProductSelectionActiveChangeBuilder builder) {
        ChangeProductSelectionActiveChange changeProductSelectionActiveChange = builder.buildUnchecked();
        Assertions.assertThat(changeProductSelectionActiveChange)
                .isInstanceOf(ChangeProductSelectionActiveChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeProductSelectionActiveChange.builder().change("change") },
                new Object[] { ChangeProductSelectionActiveChange.builder()
                        .productSelection(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { ChangeProductSelectionActiveChange.builder().previousValue(true) },
                new Object[] { ChangeProductSelectionActiveChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        ChangeProductSelectionActiveChange value = ChangeProductSelectionActiveChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void productSelection() {
        ChangeProductSelectionActiveChange value = ChangeProductSelectionActiveChange.of();
        value.setProductSelection(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void previousValue() {
        ChangeProductSelectionActiveChange value = ChangeProductSelectionActiveChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeProductSelectionActiveChange value = ChangeProductSelectionActiveChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
