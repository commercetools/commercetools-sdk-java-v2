
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
public class AttributeDefinitionAlreadyExistsErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeDefinitionAlreadyExistsErrorBuilder builder) {
        AttributeDefinitionAlreadyExistsError attributeDefinitionAlreadyExistsError = builder.buildUnchecked();
        Assertions.assertThat(attributeDefinitionAlreadyExistsError)
                .isInstanceOf(AttributeDefinitionAlreadyExistsError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeDefinitionAlreadyExistsError.builder().message("message") },
                new Object[] { AttributeDefinitionAlreadyExistsError.builder()
                        .conflictingProductTypeId("conflictingProductTypeId") },
                new Object[] { AttributeDefinitionAlreadyExistsError.builder()
                        .conflictingProductTypeName("conflictingProductTypeName") },
                new Object[] { AttributeDefinitionAlreadyExistsError.builder()
                        .conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void message() {
        AttributeDefinitionAlreadyExistsError value = AttributeDefinitionAlreadyExistsError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingProductTypeId() {
        AttributeDefinitionAlreadyExistsError value = AttributeDefinitionAlreadyExistsError.of();
        value.setConflictingProductTypeId("conflictingProductTypeId");
        Assertions.assertThat(value.getConflictingProductTypeId()).isEqualTo("conflictingProductTypeId");
    }

    @Test
    public void conflictingProductTypeName() {
        AttributeDefinitionAlreadyExistsError value = AttributeDefinitionAlreadyExistsError.of();
        value.setConflictingProductTypeName("conflictingProductTypeName");
        Assertions.assertThat(value.getConflictingProductTypeName()).isEqualTo("conflictingProductTypeName");
    }

    @Test
    public void conflictingAttributeName() {
        AttributeDefinitionAlreadyExistsError value = AttributeDefinitionAlreadyExistsError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
