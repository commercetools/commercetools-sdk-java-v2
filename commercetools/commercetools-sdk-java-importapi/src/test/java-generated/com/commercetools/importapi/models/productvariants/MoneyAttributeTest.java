
package com.commercetools.importapi.models.productvariants;

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
public class MoneyAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MoneyAttributeBuilder builder) {
        MoneyAttribute moneyAttribute = builder.buildUnchecked();
        Assertions.assertThat(moneyAttribute).isInstanceOf(MoneyAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                MoneyAttribute.builder().value(new com.commercetools.importapi.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void value() {
        MoneyAttribute value = MoneyAttribute.of();
        value.setValue(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }
}
