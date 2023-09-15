
package com.commercetools.api.models.error;

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
public class ErrorByExtensionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ErrorByExtensionBuilder builder) {
        ErrorByExtension errorByExtension = builder.buildUnchecked();
        Assertions.assertThat(errorByExtension).isInstanceOf(ErrorByExtension.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ErrorByExtension.builder().id("id") },
                new Object[] { ErrorByExtension.builder().key("key") } };
    }

    @Test
    public void id() {
        ErrorByExtension value = ErrorByExtension.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ErrorByExtension value = ErrorByExtension.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
