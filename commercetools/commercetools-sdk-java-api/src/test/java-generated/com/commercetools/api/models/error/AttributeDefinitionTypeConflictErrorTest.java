
package com.commercetools.api.models.error;

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
public class AttributeDefinitionTypeConflictErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeDefinitionTypeConflictErrorBuilder builder) {
        AttributeDefinitionTypeConflictError attributeDefinitionTypeConflictError = builder.buildUnchecked();
        Assertions.assertThat(attributeDefinitionTypeConflictError)
                .isInstanceOf(AttributeDefinitionTypeConflictError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeDefinitionTypeConflictError.builder().message("message") },
                new Object[] { AttributeDefinitionTypeConflictError.builder()
                        .conflictingProductTypeId("conflictingProductTypeId") },
                new Object[] { AttributeDefinitionTypeConflictError.builder()
                        .conflictingProductTypeName("conflictingProductTypeName") },
                new Object[] { AttributeDefinitionTypeConflictError.builder()
                        .conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void message() {
        AttributeDefinitionTypeConflictError value = AttributeDefinitionTypeConflictError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingProductTypeId() {
        AttributeDefinitionTypeConflictError value = AttributeDefinitionTypeConflictError.of();
        value.setConflictingProductTypeId("conflictingProductTypeId");
        Assertions.assertThat(value.getConflictingProductTypeId()).isEqualTo("conflictingProductTypeId");
    }

    @Test
    public void conflictingProductTypeName() {
        AttributeDefinitionTypeConflictError value = AttributeDefinitionTypeConflictError.of();
        value.setConflictingProductTypeName("conflictingProductTypeName");
        Assertions.assertThat(value.getConflictingProductTypeName()).isEqualTo("conflictingProductTypeName");
    }

    @Test
    public void conflictingAttributeName() {
        AttributeDefinitionTypeConflictError value = AttributeDefinitionTypeConflictError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
