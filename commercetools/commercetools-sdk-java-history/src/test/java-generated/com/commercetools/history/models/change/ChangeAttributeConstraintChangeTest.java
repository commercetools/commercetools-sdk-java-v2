
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
public class ChangeAttributeConstraintChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeAttributeConstraintChangeBuilder builder) {
        ChangeAttributeConstraintChange changeAttributeConstraintChange = builder.buildUnchecked();
        Assertions.assertThat(changeAttributeConstraintChange).isInstanceOf(ChangeAttributeConstraintChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeAttributeConstraintChange.builder().change("change") },
                new Object[] { ChangeAttributeConstraintChange.builder()
                        .previousValue(
                            com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None")) },
                new Object[] { ChangeAttributeConstraintChange.builder()
                        .nextValue(com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None")) },
                new Object[] { ChangeAttributeConstraintChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        ChangeAttributeConstraintChange value = ChangeAttributeConstraintChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAttributeConstraintChange value = ChangeAttributeConstraintChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None"));
    }

    @Test
    public void nextValue() {
        ChangeAttributeConstraintChange value = ChangeAttributeConstraintChange.of();
        value.setNextValue(com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None"));
    }

    @Test
    public void attributeName() {
        ChangeAttributeConstraintChange value = ChangeAttributeConstraintChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
