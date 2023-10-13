
package com.commercetools.api.models.custom_object;

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
public class CustomObjectDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomObjectDraftBuilder builder) {
        CustomObjectDraft customObjectDraft = builder.buildUnchecked();
        Assertions.assertThat(customObjectDraft).isInstanceOf(CustomObjectDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomObjectDraft.builder().container("container") },
                new Object[] { CustomObjectDraft.builder().key("key") },
                new Object[] { CustomObjectDraft.builder().value("value") },
                new Object[] { CustomObjectDraft.builder().version(2L) } };
    }

    @Test
    public void container() {
        CustomObjectDraft value = CustomObjectDraft.of();
        value.setContainer("container");
        Assertions.assertThat(value.getContainer()).isEqualTo("container");
    }

    @Test
    public void key() {
        CustomObjectDraft value = CustomObjectDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void value() {
        CustomObjectDraft value = CustomObjectDraft.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void version() {
        CustomObjectDraft value = CustomObjectDraft.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }
}
