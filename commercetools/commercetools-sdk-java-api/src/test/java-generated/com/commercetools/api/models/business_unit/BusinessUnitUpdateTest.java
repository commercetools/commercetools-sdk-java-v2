
package com.commercetools.api.models.business_unit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitUpdateBuilder builder) {
        BusinessUnitUpdate businessUnitUpdate = builder.buildUnchecked();
        Assertions.assertThat(businessUnitUpdate).isInstanceOf(BusinessUnitUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", BusinessUnitUpdate.builder().version(2L) },
                new Object[] { "actions",
                        BusinessUnitUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.business_unit.BusinessUnitUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        BusinessUnitUpdate value = BusinessUnitUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        BusinessUnitUpdate value = BusinessUnitUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.business_unit.BusinessUnitUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.business_unit.BusinessUnitUpdateActionImpl()));
    }
}
