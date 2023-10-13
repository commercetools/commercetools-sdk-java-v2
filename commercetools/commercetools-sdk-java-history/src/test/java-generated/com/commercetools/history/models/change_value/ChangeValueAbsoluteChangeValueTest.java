
package com.commercetools.history.models.change_value;

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
public class ChangeValueAbsoluteChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeValueAbsoluteChangeValueBuilder builder) {
        ChangeValueAbsoluteChangeValue changeValueAbsoluteChangeValue = builder.buildUnchecked();
        Assertions.assertThat(changeValueAbsoluteChangeValue).isInstanceOf(ChangeValueAbsoluteChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeValueAbsoluteChangeValue.builder()
                .money(Collections.singletonList(new com.commercetools.history.models.common.MoneyImpl())) } };
    }

    @Test
    public void money() {
        ChangeValueAbsoluteChangeValue value = ChangeValueAbsoluteChangeValue.of();
        value.setMoney(Collections.singletonList(new com.commercetools.history.models.common.MoneyImpl()));
        Assertions.assertThat(value.getMoney())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.MoneyImpl()));
    }
}
