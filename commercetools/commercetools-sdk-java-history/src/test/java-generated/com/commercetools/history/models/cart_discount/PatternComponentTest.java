
package com.commercetools.history.models.cart_discount;

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
public class PatternComponentTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PatternComponentBuilder builder) {
        PatternComponent patternComponent = builder.buildUnchecked();
        Assertions.assertThat(patternComponent).isInstanceOf(PatternComponent.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PatternComponent.builder().type("type") } };
    }

    @Test
    public void type() {
        PatternComponent value = PatternComponent.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }
}
