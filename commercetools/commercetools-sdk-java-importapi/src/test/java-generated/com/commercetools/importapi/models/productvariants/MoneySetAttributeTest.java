
package com.commercetools.importapi.models.productvariants;

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
public class MoneySetAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MoneySetAttributeBuilder builder) {
        MoneySetAttribute moneySetAttribute = builder.buildUnchecked();
        Assertions.assertThat(moneySetAttribute).isInstanceOf(MoneySetAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MoneySetAttribute.builder()
                .value(Collections.singletonList(new com.commercetools.importapi.models.common.TypedMoneyImpl())) } };
    }

    @Test
    public void value() {
        MoneySetAttribute value = MoneySetAttribute.of();
        value.setValue(Collections.singletonList(new com.commercetools.importapi.models.common.TypedMoneyImpl()));
        Assertions.assertThat(value.getValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.TypedMoneyImpl()));
    }
}
