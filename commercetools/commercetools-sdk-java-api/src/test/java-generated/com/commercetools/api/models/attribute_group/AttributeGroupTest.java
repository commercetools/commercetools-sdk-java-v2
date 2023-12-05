
package com.commercetools.api.models.attribute_group;

import java.time.ZonedDateTime;
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
public class AttributeGroupTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeGroupBuilder builder) {
        AttributeGroup attributeGroup = builder.buildUnchecked();
        Assertions.assertThat(attributeGroup).isInstanceOf(AttributeGroup.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeGroup.builder().id("id") },
                new Object[] { AttributeGroup.builder().version(2L) },
                new Object[] { AttributeGroup.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { AttributeGroup.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { AttributeGroup.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] {
                        AttributeGroup.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] {
                        AttributeGroup.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { AttributeGroup.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { AttributeGroup.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.api.models.attribute_group.AttributeReferenceImpl())) },
                new Object[] { AttributeGroup.builder().key("key") } };
    }

    @Test
    public void id() {
        AttributeGroup value = AttributeGroup.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        AttributeGroup value = AttributeGroup.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        AttributeGroup value = AttributeGroup.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        AttributeGroup value = AttributeGroup.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        AttributeGroup value = AttributeGroup.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        AttributeGroup value = AttributeGroup.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void name() {
        AttributeGroup value = AttributeGroup.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        AttributeGroup value = AttributeGroup.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void attributes() {
        AttributeGroup value = AttributeGroup.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()));
    }

    @Test
    public void key() {
        AttributeGroup value = AttributeGroup.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
