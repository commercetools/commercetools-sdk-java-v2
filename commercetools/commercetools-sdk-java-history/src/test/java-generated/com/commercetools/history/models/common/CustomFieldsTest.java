
package com.commercetools.history.models.common;

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
public class CustomFieldsTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomFieldsBuilder builder) {
        CustomFields customFields = builder.buildUnchecked();
        Assertions.assertThat(customFields).isInstanceOf(CustomFields.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        CustomFields.builder().type(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { CustomFields.builder().fields("fields") } };
    }

    @Test
    public void type() {
        CustomFields value = CustomFields.of();
        value.setType(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getType()).isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void fields() {
        CustomFields value = CustomFields.of();
        value.setFields("fields");
        Assertions.assertThat(value.getFields()).isEqualTo("fields");
    }
}
