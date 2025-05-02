
package com.commercetools.api.models.state;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateBuilder builder) {
        State state = builder.buildUnchecked();
        Assertions.assertThat(state).isInstanceOf(State.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", State.builder().id("id") },
                new Object[] { "version", State.builder().version(2L) },
                new Object[] { "createdAt", State.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        State.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        State.builder().lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        State.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "key", State.builder().key("key") },
                new Object[] { "type",
                        State.builder().type(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState")) },
                new Object[] { "name",
                        State.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        State.builder().description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "initial", State.builder().initial(true) },
                new Object[] { "builtIn", State.builder().builtIn(true) },
                new Object[] { "roles", State.builder()
                        .roles(Collections.singletonList(
                            com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics"))) },
                new Object[] { "transitions", State.builder()
                        .transitions(
                            Collections.singletonList(new com.commercetools.api.models.state.StateReferenceImpl())) } };
    }

    @Test
    public void id() {
        State value = State.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        State value = State.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        State value = State.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        State value = State.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        State value = State.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        State value = State.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        State value = State.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void type() {
        State value = State.of();
        value.setType(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState"));
    }

    @Test
    public void name() {
        State value = State.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        State value = State.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void initial() {
        State value = State.of();
        value.setInitial(true);
        Assertions.assertThat(value.getInitial()).isEqualTo(true);
    }

    @Test
    public void builtIn() {
        State value = State.of();
        value.setBuiltIn(true);
        Assertions.assertThat(value.getBuiltIn()).isEqualTo(true);
    }

    @Test
    public void roles() {
        State value = State.of();
        value.setRoles(Collections.singletonList(
            com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getRoles())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
    }

    @Test
    public void transitions() {
        State value = State.of();
        value.setTransitions(Collections.singletonList(new com.commercetools.api.models.state.StateReferenceImpl()));
        Assertions.assertThat(value.getTransitions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.state.StateReferenceImpl()));
    }
}
