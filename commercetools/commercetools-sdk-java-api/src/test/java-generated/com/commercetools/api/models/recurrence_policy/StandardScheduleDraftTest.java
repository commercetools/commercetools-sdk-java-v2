
package com.commercetools.api.models.recurrence_policy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandardScheduleDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandardScheduleDraftBuilder builder) {
        StandardScheduleDraft standardScheduleDraft = builder.buildUnchecked();
        Assertions.assertThat(standardScheduleDraft).isInstanceOf(StandardScheduleDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", StandardScheduleDraft.builder().value(6L) },
                new Object[] { "intervalUnit", StandardScheduleDraft.builder()
                        .intervalUnit(com.commercetools.api.models.recurrence_policy.IntervalUnit.findEnum("Days")) } };
    }

    @Test
    public void value() {
        StandardScheduleDraft value = StandardScheduleDraft.of();
        value.setValue(6L);
        Assertions.assertThat(value.getValue()).isEqualTo(6L);
    }

    @Test
    public void intervalUnit() {
        StandardScheduleDraft value = StandardScheduleDraft.of();
        value.setIntervalUnit(com.commercetools.api.models.recurrence_policy.IntervalUnit.findEnum("Days"));
        Assertions.assertThat(value.getIntervalUnit())
                .isEqualTo(com.commercetools.api.models.recurrence_policy.IntervalUnit.findEnum("Days"));
    }
}
