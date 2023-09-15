
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
public class DuplicateStandalonePriceScopeErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DuplicateStandalonePriceScopeErrorBuilder builder) {
        DuplicateStandalonePriceScopeError duplicateStandalonePriceScopeError = builder.buildUnchecked();
        Assertions.assertThat(duplicateStandalonePriceScopeError)
                .isInstanceOf(DuplicateStandalonePriceScopeError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DuplicateStandalonePriceScopeError.builder().message("message") },
                new Object[] { DuplicateStandalonePriceScopeError.builder()
                        .conflictingStandalonePrice(
                            new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl()) },
                new Object[] { DuplicateStandalonePriceScopeError.builder().sku("sku") },
                new Object[] { DuplicateStandalonePriceScopeError.builder().currency("currency") },
                new Object[] { DuplicateStandalonePriceScopeError.builder().country("country") },
                new Object[] { DuplicateStandalonePriceScopeError.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { DuplicateStandalonePriceScopeError.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { DuplicateStandalonePriceScopeError.builder()
                        .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { DuplicateStandalonePriceScopeError.builder()
                        .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void message() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingStandalonePrice() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setConflictingStandalonePrice(
            new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
        Assertions.assertThat(value.getConflictingStandalonePrice())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
    }

    @Test
    public void sku() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void currency() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void validFrom() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
