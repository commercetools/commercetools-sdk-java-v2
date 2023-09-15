
package com.commercetools.importapi.models.errors;

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
public class ResourceUpdateErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ResourceUpdateErrorBuilder builder) {
        ResourceUpdateError resourceUpdateError = builder.buildUnchecked();
        Assertions.assertThat(resourceUpdateError).isInstanceOf(ResourceUpdateError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ResourceUpdateError.builder().resource("resource") } };
    }

    @Test
    public void resource() {
        ResourceUpdateError value = ResourceUpdateError.of();
        value.setResource("resource");
        Assertions.assertThat(value.getResource()).isEqualTo("resource");
    }
}
