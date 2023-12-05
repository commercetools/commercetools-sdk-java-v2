
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
public class StandalonePriceChangeActiveActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceChangeActiveActionBuilder builder) {
        StandalonePriceChangeActiveAction standalonePriceChangeActiveAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceChangeActiveAction).isInstanceOf(StandalonePriceChangeActiveAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceChangeActiveAction.builder().active(true) } };
    }

    @Test
    public void active() {
        StandalonePriceChangeActiveAction value = StandalonePriceChangeActiveAction.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }
}
