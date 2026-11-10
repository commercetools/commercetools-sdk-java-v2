
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomerGroupAssignmentsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomerGroupAssignmentsChangeBuilder builder) {
        SetCustomerGroupAssignmentsChange setCustomerGroupAssignmentsChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomerGroupAssignmentsChange).isInstanceOf(SetCustomerGroupAssignmentsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCustomerGroupAssignmentsChange.builder().change("change") },
                new Object[] { "addedItems",
                        SetCustomerGroupAssignmentsChange.builder()
                                .addedItems(Collections.singletonList(
                                    new com.commercetools.history.models.common.CustomerGroupAssignmentImpl())) },
                new Object[] { "removedItems",
                        SetCustomerGroupAssignmentsChange.builder()
                                .removedItems(Collections.singletonList(
                                    new com.commercetools.history.models.common.CustomerGroupAssignmentImpl())) },
                new Object[] { "previousValue",
                        SetCustomerGroupAssignmentsChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.CustomerGroupAssignmentImpl())) },
                new Object[] { "nextValue",
                        SetCustomerGroupAssignmentsChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.CustomerGroupAssignmentImpl())) } };
    }

    @Test
    public void change() {
        SetCustomerGroupAssignmentsChange value = SetCustomerGroupAssignmentsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void addedItems() {
        SetCustomerGroupAssignmentsChange value = SetCustomerGroupAssignmentsChange.of();
        value.setAddedItems(
            Collections.singletonList(new com.commercetools.history.models.common.CustomerGroupAssignmentImpl()));
        Assertions.assertThat(value.getAddedItems())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.common.CustomerGroupAssignmentImpl()));
    }

    @Test
    public void removedItems() {
        SetCustomerGroupAssignmentsChange value = SetCustomerGroupAssignmentsChange.of();
        value.setRemovedItems(
            Collections.singletonList(new com.commercetools.history.models.common.CustomerGroupAssignmentImpl()));
        Assertions.assertThat(value.getRemovedItems())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.common.CustomerGroupAssignmentImpl()));
    }

    @Test
    public void previousValue() {
        SetCustomerGroupAssignmentsChange value = SetCustomerGroupAssignmentsChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.CustomerGroupAssignmentImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.common.CustomerGroupAssignmentImpl()));
    }

    @Test
    public void nextValue() {
        SetCustomerGroupAssignmentsChange value = SetCustomerGroupAssignmentsChange.of();
        value.setNextValue(
            Collections.singletonList(new com.commercetools.history.models.common.CustomerGroupAssignmentImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.common.CustomerGroupAssignmentImpl()));
    }
}
