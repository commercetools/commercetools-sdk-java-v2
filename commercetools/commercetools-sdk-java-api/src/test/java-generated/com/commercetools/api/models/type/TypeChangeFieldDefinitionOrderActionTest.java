
package com.commercetools.api.models.type;

import java.util.Collections;

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
public class TypeChangeFieldDefinitionOrderActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeChangeFieldDefinitionOrderActionBuilder builder) {
        TypeChangeFieldDefinitionOrderAction typeChangeFieldDefinitionOrderAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeFieldDefinitionOrderAction)
                .isInstanceOf(TypeChangeFieldDefinitionOrderAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                TypeChangeFieldDefinitionOrderAction.builder().fieldNames(Collections.singletonList("fieldNames")) } };
    }

    @Test
    public void fieldNames() {
        TypeChangeFieldDefinitionOrderAction value = TypeChangeFieldDefinitionOrderAction.of();
        value.setFieldNames(Collections.singletonList("fieldNames"));
        Assertions.assertThat(value.getFieldNames()).isEqualTo(Collections.singletonList("fieldNames"));
    }
}
