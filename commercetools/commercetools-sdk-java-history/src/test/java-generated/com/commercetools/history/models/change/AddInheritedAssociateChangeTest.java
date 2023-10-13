
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
public class AddInheritedAssociateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddInheritedAssociateChangeBuilder builder) {
        AddInheritedAssociateChange addInheritedAssociateChange = builder.buildUnchecked();
        Assertions.assertThat(addInheritedAssociateChange).isInstanceOf(AddInheritedAssociateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddInheritedAssociateChange.builder().change("change") },
                new Object[] { AddInheritedAssociateChange.builder()
                        .nextValue(new com.commercetools.history.models.common.InheritedAssociateImpl()) } };
    }

    @Test
    public void change() {
        AddInheritedAssociateChange value = AddInheritedAssociateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddInheritedAssociateChange value = AddInheritedAssociateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.InheritedAssociateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.InheritedAssociateImpl());
    }
}
