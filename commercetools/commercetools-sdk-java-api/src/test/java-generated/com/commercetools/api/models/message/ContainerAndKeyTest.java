
package com.commercetools.api.models.message;

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
public class ContainerAndKeyTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ContainerAndKeyBuilder builder) {
        ContainerAndKey containerAndKey = builder.buildUnchecked();
        Assertions.assertThat(containerAndKey).isInstanceOf(ContainerAndKey.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ContainerAndKey.builder().key("key") },
                new Object[] { ContainerAndKey.builder().container("container") } };
    }

    @Test
    public void key() {
        ContainerAndKey value = ContainerAndKey.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void container() {
        ContainerAndKey value = ContainerAndKey.of();
        value.setContainer("container");
        Assertions.assertThat(value.getContainer()).isEqualTo("container");
    }
}
