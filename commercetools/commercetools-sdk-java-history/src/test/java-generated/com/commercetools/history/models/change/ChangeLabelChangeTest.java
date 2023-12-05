
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
public class ChangeLabelChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeLabelChangeBuilder builder) {
        ChangeLabelChange changeLabelChange = builder.buildUnchecked();
        Assertions.assertThat(changeLabelChange).isInstanceOf(ChangeLabelChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeLabelChange.builder().change("change") },
                new Object[] { ChangeLabelChange.builder()
                        .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { ChangeLabelChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { ChangeLabelChange.builder().fieldName("fieldName") },
                new Object[] { ChangeLabelChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        ChangeLabelChange value = ChangeLabelChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeLabelChange value = ChangeLabelChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        ChangeLabelChange value = ChangeLabelChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void fieldName() {
        ChangeLabelChange value = ChangeLabelChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void attributeName() {
        ChangeLabelChange value = ChangeLabelChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
