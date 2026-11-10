
package com.commercetools.api.models.state;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateDraftBuilder builder) {
        StateDraft stateDraft = builder.buildUnchecked();
        Assertions.assertThat(stateDraft).isInstanceOf(StateDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", StateDraft.builder().key("key") },
                new Object[] { "type",
                        StateDraft.builder()
                                .type(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState")) },
                new Object[] { "name",
                        StateDraft.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        StateDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "initial", StateDraft.builder().initial(true) },
                new Object[] { "roles", StateDraft.builder()
                        .roles(Collections.singletonList(
                            com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics"))) },
                new Object[] { "transitions",
                        StateDraft.builder()
                                .transitions(Collections.singletonList(
                                    new com.commercetools.api.models.state.StateResourceIdentifierImpl())) } };
    }

    @Test
    public void key() {
        StateDraft value = StateDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void type() {
        StateDraft value = StateDraft.of();
        value.setType(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState"));
    }

    @Test
    public void name() {
        StateDraft value = StateDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        StateDraft value = StateDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void initial() {
        StateDraft value = StateDraft.of();
        value.setInitial(true);
        Assertions.assertThat(value.getInitial()).isEqualTo(true);
    }

    @Test
    public void roles() {
        StateDraft value = StateDraft.of();
        value.setRoles(Collections.singletonList(
            com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getRoles())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
    }

    @Test
    public void transitions() {
        StateDraft value = StateDraft.of();
        value.setTransitions(
            Collections.singletonList(new com.commercetools.api.models.state.StateResourceIdentifierImpl()));
        Assertions.assertThat(value.getTransitions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.state.StateResourceIdentifierImpl()));
    }
}
