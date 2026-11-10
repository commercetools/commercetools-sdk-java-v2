
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLMatchingPriceNotFoundErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLMatchingPriceNotFoundErrorBuilder builder) {
        GraphQLMatchingPriceNotFoundError graphQLMatchingPriceNotFoundError = builder.buildUnchecked();
        Assertions.assertThat(graphQLMatchingPriceNotFoundError).isInstanceOf(GraphQLMatchingPriceNotFoundError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "productId", GraphQLMatchingPriceNotFoundError.builder().productId("productId") },
                new Object[] { "variantId", GraphQLMatchingPriceNotFoundError.builder().variantId(5) },
                new Object[] { "currency", GraphQLMatchingPriceNotFoundError.builder().currency("currency") },
                new Object[] { "country", GraphQLMatchingPriceNotFoundError.builder().country("country") },
                new Object[] { "customerGroup", GraphQLMatchingPriceNotFoundError.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { "channel", GraphQLMatchingPriceNotFoundError.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void productId() {
        GraphQLMatchingPriceNotFoundError value = GraphQLMatchingPriceNotFoundError.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void variantId() {
        GraphQLMatchingPriceNotFoundError value = GraphQLMatchingPriceNotFoundError.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void currency() {
        GraphQLMatchingPriceNotFoundError value = GraphQLMatchingPriceNotFoundError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        GraphQLMatchingPriceNotFoundError value = GraphQLMatchingPriceNotFoundError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        GraphQLMatchingPriceNotFoundError value = GraphQLMatchingPriceNotFoundError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void channel() {
        GraphQLMatchingPriceNotFoundError value = GraphQLMatchingPriceNotFoundError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
