
package com.commercetools.importapi.models.products;

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
public class CustomTokenizerTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomTokenizerBuilder builder) {
        CustomTokenizer customTokenizer = builder.buildUnchecked();
        Assertions.assertThat(customTokenizer).isInstanceOf(CustomTokenizer.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomTokenizer.builder().inputs(Collections.singletonList("inputs")) } };
    }

    @Test
    public void inputs() {
        CustomTokenizer value = CustomTokenizer.of();
        value.setInputs(Collections.singletonList("inputs"));
        Assertions.assertThat(value.getInputs()).isEqualTo(Collections.singletonList("inputs"));
    }
}
