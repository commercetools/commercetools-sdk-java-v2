
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
public class DiscountCodeNonApplicableErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeNonApplicableErrorBuilder builder) {
        DiscountCodeNonApplicableError discountCodeNonApplicableError = builder.buildUnchecked();
        Assertions.assertThat(discountCodeNonApplicableError).isInstanceOf(DiscountCodeNonApplicableError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeNonApplicableError.builder().message("message") },
                new Object[] { DiscountCodeNonApplicableError.builder().discountCode("discountCode") },
                new Object[] { DiscountCodeNonApplicableError.builder().reason("reason") },
                new Object[] { DiscountCodeNonApplicableError.builder().discountCodeId("discountCodeId") },
                new Object[] {
                        DiscountCodeNonApplicableError.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] {
                        DiscountCodeNonApplicableError.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { DiscountCodeNonApplicableError.builder()
                        .validityCheckTime(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void message() {
        DiscountCodeNonApplicableError value = DiscountCodeNonApplicableError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void discountCode() {
        DiscountCodeNonApplicableError value = DiscountCodeNonApplicableError.of();
        value.setDiscountCode("discountCode");
        Assertions.assertThat(value.getDiscountCode()).isEqualTo("discountCode");
    }

    @Test
    public void reason() {
        DiscountCodeNonApplicableError value = DiscountCodeNonApplicableError.of();
        value.setReason("reason");
        Assertions.assertThat(value.getReason()).isEqualTo("reason");
    }

    @Test
    public void discountCodeId() {
        DiscountCodeNonApplicableError value = DiscountCodeNonApplicableError.of();
        value.setDiscountCodeId("discountCodeId");
        Assertions.assertThat(value.getDiscountCodeId()).isEqualTo("discountCodeId");
    }

    @Test
    public void validFrom() {
        DiscountCodeNonApplicableError value = DiscountCodeNonApplicableError.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        DiscountCodeNonApplicableError value = DiscountCodeNonApplicableError.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validityCheckTime() {
        DiscountCodeNonApplicableError value = DiscountCodeNonApplicableError.of();
        value.setValidityCheckTime(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidityCheckTime()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
