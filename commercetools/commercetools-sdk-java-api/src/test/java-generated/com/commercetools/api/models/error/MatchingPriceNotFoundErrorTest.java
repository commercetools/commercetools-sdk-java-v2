
package com.commercetools.api.models.error;

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
public class MatchingPriceNotFoundErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MatchingPriceNotFoundErrorBuilder builder) {
        MatchingPriceNotFoundError matchingPriceNotFoundError = builder.buildUnchecked();
        Assertions.assertThat(matchingPriceNotFoundError).isInstanceOf(MatchingPriceNotFoundError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MatchingPriceNotFoundError.builder().message("message") },
                new Object[] { MatchingPriceNotFoundError.builder().productId("productId") },
                new Object[] { MatchingPriceNotFoundError.builder().variantId(5) },
                new Object[] { MatchingPriceNotFoundError.builder().currency("currency") },
                new Object[] { MatchingPriceNotFoundError.builder().country("country") },
                new Object[] { MatchingPriceNotFoundError.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { MatchingPriceNotFoundError.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void message() {
        MatchingPriceNotFoundError value = MatchingPriceNotFoundError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void productId() {
        MatchingPriceNotFoundError value = MatchingPriceNotFoundError.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void variantId() {
        MatchingPriceNotFoundError value = MatchingPriceNotFoundError.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void currency() {
        MatchingPriceNotFoundError value = MatchingPriceNotFoundError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        MatchingPriceNotFoundError value = MatchingPriceNotFoundError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        MatchingPriceNotFoundError value = MatchingPriceNotFoundError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void channel() {
        MatchingPriceNotFoundError value = MatchingPriceNotFoundError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
