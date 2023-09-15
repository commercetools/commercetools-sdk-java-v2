
package com.commercetools.api.models.state;

import java.time.ZonedDateTime;
import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class StateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StateBuilder builder) {
        State state = builder.buildUnchecked();
        Assertions.assertThat(state).isInstanceOf(State.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { State.builder().id("id") }, new Object[] { State.builder().version(2L) },
                new Object[] { State.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { State.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] {
                        State.builder().lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { State.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { State.builder().key("key") },
                new Object[] {
                        State.builder().type(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState")) },
                new Object[] { State.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] {
                        State.builder().description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { State.builder().initial(true) }, new Object[] { State.builder().builtIn(true) },
                new Object[] { State.builder()
                        .roles(Collections.singletonList(
                            com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics"))) },
                new Object[] { State.builder()
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
