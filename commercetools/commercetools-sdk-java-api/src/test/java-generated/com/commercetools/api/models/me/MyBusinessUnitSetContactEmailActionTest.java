
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitSetContactEmailActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitSetContactEmailActionBuilder builder) {
        MyBusinessUnitSetContactEmailAction myBusinessUnitSetContactEmailAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitSetContactEmailAction)
                .isInstanceOf(MyBusinessUnitSetContactEmailAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "contactEmail",
                MyBusinessUnitSetContactEmailAction.builder().contactEmail("contactEmail") } };
    }

    @Test
    public void contactEmail() {
        MyBusinessUnitSetContactEmailAction value = MyBusinessUnitSetContactEmailAction.of();
        value.setContactEmail("contactEmail");
        Assertions.assertThat(value.getContactEmail()).isEqualTo("contactEmail");
    }
}
