
package com.commercetools.checkout.models.application;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReorderApplicationAgreementUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReorderApplicationAgreementUpdateActionBuilder builder) {
        ReorderApplicationAgreementUpdateAction reorderApplicationAgreementUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(reorderApplicationAgreementUpdateAction)
                .isInstanceOf(ReorderApplicationAgreementUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "agreementIds", ReorderApplicationAgreementUpdateAction.builder()
                .agreementIds(Collections.singletonList("agreementIds")) } };
    }

    @Test
    public void agreementIds() {
        ReorderApplicationAgreementUpdateAction value = ReorderApplicationAgreementUpdateAction.of();
        value.setAgreementIds(Collections.singletonList("agreementIds"));
        Assertions.assertThat(value.getAgreementIds()).isEqualTo(Collections.singletonList("agreementIds"));
    }
}
