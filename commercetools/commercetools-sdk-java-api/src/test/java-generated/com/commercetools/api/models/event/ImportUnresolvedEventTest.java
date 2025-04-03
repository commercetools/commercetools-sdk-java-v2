
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
public class ImportUnresolvedEventTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportUnresolvedEventBuilder builder) {
        ImportUnresolvedEvent importUnresolvedEvent = builder.buildUnchecked();
        Assertions.assertThat(importUnresolvedEvent).isInstanceOf(ImportUnresolvedEvent.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ImportUnresolvedEvent.builder()
                        .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                .findEnum("import-api")) },
                new Object[] { ImportUnresolvedEvent.builder()
                        .data(new com.commercetools.api.models.event.ImportUnresolvedEventDataImpl()) } };
    }

    @Test
    public void resourceType() {
        ImportUnresolvedEvent value = ImportUnresolvedEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
    }

    @Test
    public void data() {
        ImportUnresolvedEvent value = ImportUnresolvedEvent.of();
        value.setData(new com.commercetools.api.models.event.ImportUnresolvedEventDataImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.event.ImportUnresolvedEventDataImpl());
    }
}
