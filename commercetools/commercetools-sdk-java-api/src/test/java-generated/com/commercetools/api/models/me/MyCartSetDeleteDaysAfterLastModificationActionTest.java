
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetDeleteDaysAfterLastModificationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetDeleteDaysAfterLastModificationActionBuilder builder) {
        MyCartSetDeleteDaysAfterLastModificationAction myCartSetDeleteDaysAfterLastModificationAction = builder
                .buildUnchecked();
        Assertions.assertThat(myCartSetDeleteDaysAfterLastModificationAction)
                .isInstanceOf(MyCartSetDeleteDaysAfterLastModificationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "deleteDaysAfterLastModification",
                MyCartSetDeleteDaysAfterLastModificationAction.builder().deleteDaysAfterLastModification(3) } };
    }

    @Test
    public void deleteDaysAfterLastModification() {
        MyCartSetDeleteDaysAfterLastModificationAction value = MyCartSetDeleteDaysAfterLastModificationAction.of();
        value.setDeleteDaysAfterLastModification(3);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3);
    }
}
