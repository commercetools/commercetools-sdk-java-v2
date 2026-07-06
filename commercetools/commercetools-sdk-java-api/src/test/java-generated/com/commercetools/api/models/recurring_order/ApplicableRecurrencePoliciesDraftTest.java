
package com.commercetools.api.models.recurring_order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApplicableRecurrencePoliciesDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApplicableRecurrencePoliciesDraftBuilder builder) {
        ApplicableRecurrencePoliciesDraft applicableRecurrencePoliciesDraft = builder.buildUnchecked();
        Assertions.assertThat(applicableRecurrencePoliciesDraft).isInstanceOf(ApplicableRecurrencePoliciesDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "recurrencePolicies", ApplicableRecurrencePoliciesDraft.builder()
                .recurrencePolicies(Collections.singletonList(
                    new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl())) } };
    }

    @Test
    public void recurrencePolicies() {
        ApplicableRecurrencePoliciesDraft value = ApplicableRecurrencePoliciesDraft.of();
        value.setRecurrencePolicies(Collections.singletonList(
            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl()));
        Assertions.assertThat(value.getRecurrencePolicies())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl()));
    }
}
