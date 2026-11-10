
package com.commercetools.api.models.type;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeBuilder builder) {
        Type type = builder.buildUnchecked();
        Assertions.assertThat(type).isInstanceOf(Type.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Type.builder().id("id") },
                new Object[] { "version", Type.builder().version(2L) },
                new Object[] { "createdAt", Type.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        Type.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        Type.builder().lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        Type.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "key", Type.builder().key("key") },
                new Object[] { "name",
                        Type.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        Type.builder().description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "resourceTypeIds",
                        Type.builder()
                                .resourceTypeIds(Collections.singletonList(
                                    com.commercetools.api.models.type.ResourceTypeId.findEnum("address"))) },
                new Object[] { "fieldDefinitions", Type.builder()
                        .fieldDefinitions(
                            Collections.singletonList(new com.commercetools.api.models.type.FieldDefinitionImpl())) } };
    }

    @Test
    public void id() {
        Type value = Type.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Type value = Type.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        Type value = Type.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Type value = Type.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Type value = Type.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Type value = Type.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        Type value = Type.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        Type value = Type.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        Type value = Type.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void resourceTypeIds() {
        Type value = Type.of();
        value.setResourceTypeIds(
            Collections.singletonList(com.commercetools.api.models.type.ResourceTypeId.findEnum("address")));
        Assertions.assertThat(value.getResourceTypeIds())
                .isEqualTo(
                    Collections.singletonList(com.commercetools.api.models.type.ResourceTypeId.findEnum("address")));
    }

    @Test
    public void fieldDefinitions() {
        Type value = Type.of();
        value.setFieldDefinitions(
            Collections.singletonList(new com.commercetools.api.models.type.FieldDefinitionImpl()));
        Assertions.assertThat(value.getFieldDefinitions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.type.FieldDefinitionImpl()));
    }
}
