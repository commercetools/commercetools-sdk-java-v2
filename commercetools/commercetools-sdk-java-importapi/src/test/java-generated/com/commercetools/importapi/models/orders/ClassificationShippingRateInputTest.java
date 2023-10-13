
package com.commercetools.importapi.models.orders;

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
public class ClassificationShippingRateInputTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ClassificationShippingRateInputBuilder builder) {
        ClassificationShippingRateInput classificationShippingRateInput = builder.buildUnchecked();
        Assertions.assertThat(classificationShippingRateInput).isInstanceOf(ClassificationShippingRateInput.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ClassificationShippingRateInput.builder().key("key") },
                new Object[] { ClassificationShippingRateInput.builder()
                        .label(new com.commercetools.importapi.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void key() {
        ClassificationShippingRateInput value = ClassificationShippingRateInput.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        ClassificationShippingRateInput value = ClassificationShippingRateInput.of();
        value.setLabel(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }
}
