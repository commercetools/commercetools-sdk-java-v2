
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeNotApplicableTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeNotApplicableBuilder builder) {
        DiscountCodeNotApplicable discountCodeNotApplicable = builder.buildUnchecked();
        Assertions.assertThat(discountCodeNotApplicable).isInstanceOf(DiscountCodeNotApplicable.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", DiscountCodeNotApplicable.builder().severity("severity") },
                new Object[] { "message", DiscountCodeNotApplicable.builder().message("message") },
                new Object[] { "correlationId", DiscountCodeNotApplicable.builder().correlationId("correlationId") },
                new Object[] { "payload", DiscountCodeNotApplicable.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        DiscountCodeNotApplicable value = DiscountCodeNotApplicable.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        DiscountCodeNotApplicable value = DiscountCodeNotApplicable.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        DiscountCodeNotApplicable value = DiscountCodeNotApplicable.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        DiscountCodeNotApplicable value = DiscountCodeNotApplicable.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
