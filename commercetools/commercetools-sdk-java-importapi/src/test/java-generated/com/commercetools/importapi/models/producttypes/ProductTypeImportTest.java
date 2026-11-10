
package com.commercetools.importapi.models.producttypes;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeImportBuilder builder) {
        ProductTypeImport productTypeImport = builder.buildUnchecked();
        Assertions.assertThat(productTypeImport).isInstanceOf(ProductTypeImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductTypeImport.builder().key("key") },
                new Object[] { "name", ProductTypeImport.builder().name("name") },
                new Object[] { "description", ProductTypeImport.builder().description("description") },
                new Object[] { "attributes",
                        ProductTypeImport.builder()
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
