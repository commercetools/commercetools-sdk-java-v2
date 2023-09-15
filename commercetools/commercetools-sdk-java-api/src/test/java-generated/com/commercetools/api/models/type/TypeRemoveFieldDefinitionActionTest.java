
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
public class TypeRemoveFieldDefinitionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeRemoveFieldDefinitionActionBuilder builder) {
        TypeRemoveFieldDefinitionAction typeRemoveFieldDefinitionAction = builder.buildUnchecked();
        Assertions.assertThat(typeRemoveFieldDefinitionAction).isInstanceOf(TypeRemoveFieldDefinitionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeRemoveFieldDefinitionAction.builder().fieldName("fieldName") } };
    }

    @Test
    public void fieldName() {
        TypeRemoveFieldDefinitionAction value = TypeRemoveFieldDefinitionAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }
}
