
package com.commercetools.api.models.standalone_price;

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
public class StandalonePriceSetKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceSetKeyActionBuilder builder) {
        StandalonePriceSetKeyAction standalonePriceSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetKeyAction).isInstanceOf(StandalonePriceSetKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        StandalonePriceSetKeyAction value = StandalonePriceSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
