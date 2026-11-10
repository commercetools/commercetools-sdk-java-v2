
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAllowAllOriginsUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAllowAllOriginsUpdateActionBuilder builder) {
        SetAllowAllOriginsUpdateAction setAllowAllOriginsUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setAllowAllOriginsUpdateAction).isInstanceOf(SetAllowAllOriginsUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "allowAll", SetAllowAllOriginsUpdateAction.builder().allowAll(true) } };
    }

    @Test
    public void allowAll() {
        SetAllowAllOriginsUpdateAction value = SetAllowAllOriginsUpdateAction.of();
        value.setAllowAll(true);
        Assertions.assertThat(value.getAllowAll()).isEqualTo(true);
    }
}
