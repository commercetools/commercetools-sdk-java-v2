
package com.commercetools.api.models.event;

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
public class ImportUnresolvedEventDataTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportUnresolvedEventDataBuilder builder) {
        ImportUnresolvedEventData importUnresolvedEventData = builder.buildUnchecked();
        Assertions.assertThat(importUnresolvedEventData).isInstanceOf(ImportUnresolvedEventData.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportUnresolvedEventData.builder().id("id") },
                new Object[] { ImportUnresolvedEventData.builder().version(2) },
                new Object[] { ImportUnresolvedEventData.builder().importContainerKey("importContainerKey") } };
    }

    @Test
    public void id() {
        ImportUnresolvedEventData value = ImportUnresolvedEventData.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ImportUnresolvedEventData value = ImportUnresolvedEventData.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void importContainerKey() {
        ImportUnresolvedEventData value = ImportUnresolvedEventData.of();
        value.setImportContainerKey("importContainerKey");
        Assertions.assertThat(value.getImportContainerKey()).isEqualTo("importContainerKey");
    }
}
