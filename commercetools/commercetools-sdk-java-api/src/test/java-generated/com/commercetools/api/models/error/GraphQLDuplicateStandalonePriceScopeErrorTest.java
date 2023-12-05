
package com.commercetools.api.models.error;

import java.time.ZonedDateTime;

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
public class GraphQLDuplicateStandalonePriceScopeErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLDuplicateStandalonePriceScopeErrorBuilder builder) {
        GraphQLDuplicateStandalonePriceScopeError graphQLDuplicateStandalonePriceScopeError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicateStandalonePriceScopeError)
                .isInstanceOf(GraphQLDuplicateStandalonePriceScopeError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLDuplicateStandalonePriceScopeError.builder()
                        .conflictingStandalonePrice(
                            new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl()) },
                new Object[] { GraphQLDuplicateStandalonePriceScopeError.builder().sku("sku") },
                new Object[] { GraphQLDuplicateStandalonePriceScopeError.builder().currency("currency") },
                new Object[] { GraphQLDuplicateStandalonePriceScopeError.builder().country("country") },
                new Object[] { GraphQLDuplicateStandalonePriceScopeError.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { GraphQLDuplicateStandalonePriceScopeError.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { GraphQLDuplicateStandalonePriceScopeError.builder()
                        .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { GraphQLDuplicateStandalonePriceScopeError.builder()
                        .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void conflictingStandalonePrice() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setConflictingStandalonePrice(
            new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
        Assertions.assertThat(value.getConflictingStandalonePrice())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
    }

    @Test
    public void sku() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void currency() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void validFrom() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
