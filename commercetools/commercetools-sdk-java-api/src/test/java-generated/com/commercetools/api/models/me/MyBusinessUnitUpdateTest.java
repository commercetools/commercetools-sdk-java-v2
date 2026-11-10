
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitUpdateBuilder builder) {
        MyBusinessUnitUpdate myBusinessUnitUpdate = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitUpdate).isInstanceOf(MyBusinessUnitUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", MyBusinessUnitUpdate.builder().version(2L) },
                new Object[] { "actions",
                        MyBusinessUnitUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.me.MyBusinessUnitUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        MyBusinessUnitUpdate value = MyBusinessUnitUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        MyBusinessUnitUpdate value = MyBusinessUnitUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.me.MyBusinessUnitUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.me.MyBusinessUnitUpdateActionImpl()));
    }
}
