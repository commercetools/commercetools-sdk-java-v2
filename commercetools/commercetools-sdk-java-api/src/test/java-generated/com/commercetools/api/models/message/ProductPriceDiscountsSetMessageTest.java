
package com.commercetools.api.models.message;

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
public class ProductPriceDiscountsSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceDiscountsSetMessageBuilder builder) {
        ProductPriceDiscountsSetMessage productPriceDiscountsSetMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceDiscountsSetMessage).isInstanceOf(ProductPriceDiscountsSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceDiscountsSetMessage.builder()
                .updatedPrices(Collections.singletonList(
                    new com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl())) } };
    }

    @Test
    public void updatedPrices() {
        ProductPriceDiscountsSetMessage value = ProductPriceDiscountsSetMessage.of();
        value.setUpdatedPrices(Collections
                .singletonList(new com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl()));
        Assertions.assertThat(value.getUpdatedPrices())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl()));
    }
}
