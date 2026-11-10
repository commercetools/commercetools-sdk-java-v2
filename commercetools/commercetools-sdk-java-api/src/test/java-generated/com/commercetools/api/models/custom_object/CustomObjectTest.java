
package com.commercetools.api.models.custom_object;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomObjectTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomObjectBuilder builder) {
        CustomObject customObject = builder.buildUnchecked();
        Assertions.assertThat(customObject).isInstanceOf(CustomObject.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CustomObject.builder().id("id") },
                new Object[] { "version", CustomObject.builder().version(2L) },
                new Object[] { "createdAt",
                        CustomObject.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        CustomObject.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        CustomObject.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        CustomObject.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "container", CustomObject.builder().container("container") },
                new Object[] { "key", CustomObject.builder().key("key") },
                new Object[] { "value", CustomObject.builder().value("value") } };
    }

    @Test
    public void id() {
        CustomObject value = CustomObject.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        CustomObject value = CustomObject.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        CustomObject value = CustomObject.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        CustomObject value = CustomObject.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        CustomObject value = CustomObject.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        CustomObject value = CustomObject.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void container() {
        CustomObject value = CustomObject.of();
        value.setContainer("container");
        Assertions.assertThat(value.getContainer()).isEqualTo("container");
    }

    @Test
    public void key() {
        CustomObject value = CustomObject.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void value() {
        CustomObject value = CustomObject.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
