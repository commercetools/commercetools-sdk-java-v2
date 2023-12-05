
package com.commercetools.history.models.label;

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
public class CustomObjectLabelTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomObjectLabelBuilder builder) {
        CustomObjectLabel customObjectLabel = builder.buildUnchecked();
        Assertions.assertThat(customObjectLabel).isInstanceOf(CustomObjectLabel.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomObjectLabel.builder().key("key") },
                new Object[] { CustomObjectLabel.builder().container("container") } };
    }

    @Test
    public void key() {
        CustomObjectLabel value = CustomObjectLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void container() {
        CustomObjectLabel value = CustomObjectLabel.of();
        value.setContainer("container");
        Assertions.assertThat(value.getContainer()).isEqualTo("container");
    }
}
