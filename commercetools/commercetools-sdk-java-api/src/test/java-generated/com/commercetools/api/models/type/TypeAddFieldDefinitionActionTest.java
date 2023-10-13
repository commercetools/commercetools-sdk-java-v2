
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
public class TypeAddFieldDefinitionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeAddFieldDefinitionActionBuilder builder) {
        TypeAddFieldDefinitionAction typeAddFieldDefinitionAction = builder.buildUnchecked();
        Assertions.assertThat(typeAddFieldDefinitionAction).isInstanceOf(TypeAddFieldDefinitionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeAddFieldDefinitionAction.builder()
                .fieldDefinition(new com.commercetools.api.models.type.FieldDefinitionImpl()) } };
    }

    @Test
    public void fieldDefinition() {
        TypeAddFieldDefinitionAction value = TypeAddFieldDefinitionAction.of();
        value.setFieldDefinition(new com.commercetools.api.models.type.FieldDefinitionImpl());
        Assertions.assertThat(value.getFieldDefinition())
                .isEqualTo(new com.commercetools.api.models.type.FieldDefinitionImpl());
    }
}
