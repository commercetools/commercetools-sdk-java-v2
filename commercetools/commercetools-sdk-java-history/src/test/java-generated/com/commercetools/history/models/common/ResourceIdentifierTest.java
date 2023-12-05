
package com.commercetools.history.models.common;

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
public class ResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ResourceIdentifierBuilder builder) {
        ResourceIdentifier resourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(resourceIdentifier).isInstanceOf(ResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ResourceIdentifier.builder().id("id") },
                new Object[] { ResourceIdentifier.builder().key("key") }, new Object[] { ResourceIdentifier.builder()
                        .typeId(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role")) } };
    }

    @Test
    public void id() {
        ResourceIdentifier value = ResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ResourceIdentifier value = ResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void typeId() {
        ResourceIdentifier value = ResourceIdentifier.of();
        value.setTypeId(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role"));
        Assertions.assertThat(value.getTypeId())
                .isEqualTo(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role"));
    }
}
