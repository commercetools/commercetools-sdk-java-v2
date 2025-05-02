
package com.commercetools.api.models.error;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLDiscountCodeNonApplicableErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLDiscountCodeNonApplicableErrorBuilder builder) {
        GraphQLDiscountCodeNonApplicableError graphQLDiscountCodeNonApplicableError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDiscountCodeNonApplicableError)
                .isInstanceOf(GraphQLDiscountCodeNonApplicableError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "discountCode",
                        GraphQLDiscountCodeNonApplicableError.builder().discountCode("discountCode") },
                new Object[] { "reason", GraphQLDiscountCodeNonApplicableError.builder().reason("reason") },
                new Object[] { "discountCodeId",
                        GraphQLDiscountCodeNonApplicableError.builder().discountCodeId("discountCodeId") },
                new Object[] { "validFrom",
                        GraphQLDiscountCodeNonApplicableError.builder()
                                .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        GraphQLDiscountCodeNonApplicableError.builder()
                                .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validityCheckTime", GraphQLDiscountCodeNonApplicableError.builder()
                        .validityCheckTime(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void discountCode() {
        GraphQLDiscountCodeNonApplicableError value = GraphQLDiscountCodeNonApplicableError.of();
        value.setDiscountCode("discountCode");
        Assertions.assertThat(value.getDiscountCode()).isEqualTo("discountCode");
    }

    @Test
    public void reason() {
        GraphQLDiscountCodeNonApplicableError value = GraphQLDiscountCodeNonApplicableError.of();
        value.setReason("reason");
        Assertions.assertThat(value.getReason()).isEqualTo("reason");
    }

    @Test
    public void discountCodeId() {
        GraphQLDiscountCodeNonApplicableError value = GraphQLDiscountCodeNonApplicableError.of();
        value.setDiscountCodeId("discountCodeId");
        Assertions.assertThat(value.getDiscountCodeId()).isEqualTo("discountCodeId");
    }

    @Test
    public void validFrom() {
        GraphQLDiscountCodeNonApplicableError value = GraphQLDiscountCodeNonApplicableError.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        GraphQLDiscountCodeNonApplicableError value = GraphQLDiscountCodeNonApplicableError.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validityCheckTime() {
        GraphQLDiscountCodeNonApplicableError value = GraphQLDiscountCodeNonApplicableError.of();
        value.setValidityCheckTime(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidityCheckTime()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
