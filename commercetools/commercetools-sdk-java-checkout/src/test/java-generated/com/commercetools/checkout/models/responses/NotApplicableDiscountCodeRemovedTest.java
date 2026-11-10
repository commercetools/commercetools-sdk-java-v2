
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NotApplicableDiscountCodeRemovedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, NotApplicableDiscountCodeRemovedBuilder builder) {
        NotApplicableDiscountCodeRemoved notApplicableDiscountCodeRemoved = builder.buildUnchecked();
        Assertions.assertThat(notApplicableDiscountCodeRemoved).isInstanceOf(NotApplicableDiscountCodeRemoved.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "severity", NotApplicableDiscountCodeRemoved.builder().severity("severity") },
                new Object[] { "message", NotApplicableDiscountCodeRemoved.builder().message("message") },
                new Object[] { "correlationId",
                        NotApplicableDiscountCodeRemoved.builder().correlationId("correlationId") },
                new Object[] { "payload", NotApplicableDiscountCodeRemoved.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        NotApplicableDiscountCodeRemoved value = NotApplicableDiscountCodeRemoved.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        NotApplicableDiscountCodeRemoved value = NotApplicableDiscountCodeRemoved.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        NotApplicableDiscountCodeRemoved value = NotApplicableDiscountCodeRemoved.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        NotApplicableDiscountCodeRemoved value = NotApplicableDiscountCodeRemoved.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
