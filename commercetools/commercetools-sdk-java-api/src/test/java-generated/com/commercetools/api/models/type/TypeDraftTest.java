
package com.commercetools.api.models.type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeDraftBuilder builder) {
        TypeDraft typeDraft = builder.buildUnchecked();
        Assertions.assertThat(typeDraft).isInstanceOf(TypeDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", TypeDraft.builder().key("key") },
                new Object[] { "name",
                        TypeDraft.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        TypeDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "resourceTypeIds",
                        TypeDraft.builder()
                                .resourceTypeIds(Collections.singletonList(
                                    com.commercetools.api.models.type.ResourceTypeId.findEnum("address"))) },
                new Object[] { "fieldDefinitions", TypeDraft.builder()
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
