
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
public class TypeChangeEnumValueOrderActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeChangeEnumValueOrderActionBuilder builder) {
        TypeChangeEnumValueOrderAction typeChangeEnumValueOrderAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeEnumValueOrderAction).isInstanceOf(TypeChangeEnumValueOrderAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeChangeEnumValueOrderAction.builder().fieldName("fieldName") },
                new Object[] { TypeChangeEnumValueOrderAction.builder().keys(Collections.singletonList("keys")) } };
    }

    @Test
    public void fieldName() {
        TypeChangeEnumValueOrderAction value = TypeChangeEnumValueOrderAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void keys() {
        TypeChangeEnumValueOrderAction value = TypeChangeEnumValueOrderAction.of();
        value.setKeys(Collections.singletonList("keys"));
        Assertions.assertThat(value.getKeys()).isEqualTo(Collections.singletonList("keys"));
    }
}
