
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeCartDiscountsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeCartDiscountsChangeBuilder builder) {
        ChangeCartDiscountsChange changeCartDiscountsChange = builder.buildUnchecked();
        Assertions.assertThat(changeCartDiscountsChange).isInstanceOf(ChangeCartDiscountsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeCartDiscountsChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeCartDiscountsChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "nextValue",
                        ChangeCartDiscountsChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "addedItems",
                        ChangeCartDiscountsChange.builder()
                                .addedItems(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "removedItems", ChangeCartDiscountsChange.builder()
                        .removedItems(
                            Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl())) } };
    }

    @Test
    public void change() {
        ChangeCartDiscountsChange value = ChangeCartDiscountsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeCartDiscountsChange value = ChangeCartDiscountsChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void nextValue() {
        ChangeCartDiscountsChange value = ChangeCartDiscountsChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void addedItems() {
        ChangeCartDiscountsChange value = ChangeCartDiscountsChange.of();
        value.setAddedItems(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getAddedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void removedItems() {
        ChangeCartDiscountsChange value = ChangeCartDiscountsChange.of();
        value.setRemovedItems(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getRemovedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }
}
