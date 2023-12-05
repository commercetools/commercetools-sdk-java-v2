
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
public class GraphQLOverlappingStandalonePriceValidityErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLOverlappingStandalonePriceValidityErrorBuilder builder) {
        GraphQLOverlappingStandalonePriceValidityError graphQLOverlappingStandalonePriceValidityError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLOverlappingStandalonePriceValidityError)
                .isInstanceOf(GraphQLOverlappingStandalonePriceValidityError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLOverlappingStandalonePriceValidityError.builder()
                        .conflictingStandalonePrice(
                            new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl()) },
                new Object[] { GraphQLOverlappingStandalonePriceValidityError.builder().sku("sku") },
                new Object[] { GraphQLOverlappingStandalonePriceValidityError.builder().currency("currency") },
                new Object[] { GraphQLOverlappingStandalonePriceValidityError.builder().country("country") },
                new Object[] { GraphQLOverlappingStandalonePriceValidityError.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { GraphQLOverlappingStandalonePriceValidityError.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { GraphQLOverlappingStandalonePriceValidityError.builder()
                        .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { GraphQLOverlappingStandalonePriceValidityError.builder()
                        .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { GraphQLOverlappingStandalonePriceValidityError.builder()
                        .conflictingValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { GraphQLOverlappingStandalonePriceValidityError.builder()
                        .conflictingValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void conflictingStandalonePrice() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setConflictingStandalonePrice(
            new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
        Assertions.assertThat(value.getConflictingStandalonePrice())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
    }

    @Test
    public void sku() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void currency() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void validFrom() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void conflictingValidFrom() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setConflictingValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getConflictingValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void conflictingValidUntil() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setConflictingValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getConflictingValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
