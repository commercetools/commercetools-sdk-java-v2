
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
public class GraphQLMatchingPriceNotFoundErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLMatchingPriceNotFoundErrorBuilder builder) {
        GraphQLMatchingPriceNotFoundError graphQLMatchingPriceNotFoundError = builder.buildUnchecked();
        Assertions.assertThat(graphQLMatchingPriceNotFoundError).isInstanceOf(GraphQLMatchingPriceNotFoundError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLMatchingPriceNotFoundError.builder().productId("productId") },
                new Object[] { GraphQLMatchingPriceNotFoundError.builder().variantId(5) },
                new Object[] { GraphQLMatchingPriceNotFoundError.builder().currency("currency") },
                new Object[] { GraphQLMatchingPriceNotFoundError.builder().country("country") },
                new Object[] { GraphQLMatchingPriceNotFoundError.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { GraphQLMatchingPriceNotFoundError.builder()
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
