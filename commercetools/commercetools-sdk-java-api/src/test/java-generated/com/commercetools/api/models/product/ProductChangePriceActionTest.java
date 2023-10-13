
package com.commercetools.api.models.product;

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
public class ProductChangePriceActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductChangePriceActionBuilder builder) {
        ProductChangePriceAction productChangePriceAction = builder.buildUnchecked();
        Assertions.assertThat(productChangePriceAction).isInstanceOf(ProductChangePriceAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductChangePriceAction.builder().priceId("priceId") },
                new Object[] { ProductChangePriceAction.builder()
                        .price(new com.commercetools.api.models.common.PriceDraftImpl()) },
                new Object[] { ProductChangePriceAction.builder().staged(true) } };
    }

    @Test
    public void priceId() {
        ProductChangePriceAction value = ProductChangePriceAction.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void price() {
        ProductChangePriceAction value = ProductChangePriceAction.of();
        value.setPrice(new com.commercetools.api.models.common.PriceDraftImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.PriceDraftImpl());
    }

    @Test
    public void staged() {
        ProductChangePriceAction value = ProductChangePriceAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
