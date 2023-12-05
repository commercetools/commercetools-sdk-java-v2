
package com.commercetools.api.models.message;

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
public class StandalonePriceExternalDiscountSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceExternalDiscountSetMessageBuilder builder) {
        StandalonePriceExternalDiscountSetMessage standalonePriceExternalDiscountSetMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceExternalDiscountSetMessage)
                .isInstanceOf(StandalonePriceExternalDiscountSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceExternalDiscountSetMessage.builder()
                .discounted(new com.commercetools.api.models.common.DiscountedPriceImpl()) } };
    }

    @Test
    public void discounted() {
        StandalonePriceExternalDiscountSetMessage value = StandalonePriceExternalDiscountSetMessage.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceImpl());
    }
}
