
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
public class OverlappingStandalonePriceValidityErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OverlappingStandalonePriceValidityErrorBuilder builder) {
        OverlappingStandalonePriceValidityError overlappingStandalonePriceValidityError = builder.buildUnchecked();
        Assertions.assertThat(overlappingStandalonePriceValidityError)
                .isInstanceOf(OverlappingStandalonePriceValidityError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OverlappingStandalonePriceValidityError.builder().message("message") },
                new Object[] { OverlappingStandalonePriceValidityError.builder()
                        .conflictingStandalonePrice(
                            new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl()) },
                new Object[] { OverlappingStandalonePriceValidityError.builder().sku("sku") },
                new Object[] { OverlappingStandalonePriceValidityError.builder().currency("currency") },
                new Object[] { OverlappingStandalonePriceValidityError.builder().country("country") },
                new Object[] { OverlappingStandalonePriceValidityError.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { OverlappingStandalonePriceValidityError.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { OverlappingStandalonePriceValidityError.builder()
                        .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { OverlappingStandalonePriceValidityError.builder()
                        .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { OverlappingStandalonePriceValidityError.builder()
                        .conflictingValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { OverlappingStandalonePriceValidityError.builder()
                        .conflictingValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void message() {
        OverlappingStandalonePriceValidityError value = OverlappingStandalonePriceValidityError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingStandalonePrice() {
        OverlappingStandalonePriceValidityError value = OverlappingStandalonePriceValidityError.of();
        value.setConflictingStandalonePrice(
            new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
        Assertions.assertThat(value.getConflictingStandalonePrice())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
    }

    @Test
    public void sku() {
        OverlappingStandalonePriceValidityError value = OverlappingStandalonePriceValidityError.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void currency() {
        OverlappingStandalonePriceValidityError value = OverlappingStandalonePriceValidityError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        OverlappingStandalonePriceValidityError value = OverlappingStandalonePriceValidityError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        OverlappingStandalonePriceValidityError value = OverlappingStandalonePriceValidityError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        OverlappingStandalonePriceValidityError value = OverlappingStandalonePriceValidityError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void validFrom() {
        OverlappingStandalonePriceValidityError value = OverlappingStandalonePriceValidityError.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        OverlappingStandalonePriceValidityError value = OverlappingStandalonePriceValidityError.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void conflictingValidFrom() {
        OverlappingStandalonePriceValidityError value = OverlappingStandalonePriceValidityError.of();
        value.setConflictingValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getConflictingValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void conflictingValidUntil() {
        OverlappingStandalonePriceValidityError value = OverlappingStandalonePriceValidityError.of();
        value.setConflictingValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getConflictingValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
