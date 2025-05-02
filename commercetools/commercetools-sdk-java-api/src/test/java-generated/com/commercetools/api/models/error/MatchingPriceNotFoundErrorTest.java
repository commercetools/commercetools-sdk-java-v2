
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MatchingPriceNotFoundErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MatchingPriceNotFoundErrorBuilder builder) {
        MatchingPriceNotFoundError matchingPriceNotFoundError = builder.buildUnchecked();
        Assertions.assertThat(matchingPriceNotFoundError).isInstanceOf(MatchingPriceNotFoundError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", MatchingPriceNotFoundError.builder().message("message") },
                new Object[] { "productId", MatchingPriceNotFoundError.builder().productId("productId") },
                new Object[] { "variantId", MatchingPriceNotFoundError.builder().variantId(5) },
                new Object[] { "currency", MatchingPriceNotFoundError.builder().currency("currency") },
                new Object[] { "country", MatchingPriceNotFoundError.builder().country("country") },
                new Object[] { "customerGroup", MatchingPriceNotFoundError.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { "channel", MatchingPriceNotFoundError.builder()
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
