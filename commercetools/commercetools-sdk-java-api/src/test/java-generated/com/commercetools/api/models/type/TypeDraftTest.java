
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
public class TypeDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeDraftBuilder builder) {
        TypeDraft typeDraft = builder.buildUnchecked();
        Assertions.assertThat(typeDraft).isInstanceOf(TypeDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeDraft.builder().key("key") },
                new Object[] {
                        TypeDraft.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { TypeDraft.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { TypeDraft.builder()
                        .resourceTypeIds(Collections
                                .singletonList(com.commercetools.api.models.type.ResourceTypeId.findEnum("address"))) },
                new Object[] { TypeDraft.builder()
                        .fieldDefinitions(
                            Collections.singletonList(new com.commercetools.api.models.type.FieldDefinitionImpl())) } };
    }

    @Test
    public void key() {
        TypeDraft value = TypeDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        TypeDraft value = TypeDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        TypeDraft value = TypeDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void resourceTypeIds() {
        TypeDraft value = TypeDraft.of();
        value.setResourceTypeIds(
            Collections.singletonList(com.commercetools.api.models.type.ResourceTypeId.findEnum("address")));
        Assertions.assertThat(value.getResourceTypeIds())
                .isEqualTo(
                    Collections.singletonList(com.commercetools.api.models.type.ResourceTypeId.findEnum("address")));
    }

    @Test
    public void fieldDefinitions() {
        TypeDraft value = TypeDraft.of();
        value.setFieldDefinitions(
            Collections.singletonList(new com.commercetools.api.models.type.FieldDefinitionImpl()));
        Assertions.assertThat(value.getFieldDefinitions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.type.FieldDefinitionImpl()));
    }
}
