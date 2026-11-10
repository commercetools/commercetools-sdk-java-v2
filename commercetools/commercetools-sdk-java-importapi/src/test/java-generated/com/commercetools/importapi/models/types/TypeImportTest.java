
package com.commercetools.importapi.models.types;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeImportBuilder builder) {
        TypeImport typeImport = builder.buildUnchecked();
        Assertions.assertThat(typeImport).isInstanceOf(TypeImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", TypeImport.builder().key("key") },
                new Object[] { "name",
                        TypeImport.builder()
                                .name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        TypeImport.builder()
                                .description(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "resourceTypeIds",
                        TypeImport.builder()
                                .resourceTypeIds(Collections.singletonList(
                                    com.commercetools.importapi.models.types.ResourceTypeId.findEnum("address"))) },
                new Object[] { "fieldDefinitions",
                        TypeImport.builder()
                                .fieldDefinitions(Collections.singletonList(
                                    new com.commercetools.importapi.models.types.FieldDefinitionImpl())) } };
    }

    @Test
    public void key() {
        TypeImport value = TypeImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        TypeImport value = TypeImport.of();
        value.setName(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        TypeImport value = TypeImport.of();
        value.setDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void resourceTypeIds() {
        TypeImport value = TypeImport.of();
        value.setResourceTypeIds(
            Collections.singletonList(com.commercetools.importapi.models.types.ResourceTypeId.findEnum("address")));
        Assertions.assertThat(value.getResourceTypeIds())
                .isEqualTo(Collections
                        .singletonList(com.commercetools.importapi.models.types.ResourceTypeId.findEnum("address")));
    }

    @Test
    public void fieldDefinitions() {
        TypeImport value = TypeImport.of();
        value.setFieldDefinitions(
            Collections.singletonList(new com.commercetools.importapi.models.types.FieldDefinitionImpl()));
        Assertions.assertThat(value.getFieldDefinitions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.types.FieldDefinitionImpl()));
    }
}
