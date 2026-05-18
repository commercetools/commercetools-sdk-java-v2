
package com.commercetools.api.models.recurring_order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApplicableRecurrencePoliciesTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApplicableRecurrencePoliciesBuilder builder) {
        ApplicableRecurrencePolicies applicableRecurrencePolicies = builder.buildUnchecked();
        Assertions.assertThat(applicableRecurrencePolicies).isInstanceOf(ApplicableRecurrencePolicies.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "recurrencePolicies",
                ApplicableRecurrencePolicies.builder()
                        .recurrencePolicies(Collections.singletonList(
                            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceImpl())) } };
    }

    @Test
    public void recurrencePolicies() {
        ApplicableRecurrencePolicies value = ApplicableRecurrencePolicies.of();
        value.setRecurrencePolicies(Collections
                .singletonList(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceImpl()));
        Assertions.assertThat(value.getRecurrencePolicies())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceImpl()));
    }
}
