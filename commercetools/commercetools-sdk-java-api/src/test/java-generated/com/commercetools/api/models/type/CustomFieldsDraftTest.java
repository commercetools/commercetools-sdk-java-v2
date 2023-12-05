
package com.commercetools.api.models.type;

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
public class CustomFieldsDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomFieldsDraftBuilder builder) {
        CustomFieldsDraft customFieldsDraft = builder.buildUnchecked();
        Assertions.assertThat(customFieldsDraft).isInstanceOf(CustomFieldsDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomFieldsDraft.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { CustomFieldsDraft.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void type() {
        CustomFieldsDraft value = CustomFieldsDraft.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        CustomFieldsDraft value = CustomFieldsDraft.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
