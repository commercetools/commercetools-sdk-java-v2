
package com.commercetools.importapi.models.customfields;

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
public class MoneySetFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MoneySetFieldBuilder builder) {
        MoneySetField moneySetField = builder.buildUnchecked();
        Assertions.assertThat(moneySetField).isInstanceOf(MoneySetField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MoneySetField.builder()
                .value(Collections.singletonList(new com.commercetools.importapi.models.common.MoneyImpl())) } };
    }

    @Test
    public void value() {
        MoneySetField value = MoneySetField.of();
        value.setValue(Collections.singletonList(new com.commercetools.importapi.models.common.MoneyImpl()));
        Assertions.assertThat(value.getValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.MoneyImpl()));
    }
}
