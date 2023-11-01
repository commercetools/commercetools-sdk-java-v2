
package com.commercetools.importapi.models.producttypes;

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
public class ProductTypeImportTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeImportBuilder builder) {
        ProductTypeImport productTypeImport = builder.buildUnchecked();
        Assertions.assertThat(productTypeImport).isInstanceOf(ProductTypeImport.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTypeImport.builder().key("key") },
                new Object[] { ProductTypeImport.builder().name("name") },
                new Object[] { ProductTypeImport.builder().description("description") },
                new Object[] { ProductTypeImport.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.importapi.models.producttypes.AttributeDefinitionImpl())) } };
    }

    @Test
    public void key() {
        ProductTypeImport value = ProductTypeImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ProductTypeImport value = ProductTypeImport.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        ProductTypeImport value = ProductTypeImport.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void attributes() {
        ProductTypeImport value = ProductTypeImport.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.importapi.models.producttypes.AttributeDefinitionImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.producttypes.AttributeDefinitionImpl()));
    }
}
