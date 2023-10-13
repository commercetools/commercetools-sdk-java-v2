
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
public class RemoveInheritedAssociateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveInheritedAssociateChangeBuilder builder) {
        RemoveInheritedAssociateChange removeInheritedAssociateChange = builder.buildUnchecked();
        Assertions.assertThat(removeInheritedAssociateChange).isInstanceOf(RemoveInheritedAssociateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveInheritedAssociateChange.builder().change("change") },
                new Object[] { RemoveInheritedAssociateChange.builder()
                        .previousValue(new com.commercetools.history.models.common.InheritedAssociateImpl()) } };
    }

    @Test
    public void change() {
        RemoveInheritedAssociateChange value = RemoveInheritedAssociateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveInheritedAssociateChange value = RemoveInheritedAssociateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.InheritedAssociateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.InheritedAssociateImpl());
    }
}
