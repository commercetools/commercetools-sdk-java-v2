
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetLocaleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetLocaleActionBuilder builder) {
        StagedOrderSetLocaleAction stagedOrderSetLocaleAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetLocaleAction).isInstanceOf(StagedOrderSetLocaleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "locale", StagedOrderSetLocaleAction.builder().locale("locale") } };
    }

    @Test
    public void locale() {
        StagedOrderSetLocaleAction value = StagedOrderSetLocaleAction.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }
}
