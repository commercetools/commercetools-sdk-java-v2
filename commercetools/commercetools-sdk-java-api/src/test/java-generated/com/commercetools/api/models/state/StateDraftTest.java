
package com.commercetools.api.models.state;

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
public class StateDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StateDraftBuilder builder) {
        StateDraft stateDraft = builder.buildUnchecked();
        Assertions.assertThat(stateDraft).isInstanceOf(StateDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StateDraft.builder().key("key") },
                new Object[] { StateDraft.builder()
                        .type(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState")) },
                new Object[] {
                        StateDraft.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { StateDraft.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { StateDraft.builder().initial(true) },
                new Object[] { StateDraft.builder()
                        .roles(Collections.singletonList(
                            com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics"))) },
                new Object[] { StateDraft.builder()
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
