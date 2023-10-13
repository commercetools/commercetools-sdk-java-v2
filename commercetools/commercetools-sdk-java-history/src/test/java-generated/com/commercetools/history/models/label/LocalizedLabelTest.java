
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
public class LocalizedLabelTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LocalizedLabelBuilder builder) {
        LocalizedLabel localizedLabel = builder.buildUnchecked();
        Assertions.assertThat(localizedLabel).isInstanceOf(LocalizedLabel.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                LocalizedLabel.builder().value(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void value() {
        LocalizedLabel value = LocalizedLabel.of();
        value.setValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
