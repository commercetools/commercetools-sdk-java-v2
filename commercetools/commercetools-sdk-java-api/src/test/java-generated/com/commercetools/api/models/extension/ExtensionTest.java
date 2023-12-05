
package com.commercetools.api.models.extension;

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
public class ExtensionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExtensionBuilder builder) {
        Extension extension = builder.buildUnchecked();
        Assertions.assertThat(extension).isInstanceOf(Extension.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Extension.builder().id("id") },
                new Object[] { Extension.builder().version(2L) },
                new Object[] { Extension.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { Extension.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { Extension.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { Extension.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { Extension.builder().key("key") },
                new Object[] { Extension.builder()
                        .destination(new com.commercetools.api.models.extension.ExtensionDestinationImpl()) },
                new Object[] { Extension.builder()
                        .triggers(Collections
                                .singletonList(new com.commercetools.api.models.extension.ExtensionTriggerImpl())) },
                new Object[] { Extension.builder().timeoutInMs(6) } };
    }

    @Test
    public void id() {
        Extension value = Extension.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Extension value = Extension.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        Extension value = Extension.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Extension value = Extension.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Extension value = Extension.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Extension value = Extension.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        Extension value = Extension.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void destination() {
        Extension value = Extension.of();
        value.setDestination(new com.commercetools.api.models.extension.ExtensionDestinationImpl());
        Assertions.assertThat(value.getDestination())
                .isEqualTo(new com.commercetools.api.models.extension.ExtensionDestinationImpl());
    }

    @Test
    public void triggers() {
        Extension value = Extension.of();
        value.setTriggers(Collections.singletonList(new com.commercetools.api.models.extension.ExtensionTriggerImpl()));
        Assertions.assertThat(value.getTriggers())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.extension.ExtensionTriggerImpl()));
    }

    @Test
    public void timeoutInMs() {
        Extension value = Extension.of();
        value.setTimeoutInMs(6);
        Assertions.assertThat(value.getTimeoutInMs()).isEqualTo(6);
    }
}
