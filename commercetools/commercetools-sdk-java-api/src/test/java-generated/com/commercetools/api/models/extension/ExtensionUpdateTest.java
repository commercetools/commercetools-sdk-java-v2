
package com.commercetools.api.models.extension;

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
public class ExtensionUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExtensionUpdateBuilder builder) {
        ExtensionUpdate extensionUpdate = builder.buildUnchecked();
        Assertions.assertThat(extensionUpdate).isInstanceOf(ExtensionUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ExtensionUpdate.builder().version(2L) },
                new Object[] { ExtensionUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.extension.ExtensionUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ExtensionUpdate value = ExtensionUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ExtensionUpdate value = ExtensionUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.extension.ExtensionUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.extension.ExtensionUpdateActionImpl()));
    }
}
