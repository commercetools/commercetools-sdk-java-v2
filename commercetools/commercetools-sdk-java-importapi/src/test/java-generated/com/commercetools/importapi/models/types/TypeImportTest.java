
package com.commercetools.importapi.models.types;

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
public class TypeImportTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeImportBuilder builder) {
        TypeImport typeImport = builder.buildUnchecked();
        Assertions.assertThat(typeImport).isInstanceOf(TypeImport.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeImport.builder().key("key") },
                new Object[] { TypeImport.builder()
                        .name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { TypeImport.builder()
                        .description(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { TypeImport.builder()
                        .resourceTypeIds(Collections.singletonList(
                            com.commercetools.importapi.models.types.ResourceTypeId.findEnum("address"))) },
                new Object[] { TypeImport.builder()
                        .fieldDefinitions(Collections
                                .singletonList(new com.commercetools.importapi.models.types.FieldDefinitionImpl())) } };
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
