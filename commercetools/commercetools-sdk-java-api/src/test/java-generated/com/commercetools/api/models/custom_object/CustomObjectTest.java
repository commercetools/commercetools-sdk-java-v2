
package com.commercetools.api.models.custom_object;

import java.time.ZonedDateTime;

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
public class CustomObjectTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomObjectBuilder builder) {
        CustomObject customObject = builder.buildUnchecked();
        Assertions.assertThat(customObject).isInstanceOf(CustomObject.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomObject.builder().id("id") },
                new Object[] { CustomObject.builder().version(2L) },
                new Object[] { CustomObject.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { CustomObject.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { CustomObject.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] {
                        CustomObject.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { CustomObject.builder().container("container") },
                new Object[] { CustomObject.builder().key("key") },
                new Object[] { CustomObject.builder().value("value") } };
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
